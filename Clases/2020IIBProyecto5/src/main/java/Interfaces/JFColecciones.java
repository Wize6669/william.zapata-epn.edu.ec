package Interfaces;

import Fuentes.Pais;
import Fuentes.Provincia;

public class JFColecciones extends javax.swing.JFrame {
    public Pais lista;
    
    public JFColecciones() {
        initComponents();
        lista = new Pais();
        this.setLocationRelativeTo(null);
        this.jTAPais.setEditable(false);
        this.jTAInformacionCrearOrdenar.setEditable(false);  
        this.jTAProvMayorNumHabitantes.setEditable(false);  
        this.jTAProvMenorNumHabitantes.setEditable(false);  
        this.jTANombreProvBuscar.setEditable(false);  
        this.jTANumHabitantesProvBuscar.setEditable(false);
        this.jTFNombreProvCrearOrdenar.requestFocus(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAInformacionCrearOrdenar = new javax.swing.JTextArea();
        jTFNombreProvCrearOrdenar = new javax.swing.JTextField();
        jTFNumHabitantesProvCrearOrdenar = new javax.swing.JTextField();
        jBAceptarPestanaUno = new javax.swing.JButton();
        jBClasificaNombreProv = new javax.swing.JButton();
        jBClasificaNumHabitantes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTFNumeroProvCrearOrdenar = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAProvMayorNumHabitantes = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAProvMenorNumHabitantes = new javax.swing.JTextArea();
        jBProvMayorNumHabitantes = new javax.swing.JButton();
        jBProvMenorNumHabitantes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTFNombreProvBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTANombreProvBuscar = new javax.swing.JTextArea();
        jBNombreProvBuscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTFNumHabitantesProvBuscar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTANumHabitantesProvBuscar = new javax.swing.JTextArea();
        jBNumHabitantesProvBuscar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTFPrvoEliminar = new javax.swing.JTextField();
        jBEliminarProv = new javax.swing.JButton();
        jBNuevoEliminarProv = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTAProvinciasActualizado = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAPais = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnuISalir = new javax.swing.JMenuItem();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("País");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Núm-Habitantes:");

        jLabel4.setText("Información:");

        jTAInformacionCrearOrdenar.setBackground(new java.awt.Color(255, 255, 255));
        jTAInformacionCrearOrdenar.setColumns(20);
        jTAInformacionCrearOrdenar.setRows(5);
        jScrollPane1.setViewportView(jTAInformacionCrearOrdenar);

        jTFNombreProvCrearOrdenar.setBackground(new java.awt.Color(255, 255, 255));

        jTFNumHabitantesProvCrearOrdenar.setBackground(new java.awt.Color(255, 255, 255));

        jBAceptarPestanaUno.setText("Aceptar");
        jBAceptarPestanaUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarPestanaUnoActionPerformed(evt);
            }
        });

        jBClasificaNombreProv.setText("Clasifica Nombre-Prov");
        jBClasificaNombreProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClasificaNombreProvActionPerformed(evt);
            }
        });

        jBClasificaNumHabitantes.setText("Clasifica Num-Habitantes");
        jBClasificaNumHabitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClasificaNumHabitantesActionPerformed(evt);
            }
        });

        jLabel1.setText("Número:");

        jTFNumeroProvCrearOrdenar.setBackground(new java.awt.Color(255, 255, 255));

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFNombreProvCrearOrdenar)
                            .addComponent(jTFNumeroProvCrearOrdenar)
                            .addComponent(jTFNumHabitantesProvCrearOrdenar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(344, 344, 344))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBAceptarPestanaUno)
                                .addGap(28, 28, 28)
                                .addComponent(jBNuevo))
                            .addComponent(jBClasificaNombreProv)
                            .addComponent(jBClasificaNumHabitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFNombreProvCrearOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFNumeroProvCrearOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFNumHabitantesProvCrearOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jBNuevo)
                                    .addComponent(jBAceptarPestanaUno))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBClasificaNombreProv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBClasificaNumHabitantes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear - Ordenar", jPanel1);

        jLabel6.setText("Provincia con Mayor Núm de Habitantes:");

        jLabel8.setText("Provincia con Menor Núm de Habitantes:");

        jTAProvMayorNumHabitantes.setBackground(new java.awt.Color(255, 255, 255));
        jTAProvMayorNumHabitantes.setColumns(20);
        jTAProvMayorNumHabitantes.setRows(5);
        jScrollPane3.setViewportView(jTAProvMayorNumHabitantes);

        jTAProvMenorNumHabitantes.setBackground(new java.awt.Color(255, 255, 255));
        jTAProvMenorNumHabitantes.setColumns(20);
        jTAProvMenorNumHabitantes.setRows(5);
        jScrollPane4.setViewportView(jTAProvMenorNumHabitantes);

        jBProvMayorNumHabitantes.setText("Provincia con Mayor Núm de Habitantes:");
        jBProvMayorNumHabitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProvMayorNumHabitantesActionPerformed(evt);
            }
        });

        jBProvMenorNumHabitantes.setText("Provincia con Menor Núm de Habitantes:");
        jBProvMenorNumHabitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProvMenorNumHabitantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBProvMayorNumHabitantes))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBProvMenorNumHabitantes)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBProvMayorNumHabitantes)
                    .addComponent(jBProvMenorNumHabitantes))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mayor - Menor", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Nombre de la Provincia a buscar:");

        jTFNombreProvBuscar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Resultado:");

        jTANombreProvBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jTANombreProvBuscar.setColumns(20);
        jTANombreProvBuscar.setRows(5);
        jScrollPane5.setViewportView(jTANombreProvBuscar);

        jBNombreProvBuscar.setText("Búsqueda Binaria-Provincia");
        jBNombreProvBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNombreProvBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFNombreProvBuscar))
                    .addComponent(jLabel11)
                    .addComponent(jBNombreProvBuscar))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNombreProvBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBNombreProvBuscar)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("Número de Habitantes:");

        jTFNumHabitantesProvBuscar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("Resultado:");

        jTANumHabitantesProvBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jTANumHabitantesProvBuscar.setColumns(20);
        jTANumHabitantesProvBuscar.setRows(5);
        jScrollPane6.setViewportView(jTANumHabitantesProvBuscar);

        jBNumHabitantesProvBuscar.setText("Búsqueda Binaria-Núm de Habitantes");
        jBNumHabitantesProvBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNumHabitantesProvBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addComponent(jTFNumHabitantesProvBuscar))
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNumHabitantesProvBuscar))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNumHabitantesProvBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBNumHabitantesProvBuscar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Búsqueda Binaria", jPanel3);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Provincia a eliminar:");

        jTFPrvoEliminar.setBackground(new java.awt.Color(255, 255, 255));

        jBEliminarProv.setText("Eliminar");
        jBEliminarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarProvActionPerformed(evt);
            }
        });

        jBNuevoEliminarProv.setText("Nuevo");
        jBNuevoEliminarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoEliminarProvActionPerformed(evt);
            }
        });

        jTAProvinciasActualizado.setBackground(new java.awt.Color(255, 255, 255));
        jTAProvinciasActualizado.setColumns(20);
        jTAProvinciasActualizado.setRows(5);
        jScrollPane7.setViewportView(jTAProvinciasActualizado);

        jLabel14.setText("País:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jTFPrvoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBNuevoEliminarProv)
                            .addComponent(jBEliminarProv))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTFPrvoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminarProv)
                        .addGap(18, 18, 18)
                        .addComponent(jBNuevoEliminarProv))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Provincia", jPanel6);

        jLabel5.setText("País:");

        jTAPais.setBackground(new java.awt.Color(255, 255, 255));
        jTAPais.setColumns(20);
        jTAPais.setRows(5);
        jScrollPane2.setViewportView(jTAPais);

        jMenu1.setText("File");

        jMnuISalir.setText("Salir");
        jMnuISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuISalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuISalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAceptarPestanaUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarPestanaUnoActionPerformed
        String nombProvincia = this.jTFNombreProvCrearOrdenar.getText();
        int numProvincia = Integer.parseInt(this.jTFNumeroProvCrearOrdenar.getText());
        int numHabitanteProvincia = Integer.parseInt(this.jTFNumHabitantesProvCrearOrdenar.getText());
        Provincia prov = new Provincia(nombProvincia, numProvincia, numHabitanteProvincia);
        this.jTAInformacionCrearOrdenar.setText(prov.toString());
        lista.addProvincia(prov);
        this.jTAPais.setText(lista.toString());
    }//GEN-LAST:event_jBAceptarPestanaUnoActionPerformed

    private void jMnuISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuISalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMnuISalirActionPerformed

    private void jBClasificaNombreProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClasificaNombreProvActionPerformed
        lista.ordenarPaisNombreProvincias();
        jTAPais.setText(lista.toString());
    }//GEN-LAST:event_jBClasificaNombreProvActionPerformed

    private void jBClasificaNumHabitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClasificaNumHabitantesActionPerformed
       lista.ordenarPaisNumHabitantes();
       jTAPais.setText(lista.toString());
    }//GEN-LAST:event_jBClasificaNumHabitantesActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        this.jTFNombreProvCrearOrdenar.setText("");
        this.jTFNumeroProvCrearOrdenar.setText("");
        this.jTFNumHabitantesProvCrearOrdenar.setText("");
        this.jTFNombreProvCrearOrdenar.requestFocus(true);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBProvMayorNumHabitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProvMayorNumHabitantesActionPerformed
        Provincia provincia;
        provincia = (Provincia)lista.provinciaMaxNumHabitantentes();
        jTAProvMayorNumHabitantes.setText(provincia.toString());
    }//GEN-LAST:event_jBProvMayorNumHabitantesActionPerformed

    private void jBProvMenorNumHabitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProvMenorNumHabitantesActionPerformed
        Provincia provincia;
        provincia = (Provincia)lista.provinciaMinNumHabitantentes();
        jTAProvMenorNumHabitantes.setText(provincia.toString());
    }//GEN-LAST:event_jBProvMenorNumHabitantesActionPerformed

    private void jBNombreProvBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNombreProvBuscarActionPerformed
        String nombreProvincia = this.jTFNombreProvBuscar.getText();
        Provincia provBuscar = new Provincia(nombreProvincia,0,0);
        int posic=lista.busquedaBinariaNombreProvincia(provBuscar);
        if(posic!=-1)
            jTANombreProvBuscar.setText(lista.getProvincias().get(posic).toString());
        else 
            jTANombreProvBuscar.setText("Provincia No encontrada !!!"); 
    }//GEN-LAST:event_jBNombreProvBuscarActionPerformed

    private void jBNumHabitantesProvBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNumHabitantesProvBuscarActionPerformed
        int numHabitantes = Integer.parseInt(this.jTFNumHabitantesProvBuscar.getText());
        Provincia provBuscar = new Provincia("",0,numHabitantes);
        int posic=lista.busquedaBinariaNumHabitantes(provBuscar);
        if(posic!=-1)
            jTANumHabitantesProvBuscar.setText(lista.getProvincias().get(posic).toString());
        else 
            jTANumHabitantesProvBuscar.setText("Provincia No encontrada !!!"); 
    }//GEN-LAST:event_jBNumHabitantesProvBuscarActionPerformed

    private void jBEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarProvActionPerformed
        String nombreProv;
        nombreProv = this.jTFPrvoEliminar.getText();
        Provincia prov =  new Provincia(nombreProv,0,0); 
        lista.remover(nombreProv);
        this.jTAProvinciasActualizado.setText(lista.toString());
        this.jTAPais.setText(lista.toString());
    }//GEN-LAST:event_jBEliminarProvActionPerformed

    private void jBNuevoEliminarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoEliminarProvActionPerformed
        this.jTFPrvoEliminar.setText("");
    }//GEN-LAST:event_jBNuevoEliminarProvActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFColecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFColecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFColecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFColecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFColecciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptarPestanaUno;
    private javax.swing.JButton jBClasificaNombreProv;
    private javax.swing.JButton jBClasificaNumHabitantes;
    private javax.swing.JButton jBEliminarProv;
    private javax.swing.JButton jBNombreProvBuscar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBNuevoEliminarProv;
    private javax.swing.JButton jBNumHabitantesProvBuscar;
    private javax.swing.JButton jBProvMayorNumHabitantes;
    private javax.swing.JButton jBProvMenorNumHabitantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnuISalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTAInformacionCrearOrdenar;
    private javax.swing.JTextArea jTANombreProvBuscar;
    private javax.swing.JTextArea jTANumHabitantesProvBuscar;
    private javax.swing.JTextArea jTAPais;
    private javax.swing.JTextArea jTAProvMayorNumHabitantes;
    private javax.swing.JTextArea jTAProvMenorNumHabitantes;
    private javax.swing.JTextArea jTAProvinciasActualizado;
    private javax.swing.JTextField jTFNombreProvBuscar;
    private javax.swing.JTextField jTFNombreProvCrearOrdenar;
    private javax.swing.JTextField jTFNumHabitantesProvBuscar;
    private javax.swing.JTextField jTFNumHabitantesProvCrearOrdenar;
    private javax.swing.JTextField jTFNumeroProvCrearOrdenar;
    private javax.swing.JTextField jTFPrvoEliminar;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}