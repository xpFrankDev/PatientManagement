package Clases;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Propiedades {
    static String rutaArchivos= "C:\\DataCaps\\";
    
    static final String nameDataFile ="data.properties";
    //static  String nameSoftwareFile ="CAPS-Software.jar";
    static String urlProyecto ="https://github.com/fParrax/CapsPacientes2022/raw/main/";
    static String fileVersionCloud = "version.txt";
     Properties p = new Properties();
    static BufferedWriter bw;
    static File archivo;
    static int len = rutaArchivos.length();
    public Propiedades(){
        openPropiedades();
        
    }
    
    
    public void openPropiedades() {
        File temp = new File(rutaArchivos+nameDataFile);
        if(temp.exists()){
            try {
                p.load(new FileReader(rutaArchivos+nameDataFile));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error abriendo archivo de configuracion \n"+ex);
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, "Error abriendo archivo de configuracion \n"+ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            obtenerPropierties(rutaArchivos);
        }
    }
    public void obtenerPropierties(String ruta) {
        File temp = new File(ruta);
        temp.mkdirs();
        archivo = new File(ruta+nameDataFile);
         if (!archivo.exists()) {
             descargar(nameDataFile);
             openPropiedades();
         }
        
    }
    public  String getMiVersion() {
        String v = "";

        File temp = new File(rutaArchivos + fileVersionCloud);
        if (temp.exists()) {
            try {
                p.load(new FileReader(rutaArchivos + fileVersionCloud));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        } else {
            try {
                // Url con la foto
                URL url = new URL(urlProyecto + fileVersionCloud);

                // establecemos conexion
                URLConnection urlCon = url.openConnection();

                // Se obtiene el inputStream de la foto web y se abre el fichero
                // local.
                InputStream is = urlCon.getInputStream();
                FileOutputStream fos = new FileOutputStream(rutaArchivos + fileVersionCloud);

                // Lectura de la foto de la web y escritura en fichero local
                byte[] array = new byte[1000]; // buffer temporal de lectura.
                int leido = is.read(array);
                while (leido > 0) {
                    fos.write(array, 0, leido);
                    leido = is.read(array);
                }

                // cierre de conexion y fichero.
                is.close();
                fos.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error descargando actualización \n" + e);

            }
        }

        v = p.getProperty("version");
        System.out.println("version tomada: "+v);
        return v;

    }
    public static void descargar(String nameArchivox) {
       
        try {
            // Url con la foto
            URL url = new URL(urlProyecto+nameArchivox);

            // establecemos conexion
            URLConnection urlCon = url.openConnection();


            // Se obtiene el inputStream de la foto web y se abre el fichero
            // local.
            InputStream is = urlCon.getInputStream();
            FileOutputStream fos = new FileOutputStream(rutaArchivos + nameArchivox);

            // Lectura de la foto de la web y escritura en fichero local
            byte[] array = new byte[1000]; // buffer temporal de lectura.
            int leido = is.read(array);
            while (leido > 0) {
                fos.write(array, 0, leido);
                leido = is.read(array);
            }

            // cierre de conexion y fichero.
            is.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error descargando actualización \n" + e);
            
        }

    }
    
    
    
    
    
    
    
    
    
        
    

    public String getPropiedad(String property) {
        String resultado = "";
        resultado = p.getProperty(property);
        return resultado;
    }

    public ArrayList listarPropiedades() {
        ArrayList<String> lista = new ArrayList();

        Enumeration<Object> keys = p.keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            lista.add(key + " = " + p.get(key));            
        }

        return lista;
    }
    private void guardar(String comentario){
        try {
            p.store(new FileWriter(rutaArchivos+"\\"+nameDataFile),comentario);
        } catch (IOException ex) {
            Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void setPropert(String llave, String valor){
        p.setProperty(llave,valor);
        guardar(" "+new SimpleDateFormat("dd/MM/yyyy").format(new Date())+"");
        
    }
    public String getRuta() {
        return rutaArchivos;
    }
    
  
   
    public void setRuta(String ruta) {
        this.rutaArchivos = ruta;
    }

    
    
        public void openVersion(String rutax) {
        rutaArchivos = rutax+nameDataFile;
            File temp = new File(rutaArchivos);
        if(temp.exists()){
            try {
                p.load(new FileReader(rutaArchivos));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        
    }

    

}
