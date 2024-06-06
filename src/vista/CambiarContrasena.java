package vista;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class CambiarContrasena extends javax.swing.JFrame {

    // Variables de instancia
    private String nombre;
    private int nro;
    private String apellido;
    private int idioma;
    private String selec;
    private ArrayList<Cuenta> cuentas;

    // Constructor
    public CambiarContrasena() {
        cuentas = new ArrayList<>(); // Inicialización del ArrayList de cuentas
        initComponents(); // Inicialización de componentes visuales
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotonAtras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BotonConfirmar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contrasenaActual = new javax.swing.JPasswordField();
        contrasenaNew = new javax.swing.JPasswordField();
        verificarContrasena = new javax.swing.JPasswordField();

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        BotonAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese la contraseña actual:");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingrese su nueva contraseña:");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Confirme la nueva contraseña:");

        BotonConfirmar.setBackground(new java.awt.Color(204, 204, 204));
        BotonConfirmar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonConfirmar.setForeground(new java.awt.Color(0, 0, 102));
        BotonConfirmar.setText("Confirmar");
        BotonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConfirmarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Cambiar Contraseña");

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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        contrasenaActual.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        contrasenaActual.setForeground(new java.awt.Color(0, 0, 102));

        contrasenaNew.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        contrasenaNew.setForeground(new java.awt.Color(0, 0, 102));

        verificarContrasena.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        verificarContrasena.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(BotonConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verificarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contrasenaNew, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrasenaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contrasenaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(contrasenaNew, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verificarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras)
                    .addComponent(BotonConfirmar)))
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
        // Volver al menú de transacciones al presionar el botón "Atras"
        MenuTransacciones menu = new MenuTransacciones();
        menu.datos(nombre, nro, apellido, idioma); // Pasar datos de usuario al menú de transacciones
        menu.idioma(idioma); // Establecer idioma en el menú de transacciones
        menu.cargarDatos(); // Cargar datos del usuario en el menú de transacciones
        menu.mantCuenta(selec); // Mantener datos de cuenta en el menú de transacciones
        menu.setVisible(true); // Mostrar el menú de transacciones
        this.dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void BotonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfirmarActionPerformed
        // Obtener contraseñas ingresadas por el usuario
        String passAnt = contrasenaActual.getText();
        String passNew = contrasenaNew.getText();
        String verPass = verificarContrasena.getText();
        
        llenarListaCuentas(); // Llenar el ArrayList con las cuentas desde el archivo

        boolean contraseñaCambiada = false;

        // Buscar la cuenta correspondiente al número de cuenta actual
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNroCuenta() == nro) {
                // Verificar si la contraseña actual coincide y las contraseñas nuevas coinciden
                if (cuentas.get(i).getContraseña().equals(passAnt) && passNew.equals(verPass)) {
                    cuentas.get(i).setContraseña(passNew); // Cambiar la contraseña
                    guardarCambios("Usuarios"); // Guardar cambios en el archivo
                    contraseñaCambiada = true;
                    break;
                }
            }
        }

        // Mostrar mensajes según si se cambió la contraseña o no
        if (contraseñaCambiada) {
            JOptionPane.showMessageDialog(null, "Se cambió la contraseña exitosamente.");
            new AccederCuenta().setVisible(true); // Mostrar la ventana de acceso a la cuenta
            this.setVisible(false); // Ocultar la ventana actual
            this.dispose(); // Liberar recursos de la ventana actual
        } else {
            JOptionPane.showMessageDialog(null, "Verifique sus datos por favor, no están correctos.");
            contrasenaActual.setText(""); // Limpiar campo de contraseña actual
            contrasenaNew.setText(""); // Limpiar campo de nueva contraseña
            verificarContrasena.setText(""); // Limpiar campo de verificación de contraseña
        }
    }//GEN-LAST:event_BotonConfirmarActionPerformed
    
    // Método para guardar los cambios en el archivo de cuentas
    public void guardarCambios(String Archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Archivo))) {
            writer.write(""); // Vaciar el archivo antes de escribir los nuevos datos
            // Escribir cada cuenta en una línea separada en el archivo
            for (int i = 0; i < cuentas.size(); i++) {
                writer.write(cuentas.get(i).getNombre() + ";" + cuentas.get(i).getApellido() + ";" + cuentas.get(i).getNroCuenta() + ";" + cuentas.get(i).getLogin() + ";" + cuentas.get(i).getContraseña());
                writer.newLine(); // Agregar un salto de línea después de cada cuenta
            }
            System.out.println("ArrayList guardado en " + Archivo + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }

    // Método para llenar el ArrayList de cuentas desde el archivo
    public void llenarListaCuentas() {
        AccederCuenta acc = new AccederCuenta(); // Instancia de la clase AccederCuenta para acceder a métodos de archivo
        ArrayList<String> lineas = acc.obtenerTexto("Usuarios"); // Obtener líneas del archivo de cuentas
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";"); // Tokenizar cada línea por ";"
                if (tokens.countTokens() >= 5) { // Verificar si hay al menos 5 tokens en la línea
                    String nombrec = tokens.nextToken(); // Obtener nombre de cuenta
                    String apellido = tokens.nextToken(); // Obtener apellido de cuenta
                    int nroc = 0;
                    try {
                        nroc = Integer.parseInt(tokens.nextToken()); // Obtener número de cuenta (convertir a entero)
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage());
                    }
                    String login = tokens.nextToken(); // Obtener login de cuenta
                    String contraseña = tokens.nextToken(); // Obtener contraseña de cuenta
                    Cuenta cuenta = new Cuenta(nombrec, apellido, nroc, login, contraseña); // Crear objeto de tipo Cuenta
                    cuentas.add(cuenta); // Agregar cuenta al ArrayList
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios."); // Mensaje si no hay líneas en el archivo
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void datos(String nombre, int nro, String apellido, int idioma, String selec) {
        this.nombre = nombre;// Asigna el nombre recibido al atributo 'nombre' de la clase
        this.nro = nro;// Asigna el número recibido al atributo 'nro' de la clase
        this.apellido = apellido;// Asigna el apellido recibido al atributo 'apellido' de la clase
        this.idioma = idioma;// Asigna el idioma recibido al atributo 'idioma' de la clase
        this.selec = selec;// Asigna la selección recibida al atributo 'selec' de la clase
    }


    // Método principal, generado automáticamente para ejecutar la interfaz gráfica
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarContrasena().setVisible(true); // Mostrar la interfaz gráfica para cambiar contraseña
            }
        });
    }
    
    // Método para configurar el idioma de la interfaz según la selección del usuario
    public void idioma(int idioma) {
        if (idioma == 1) {
            ingles(); // Configurar interfaz en inglés
        } else if (idioma == 2) {
            quechua(); // Configurar interfaz en quechua
        }
    }
    
    // Método para configurar la interfaz en inglés
    public void ingles(){
        jButton2.setText("Confirm");
        BotonAtras.setText("Back");
        jLabel4.setText("Enter the current password:");
        jLabel5.setText("Enter your new password:");
        jLabel6.setText("Confirm the new password:");
        BotonConfirmar.setText("Confirm");
        jLabel1.setText("Change Password");
    }

    // Método para configurar la interfaz en quechua
    public void quechua(){
        jButton2.setText("Kachkanay");
        BotonAtras.setText("Qhipa");
        jLabel4.setText("Kachkanay kay k'itinchik:");
        jLabel5.setText("Kachkanay musoq k'itinchik:");
        jLabel6.setText("Kachkanay musoq k'itinchik ruranay:");
        BotonConfirmar.setText("Kachkanay");
        jLabel1.setText("Simi ñit'iyta tukuy");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonConfirmar;
    private javax.swing.JPasswordField contrasenaActual;
    private javax.swing.JPasswordField contrasenaNew;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField verificarContrasena;
    // End of variables declaration//GEN-END:variables
}
