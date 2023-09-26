package pck_numero_menor;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmNumeroMenor extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JTextField txtnum1 = new JTextField();
    private JLabel jLabel2 = new JLabel();
    private JTextField txtnum3 = new JTextField();
    private JLabel jLabel3 = new JLabel();
    private JButton bntver = new JButton();
    private JLabel jLabel4 = new JLabel();
    private JTextField txtmenor = new JTextField();
    private JTextField txtnum2 = new JTextField();
    
    public FrmNumeroMenor() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Numero menor" );
        jLabel1.setText("primer numero");
        jLabel1.setBounds(new Rectangle(5, 25, 75, 20));
        txtnum1.setBounds(new Rectangle(85, 25, 50, 25));
        jLabel2.setText("segundo numero");
        jLabel2.setBounds(new Rectangle(5, 70, 85, 20));
        txtnum3.setBounds(new Rectangle(100, 70, 55, 25));
        jLabel3.setText("tercer numero");
        jLabel3.setBounds(new Rectangle(5, 115, 75, 20));
        txtnum3.setBounds(new Rectangle(90, 115, 50, 25));
        bntver.setText("ver");
        bntver.setBounds(new Rectangle(175, 45, 50, 30));
        bntver.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        bntver_actionPerformed(e);
                    }
                });
        jLabel4.setText("el numero menor es");
        jLabel4.setBounds(new Rectangle(215, 85, 110, 25));
        txtmenor.setBounds(new Rectangle(235, 115, 50, 25));
        txtnum2.setBounds(new Rectangle(95, 70, 45, 30));
        this.getContentPane().add(txtnum2, null);
        this.getContentPane().add(txtmenor, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(bntver, null);
        this.getContentPane().add(txtnum3, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(txtnum3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(txtnum1, null);
        this.getContentPane().add(jLabel1, null);
    }
    private  int menor(int a,int b,int c){
     int menor;
       menor=a;
       if(menor>b){
           menor=b;
       }
       if(menor>c){
           menor=c;
           
       }
        return menor;
    }
    
    private void bntver_actionPerformed(ActionEvent e) {
    int a,b,c,M;
    a=Integer.parseInt(txtnum1.getText());
    b=Integer.parseInt(txtnum2.getText());
    c=Integer.parseInt(txtnum3.getText());
    M=menor(a,b,c);
    txtmenor.setText(""+M);
    }

    
}
