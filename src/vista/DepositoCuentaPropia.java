package vista;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class DepositoCuentaPropia extends javax.swing.JFrame {
  
  // Variables para almacenar información del usuario y cuentas
  private String nombre;
  private int nro;
  private String selec;
  private String apellido;
  private int idioma;
  private ArrayList<TipoCuenta> saldos;
    
    // Constructor de la clase
    public DepositoCuentaPropia() {
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        saldos = new ArrayList<>(); // Inicializa la lista de saldos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        deposito = new javax.swing.JTextField();
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

        deposito.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        deposito.setForeground(new java.awt.Color(0, 0, 102));
        deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoActionPerformed(evt);
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
        jLabel1.setText("Depositar en Cuenta Propia ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
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
        DepositarDinero deposi = new DepositarDinero();
        deposi.idioma(idioma);
        deposi.datos(nombre, nro, selec, apellido, idioma);
        deposi.setVisible(true);
        this.dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_BotonAtrasActionPerformed
    /*public void cargarDatos() {
        llenarLista(""+nro);
        moneda.removeAllItems();
        for (int i = 0; i < saldos.size(); i++) {
            if (saldos.get(i).getTipoMoneda().equals("Bolivianos")) {
                moneda.addItem("Bolivianos");
            }
            if (saldos.get(i).getTipoMoneda().equals("Dolares")) {
                moneda.addItem("Dolares");
            }
            if (saldos.get(i).getTipoMoneda().equals("Euros")) {
                moneda.addItem("Euros");
            }

        }

    }*/
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarLista("" + nro); // Llama al método llenarLista con el número de cuenta como archivo
        double depo;
        try {
            depo = Double.parseDouble(deposito.getText()); // Obtiene la cantidad de depósito
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduzca una cantidad válida");
            return;
        }

        boolean monedaEncontrada = false;
        for (int i = 0; i < saldos.size(); i++) {
            if (selec.equals(saldos.get(i).getTipoMoneda())) {
                monedaEncontrada = true;
                double sal = saldos.get(i).getSaldo();
                saldos.get(i).setSaldo(sal + depo); // Actualiza el saldo con el depósito realizado
                Historial(selec); // Registra el depósito en el historial
                guardarCambios(nro + ""); // Guarda los cambios en el archivo correspondiente
                JOptionPane.showMessageDialog(null, "Se realizó el depósito con éxito!!");
                deposito.setText(""); // Limpia el campo de texto de depósito
                break;
            }
        }

        if (!monedaEncontrada) {
            JOptionPane.showMessageDialog(null, "Moneda no encontrada");
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void depositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositoActionPerformed
    
    // Método para registrar el depósito en el historial
    public void Historial(String selecte) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nro + selecte, true))) {
            writer.write("");
            writer.write("Se realizó un depósito de : " + deposito.getText() + " " + selecte);
            writer.newLine(); // Agrega un salto de línea después de cada elemento
            System.out.println("Historial guardado en " + nombre + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el historial en el archivo.");
            e.printStackTrace();
        }
    }

    // Método para guardar los cambios realizados en los saldos en el archivo correspondiente
    public void guardarCambios(String Archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Archivo))) {
            writer.write("");
            for (int i = 0; i < saldos.size(); i++) {
                writer.write(saldos.get(i).getNroCuenta() + ";" + saldos.get(i).getTipoMoneda() + ";" + saldos.get(i).getSaldo());
                writer.newLine(); // Agrega un salto de línea después de cada elemento
            }
            System.out.println("Saldos guardados en " + Archivo + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los saldos en el archivo.");
            e.printStackTrace();
        }
    }
    // Método para llenar la lista de saldos desde el archivo especificado
    public void llenarLista(String archivo) {
        AccederCuenta acc = new AccederCuenta();
        ArrayList<String> lineas = acc.obtenerTexto(archivo); // Obtiene las líneas del archivo
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                if (tokens.countTokens() >= 3) {
                    int nros = Integer.parseInt(tokens.nextToken());
                    String monedas = tokens.nextToken();
                    double saldo = Double.parseDouble(tokens.nextToken());
                    TipoCuenta tipoMoneda = new TipoCuenta(nros, monedas, saldo); // Crea un objeto TipoCuenta
                    saldos.add(tipoMoneda); // Agrega el objeto a la lista de saldos
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios.");
        }
    }

    // Método para establecer los datos del usuario
    public void datos(String nombre, int nro, String selec, String apellido, int idioma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nro = nro;
        this.selec = selec;
        this.idioma = idioma;
    }

    // Método principal (main) que inicia la aplicación
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositoCuentaPropia().setVisible(true); // Crea y muestra la ventana de DepositoCuentaPropia
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

    // Método para configurar el idioma de la interfaz gráfica en inglés
    public void ingles() {
        jLabel2.setText("Enter the amount of");
        BotonAtras.setText("Back");
        jLabel3.setText("money to deposit:");
        jButton1.setText("Confirm");
        jLabel1.setText("Deposit in Own Account");
    }

    // Método para configurar el idioma de la interfaz gráfica en quechua
    public void quechua() {
        jLabel2.setText("Qillqayki ruray");
        BotonAtras.setText("Qhipa");
        jLabel3.setText("ñananchasqa:");
        jButton1.setText("Kachkanay");
        jLabel1.setText("Sapaq qillqaypi qullqi churay");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JTextField deposito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}