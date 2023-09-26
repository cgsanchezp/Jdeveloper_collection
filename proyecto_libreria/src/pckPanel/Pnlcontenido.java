package pckPanel;


import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.StringTokenizer;

import javax.swing.ActionMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;

import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import pckLogico.ClassEncapsular;
import pckLogico.ClassMetodos;


public class Pnlcontenido extends JPanel {
    int ordenE,orden;
    ClassEncapsular atri=new ClassEncapsular();
    ClassMetodos metodo=new ClassMetodos();
    String titulos[]={"reg","codigo","Marca","Articulos","modelo","precio","cantidad","precio_total","tip_pago","tip_credito","aumento","descuentos","pago_total"};
    String acceso[][]={};
    String f,prep;
    String g;
      int t=2,elemento; 
   
      
    double pc,c;
double p;
int cant;
    private JLabel jLabel1 = new JLabel();
    private JSeparator jSeparator2 = new JSeparator();
    private JSeparator jSeparator3 = new JSeparator();
    private JLabel jLabel2 = new JLabel();
    private JComboBox cboProducto = new JComboBox();
    private JLabel jLabel3 = new JLabel();
    private JComboBox cboModelo = new JComboBox();
    private JLabel jLabel4 = new JLabel();
    int r=0;
    private DefaultListModel dfg = new DefaultListModel();
    private JLabel lblPrecio = new JLabel();
    private JSeparator jSeparator4 = new JSeparator();
    private JRadioButton rbtEfectivo = new JRadioButton();
    private JRadioButton rbtCredito = new JRadioButton();
    private JLabel lblImagen = new JLabel();
    private Object gp = new Object();
    private JLabel jLabel6 = new JLabel();
    private Object oc = new Object();
    private JComboBox cboCredito = new JComboBox();
    private JLabel lblplazo = new JLabel();
    private JLabel lblTotaldesc = new JLabel();
    private JLabel lblPagototal = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();
    private JComboBox cboMarc = new JComboBox();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private DefaultTableModel dfmd = new DefaultTableModel(acceso,titulos );
    private JTable jTable1 = new JTable();
    private JButton btnListar = new JButton();

    private JComboBox cboTpago = new JComboBox();
    private JLabel lblTippago = new JLabel();
    private JLabel totalaumento = new JLabel();

    private JLabel jLabel5 = new JLabel();
    private JTextField txtCantidad = new JTextField();
    private JButton btnCalcular = new JButton();
    private JLabel jLabel7 = new JLabel();
    private JTextField txtTotal = new JTextField();

    private JTable jTable2 = new JTable();
    private JTable jTable3 = new JTable();
    private JCheckBox chkigv = new JCheckBox();
    private JTextField txtd = new JTextField();
    private JLabel jLabel8 = new JLabel();
    private JButton btnprim = new JButton();
    private JButton btnant = new JButton();
    private JButton btnsig = new JButton();
    private JButton btnult = new JButton();
    private JButton btnOrdenar = new JButton();
    private JLabel lblRegistro = new JLabel();
    private JTable tabla = new JTable();
    private JTable tab = new JTable();
    private JTable tabl = new JTable();
    private JTable tab2 = new JTable();
    private JTable a = new JTable();
    private JTable jTable4 = new JTable();
    private JButton btnGuardar = new JButton();
    private JButton btnCerrar = new JButton();

    public Pnlcontenido() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(761, 828));
        this.setBackground(Color.black);
        jLabel1.setText("Venta de utiles escolares");
        jLabel1.setBounds(new Rectangle(190, 5, 325, 25));
        jLabel1.setForeground(Color.white);
        jLabel1.setFont(new Font("Cambria", 1, 18));
        jSeparator2.setBounds(new Rectangle(0, 5, 785, 2));
        jSeparator2.setBackground(new Color(164, 0, 0));
        jSeparator2.setForeground(new Color(231, 0, 0));
        jSeparator3.setBounds(new Rectangle(0, 30, 775, 2));
        jSeparator3.setBackground(new Color(164, 0, 0));
        jSeparator3.setForeground(new Color(231, 0, 0));
        jLabel2.setBounds(new Rectangle(40, 50, 115, 40));
        jLabel2.setBorder(BorderFactory.createTitledBorder("Marca"));
        jLabel2.setBackground(new Color(99, 255, 99));
        jLabel2.setForeground(Color.white);
        cboProducto.setBounds(new Rectangle(185, 65, 105, 20));
        cboProducto.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cboProducto_actionPerformed(e);
                    }
                });
        jLabel3.setBounds(new Rectangle(180, 50, 115, 40));
        jLabel3.setBorder(BorderFactory.createTitledBorder("Articulos"));
        jLabel3.setBackground(new Color(99, 255, 99));
        jLabel3.setForeground(Color.white);
        cboModelo.setBounds(new Rectangle(315, 65, 110, 20));
        cboModelo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cboModelo_actionPerformed(e);
                    }
                });
        jLabel4.setBounds(new Rectangle(310, 50, 120, 40));
        jLabel4.setBorder(BorderFactory.createTitledBorder("Modelo"));
        jLabel4.setBackground(new Color(99, 255, 99));
        jLabel4.setForeground(Color.white);
        lblPrecio.setBounds(new Rectangle(480, 40, 105, 35));
        lblPrecio.setBorder(BorderFactory.createTitledBorder("Precio"));
        lblPrecio.setForeground(Color.white);
        lblPrecio.setActionMap(new ActionMap());
        jSeparator4.setBounds(new Rectangle(0, 165, 815, 5));
        jSeparator4.setBackground(new Color(0, 214, 214));
        jSeparator4.setForeground(new Color(247, 247, 247));
        rbtEfectivo.setText("Al contado");
        rbtEfectivo.setBackground(Color.black);
        rbtEfectivo.setForeground(Color.red);
        rbtEfectivo.setBounds(new Rectangle(55, 185, 115, 20));
        rbtEfectivo.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        rbtEfectivo_actionPerformed(e);
                    }
                });
        rbtCredito.setText("Credito");
        rbtCredito.setBackground(Color.black);
        rbtCredito.setForeground(Color.red);
        rbtCredito.setBounds(new Rectangle(55, 215, 70, 20));
        rbtCredito.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        rbtCredito_actionPerformed(e);
                    }
                });
        lblImagen.setBounds(new Rectangle(585, 35, 130, 125));
        lblImagen.setForeground(Color.white);
        lblImagen.setFont(new Font("Calibri", 1, 18));
        lblImagen.setBorder(BorderFactory.createTitledBorder("Imagen"));
        jLabel6.setBounds(new Rectangle(40, 170, 125, 75));
        jLabel6.setBorder(BorderFactory.createTitledBorder("Tipo de compra"));
        jLabel6.setForeground(new Color(156, 255, 0));
        cboCredito.setBounds(new Rectangle(325, 190, 95, 25));
        lblplazo.setBounds(new Rectangle(320, 175, 105, 50));
        lblplazo.setBorder(BorderFactory.createTitledBorder("Plazo"));
        lblplazo.setForeground(new Color(181, 181, 0));
        lblplazo.setText("ninguno");
        lblTotaldesc.setText("0");
        lblTotaldesc.setBounds(new Rectangle(160, 255, 105, 45));
        lblTotaldesc.setBackground(new Color(0, 247, 247));
        lblTotaldesc.setBorder(BorderFactory.createTitledBorder("descuento"));
        lblTotaldesc.setForeground(new Color(0, 148, 231));
        lblPagototal.setText("0");
        lblPagototal.setBounds(new Rectangle(205, 305, 125, 50));
        lblPagototal.setBorder(BorderFactory.createTitledBorder("Pago total"));
        lblPagototal.setForeground(new Color(82, 198, 255));
        jButton1.setFont(new Font("Calibri", 1, 17));
        jButton1.setBackground(new Color(0, 173, 255));
        jButton1.setFocusCycleRoot(true);
        jButton1.setBounds(new Rectangle(615, 215, 100, 25));
        jButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton1_actionPerformed(e);
                    }
                });
        jButton2.setBounds(new Rectangle(615, 250, 100, 25));
        jButton2.setFont(new Font("Calibri", 1, 17));
        jButton2.setBackground(new Color(0, 173, 255));
        jButton2.setSize(new Dimension(100, 25));
        jButton3.setBounds(new Rectangle(615, 285, 100, 25));
        jButton3.setFont(new Font("Calibri", 1, 17));
        jButton3.setBackground(new Color(0, 173, 255));
        jButton3.setSize(new Dimension(100, 25));
        cboMarc.setBounds(new Rectangle(45, 65, 105, 20));
        cboMarc.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cboMarc_actionPerformed(e);
                    }
                });
        jScrollPane1.setBounds(new Rectangle(20, 410, 760, 80));
        dfmd.setColumnCount(13);
        this.add(btnCerrar, null);
        this.add(btnGuardar, null);
        this.add(lblRegistro, null);
        this.add(btnOrdenar, null);
        this.add(btnult, null);
        this.add(btnsig, null);
        this.add(btnant, null);
        this.add(btnprim, null);
        this.add(jLabel8, null);
        this.add(txtd, null);
        this.add(chkigv, null);
        this.add(txtTotal, null);
        this.add(jLabel7, null);
        this.add(btnCalcular, null);
        this.add(txtCantidad, null);
        this.add(jLabel5, null);
        this.add(totalaumento, null);
        this.add(lblTippago, null);
        this.add(cboTpago, null);
        this.add(btnListar, null);
        this.add(jScrollPane1, null);
        jScrollPane1.getViewport().add(jTable1, null);
        jScrollPane1.getViewport().add(jTable2, null);
        jScrollPane1.getViewport().add(jTable3, null);
        jScrollPane1.getViewport().add(tabla, null);
        jScrollPane1.getViewport().add(tab, null);
        jScrollPane1.getViewport().add(tabl, null);
        jScrollPane1.getViewport().add(tab2, null);
        jScrollPane1.getViewport().add(a, null);
        jScrollPane1.getViewport().add(jTable4, null);
        this.add(cboMarc, null);
        this.add(jButton3, null);
        this.add(jButton2, null);
        this.add(lblPagototal, null);
        this.add(lblTotaldesc, null);
        this.add(lblplazo, null);
        this.add(cboCredito, null);
        this.add(jLabel6, null);
        this.add(lblImagen, null);
        this.add(jSeparator4, null);
        this.add(lblPrecio, null);
        this.add(jLabel4, null);
        this.add(cboModelo, null);
        this.add(jLabel3, null);
        this.add(cboProducto, null);
        this.add(jLabel2, null);
        this.add(jSeparator3, null);
        this.add(jSeparator2, null);
        this.add(jLabel1, null);
        this.add(rbtEfectivo, null);
        this.add(rbtCredito, null);
        this.add(jButton1, null);
        cboMarc.addItem("Faber Castell");
        cboMarc.addItem("Artesco");
        cboMarc.addItem("Stanford");
        cboMarc.addItem("Alpha");
        jTable1.setModel(dfmd);
        btnListar.setBounds(new Rectangle(615, 320, 100, 25));
        btnListar.setFont(new Font("Calibri", 1, 17));
        btnListar.setBackground(new Color(0, 148, 231));
        btnListar.setSize(new Dimension(100, 25));
        btnListar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnListar_actionPerformed(e);
                    }
                });
        cboTpago.setBounds(new Rectangle(205, 195, 95, 25));
        lblTippago.setText("ninguno");
        lblTippago.setBounds(new Rectangle(195, 175, 120, 50));
        lblTippago.setBorder(BorderFactory.createTitledBorder("Tipo de pago"));
        lblTippago.setForeground(new Color(165, 165, 0));
        totalaumento.setText("0");
        totalaumento.setBounds(new Rectangle(275, 255, 90, 45));
        totalaumento.setBorder(BorderFactory.createTitledBorder("Aumento"));
        totalaumento.setForeground(new Color(82, 198, 255));
        jLabel5.setText("Cantidad");
        jLabel5.setBounds(new Rectangle(480, 75, 55, 30));
        jLabel5.setForeground(Color.green);
        txtCantidad.setBounds(new Rectangle(535, 80, 40, 20));
        txtCantidad.setSelectedTextColor(Color.black);
        btnCalcular.setBounds(new Rectangle(500, 105, 75, 20));
        btnCalcular.setFont(new Font("Calibri", 1, 12));
        btnCalcular.setBackground(new Color(148, 107, 0));
        btnCalcular.setRolloverEnabled(true);
        btnCalcular.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnCalcular_actionPerformed(e);
                    }
                });
        jLabel7.setText("Total");
        jLabel7.setBounds(new Rectangle(485, 130, 55, 30));
        jLabel7.setForeground(Color.green);
        txtTotal.setBounds(new Rectangle(530, 130, 50, 25));
        txtTotal.setColumns(2);
        txtTotal.setSelectedTextColor(Color.black);
      cboCredito.setVisible(false);
        cboCredito.setEnabled(false);
        cboCredito.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cboCredito_actionPerformed(e);
                    }
                });
        cboCredito.addItem("semanal");
        cboCredito.addItem("quincenal");
        cboCredito.addItem("mensual");
      cboTpago.setVisible(false);
        cboTpago.setEnabled(false);
        cboTpago.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        cboTpago_actionPerformed(e);
                    }
                });
        cboTpago.addItem("efectivo");
        cboTpago.addItem("tarjeta credito");
        jTable3.setModel(dfmd);
        chkigv.setText("IGV");
        chkigv.setBounds(new Rectangle(400, 135, 75, 19));
        chkigv.setForeground(Color.red);
        chkigv.setFont(new Font("Cambria", 1, 13));
        chkigv.setBackground(Color.black);
        chkigv.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        chkigv_actionPerformed(e);
                    }
                });
        txtd.setBounds(new Rectangle(430, 180, 130, 50));
        txtd.setSelectedTextColor(Color.black);
        txtd.setBackground(Color.black);
        txtd.setBorder(BorderFactory.createTitledBorder("precio_total + igv"));
        txtd.setForeground(new Color(165, 123, 0));
        jLabel8.setText("jLabel8");
        jLabel8.setBounds(new Rectangle(-720, -485, 830, 630));
        jLabel8.setForeground(new Color(49, 49, 255));
        jLabel8.setBackground(new Color(181, 90, 0));
        btnprim.setBounds(new Rectangle(190, 500, 35, 28));
        btnprim.setSize(new Dimension(35, 28));
        btnprim.setFont(new Font("Dialog", 0, 14));
        btnprim.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnprim_actionPerformed(e);
                    }
                });
        btnant.setBounds(new Rectangle(275, 500, 35, 28));
        btnant.setSize(new Dimension(35, 28));
        btnant.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnant_actionPerformed(e);
                    }
                });
        btnsig.setBounds(new Rectangle(350, 500, 35, 28));
        btnsig.setSize(new Dimension(35, 28));
        btnsig.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnsig_actionPerformed(e);
                    }
                });
        btnult.setBounds(new Rectangle(435, 500, 35, 28));
        btnult.setSize(new Dimension(35, 28));
        btnult.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnult_actionPerformed(e);
                    }
                });
        btnOrdenar.setBounds(new Rectangle(615, 355, 100, 25));
        btnOrdenar.setSize(new Dimension(100, 25));
        btnOrdenar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnOrdenar_actionPerformed(e);
                    }
                });
        lblRegistro.setText("jLabel9");
        lblRegistro.setBounds(new Rectangle(40, 255, 90, 40));
        lblRegistro.setBorder(BorderFactory.createTitledBorder("Registro _nº"));
        jButton1.setIcon(new ImageIcon("agre.jpg"));
        jButton2.setIcon(new ImageIcon("mod.jpg"));
        jButton3.setIcon(new ImageIcon("eliminar.jpg"));
        jButton3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton3_actionPerformed(e);
                    }
                });
        btnListar.setIcon(new ImageIcon("listar.jpg"));
        btnCalcular.setIcon(new ImageIcon("calcular.jpg"));
        btnsig.setIcon(new ImageIcon("sig.jpg"));
        btnant.setIcon(new ImageIcon("ant.jpg"));
        btnprim.setIcon(new ImageIcon("prim.jpg"));
        btnult.setIcon(new ImageIcon("ul.jpg"));
        btnOrdenar.setIcon(new ImageIcon("or.jpg"));
        btnGuardar.setIcon(new ImageIcon("gu.jpg"));
        btnCerrar.setIcon(new ImageIcon("cer.jpg"));
        tabl.setModel(dfmd);
        a.setModel(dfmd);
        jTable4.setModel(dfmd);
        btnGuardar.setBounds(new Rectangle(615, 5, 100, 25));
        btnGuardar.setSize(new Dimension(100, 25));
        btnGuardar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnGuardar_actionPerformed(e);
                    }
                });
        btnCerrar.setBounds(new Rectangle(725, 5, 35, 25));
        btnCerrar.setSize(new Dimension(35, 25));
        btnCerrar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnCerrar_actionPerformed(e);
                    }
                });
                btnant.setToolTipText("anterior");
        btnCalcular.setToolTipText("calcular el pago");
        btnCerrar.setToolTipText("Cerrar");
        btnGuardar.setToolTipText("Guardar");
        btnListar.setToolTipText("Mostrar los registros");
        btnOrdenar.setToolTipText("Ordenar los registros");
        btnprim.setToolTipText("Mostrar el primer registro");
        btnsig.setToolTipText("Siguiente");
        btnult.setToolTipText("Mostrar el ultimo registro");
        jButton1.setToolTipText("Agregar registro");
        jButton2.setToolTipText("Modificar registro");
        jButton3.setToolTipText("Eliminar registro");
        cargar();
    }
    public void cargar(){
            FileReader fr;

              try {
                  fr = new FileReader("Datos.txt");
                  BufferedReader br=new BufferedReader(fr);
                  String linea;
                  while((linea=br.readLine())!=null){
                      StringTokenizer st=new StringTokenizer(linea,",");
                      atri=new ClassEncapsular();
                      atri.setReg(Integer.parseInt(st.nextToken()));
                      atri.setCodigo(st.nextToken());
                      atri.setMar(st.nextToken());
                      atri.setProd(st.nextToken());
                      atri.setMod(st.nextToken());                
                      atri.setPrecio(Double.parseDouble(st.nextToken()));
                      atri.setCant(Integer.parseInt(st.nextToken()));
                      atri.setPrecio_total(Double.parseDouble(st.nextToken()));
                      atri.setTipo_pago(st.nextToken());
                      atri.setTipo_credito(st.nextToken());
                      atri.setAum(Double.parseDouble(st.nextToken()));
                      atri.setDescuento(Double.parseDouble(st.nextToken()));
                      atri.setTotal_pago(Double.parseDouble(st.nextToken()));
                      
                      metodo.AgregarDatos(atri);
                  }
                  br.close();
              } catch (FileNotFoundException e) {
                  // TODO
              } catch (IOException e) {
                  // TODO
                  
              }
          }

    
    public void Grabar(){
        FileWriter fw;
      try {
          fw = new FileWriter("Datos.txt");
          PrintWriter pw=new PrintWriter(fw);
          for(int i=0;i<metodo.Tamaño();++i){
              atri=metodo.obtenerDtos(i);
              pw.println(atri.getReg()+","+atri.getCodigo()+","+atri.getMar()+","+atri.getProd()+","+atri.getMod()+","+atri.getPrecio()+","+ atri.getCant()+","+atri.getPrecio_total()+","+atri.getTipo_pago()+","+ atri. getTipo_credito()+","+ atri. getAum()+","+ atri. getDescuento()+","+ atri. getTotal_pago());                
          }
          pw.close();
      } catch (IOException e) {
          // TODO
      }
     
    }
    //Procedimiento articulos//
        void ArticulosF (){
            cboProducto.addItem("Colores");
            cboProducto.addItem("Plumones");
            cboProducto.addItem("Lapices"); 
            cboProducto.addItem("Temperas"); 
            }
            
        void ArticulosAr (){
            cboProducto.addItem("lapices");
            cboProducto.addItem("reglas");
            cboProducto.addItem("Colores");
           
        }
        void ArticulosS (){
            cboProducto.addItem("Cuadernos");
             cboProducto.addItem("Hojas");
            cboProducto.addItem("papelografo");
        }
        
        void ArticulosAl (){
            cboProducto.addItem("Cuadernos");
            cboProducto.addItem("Block´s");
        }
        
        
        //procedimiento modelos de articulos faber//

    void modelosFL(){
       
        cboModelo.addItem("paquete 6 colores");
        cboModelo.addItem("paquete 12 colores");
        
        }
    void modelosFP(){
       
        cboModelo.addItem("paquete 10 plumones");
        cboModelo.addItem("paquete 25 plumones");
        
        }
    void modelosFC(){
       
        cboModelo.addItem("1B");
        cboModelo.addItem("2B");
        cboModelo.addItem("2HB");    
        
        }
        
    void modelosFT(){
       
        cboModelo.addItem("caja 6 temperas");
        cboModelo.addItem("caja 12 temperas");
            
        }
        
    //procedimiento modelos de articulos  Artesco//
                        
    void modelosArl(){
       
        cboModelo.addItem("2B");
        cboModelo.addItem("2HB");
        }
        
    void modelosArC(){
       
            cboModelo.addItem("Paquete 10 colores");
            cboModelo.addItem("Paquete 20 colores");
        }
        
    void modelosArR(){
            cboModelo.addItem("Juego de escuadras");
            cboModelo.addItem("regla 30 cm");
                cboModelo.addItem("Transportador");
        
          
        } 
        
    // procedimiento modelos de articulos Stanford//
     void modelosSC(){
        
         cboModelo.addItem("A4 cuadriculado");
         cboModelo.addItem("A4 rayado");
           
         } 
    void modelosSH(){
       
        cboModelo.addItem("A4 cuadriculado");
        cboModelo.addItem("A4 rayado");
          
        } 
    void modelosSP(){
       
        cboModelo.addItem("cuadriculado");
        cboModelo.addItem("rayado");
        cboModelo.addItem("blanco");
        }    
    //procedimiento modelos de articulos Alpha//
     void modelosAlC(){
         cboModelo.addItem("A4 cuadriculado");
         cboModelo.addItem("A4 rayado");
        
         } 
    void modelosAlB(){
        cboModelo.addItem("cuadriculado");
        cboModelo.addItem("rayado");
        cboModelo.addItem("blanco");
          
       
        }


    private void cboMarc_actionPerformed(ActionEvent e) {
        cboProducto.removeAllItems();
    
            int orden=cboMarc.getSelectedIndex();
            switch(orden){
               
                case 0:ArticulosF ();break;
                case 1: ArticulosAr();break;
                case 2: ArticulosS();break;
                case 3: ArticulosAl();break;
                
                 }
    }

    private void cboProducto_actionPerformed(ActionEvent e) {
    
             cboModelo.removeAllItems(); 
             
               ordenE=cboMarc.getSelectedIndex();
               orden=cboProducto.getSelectedIndex();
              if(ordenE==0){
                switch(orden){
                  case 0:modelosFL();break;
                  case 1:modelosFP();break;
                  case 2:modelosFC();break;
                  case 3:modelosFT();break; 
                  }
              }
                   if(ordenE==1){
                       switch(orden){
                           case 0:modelosArl();break;
                           case 1:modelosArR();break;
                           case 2:modelosArC();;break;
                       }
                   }
                   if(ordenE==2){
                       switch(orden){
                           case 0:modelosSC();break;
                           case 1:modelosSH();break;
                           case 2:modelosSP();break;
                       }    
                   }   
                   
                   if(ordenE==3){
                       switch(orden){
                           case 0:modelosAlC();break;
                           case 1:modelosAlB();break;
                        
                       }    
                   }   
               }

   
    private void cboModelo_actionPerformed(ActionEvent e) {
        lblPrecio.setText("");
      
        int ordenMo=cboModelo.getSelectedIndex();
        
        if(ordenE==0){
           if(orden==0){
               switch(ordenMo){
                       case 0:
                       lblImagen.setIcon(new ImageIcon("colorf6.jpg"));
                              p=2.50;
                               break;
                       case 1:
                     lblImagen.setIcon(new ImageIcon("colorf12.jpg"));
                              p=5.0;
                                break; 
                    
                               
                               
                 }
           }
        
        
           if(orden==1){
               switch(ordenMo){
                       case 0:
                    lblImagen.setIcon(new ImageIcon("plum12f.jpg"));
                              p=10;
                               break; 
                       case 1:
                    lblImagen.setIcon(new ImageIcon("plum25f.jpg"));
                              p=25;
                               break; 
                       
                }
           }
        
           if(orden==2){
               switch(ordenMo){
                       case 0:
                 lblImagen.setIcon(new ImageIcon("lpfb.jpg"));
                              p=0.50;
                               break; 
                       case 1:
                 lblImagen.setIcon(new ImageIcon("lpf2b.jpg"));
                              p=1.0;
                               break; 
                       case 2:
                 lblImagen.setIcon(new ImageIcon("lpf2hb.jpg"));
                              p=1.50;
                               break; 
             }
           }
           
            if(orden==3){
                switch(ordenMo){
                        case 0:
                  lblImagen.setIcon(new ImageIcon("tpfa.jpg"));
                               p=10.0;
                                break; 
                        case 1:
                  lblImagen.setIcon(new ImageIcon("tpfb.jpg"));
                               p=20.0;
                                break; 
                       
              }
            }
        }    
         if(ordenE==1){
            if(orden==0){
                switch(ordenMo){
                    case 0:
            lblImagen.setIcon(new ImageIcon("lpa1.jpg"));
                             p=0.40;
                               break; 
                    case 1:
            lblImagen.setIcon(new ImageIcon("lpa2.jpg"));
                             p=0.80;
                               break; 
                                                 
        }
        }
         
             if(orden==1){
                 switch(ordenMo){
                    case 0:
                 lblImagen.setIcon(new ImageIcon("juegoar.jpg"));
                        p=3.50;
                          break; 
                    case 1:
                 lblImagen.setIcon(new ImageIcon("reglaar.jpg"));
                        p=0.50;
                           break; 
                    case 2:
                 lblImagen.setIcon(new ImageIcon("transar.jpg"));
                        p=0.50;
                            break; 
                                      
             }
        }

           if(orden==2){
             switch(ordenMo){
                 case 0:
                 lblImagen.setIcon(new ImageIcon("colar1.jpg"));
                      p=4.50;
                         break; 
                 case 1:
                 lblImagen.setIcon(new ImageIcon("colar2.jpg"));
                      p=15;
                         break; 
                      
             }
           }
         }
         
         
         
        if(ordenE==2){
          if(orden==0){
            switch(ordenMo){
                 case 0:
               lblImagen.setIcon(new ImageIcon("cuads1.jpg"));
                      p=3.50;
                        break; 
                 case 1:
                    lblImagen.setIcon(new ImageIcon("cuads2.jpg"));
                      p=3.20;
                        break; 
               
             
                     }
                  
                                }  
                             if(orden==1){
                             switch(ordenMo){
                              case 0:
                               lblImagen.setIcon(new ImageIcon("hojs1.jpg"));
                             p=5.50;
                             break;
                             case 1:
                              p=5.30;
                             break;
                                    }
                             
                                      
                                      
                                                  }
                             if(orden==2){
                             switch(ordenMo){
                              case 0:
                             p=0.10;
                             break;
                             case 1:
                              p=0.15;
                             break;
                               case 2:
                              p=0.10;
                              break;
                                    }
                             
                                      
                                      
                                                  }                                                              
                         } 
        if(ordenE==3){
          if(orden==0){
            switch(ordenMo){
                 case 0:
                      p=2.80;
                        break; 
                 case 1:
                      p=2.70;
                        break; 
               
             
                             }
                  
                                       }  
                             if(orden==1){
                             switch(ordenMo){
                              case 0:
                             p=1.50;
                             break;
                             case 1:
                              p=1.30;
                             break;
                               case 2:
                                 p=1.60;
                              break;
                                    }
                             
                                      
                                      
                                                  }
                                                                                        
                         }    
                         
   lblPrecio.setText(""+p);

  
     

    } 
   

    private void rbtEfectivo_actionPerformed(ActionEvent e) {
       
    if(rbtEfectivo.isSelected()==true){
     totalaumento.setText("0");  
        rbtCredito.setSelected(false);
        cboCredito.setVisible(false);
       lblplazo.setText("ninguno");
        cboTpago.setVisible(true);
        lblTippago.setText("");
        cboTpago.setEnabled(true);
        cboCredito.setEnabled(false);
        atri.setCant(Double.parseDouble(txtCantidad.getText()));
        atri.setPrecio_total(metodo.precio_total(atri.getPrecio(),atri.getCant()));
      g="ninguno";
    }
    }

    private void rbtCredito_actionPerformed(ActionEvent e) {
        if(rbtCredito.isSelected()==true){
        lblTotaldesc.setText("0");
        atri.setTipoc("credito"); 
        rbtEfectivo.setSelected(false);
        cboCredito.setVisible(true);
        cboTpago.setVisible(false);
        cboTpago.setEnabled(false);
        cboCredito.setEnabled(true);
        lblplazo.setText("");
        lblTippago.setText("ninguno");
       f="ninguno";
     
    }
}



    private void jButton1_actionPerformed(ActionEvent e) {
       atri=new ClassEncapsular();
        sumar();
        leerDatos();
        agregarArray();
        r++;
        lblRegistro.setText(""+r);
      
        metodo.AgregarDatos(atri);
    }
    private void leerDatos() {
    atri.setReg(r);
    atri.setMar(cboMarc.getSelectedItem().toString());
    atri.setProd(cboProducto.getSelectedItem().toString());
    atri.setMod(cboModelo.getSelectedItem().toString());
     atri.setTipo_pago(f);
     atri.setTipo_credito(g);
     atri.setPrecio(p);
     atri.setCant(Double.parseDouble(txtCantidad.getText()));
     atri.setPrecio_total(Double.parseDouble(txtTotal.getText()));
    atri.setI("IGV");
    atri.setDescuento(Double.parseDouble(lblTotaldesc.getText()));
    atri.setAum(Double.parseDouble(totalaumento.getText()));
    atri.setTotal_pago(Double.parseDouble(lblPagototal.getText()));
    atri.setReg(r);
      r++;
    atri.setCodigo(metodo.Codigo(atri.getMar(),atri.getProd(),atri.getMod(),atri.getReg()));
    }

    private void agregarArray() {
    }

    private void cboTpago_actionPerformed(ActionEvent e) {
        f=cboTpago.getSelectedItem().toString();
        atri.setTipo_pago(cboTpago.getSelectedItem().toString());
        
         atri.setDescuento(metodo.descuento(atri.getTipo_pago(),atri.getXigv()));
        lblTotaldesc.setText(""+atri.getDescuento());  
    

       
        
    }
    

    private void cboCredito_actionPerformed(ActionEvent e) {
        g=cboCredito.getSelectedItem().toString();
        atri.setTipo_credito(cboCredito.getSelectedItem().toString());
        
         atri.setAum(metodo.aum(atri.getTipo_credito(),atri.getXigv()));
          totalaumento.setText(""+atri.getAum());  
        
        
    }
    private void btnCalcular_actionPerformed(ActionEvent e) {
      
        lblRegistro.setText(""+r);
        atri.setPrecio(p);
        atri.setCant(Double.parseDouble(txtCantidad.getText()));
        atri.setPrecio_total(metodo.precio_total(atri.getPrecio(),atri.getCant()));

   
    txtTotal.setText(""+atri.getPrecio_total());
    }
   
    private void btnListar_actionPerformed(ActionEvent e) {
        dfmd.setRowCount(0);
     
        for(int j=0;j<metodo.Tamaño();++j){
        atri=metodo.obtenerDtos(j);
       Object valor[]={r,atri.getCodigo(),atri.getMar(),atri.getProd(),atri.getMod(),atri.getPrecio(),atri.getCant(),atri.getPrecio_total(),atri.getTipo_pago(),atri.getTipo_credito(),atri.getAum(),atri.getDescuento(),atri.getTotal_pago(),atri.getCodigo()};
       dfmd.addRow(valor);
       
       
   }
       
     
    }

    private void chkigv_actionPerformed(ActionEvent e) {
  
        atri.setI("IGV");
        atri.setXigv(metodo.xigv(atri.getI(),atri.getPrecio_total()));
        txtd.setText(""+atri.getXigv());
    }
    
    void sumar(){
        atri.setAum(Double.parseDouble(totalaumento.getText()));
        atri.setXigv(Double.parseDouble(txtd.getText()));
        atri.getDescuento();
        atri.setTotal_pago(metodo.total_pago(atri.getXigv(),atri.getAum(),atri.getDescuento()));
        lblPagototal.setText(""+atri.getTotal_pago());
    }

    private void btnOrdenar_actionPerformed(ActionEvent e) {
    
    }

    private void jButton3_actionPerformed(ActionEvent e) {
        int indice=jTable4.getSelectedRow();
        dfmd.removeRow(indice);
        metodo.Quitar(indice);
    
    }

    private void btnprim_actionPerformed(ActionEvent e) {
        jTable4.changeSelection(0,0,false,false);
    }

    private void btnult_actionPerformed(ActionEvent e) {
        int total=jTable4.getRowCount()-1;
            jTable4.changeSelection(total,0,false,false);
    }

    private void btnant_actionPerformed(ActionEvent e) {
        elemento=(jTable4.getRowCount())-t;         
           jTable4.changeSelection(elemento,0,false,false);
           ++t;   
    }

    private void btnsig_actionPerformed(ActionEvent e) {
        elemento=(jTable4.getSelectedRow())+1;        
           jTable4.changeSelection(elemento,0,false,false);
    }

    private void btnGuardar_actionPerformed(ActionEvent e) {
    Grabar();
    
    }

    private void btnCerrar_actionPerformed(ActionEvent e) {
    int h;
  
 
String prep= JOptionPane.showInputDialog("Desea guardar cambios si/no");



if(prep.equalsIgnoreCase("si")){
    Grabar();
    JOptionPane.showMessageDialog(null,"los registros han sido guardados correctamente");
    JOptionPane.showMessageDialog(null,"gracias por usar el producto");
    System.exit(0);
}else{
if(prep.equalsIgnoreCase("no")){
    JOptionPane.showMessageDialog(null,"gracias por usar el producto");
    System.exit(0);
}      


else{
   for(int y=24;y<1984548;y++){
    JOptionPane.showMessageDialog(null,"escriba solo si o no");
   prep= JOptionPane.showInputDialog("¡incorrecto!Desea guardar cambios si/no");

    if(prep.equalsIgnoreCase("si")){
        Grabar();
        JOptionPane.showMessageDialog(null,"los registros han sido guardados correctamente");
        JOptionPane.showMessageDialog(null,"gracias por usar el producto");
         System.exit(0);
    }else{
    if(prep.equalsIgnoreCase("no")){
        JOptionPane.showMessageDialog(null,"gracias por usar el producto");
        System.exit(0);
        
    }      
}
}
}

    }}}