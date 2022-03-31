
import java.io.File;
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

    private String pwd;
    private String cd;
    private String ls;
    private String ll;
    private String mkdir;
    private String rm;
    private String mv;
    private String help;
    private String exit;

    private File ruta = new File("C:\\Users\\DAW\\Desktop\\EjercioA3");

    public MiniFileManager(String pwd, String cd, String ls, String ll, String mkdir, String rm, String mv, String help, String exit) {
        this.pwd = pwd;
        this.cd = cd;
        this.ls = ls;
        this.ll = ll;
        this.mkdir = mkdir;
        this.rm = rm;
        this.mv = mv;
        this.help = help;
        this.exit = exit;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getLs() {
        return ls;
    }

    public void setLs(String ls) {
        this.ls = ls;
    }

    public String getLl() {
        return ll;
    }

    public void setLl(String ll) {
        this.ll = ll;
    }

    public String getMkdir() {
        return mkdir;
    }

    public void setMkdir(String mkdir) {
        this.mkdir = mkdir;
    }

    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }

    public String getMv() {
        return mv;
    }

    public void setMv(String mv) {
        this.mv = mv;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public File getRuta() {
        return ruta;
    }

    public void setRuta(File ruta) {
        this.ruta = ruta;
    }

   

    public String getPWD() throws IOException {
        try {
            pwd = this.ruta.getParent();
        } catch (Exception e) {
            System.out.println("La ruta no es valida, pruebe a intrioducir otra ruta");
        }
        return pwd;
    }

    
    public void printList (boolean info){
        try{
            String [] listado = ruta.list();
            if (listado == null || listado.length == 0){
                return;
            }else  {
                for (int i = 0; i < listado.length; i++) {
                    System.out.println(listado[i]);
                }
            }
           
        }catch(Exception e){
            System.out.println("No hay elemenmtos dentro de la ruta actual");
        }
     
  
    } 
    
}
/*

public static String getPWD (String PWD) throws IOException{
 try {
     File ruta = new File(""); 
     PWD=ruta.getParent();
 }catch(Exception e){
     System.out.println("La ruta no es valida, pruebe a intrioducir otra ruta");
 }
 return PWD;
}
}
/**public boolean changeDir (String dir) {
   try  {
       File ruta = new File();
       
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
