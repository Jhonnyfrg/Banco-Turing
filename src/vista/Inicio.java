package vista;

// Importación de clases necesarias para cifrado y manejo de archivos
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Key;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


public class Inicio extends javax.swing.JFrame {

    // Constantes para el algoritmo de cifrado AES
    private static final String ALGORITHM = "AES";// Algoritmo de cifrado
    private static final byte[] keyValue = "1234567890123456".getBytes(); // clave de 16 bytes para AES
    private static final String DIRECTORY_PATH = "C:\\Users\\fr326\\OneDrive\\Documentos\\NetBeansProjects"; // Cambia esto a tu ruta
    
    // Constructor de la clase Inicio
    public Inicio() {
        initComponents();// Inicializa los componentes de la interfaz gráfica
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonEspaniol = new javax.swing.JButton();
        BotonIngles = new javax.swing.JButton();
        BotonQuechua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LineaAmarilla1 = new javax.swing.JTextField();
        LineaNaranja = new javax.swing.JTextField();
        LineaAmarilla2 = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("IDIOMA:");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText(" SELECCIONAR");

        BotonEspaniol.setBackground(new java.awt.Color(204, 204, 204));
        BotonEspaniol.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonEspaniol.setForeground(new java.awt.Color(0, 0, 102));
        BotonEspaniol.setText("Español");
        BotonEspaniol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEspaniolActionPerformed(evt);
            }
        });

        BotonIngles.setBackground(new java.awt.Color(204, 204, 204));
        BotonIngles.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonIngles.setForeground(new java.awt.Color(0, 0, 102));
        BotonIngles.setText("English");
        BotonIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInglesActionPerformed(evt);
            }
        });

        BotonQuechua.setBackground(new java.awt.Color(204, 204, 204));
        BotonQuechua.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonQuechua.setForeground(new java.awt.Color(0, 0, 102));
        BotonQuechua.setText("Quechua");
        BotonQuechua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonQuechuaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/203x184.png"))); // NOI18N

        LineaAmarilla1.setBackground(new java.awt.Color(255, 204, 0));
        LineaAmarilla1.setBorder(null);

        LineaNaranja.setBackground(new java.awt.Color(255, 102, 0));
        LineaNaranja.setBorder(null);

        LineaAmarilla2.setBackground(new java.awt.Color(255, 204, 0));
        LineaAmarilla2.setBorder(null);

        BotonSalir.setBackground(new java.awt.Color(204, 204, 204));
        BotonSalir.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(0, 0, 102));
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(167, 167, 167))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BotonEspaniol, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(BotonIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BotonQuechua, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(234, 234, 234)))
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LineaAmarilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LineaAmarilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(LineaNaranja)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LineaAmarilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LineaNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LineaAmarilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotonEspaniol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonIngles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonQuechua)
                                .addContainerGap(114, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonSalir))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEspaniolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEspaniolActionPerformed
        desencriptarArchivos(); // Llama a la función para desencriptar archivos
        new AccederCuenta().setVisible(true); // Abre una nueva ventana
        this.setVisible(false); // Oculta la ventana actual
    }//GEN-LAST:event_BotonEspaniolActionPerformed

    private void BotonInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInglesActionPerformed
        desencriptarArchivos();
        AccederCuenta acceder = new AccederCuenta(); // Crea una nueva ventana
        acceder.ingles(); // Configura la ventana para inglés
        acceder.idioma(1); // Indica que el idioma seleccionado es inglés
        acceder.setVisible(true); // Muestra la nueva ventana
        this.setVisible(false); // Oculta la ventana actual
    }//GEN-LAST:event_BotonInglesActionPerformed

    private void BotonQuechuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonQuechuaActionPerformed
        desencriptarArchivos();
        AccederCuenta acceder = new AccederCuenta(); // Crea una nueva ventana
        acceder.quechua(); // Configura la ventana para quechua
        acceder.idioma(2); // Indica que el idioma seleccionado es quechua
        acceder.setVisible(true); // Muestra la nueva ventana
        this.setVisible(false); // Oculta la ventana actual
    }//GEN-LAST:event_BotonQuechuaActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        try {
            List<File> archivosAEncriptar = listarArchivosSinExtension(new File(DIRECTORY_PATH)); // Lista los archivos sin extensión
            for (File archivo : archivosAEncriptar) {
                encryptFile(archivo, new File(archivo.getAbsolutePath() + ".enc")); // Encripta cada archivo
                archivo.delete(); // Borra el archivo original
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error
        } finally {
            System.exit(0); // Cierra la aplicación
        }
    }//GEN-LAST:event_BotonSalirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true); // Muestra la ventana principal
            }
        });
    }
    
    private static List<File> listarArchivosSinExtension(File directorio) {
        List<File> archivosSinExtension = new ArrayList<>();
        File[] archivos = directorio.listFiles(); // Lista todos los archivos y carpetas en el directorio
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile() && !archivo.getName().contains(".")) { // Verifica si el archivo no tiene extensión
                    archivosSinExtension.add(archivo); // Añade el archivo a la lista
                } else if (archivo.isDirectory()) {
                    archivosSinExtension.addAll(listarArchivosSinExtension(archivo)); // Recursivamente lista archivos en subdirectorios
                }
            }
        }
        return archivosSinExtension; // Devuelve la lista de archivos sin extensión
    }

    private static void encryptFile(File inputFile, File outputFile) throws Exception {
        Key key = generateKey(); // Genera la clave para el cifrado
        Cipher cipher = Cipher.getInstance(ALGORITHM); // Obtiene una instancia del cifrador para el algoritmo especificado
        cipher.init(Cipher.ENCRYPT_MODE, key); // Inicializa el cifrador en modo cifrado
        try (FileInputStream inputStream = new FileInputStream(inputFile); // Abre el archivo de entrada
             FileOutputStream outputStream = new FileOutputStream(outputFile)) { // Abre el archivo de salida
            byte[] inputBytes = new byte[(int) inputFile.length()]; // Lee el contenido del archivo de entrada
            inputStream.read(inputBytes);
            byte[] outputBytes = cipher.doFinal(inputBytes); // Cifra el contenido
            outputStream.write(outputBytes); // Escribe el contenido cifrado en el archivo de salida
        }
    }

    private static void decryptFile(File inputFile, File outputFile) throws Exception {
        Key key = generateKey(); // Genera la clave para el descifrado
        Cipher cipher = Cipher.getInstance(ALGORITHM); // Obtiene una instancia del cifrador para el algoritmo especificado
        cipher.init(Cipher.DECRYPT_MODE, key); // Inicializa el cifrador en modo descifrado
        try (FileInputStream inputStream = new FileInputStream(inputFile); // Abre el archivo de entrada
             FileOutputStream outputStream = new FileOutputStream(outputFile)) { // Abre el archivo de salida
            byte[] inputBytes = new byte[(int) inputFile.length()]; // Lee el contenido del archivo de entrada
            inputStream.read(inputBytes);
            byte[] outputBytes = cipher.doFinal(inputBytes); // Descifra el contenido
            outputStream.write(outputBytes); // Escribe el contenido descifrado en el archivo de salida
        }
    }

    private static Key generateKey() {
        return new SecretKeySpec(keyValue, ALGORITHM); // Crea una clave secreta específica para el algoritmo AES
    }
    
     private void desencriptarArchivos() {
        try {
            File[] archivos = new File(DIRECTORY_PATH).listFiles(); // Lista todos los archivos en el directorio
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.isFile() && archivo.getName().endsWith(".enc")) { // Verifica si el archivo tiene la extensión ".enc"
                        File archivoDesencriptado = new File(archivo.getParent(), archivo.getName().replace(".enc", "")); // Crea el archivo desencriptado
                        decryptFile(archivo, archivoDesencriptado); // Desencripta el archivo
                        archivo.delete(); // Borra el archivo cifrado original
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime cualquier error que ocurra
        }
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEspaniol;
    private javax.swing.JButton BotonIngles;
    private javax.swing.JButton BotonQuechua;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField LineaAmarilla1;
    private javax.swing.JTextField LineaAmarilla2;
    private javax.swing.JTextField LineaNaranja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
