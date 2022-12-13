package cazatalentos;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class Servidor extends Thread {
    private static final int PUERTO = 5000;
    private ServerSocket sc;
    private Socket cl;
    private String mensajeRecibido = "";
    static double monto;
    static String listado;
    
    public void resultados() {
        monto = 0;
        listado = "";
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream("Facturas.dat"));
            try {
                while (true) {
                    Facturacion f = new Facturacion();
                    f.setFecha(entrada.readUTF());
                    f.setHora(entrada.readUTF());
                    f.setIdCliente(entrada.readLong());
                    f.setNombre(entrada.readUTF());
                    f.setApellidos(entrada.readUTF());
                    f.setPagoMensual(entrada.readInt());
                    f.setDescripcionR(entrada.readUTF());
                    monto += f.getPagoMensual();
                    listado += "ID cliente: " + f.getIdCliente() + "\n";
                }

            } catch (EOFException ex02) {
                entrada.close();
            }
        } catch (FileNotFoundException ex01) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado", "Error",
            JOptionPane.ERROR_MESSAGE);
            
        } catch (IOException ex04) {
           // JOptionPane.showMessageDialog(null, "Error al cargar la informacion", "Error",
           // JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void run() {
        resultados();
        try {
            sc = new ServerSocket(PUERTO);
            cl = new Socket();
            

            JOptionPane.showMessageDialog(null, "Servidor en linea, esperando conexion");
            cl = sc.accept();
            System.out.println("Sistema conectado!");
            
            DataInputStream entrada = new DataInputStream(cl.getInputStream());
            DataOutputStream salida = new DataOutputStream(cl.getOutputStream());
            while (true) {
                mensajeRecibido = entrada.readUTF();
                System.out.println(mensajeRecibido);
                if (mensajeRecibido.equals("Monto")) {
                    salida.writeDouble(monto);
                } else {
                    salida.writeUTF(listado);
                }
                
                
            }
        } catch (IOException ex) {
            System.out.println("Error en el servidor");
        }
    }
}
