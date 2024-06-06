package vista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ConsultaSaldo extends javax.swing.JFrame {
    // Variables de instancia
    private String nombre;
    private int nro;
    private String apellido;
    private int idioma;
    private String cuen;
    private ArrayList<TipoCuenta> saldos; // Lista para almacenar tipos de cuenta y saldos
    private String cuenta = " | Nro. cuenta :"; // Etiqueta para número de cuenta en diferentes idiomas
    private String text = "Su saldo es de :"; // Etiqueta para saldo en diferentes idiomas

    public ConsultaSaldo() {
        saldos = new ArrayList<>(); // Inicialización de la lista de saldos
        initComponents(); // Método generado automáticamente para inicializar componentes visuales
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        saldo = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lineaNaranja = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        saldo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        saldo.setForeground(new java.awt.Color(255, 204, 0));
        saldo.setText("Saldo Actual:");

        BotonAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(382, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Consulta de Saldo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextArea.setForeground(new java.awt.Color(255, 102, 0));
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HISTORIAL TRANSACCIONAL");

        lineaNaranja.setBackground(new java.awt.Color(255, 102, 0));
        lineaNaranja.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                                    .addComponent(lineaNaranja))))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineaNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonAtras))
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

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        // Al presionar el botón "Atras", se vuelve al menú de transacciones
        MenuTransacciones tran = new MenuTransacciones();
        tran.idioma(idioma); // Establecer idioma en el nuevo frame
        tran.datos(nombre, nro, apellido, idioma); // Pasar datos de usuario al nuevo frame
        tran.cargarDatos(); // Cargar datos de usuario en el nuevo frame
        tran.mantCuenta(cuen); // Mantener datos de cuenta en el nuevo frame
        tran.setVisible(true); // Mostrar el nuevo frame
        this.dispose(); // Cerrar el frame actual
    }//GEN-LAST:event_BotonAtrasActionPerformed
    
    // Método para mostrar el contenido de un archivo de texto en el área de texto
    public void mostrarContenidoArchivo(String moneda) {
        cuen = moneda; // Guardar el tipo de moneda seleccionado
        try (BufferedReader br = new BufferedReader(new FileReader(nro + moneda))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                jTextArea.append(linea + "\n"); // Mostrar cada línea del archivo en el área de texto
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
        }
    }

    // Método para inicializar datos de la cuenta en la ventana
    public void datos(String nombre, int nro, String apellido, int idioma) {
        this.apellido = apellido; // Asignar apellido
        this.nombre = nombre; // Asignar nombre
        this.nro = nro; // Asignar número de cuenta
        this.idioma = idioma; // Asignar idioma
    }

    // Método para cargar los datos de saldo según el tipo de cuenta seleccionado
    public void cargarDatos(String cunt) {
        llenarLista(nro + ""); // Llenar la lista de saldos desde el archivo correspondiente
        for (int i = 0; i < saldos.size(); i++) {
            if (saldos.get(i).getTipoMoneda().equals(cunt)) { // Buscar el tipo de moneda seleccionado
                saldo.setText(text + " " + saldos.get(i).getSaldo() + cuenta + " " + saldos.get(i).getNroCuenta());
                // Mostrar saldo y número de cuenta en la interfaz
                System.out.println(text + saldos.get(i).getSaldo() + cuenta + saldos.get(i).getNroCuenta());
            }
        }
    }

    // Método para leer y almacenar datos de saldo desde un archivo de texto
    public void llenarLista(String archivo) {
        AccederCuenta acc = new AccederCuenta(); // Instancia para acceder a datos de cuenta
        ArrayList<String> lineas = acc.obtenerTexto(archivo); // Obtener líneas de archivo
        if (lineas != null) {
            for (String linea : lineas) {
                // Dividir la línea en tokens separados por ";"
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                if (tokens.countTokens() >= 3) { // Verificar si hay al menos 3 tokens en la línea
                    int nros = Integer.parseInt(tokens.nextToken()); // Obtener número de cuenta
                    String moneda = tokens.nextToken(); // Obtener tipo de moneda
                    double saldo = Double.parseDouble(tokens.nextToken()); // Obtener saldo
                    TipoCuenta tipoMoneda = new TipoCuenta(nros, moneda, saldo); // Crear instancia de TipoCuenta
                    saldos.add(tipoMoneda); // Agregar tipo de cuenta a la lista de saldos
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios."); // Mensaje si no hay datos en el archivo
        }
    }

    // Método principal, generado automáticamente para ejecutar la interfaz gráfica
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaSaldo().setVisible(true); // Mostrar la interfaz de consulta de saldo
            }
        });
    }

    // Método para configurar el idioma de la interfaz según la selección del usuario
    public void idioma(int idioma) {
        if (idioma == 1) {
            ingles(); // Configurar la interfaz en inglés
        } else if (idioma == 2) {
            quechua(); // Configurar la interfaz en quechua
        }
    }

    // Método para configurar la interfaz en inglés
    public void ingles() {
        text = "Your balance is :"; // Cambiar etiqueta de saldo a inglés
        cuenta = " | Account Number :"; // Cambiar etiqueta de número de cuenta a inglés
        saldo.setText("Current Balance:"); // Cambiar título de saldo en la interfaz a inglés
        BotonAtras.setText("Back"); // Cambiar texto del botón "Atras" a inglés
        jLabel1.setText("Balance inquiry"); // Cambiar título de la ventana a inglés
        jLabel3.setText("TRANSACTION HISTORY"); // Cambiar subtítulo a inglés
    }

    // Método para configurar la interfaz en quechua
    public void quechua() {
        cuenta = " | Qillqayki Unu :"; // Cambiar etiqueta de número de cuenta a quechua
        text = "Qullqisqa unu :"; // Cambiar etiqueta de saldo a quechua
        saldo.setText("Qullqi Qhipa:"); // Cambiar título de saldo en la interfaz a quechua
        BotonAtras.setText("Quipa"); // Cambiar texto del botón "Atras" a quechua
        jLabel1.setText("Qullqisqa Yachay"); // Cambiar título de la ventana a quechua
        jLabel3.setText("LLAQTANAKUQ WAKT'AYNIN"); // Cambiar subtítulo a quechua
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lineaNaranja;
    private javax.swing.JLabel saldo;
    // End of variables declaration//GEN-END:variables
}