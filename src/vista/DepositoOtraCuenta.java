package vista;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class DepositoOtraCuenta extends javax.swing.JFrame {
    private String nombre;
    private int nro;
    private String selec;
    private String apellido;
    private int idioma;
    private ArrayList<TipoCuenta> saldos;
    private ArrayList<Cuenta> cuentas;
    
// Constructor de la clase
    public DepositoOtraCuenta() {
        saldos = new ArrayList<>();
        cuentas = new ArrayList<>();
        initComponents(); // Inicializar componentes de la interfaz gráfica
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cantdeposito = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nrodeposito = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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
        jLabel3.setText("dinero a depositar:");

        cantdeposito.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        cantdeposito.setForeground(new java.awt.Color(0, 0, 102));
        cantdeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantdepositoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese N°de cuenta a");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("depositar:");

        nrodeposito.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        nrodeposito.setForeground(new java.awt.Color(0, 0, 102));
        nrodeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrodepositoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Depositar en Otra Cuenta");

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
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(cantdeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nrodeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nrodeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantdeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras)
                    .addComponent(jButton1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        // Crear una instancia de DepositarDinero y configurar sus datos
        DepositarDinero depositomenu = new DepositarDinero();
        depositomenu.datos(nombre, nro, selec, apellido, idioma);
        depositomenu.idioma(idioma);
        depositomenu.setVisible(true); // Mostrar la ventana de depositar dinero
        this.dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Obtener los valores de los campos de texto
        String nrodepText = nrodeposito.getText();
        String cantdepoText = cantdeposito.getText();
        
        // Verificar que los campos no estén vacíos y que solo contengan números
        if (nrodepText.isEmpty() && cantdepoText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los datos por favor");
            return;
        }
        if (nrodepText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene el campo del número de cuenta");
            return;
        }
        if (cantdepoText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene el campo de la cantidad a depositar");
            return;
        }
        if (!nrodepText.matches("\\d+") || !cantdepoText.matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "Los campos solo deben contener números");
            return;
        }
        
        int nrodep = Integer.parseInt(nrodepText);
        double cantdepo = Double.parseDouble(cantdepoText);
        boolean depositoExitoso = false; // Variable para verificar si el depósito fue exitoso
        
        // Verificar si el número de cuenta es válido y realizar el depósito
        if (nrodep != 0 && cantdepo != 0) {
            cuentas.clear(); // Limpiar la lista de cuentas
            llenarListaCuentas(); // Llenar la lista de cuentas desde el archivo "Usuarios"
            
            // Iterar sobre la lista de cuentas para buscar la cuenta destino
            for (int i = 0; i < cuentas.size(); i++) {
                saldos.clear(); // Limpiar la lista de saldos
                String arch = cuentas.get(i).getNroCuenta() + "";
                llenarLista(arch); // Llenar la lista de saldos desde el archivo correspondiente
                
                // Iterar sobre la lista de saldos para encontrar la cuenta destino
                for (int j = 0; j < saldos.size(); j++) {
                    if (saldos.get(j).getNroCuenta() == nrodep) {
                        // Realizar el depósito sumando la cantidad especificada al saldo existente
                        saldos.get(j).setSaldo(saldos.get(j).getSaldo() + cantdepo);
                        guardarCambios(cuentas.get(i).getNroCuenta() + ""); // Guardar los cambios en el archivo correspondiente
                        Historial(selec); // Registrar la transacción en el historial
                        Historial2(cuentas.get(i).getNroCuenta() + saldos.get(j).getTipoMoneda(), cantdepo, saldos.get(j).getTipoMoneda());
                        cantdeposito.setText(""); // Limpiar el campo de cantidad de depósito
                        nrodeposito.setText(""); // Limpiar el campo de número de cuenta
                        depositoExitoso = true; // Indicar que el depósito fue exitoso
                    }
                }
            }
        }
        
        // Mostrar mensaje de depósito exitoso o número de cuenta inválido
        if (depositoExitoso) {
            JOptionPane.showMessageDialog(null, "¡Depósito Exitoso!");
        } else {
            JOptionPane.showMessageDialog(null, "Número de Cuenta Inválido");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nrodepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrodepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrodepositoActionPerformed

    private void cantdepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantdepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantdepositoActionPerformed
    
    // Método para registrar el depósito en el historial del usuario
    public void Historial(String selecte){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nro + selecte, true))) {
            writer.write("");
            // Escribir la transacción en el archivo de historial
            writer.write("Se realizó un depósito de: " + cantdeposito.getText() + " " + selecte + " a la cuenta: " + nrodeposito.getText());
            writer.newLine(); // Agregar un salto de línea después de cada transacción
            System.out.println("Historial guardado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el historial en el archivo.");
            e.printStackTrace();
        }
    }
    
    // Método para registrar el depósito en el historial de transacciones
    public void Historial2(String cuen, double z, String mon){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cuen, true))) {
            writer.write("");
            // Escribir la transacción en el archivo de historial de transacciones
            writer.write("Se te depositó: " + z + " " + mon + " de parte de: " + nombre + " " + apellido);
            writer.newLine(); // Agregar un salto de línea después de cada transacción
            System.out.println("Historial 2 guardado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el historial 2 en el archivo.");
            e.printStackTrace();
        }
    }
    
    // Método para guardar los cambios realizados en los saldos de las cuentas
    public void guardarCambios(String Archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Archivo))) {
            writer.write("");
            // Escribir cada elemento del ArrayList en una línea separada
            for (int i = 0; i < saldos.size(); i++) {
                writer.write(saldos.get(i).getNroCuenta() + ";" + saldos.get(i).getTipoMoneda() + ";" + saldos.get(i).getSaldo());
                writer.newLine(); // Agregar un salto de línea después de cada elemento
            }
            System.out.println("Cambios guardados correctamente en " + Archivo);
        } catch (IOException e) {
            System.err.println("Error al guardar los cambios en el archivo " + Archivo);
            e.printStackTrace();
        }
    } 
    
    // Método para establecer los datos del usuario actual
    public void datos(String nombre, int nro, String selec, String apellido, int idioma) {
        this.nombre = nombre; // Asignar nombre del usuario
        this.apellido = apellido; // Asignar apellido del usuario
        this.nro = nro; // Asignar número de cuenta del usuario
        this.selec = selec; // Asignar selección (moneda) del usuario
        this.idioma = idioma; // Asignar idioma seleccionado por el usuario
    }
     
    // Método para llenar la lista de saldos desde un archivo especificado
    public void llenarLista(String archivo) {
        AccederCuenta acc = new AccederCuenta(); // Crear instancia para acceder a cuentas
        ArrayList<String> lineas = acc.obtenerTexto(archivo); // Obtener líneas de texto desde el archivo
        
        if (lineas != null) {
            for (String linea : lineas) { // Iterar sobre cada línea obtenida
                StringTokenizer tokens = new StringTokenizer(linea, ";"); // Dividir la línea en tokens usando ";"
                if (tokens.countTokens() >= 3) { // Verificar si hay al menos 3 tokens en la línea
                    int nros = Integer.parseInt(tokens.nextToken()); // Obtener número de cuenta como entero
                    String monedas = tokens.nextToken(); // Obtener tipo de moneda
                    double saldo = Double.parseDouble(tokens.nextToken()); // Obtener saldo como double
                    TipoCuenta tipoMoneda = new TipoCuenta(nros, monedas, saldo); // Crear instancia de TipoCuenta
                    saldos.add(tipoMoneda); // Agregar instancia a la lista de saldos
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado."); // Mensaje de error si el formato no es válido
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios."); // Mensaje si no hay líneas en el archivo
        }
    }
    
    // Método para llenar la lista de cuentas desde el archivo "Usuarios"
    public void llenarListaCuentas() {
        AccederCuenta acc = new AccederCuenta(); // Crear instancia para acceder a cuentas
        ArrayList<String> lineas = acc.obtenerTexto("Usuarios"); // Obtener líneas de texto desde el archivo "Usuarios"
        
        if (lineas != null) {
            for (String linea : lineas) { // Iterar sobre cada línea obtenida
                StringTokenizer tokens = new StringTokenizer(linea, ";"); // Dividir la línea en tokens usando ";"
                if (tokens.countTokens() >= 5) { // Verificar si hay al menos 5 tokens en la línea
                    String nombrec = tokens.nextToken(); // Obtener nombre de cuenta
                    String apellido = tokens.nextToken(); // Obtener apellido de cuenta
                    int nroc = 0;
                    try {
                        nroc = Integer.parseInt(tokens.nextToken()); // Obtener número de cuenta como entero
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage()); // Mensaje de error si no se puede convertir
                    }
                    String login = tokens.nextToken(); // Obtener login de cuenta
                    String contraseña = tokens.nextToken(); // Obtener contraseña de cuenta
                    Cuenta cuenta = new Cuenta(nombrec, apellido, nroc, login, contraseña); // Crear instancia de Cuenta
                    cuentas.add(cuenta); // Agregar instancia a la lista de cuentas
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado."); // Mensaje de error si el formato no es válido
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios."); // Mensaje si no hay líneas en el archivo
        }
    }
    
    // Método principal (main) que inicia la interfaz gráfica
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositoOtraCuenta().setVisible(true); // Crear y hacer visible la ventana de DepositoOtraCuenta
            }
        });
    }

    // Método para configurar el idioma de la interfaz
    public void idioma(int idioma){
        if (idioma == 1) {
            ingles(); // Configurar idioma inglés
        } else if (idioma == 2) {
            quechua(); // Configurar idioma quechua
        }
    }
    
    // Método para configurar la interfaz en idioma inglés
    public void ingles(){
        jLabel2.setText("Enter the amount of");
        BotonAtras.setText("Back");
        jLabel3.setText("money to deposit:");
        jLabel4.setText("Enter account number");
        jLabel5.setText("to deposit:");
        jButton1.setText("Confirm");
        jLabel1.setText("Deposit in Another Account");
    }

    // Método para configurar la interfaz en idioma quechua
    public void quechua(){
        jLabel2.setText("Qullqiyta churay");
        BotonAtras.setText("Qhipa");
        jLabel3.setText("ñananchasqa:");
        jLabel4.setText("Qillqayki ruray");
        jLabel5.setText("ñananchasqa:");
        jButton1.setText("Kachkanay");
        jLabel1.setText("Huk qillqaypi qullqi churay");
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JTextField cantdeposito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nrodeposito;
    // End of variables declaration//GEN-END:variables
}