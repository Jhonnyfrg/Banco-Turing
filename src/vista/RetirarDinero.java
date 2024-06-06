package vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class RetirarDinero extends javax.swing.JFrame {

    private String nombre;
    private int nro;
    private String selecte; // Variable para el tipo de moneda seleccionado
    private String apellido;
    private int idioma;
    private ArrayList<TipoCuenta> saldos; // Lista para almacenar las cuentas y saldos

    // Constructor de la clase RetirarDinero
    public RetirarDinero() {
        saldos = new ArrayList<>(); // Inicialización de la lista de saldos

        initComponents(); // Inicialización de componentes de la interfaz gráfica
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        montoRetiro = new javax.swing.JTextField();
        jbRetiro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese la cantidad de");

        BotonAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("dinero a retirar:");

        montoRetiro.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        montoRetiro.setForeground(new java.awt.Color(0, 0, 102));
        montoRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoRetiroActionPerformed(evt);
            }
        });

        jbRetiro.setBackground(new java.awt.Color(204, 204, 204));
        jbRetiro.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jbRetiro.setForeground(new java.awt.Color(0, 0, 102));
        jbRetiro.setText("Confirmar");
        jbRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetiroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Retirar Dinero");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jbRetiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(montoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(montoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras)
                    .addComponent(jbRetiro)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuTransacciones menu = new MenuTransacciones();
        menu.datos(nombre, nro, apellido, idioma); // Transferir datos al menú de transacciones
        menu.idioma(idioma); // Configurar idioma del menú
        menu.cargarDatos(); // Cargar datos necesarios en el menú
        menu.mantCuenta(selecte); // Mantener cuenta seleccionada en el menú
        menu.setVisible(true); // Mostrar el menú de transacciones
        this.setVisible(false); // Ocultar la ventana actual
    }//GEN-LAST:event_BotonAtrasActionPerformed
    /*
    public void cargarDatos() {
        llenarLista(""+nro);
        jComboBox1.removeAllItems();
        for (int i = 0; i < saldos.size(); i++) {
            if (saldos.get(i).getTipoMoneda().equals("Bolivianos")) {
                jComboBox1.addItem("Bolivianos");
            }
            if (saldos.get(i).getTipoMoneda().equals("Dolares")) {
                jComboBox1.addItem("Dolares");
            }
            if (saldos.get(i).getTipoMoneda().equals("Euros")) {
                jComboBox1.addItem("Euros");
            }

        }

    }
    */
    // Método para registrar el historial de retiros
    public void Historial(String selecte) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nro + selecte, true))) {
            writer.write("");
            // Escribir cada elemento del ArrayList en una línea separada
            writer.write("Se realizó un retiro de : " + montoRetiro.getText() + " " + selecte);
            writer.newLine(); // Agregar un salto de línea después de cada elemento
            System.out.println("ArrayList guardado en " + nombre + "historial" + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }

    // Método para cargar datos de usuario
    public void datos(String nombre, int nro, String selecte, String apellido, int idioma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nro = nro;
        this.selecte = selecte;
        this.idioma = idioma;
    }

    // Método para llenar la lista de saldos desde un archivo
    public void llenarLista(String archivo) {
        AccederCuenta acc = new AccederCuenta(); // Instancia para acceder a la cuenta
        ArrayList<String> lineas = acc.obtenerTexto(archivo); // Obtener líneas de texto del archivo
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                if (tokens.countTokens() >= 3) {
                    // Obtener tokens y crear objeto TipoCuenta
                    int nros = Integer.parseInt(tokens.nextToken());
                    String moneda = tokens.nextToken();
                    double saldo = Double.parseDouble(tokens.nextToken());
                    TipoCuenta tipoMoneda = new TipoCuenta(nros, moneda, saldo);
                    saldos.add(tipoMoneda); // Agregar a la lista de saldos
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios.");
        }
    }

    private void montoRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoRetiroActionPerformed

    }//GEN-LAST:event_montoRetiroActionPerformed

    private void jbRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetiroActionPerformed
        llenarLista(nro + ""); // Llenar la lista de saldos desde el archivo correspondiente
        double retiro;
        try {
            retiro = Double.parseDouble(montoRetiro.getText()); // Obtener monto de retiro ingresado
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduzca una cantidad válida");
            return;
        }

        for (int i = 0; i < saldos.size(); i++) {
            if (selecte.equals(saldos.get(i).getTipoMoneda())) {
                if (saldos.get(i).getSaldo() >= retiro) {
                    double money = saldos.get(i).getSaldo();
                    saldos.get(i).setSaldo(money - retiro); // Actualizar saldo después del retiro
                    Historial(selecte); // Registrar el retiro en el historial
                    guardarCambios("" + nro); // Guardar cambios en el archivo de cuentas
                    JOptionPane.showMessageDialog(null, "Se realizó el Retiro con Éxito.");
                    montoRetiro.setText(""); // Limpiar campo de monto de retiro
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene suficiente monto para realizar el retiro.");
                }
                break; // Salir del bucle después de encontrar la moneda correspondiente
            }
        }
        montoRetiro.setText(""); // Limpiar campo de monto de retiro al finalizar
    }//GEN-LAST:event_jbRetiroActionPerformed
   
    // Método para guardar cambios en el archivo de cuentas
    public void guardarCambios(String Archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Archivo))) {
            writer.write("");
            // Escribir cada elemento del ArrayList en una línea separada
            for (int i = 0; i < saldos.size(); i++) {
                long n = saldos.get(i).getNroCuenta();
                String m = saldos.get(i).getTipoMoneda();
                double s = saldos.get(i).getSaldo();
                writer.write(n + ";" + m + ";" + s);
                writer.newLine(); // Agregar un salto de línea después de cada elemento
            }
            System.out.println("ArrayList guardado en " + Archivo + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }

    // Método principal que inicia la aplicación
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetirarDinero().setVisible(true); // Crear y mostrar la ventana principal
            }
        });
    }
    
    // Método para configurar el idioma en la ventana de acceso
    public void idioma(int idioma){
        this.idioma=idioma;
        if (idioma==1){
            ingles(); // Configura los componentes en inglés
        } else if(idioma==2){
            quechua(); // Configura los componentes en quechua
        }
    }
    
    // Método para configurar el idioma en inglés
    public void ingles(){
        jLabel2.setText("Enter the amount of");
        BotonAtras.setText("Back");
        jLabel3.setText("Amount to withdraw:");
        jbRetiro.setText("Confirm");
        jLabel1.setText("Withdraw money");
    }
    
    // Método para configurar el idioma en quechua
    public void quechua(){
        jLabel2.setText("Qullqiyta ch'isqay");
        BotonAtras.setText("Qhipa");
        jLabel3.setText("Qullqi apaq:");
        jbRetiro.setText("Kachkanay");
        jLabel1.setText("Qullqi apaq");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbRetiro;
    private javax.swing.JTextField montoRetiro;
    // End of variables declaration//GEN-END:variables
}
