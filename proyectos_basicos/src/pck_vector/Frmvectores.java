package pck_vector;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.List;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class Frmvectores extends JFrame {
    final int tam=6;
    public String nom[]=new String[tam];
    Vector nombre= new Vector (6,5);//aqui se asigna el tamaño del vector //
    private JButton btnIngresarnom = new JButton();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private DefaultListModel dfmod1 = new DefaultListModel();
    private JList jList1 = new JList();
    private JTextField txtregistro = new JTextField();
    private JButton btnEliminar = new JButton();
    private JButton btnlimpiar = new JButton();

    public Frmvectores() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(424, 343));
        btnIngresarnom.setText("Ingresar nombres");
        btnIngresarnom.setBounds(new Rectangle(15, 25, 120, 30));
        btnIngresarnom.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnIngresarnom_actionPerformed(e);
                    }
                });
        jScrollPane1.setBounds(new Rectangle(20, 75, 105, 140));
        jList1.setBorder(BorderFactory.createTitledBorder("Nombres"));
        jList1.setSelectionForeground(new Color(0, 66, 198));
        jScrollPane1.getViewport().add(jList1, null);
        this.getContentPane().add(btnlimpiar, null);
        this.getContentPane().add(btnEliminar, null);
        this.getContentPane().add(txtregistro, null);
        this.getContentPane().add(jScrollPane1, null);
        this.getContentPane().add(btnIngresarnom, null);
        jList1.setModel(dfmod1);
        txtregistro.setBounds(new Rectangle(140, 75, 110, 50));
        txtregistro.setBorder(BorderFactory.createTitledBorder(" numero posicion"));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBounds(new Rectangle(255, 80, 90, 25));
        btnEliminar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnEliminar_actionPerformed(e);
                    }
                });
        btnlimpiar.setText("Limpiar");
        btnlimpiar.setBounds(new Rectangle(255, 110, 95, 25));
        btnlimpiar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnlimpiar_actionPerformed(e);
                    }
                });
    }
    void ingresar(){ //  funcion para ingresan los datos//
    Vector nombre= new Vector ();
    for(int g=0;g<nom.length;++g){
        nom[g]=JOptionPane.showInputDialog("Ingresar Datos");
      
    }
    
    }

    void agregar(){// funcion para agregar los datos a la lista//
    Vector nombre= new Vector (6,5);
    for(int g=0;g<nom.length;++g){
    
      dfmod1.addElement("Valor["+g+"]: "+nom[g]);
    }
    }


    void eliminar(){//funcion para  Eliminar un dato segun su posicion//
    int n=Integer.parseInt(txtregistro.getText());
    dfmod1.removeElementAt(n);
    }
    private void btnIngresarnom_actionPerformed(ActionEvent e) {
    //boton donde se toman los procedimientos ingresar(),y agregar()//
    ingresar();
    agregar();
    }

    private void btnEliminar_actionPerformed(ActionEvent e) {
        //boton donde se toma el procedimiento eliminar()//
    eliminar();
    }

    private void btnlimpiar_actionPerformed(ActionEvent e) {
    // boton para que sese limpia la lista//
    dfmod1.removeAllElements();
    }
  
}
