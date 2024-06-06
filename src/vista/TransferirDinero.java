package vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class TransferirDinero extends javax.swing.JFrame {

    // Declaración de variables
    private String nombre;
    private int nro;
    private String apellido;
    private int idioma;
    private double sobra;
    private String selec;
    private double cam;
    private ArrayList<TipoCuenta> saldos;
    private ArrayList<Cuenta> cuentas;

    // Constructor de la clase
    public TransferirDinero() {
        saldos = new ArrayList<>();
        cuentas = new ArrayList<>();
        initComponents(); // Inicializa los componentes de la interfaz gráfica
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nrocuenta = new javax.swing.JTextField();
        jButtonConfirmar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        historial = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
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

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("dinero a transferir:");

        cantidad.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        cantidad.setForeground(new java.awt.Color(0, 0, 102));
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Ingrese N°de cuenta a");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("transferir:");

        nrocuenta.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        nrocuenta.setForeground(new java.awt.Color(0, 0, 102));
        nrocuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrocuentaActionPerformed(evt);
            }
        });

        jButtonConfirmar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonConfirmar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jButtonConfirmar.setForeground(new java.awt.Color(0, 0, 102));
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Transferir Dinero");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(126, 126, 126))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historial.setColumns(20);
        historial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        historial.setForeground(new java.awt.Color(255, 102, 0));
        historial.setRows(5);
        jScrollPane4.setViewportView(historial);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("HISTORIAL TRANSACCIONAL");

        jTextField2.setBackground(new java.awt.Color(255, 102, 0));
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(nrocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField2))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nrocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(BotonAtras)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método para manejar la acción del botón de confirmar
    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // Obtener el texto ingresado en los campos de número de cuenta y cantidad
        String nrocuentaText = nrocuenta.getText();
        String cantidadText = cantidad.getText();

        // Verificar si ambos campos están vacíos
        if (nrocuentaText.isEmpty() && cantidadText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los datos por favor.");
            return;
        }

        // Verificar si el campo de número de cuenta está vacío
        if (nrocuentaText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene el campo de Nro de Cuenta por favor.");
            return;
        }

        // Verificar si el campo de cantidad está vacío
        if (cantidadText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene el campo de cantidad por favor.");
            return;
        }

        // Verificar que los campos contengan solo números
        if (!nrocuentaText.matches("\\d+") || !cantidadText.matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "Los campos solo deben contener números.");
            return;
        }

        // Convertir los valores de los campos a tipos numéricos
        int nrocuen = Integer.parseInt(nrocuentaText); // Convertir el número de cuenta a entero
        double monto = Double.parseDouble(cantidadText); // Convertir el monto a doble

        boolean transferenciaRealizada = false; // Variable para controlar si se realizó la transferencia

        // Verificar si el número de cuenta y el monto son diferentes de cero
        if (nrocuen != 0 && monto != 0) {
            cuentas.clear(); // Limpiar la lista de cuentas
            llenarListaCuentas(); // Cargar la lista de cuentas desde el archivo

            // Iterar sobre las cuentas cargadas
            for (int i = 0; i < cuentas.size(); i++) {
                saldos.clear(); // Limpiar la lista de saldos
                String arch = cuentas.get(i).getNroCuenta() + ""; // Obtener el archivo de la cuenta actual
                llenarLista(arch); // Cargar los saldos de la cuenta desde el archivo

                // Iterar sobre los saldos de la cuenta actual
                for (int j = 0; j < saldos.size(); j++) {
                    // Verificar si el número de cuenta coincide con el ingresado
                    if (saldos.get(j).getNroCuenta() == nrocuen) {
                        // Construir el identificador único del historial
                        String histA = cuentas.get(i).getNroCuenta() + saldos.get(j).getTipoMoneda();

                        // Obtener la moneda del saldo actual
                        String mone = saldos.get(j).getTipoMoneda();

                        // Calcular el saldo actualizado después de la transferencia
                        double sal = cambiomoneda(saldos.get(j).getSaldo(), mone);

                        // Actualizar el saldo en la lista de saldos
                        saldos.get(j).setSaldo(sal);

                        // Guardar los cambios realizados en el archivo
                        guardarCambios(cuentas.get(i).getNroCuenta() + "");

                        // Limpiar la lista de saldos
                        saldos.clear();

                        // Descontar el monto transferido de la cuenta de origen
                        descontar();

                        // Registrar la transferencia en el historial de transacciones
                        Historial(monto, selec, nrocuen);

                        // Registrar la transferencia en el historial de la cuenta destino
                        Historial2(histA, cam, mone);

                        // Mostrar el historial actualizado en la interfaz gráfica
                        mostrarContenidoArchivo(nombre);

                        // Marcar la transferencia como realizada con éxito
                        transferenciaRealizada = true;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llene los datos por favor.");
            return;
        }

        // Mostrar mensaje de éxito o fracaso de la transferencia
        if (transferenciaRealizada) {
            JOptionPane.showMessageDialog(null, "¡Se realizó la transferencia con éxito!");
            // Limpiar los campos de texto después de la transferencia
            nrocuenta.setText("");
            cantidad.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Número de cuenta inválido.");
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed
    
    public void mostrarContenidoArchivo(String nombreArchivo) {
        historial.setText(""); // Limpiar el área de texto del historial

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            // Leer cada línea del archivo y mostrarla en el área de texto del historial
            while ((linea = br.readLine()) != null) {
                historial.append(linea + "\n"); // Agregar cada línea al historial, con salto de línea
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
        }
    }

    public void Historial2(String cuen, double z, String mon) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cuen, true))) {
            writer.write(""); // Limpiar el contenido del archivo antes de escribir

            // Escribir la información de la transferencia en una nueva línea del archivo
            writer.write("Se te transfirió: " + z + " " + mon + " de parte de: " + nombre + " " + apellido);
            writer.newLine(); // Agregar un salto de línea después de cada registro

            System.out.println("Historial guardado en " + cuen + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el historial en el archivo.");
            e.printStackTrace();
        }
    }

    public void descontar() {
        double retirar = Double.parseDouble(cantidad.getText()); // Obtener el monto a retirar

        llenarLista(nro + ""); // Cargar la lista de saldos desde el archivo

        // Iterar sobre la lista de saldos para encontrar la moneda seleccionada
        for (int i = 0; i < saldos.size(); i++) {
            if (saldos.get(i).getTipoMoneda().equals(selec)) {
                // Actualizar el saldo restando el monto a retirar
                saldos.get(i).setSaldo(saldos.get(i).getSaldo() - retirar);
                sobra = saldos.get(i).getSaldo(); // Actualizar el saldo restante
                guardarCambios(nro + ""); // Guardar los cambios en el archivo
            }
        }
    }

    
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuTransacciones menu = new MenuTransacciones(); // Crear instancia del menú de transacciones
        menu.datos(nombre, nro, apellido, idioma); // Transferir datos de usuario al menú
        menu.idioma(idioma); // Configurar idioma del menú
        menu.cargarDatos(); // Cargar datos necesarios en el menú
        menu.mantCuenta(selec); // Mantener cuenta seleccionada en el menú
        menu.setVisible(true); // Mostrar el menú de transacciones
        this.dispose(); // Cerrar la ventana actual
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void nrocuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrocuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nrocuentaActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed
    
    public void datos(String nombre, int nro, String selec, String apellido, int idioma) {
        this.nombre = nombre; // Asignar el nombre recibido al atributo nombre de la clase
        this.apellido = apellido; // Asignar el apellido recibido al atributo apellido de la clase
        this.selec = selec; // Asignar la selección de cuenta recibida al atributo selec de la clase
        this.nro = nro; // Asignar el número de cuenta recibido al atributo nro de la clase
        this.idioma = idioma; // Asignar el idioma recibido al atributo idioma de la clase
    }


    public double cambiomoneda(double dinero, String monedaT) {
        double cambio = Double.parseDouble(cantidad.getText()); // Obtener el monto de cambio ingresado
        cam = cambio; // Asignar el monto de cambio a la variable cam
        // Crear un formato decimal con tres decimales
        DecimalFormat formato = new DecimalFormat("#.###");

        // Verificar si la moneda seleccionada es la misma que la moneda de destino
        if (selec.equals(monedaT)) {
            cambio = cambio + dinero; // Sumar el dinero al cambio actual
        } else {
            // Realizar conversiones según la moneda seleccionada y la moneda de destino
            if (selec.equals("Bolivianos")) {
                if (monedaT.equals("Dolares")) {
                    cam = cambio / 6.9; // Calcular el cambio a dólares
                    cambio = dinero + (cambio / 6.9); // Sumar el dinero convertido a dólares al cambio actual

                }
                if (monedaT.equals("Euros")) {
                    cam = cambio / 7.44; // Calcular el cambio a euros
                    cambio = dinero + (cambio / 7.44); // Sumar el dinero convertido a euros al cambio actual

                }
            } else {
                if (selec.equals("Dolares")) {
                    if (monedaT.equals("Bolivianos")) {
                        cam = cambio * 6.9; // Calcular el cambio a bolivianos
                        cambio = dinero + (cambio * 6.9); // Sumar el dinero convertido a bolivianos al cambio actual

                    }
                    if (monedaT.equals("Euros")) {
                        cam = cambio * 0.93; // Calcular el cambio a euros
                        cambio = dinero + (cambio * 0.93); // Sumar el dinero convertido a euros al cambio actual

                    }
                } else {
                    if (selec.equals("Euros")) {
                        if (monedaT.equals("Dolares")) {
                            cam = cambio * 1.08; // Calcular el cambio a dólares
                            cambio = dinero + (cambio * 1.08); // Sumar el dinero convertido a dólares al cambio actual

                        }
                        if (monedaT.equals("Bolivianos")) {
                            cam = cambio * 7.44; // Calcular el cambio a bolivianos
                            cambio = dinero + (cambio * 7.44); // Sumar el dinero convertido a bolivianos al cambio actual

                        }
                    }
                }
            }
        }
        cam = Math.round(cam * 1000.0) / 1000.0; // Redondear cam a tres decimales
        return Math.round(cambio * 1000.0) / 1000.0; // Redondear cambio a tres decimales y devolverlo
    }


    /*public void cargarDatos() {
        llenarLista("" + nro);
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

     public void Historial(double m, String tipo, int ncc) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nro + selec, true))) {
            writer.write(""); // Limpiar el archivo antes de escribir (parece no ser necesario)
            writer.write("Se transfirio: " + m + " " + tipo + " a la cuenta: " + ncc); // Escribir la información de la transferencia
            writer.newLine(); // Agregar un salto de línea después de cada registro
            System.out.println("Historial guardado en " + nombre + " correctamente."); // Confirmar que se guardó el historial correctamente
        } catch (IOException e) {
            System.err.println("Error al guardar el historial en el archivo."); // Manejar errores de escritura
            e.printStackTrace();
        }
    }

    public void guardarCambios(String Archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Archivo))) {
            writer.write(""); // Limpiar el archivo antes de escribir (parece no ser necesario)
            for (int i = 0; i < saldos.size(); i++) {
                writer.write(saldos.get(i).getNroCuenta() + ";" + saldos.get(i).getTipoMoneda() + ";" + saldos.get(i).getSaldo());
                writer.newLine(); // Escribir cada línea de información de saldo en el archivo
            }
            System.out.println("Cambios guardados en " + Archivo + " correctamente."); // Confirmar que se guardaron los cambios correctamente
        } catch (IOException e) {
            System.err.println("Error al guardar los cambios en el archivo."); // Manejar errores de escritura
            e.printStackTrace();
        }
    }

    public void llenarLista(String archivo) {
        AccederCuenta acc = new AccederCuenta(); // Crear instancia para acceder a la cuenta
        ArrayList<String> lineas = acc.obtenerTexto(archivo); // Obtener las líneas del archivo especificado
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";"); // Separar la línea en tokens usando ";"
                if (tokens.countTokens() >= 3) { // Verificar si hay al menos 3 tokens en la línea
                    int nros = Integer.parseInt(tokens.nextToken()); // Obtener y convertir el número de cuenta a entero
                    String monedas = tokens.nextToken(); // Obtener el tipo de moneda
                    double saldo = Double.parseDouble(tokens.nextToken()); // Obtener y convertir el saldo a double
                    TipoCuenta tipoMoneda = new TipoCuenta(nros, monedas, saldo); // Crear instancia de TipoCuenta con la información obtenida
                    saldos.add(tipoMoneda); // Agregar la cuenta a la lista de saldos
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado."); // Manejar errores de formato de línea
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios."); // Indicar si no hay líneas en el archivo
        }
    }

    public void llenarListaCuentas() {
        AccederCuenta acc = new AccederCuenta(); // Crear instancia para acceder a la cuenta
        ArrayList<String> lineas = acc.obtenerTexto("Usuarios"); // Obtener las líneas del archivo "Usuarios"
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";"); // Separar la línea en tokens usando ";"
                if (tokens.countTokens() >= 5) { // Verificar si hay al menos 5 tokens en la línea
                    String nombrec = tokens.nextToken(); // Obtener el nombre de la cuenta
                    String apellido = tokens.nextToken(); // Obtener el apellido de la cuenta
                    int nroc = 0;
                    try {
                        nroc = Integer.parseInt(tokens.nextToken()); // Obtener y convertir el número de cuenta a entero
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage()); // Manejar errores de conversión
                    }
                    String login = tokens.nextToken(); // Obtener el nombre de usuario
                    String contraseña = tokens.nextToken(); // Obtener la contraseña
                    Cuenta cuenta = new Cuenta(nombrec, apellido, nroc, login, contraseña); // Crear instancia de Cuenta con la información obtenida
                    cuentas.add(cuenta); // Agregar la cuenta a la lista de cuentas
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado."); // Manejar errores de formato de línea
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios."); // Indicar si no hay líneas en el archivo
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferirDinero().setVisible(true); // Crear una nueva instancia de TransferirDinero y mostrarla
            }
        });
    }

    public void idioma(int idioma) {
        if (idioma == 1) {
            ingles(); // Configurar el idioma en inglés
        } else if (idioma == 2) {
            quechua(); // Configurar el idioma en quechua
        }
    }
    
    // Método para configurar la interfaz en inglés
    public void ingles(){
        jLabel2.setText("Enter the amount of");
        BotonAtras.setText("Back");
        jLabel3.setText("money to transfer:");
        jLabel4.setText("Enter account number");
        jLabel5.setText("to transfer:");
        jButtonConfirmar.setText("Confirm");
        jLabel1.setText("Transfer Money");
        jLabel7.setText("TRANSACTION HISTORY");
    }

    // Método para configurar la interfaz en quechua
    public void quechua(){
        jLabel2.setText("Qullqiyta waktay");
        BotonAtras.setText("Qhipa");
        jLabel3.setText("ñananchasqa:");
        jLabel4.setText("Qillqayki ruray");
        jLabel5.setText("ñananchasqa:");
        jButtonConfirmar.setText("Kachkanay");
        jLabel1.setText("Qullqi waktay");
        jLabel7.setText("LLAQTANAKUQ WAKT'AYNIN");
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextArea historial;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField nrocuenta;
    // End of variables declaration//GEN-END:variables
}
