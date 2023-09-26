package pck_area_rectangulo;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmAreaRectangulo extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTextField txtbase = new JTextField();
    private JTextField txtaltura = new JTextField();
    private JButton btncalcular = new JButton();
    private JLabel jLabel3 = new JLabel();
    private JTextField txtarea = new JTextField();
 private int h,b;
    public FrmAreaRectangulo() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Area de un rectangulo" );
        jLabel1.setText("ingresar base");
        jLabel1.setBounds(new Rectangle(10, 25, 75, 25));
        jLabel2.setText("ingresar altura");
        jLabel2.setBounds(new Rectangle(10, 65, 75, 20));
        txtbase.setBounds(new Rectangle(90, 25, 50, 25));
        txtaltura.setBounds(new Rectangle(90, 65, 50, 25));
        btncalcular.setText("calcular");
        btncalcular.setBounds(new Rectangle(160, 40, 70, 30));
        btncalcular.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btncalcular_actionPerformed(e);
                    }
                });
        jLabel3.setText("el area es:");
        jLabel3.setBounds(new Rectangle(170, 80, 65, 25));
        txtarea.setBounds(new Rectangle(230, 80, 50, 25));
        this.getContentPane().add(txtarea, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(btncalcular, null);
        this.getContentPane().add(txtaltura, null);
        this.getContentPane().add(txtbase, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
    }

private int area( int b,int h){
int a;
    a=b*h;
    return a  ; 
    
}
    private void btncalcular_actionPerformed(ActionEvent e) {
    int b,h,f;
    b=Integer.parseInt(txtbase.getText());
    h=Integer.parseInt(txtaltura.getText());
     f= area(h,b);
    txtarea.setText(""+f);
    }
}
