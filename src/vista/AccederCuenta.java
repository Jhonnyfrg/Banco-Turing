package vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class AccederCuenta extends javax.swing.JFrame {

    // Variables
    private String log;
    private String contra;
    public ArrayList<Cuenta> listaCuentas;
    private String Nombre;
    private String Apellido;
    private int idioma;

    // Constructor
    public AccederCuenta() {
        initComponents(); // Inicializa los componentes de la interfaz gráfica
        listaCuentas = new ArrayList<>(); // Inicializa la lista de cuentas
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotonCrearCuenta = new javax.swing.JButton();
        BotonIrAtras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        ingresarjb = new javax.swing.JButton();
        LineaAmarilla1 = new javax.swing.JTextField();
        LineaNaranja = new javax.swing.JTextField();
        LineaAmarilla2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BIENVENIDO");
        jLabel3.setToolTipText("");

        BotonCrearCuenta.setBackground(new java.awt.Color(204, 204, 204));
        BotonCrearCuenta.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonCrearCuenta.setForeground(new java.awt.Color(0, 0, 102));
        BotonCrearCuenta.setText("Crear Cuenta");
        BotonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearCuentaActionPerformed(evt);
            }
        });

        BotonIrAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonIrAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonIrAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonIrAtras.setText("Atras");
        BotonIrAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIrAtrasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BANCO TURNIG");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Usuario :");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("INGRESE SUS DATOS:");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Contraseña :");

        login.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 102));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 102));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        ingresarjb.setBackground(new java.awt.Color(204, 204, 204));
        ingresarjb.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        ingresarjb.setForeground(new java.awt.Color(0, 0, 102));
        ingresarjb.setText("Ingresar");
        ingresarjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarjbActionPerformed(evt);
            }
        });

        LineaAmarilla1.setBackground(new java.awt.Color(255, 204, 0));
        LineaAmarilla1.setBorder(null);

        LineaNaranja.setBackground(new java.awt.Color(255, 102, 0));
        LineaNaranja.setBorder(null);

        LineaAmarilla2.setBackground(new java.awt.Color(255, 204, 0));
        LineaAmarilla2.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(ingresarjb, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonIrAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LineaAmarilla1)
                    .addComponent(LineaNaranja)
                    .addComponent(LineaAmarilla2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCrearCuenta))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LineaAmarilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LineaNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LineaAmarilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonIrAtras)
                    .addComponent(ingresarjb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Método que se ejecuta al presionar el botón de ingresar    
    private void ingresarjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarjbActionPerformed
        log = login.getText(); // Obtiene el texto ingresado en el campo de usuario
        contra = String.valueOf(password.getText()); // Obtiene el texto ingresado en el campo de contraseña
        llenarLista(); // Llena la lista de cuentas desde el archivo
        boolean loginExitoso = false;
        int c = 0;

        // Itera sobre la lista de cuentas
        for (int j = 0; j < listaCuentas.size(); j++) {
            if (listaCuentas.get(j).iniciarSesion(log, contra)) { // Intenta iniciar sesión con las credenciales ingresadas
                MenuTransacciones menu = new MenuTransacciones(); // Crea una instancia del menú de transacciones
                String nombre = listaCuentas.get(j).getNombre();
                Nombre = nombre;
                String apellido = listaCuentas.get(j).getApellido();
                Apellido = apellido;
                int nro = listaCuentas.get(j).getNroCuenta();
                menu.datos(nombre, nro, apellido, idioma); // Configura los datos del usuario en el menú
                menu.cargarDatos(); // Carga los datos en el menú
                menu.idioma(idioma); // Configura el idioma en el menú
                this.dispose(); // Cierra la ventana actual de acceso
                menu.setVisible(true); // Muestra el menú de transacciones
                c = 1;
                loginExitoso = true;
                break;
            }
        }
        
        // Mensaje de error si el login no fue exitoso
        if (!loginExitoso) {
            JOptionPane.showMessageDialog(this, "Contraseña incorrecta o usuario no encontrado.", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println("BIENVENIDO."); // Mensaje de bienvenida en la consola
        }   
    }//GEN-LAST:event_ingresarjbActionPerformed

    
    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

    }//GEN-LAST:event_loginActionPerformed

    // Método que se ejecuta al presionar el botón de retroceder
    private void BotonIrAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIrAtrasActionPerformed
        new Inicio().setVisible(true); // Muestra la ventana de inicio
        this.setVisible(false); // Oculta la ventana actual de acceso
    }//GEN-LAST:event_BotonIrAtrasActionPerformed

    // Método que se ejecuta al presionar el botón de crear cuenta
    private void BotonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearCuentaActionPerformed
        CrearCuenta crear = new CrearCuenta(); // Crea una instancia de la ventana de creación de cuenta
        crear.idioma(idioma); // Configura el idioma en la ventana de creación de cuenta
        crear.setVisible(true); // Muestra la ventana de creación de cuenta
        this.setVisible(false); // Oculta la ventana actual de acceso
    }//GEN-LAST:event_BotonCrearCuentaActionPerformed
    
    // Método para mostrar el contenido de la lista de cuentas en la consola
    public void mostrar() {
        for (int j = 0; j < listaCuentas.size(); j++) {
            System.out.println(listaCuentas.get(j));
        }
    }

    // Método para leer el contenido de un archivo de texto y retornarlo como una lista de líneas
    public ArrayList<String> obtenerTexto(String nombreA) {
        ArrayList<String> lineasDeTexto = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreA)); // Abre el archivo para lectura
            String linea;
            while ((linea = br.readLine()) != null) { // Lee cada línea del archivo
                lineasDeTexto.add(linea); // Agrega la línea a la lista
            }
            br.close(); // Cierra el archivo
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Se produjo un error al leer el archivo."); // Muestra mensaje de error
        }
        return lineasDeTexto; // Retorna la lista de líneas de texto
    }

    // Método para llenar la lista de cuentas a partir de un archivo de usuarios
    public void llenarLista() {
        ArrayList<String> lineas = obtenerTexto("Usuarios"); // Obtiene todas las líneas del archivo "Usuarios"
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";"); // Divide la línea en tokens separados por ";"
                if (tokens.countTokens() >= 5) { // Verifica si hay al menos 5 tokens en la línea
                    String nombre = tokens.nextToken();
                    String apellido = tokens.nextToken();
                    int nro = 0;
                    try {
                        nro = Integer.parseInt(tokens.nextToken()); // Convierte el token a entero
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage()); // Manejo de error si no se puede convertir a entero
                    }
                    String login = tokens.nextToken();
                    String contraseña = tokens.nextToken();
                    Cuenta cuenta = new Cuenta(nombre, apellido, nro, login, contraseña); // Crea un objeto cuenta
                    listaCuentas.add(cuenta); // Agrega la cuenta a la lista
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado."); // Mensaje de error si la línea no tiene el formato esperado
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios."); // Mensaje si no hay líneas en el archivo
        }
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
    
    // Método principal (main) para ejecutar la ventana de acceso
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccederCuenta().setVisible(true); // Crea y muestra la ventana de acceso
            }
        });
    }
    
    // Método para configurar los componentes en inglés
    public void ingles(){
        jLabel3.setText("WELCOME"); // Etiqueta de bienvenida
        BotonCrearCuenta.setText("Create Account"); // Botón para crear cuenta
        BotonIrAtras.setText("Back"); // Botón para retroceder
        jLabel4.setText("BANK TURNIG"); // Título del banco
        jLabel5.setText("User :"); // Etiqueta de usuario
        jLabel6.setText("ENTER YOUR DETAILS:"); // Etiqueta para ingresar detalles
        jLabel7.setText("Password :"); // Etiqueta de contraseña
        ingresarjb.setText("Log In"); // Botón para ingresar
    }
    
    // Método para configurar los componentes en quechua
    public void quechua(){
        jLabel3.setText("YATICHAÑATAKI"); // Etiqueta de bienvenida en quechua
        BotonCrearCuenta.setText("Ch'ini Ikkhuta"); // Botón para crear cuenta en quechua
        BotonIrAtras.setText("Qhipa"); // Botón para retroceder en quechua
        jLabel4.setText("BANCO TURNIG"); // Título del banco en quechua
        jLabel5.setText("Lurata :"); // Etiqueta de usuario en quechua
        jLabel6.setText("QILLQAYKITA KAYKUNA:"); // Etiqueta para ingresar detalles en quechua
        jLabel7.setText("Apatamawka :"); // Etiqueta de contraseña en quechua
        ingresarjb.setText("Yatiyki"); // Botón para ingresar en quechua
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearCuenta;
    private javax.swing.JButton BotonIrAtras;
    private javax.swing.JTextField LineaAmarilla1;
    private javax.swing.JTextField LineaAmarilla2;
    private javax.swing.JTextField LineaNaranja;
    private javax.swing.JButton ingresarjb;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
