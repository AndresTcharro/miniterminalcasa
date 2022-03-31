/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniterminal;

/**
 *
 * @author DAW
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/**
 *
 * @author DAW
 */
public class MiniFileManager {

    File rutaActual = new File("C:\\Users\\AndresCangri\\Desktop\\Refugios");

    public MiniFileManager(File ruta) {
        this.rutaActual = ruta;
    }

    public File getRuta() {
        return rutaActual;
    }

    public void setRuta(File ruta) {
        this.rutaActual = ruta;
    }

    public String getPWD() throws IOException {

        String ruta = this.rutaActual.getAbsolutePath();
        System.out.println(ruta);
        return ruta;
    }

    boolean changeDir(String ruta) throws FileNotFoundException {
        File nuevaruta = new File(ruta);
        if (!nuevaruta.exists()) {
            throw new FileNotFoundException();
        }
        rutaActual = nuevaruta;
        System.out.println("Se ha cambiado de directorio");
        return true;
    }

    void printList(boolean info) throws FileNotFoundException {
        try {
            String ruta = rutaActual.getAbsolutePath();
            System.out.println(ruta);
            File carpeta = new File(ruta);
            if (!carpeta.exists()) {
                throw new FileNotFoundException();
            }
            if (carpeta.isFile()) {
                System.out.println("" + carpeta.getName());
            }
            if (carpeta.isDirectory()) {
                System.out.println(" " + carpeta.getName());
                for (File ruta2 : carpeta.listFiles()) {
                    if (ruta2.isDirectory()) {
                        System.out.println("" + ruta2.getName());
                    }
                    String aux1 = ("*" + ruta2.getName());

                }
                for (File ruta3 : carpeta.listFiles()) {
                    if (ruta3.isFile()) {
                        System.out.println("" + ruta3.getName());
                    }
                    String aux2 = ("A" + ruta3.getName());

                }

            }
        }catch (Exception e) {
         System.out.println("No hay elemenmtos dentro de la ruta actual");  }
    }
}

/*
public static String getPWD (String PWD) throws IOException{
 try {
     File rutaActual = new File(""); 
     PWD=rutaActual.getParent();
 }catch(Exception e){
     System.out.println("La rutaActual no es valida, pruebe a intrioducir otra rutaActual");
 }
 return PWD;
}
}
/**public boolean changeDir (String dir) {
   try  {
       File rutaActual = new File();
       
   }catch{
   }
   
}
    
}
    
    /*archivos = carpeta.listFiles(filtro);
if (archivos == null || archivos.length == 0) {
    System.out.println("No hay elementos dentro de la carpeta actual");
    return;
}
else {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    for (int i=0; i< archivos.length; i++) {
        File archivo = archivos[i];
        System.out.println(String.format("%s (%s) - %d - %s", 
                        archivo.getName(),
                        archivo.isDirectory() ? "Carpeta" : "Archivo",
                        archivo.length(),
                        sdf.format(archivo.lastModified())
                ));
    }
}
    return ;
}
    
}*/
