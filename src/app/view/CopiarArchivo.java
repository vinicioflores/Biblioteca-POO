package app.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Permite copiar un archivo de un lado a otro
 * @author BillyJoel
 */
public class CopiarArchivo {
    /**
     * Instancia de la clase CopiarArchivo
     */
    private static CopiarArchivo copiarArchivo;
   
    /**
     * Constructor de la clase. Inicializa la instancia
     */
    private CopiarArchivo(){
       
    }

    /**
     * Método que permite obtener una instancia de la clase CopiarArchivo
     * @return 
     */
    public static CopiarArchivo getInstance(){
        if(copiarArchivo == null){
            copiarArchivo = new CopiarArchivo();
        }
        return copiarArchivo;
    }
   
    /**
     * Copia un arhivo de una ubicación a otra.
     * Devuelve true si y solo si se completó la operación correctamente. 
     * de otro modo devuelve false 
     * @param origen
     * @param destino
     * @return boolean
     */
    public boolean copiar(String origen, String destino){
        File archivoOrigen;
        File archivoDestino;
        FileInputStream in = null;
        FileOutputStream out = null;
        boolean b;
        try{
            archivoOrigen = new File(origen);
            archivoDestino = new File(destino);
           
            /**
             * Validamos que el archivo de origen exista. En caso de que no 
             * exista saldremos del método
             */
            if(b = archivoOrigen.exists()) {
                /**
                 * Validamos que el archivo de origen se pueda leer
                 */
                if(b = archivoOrigen.canRead()) {
                    /**
                     * Creamos el lector y el escritor
                     */
                    in = new FileInputStream(archivoOrigen);
                    out = new FileOutputStream(archivoDestino);

                    /**
                     * Mientras se lee de un lado por otro lado se escribe
                     */
                    int c;
                    while( (c = in.read() ) != -1) {
                        out.write(c);
                    }
                }
            }
        } catch(IOException ex){
            ex.printStackTrace(System.out);
            b = false;
        } finally {
            try{
                if(in != null) {
                    in.close();
                }
                if(out != null) {
                    out.close();
                }
            } catch(IOException ex) {
                ex.printStackTrace(System.out);
                b = false;
            }
        }
        return b;
    }

    public class PruebaArchivos {
    	   
        public void main(String [] args){
            String origen = "C:/Users/Junior/Desktop/versions/Foca-gay.jpg";
            String destino = "C:/Users/Junior/Desktop/destino.jpg";
            System.out.println("Proceso de copiar archivo: " + CopiarArchivo.getInstance().copiar(origen, destino));
        }
    }}


