package pckPresentacion;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FrmOperacion extends JFrame {
    private JLabel lblfondo = new JLabel();
    private JButton btnSuma = new JButton();
    private JButton btnResta = new JButton();
    private JButton btnMulti = new JButton();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JTextField txt1 = new JTextField();
    private JTextField txt2 = new JTextField();
    private JLabel jLabel4 = new JLabel();
    private JTextField txtSol = new JTextField();
    private JButton jButton1 = new JButton();
Double a,b,s;
    private JLabel lblImagemap = new JLabel();
    private JLabel y = new JLabel();
    private JButton btnpt = new JButton();
    private JButton btnpt1 = new JButton();
    private JButton jButton2 = new JButton();
    private JLabel jLabel6 = new JLabel();
    private JLabel jLabel7 = new JLabel();
    private JButton btncuad = new JButton();
    private JButton btnRectan = new JButton();
    private JButton jButton3 = new JButton();
    private JButton jButton4 = new JButton();
    private JButton jButton5 = new JButton();
    private JButton jButton6 = new JButton();
    private JButton jButton7 = new JButton();
    private JButton jButton8 = new JButton();
    private JButton jButton9 = new JButton();
    private JButton jButton10 = new JButton();

    public FrmOperacion() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(550, 574));
        this.setTitle("MAGICTRONIC-Supercalc");
        this.setResizable(false);
        lblfondo.setBounds(new Rectangle(0, 0, 550, 550));
        lblfondo.setSize(new Dimension(550, 550));
        this.getContentPane().add(jButton10, null);
        this.getContentPane().add(jButton9, null);
        this.getContentPane().add(jButton8, null);
        this.getContentPane().add(jButton7, null);
        this.getContentPane().add(jButton6, null);
        this.getContentPane().add(jButton5, null);
        this.getContentPane().add(jButton4, null);
        this.getContentPane().add(jButton3, null);
        this.getContentPane().add(btnRectan, null);
        this.getContentPane().add(btncuad, null);
        this.getContentPane().add(jLabel7, null);
        this.getContentPane().add(jLabel6, null);
        this.getContentPane().add(jButton2, null);
        this.getContentPane().add(btnpt1, null);
        this.getContentPane().add(btnpt, null);
        this.getContentPane().add(y, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(txtSol, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(txt2, null);
        this.getContentPane().add(txt1, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(btnMulti, null);
        this.getContentPane().add(btnResta, null);
        this.getContentPane().add(btnSuma, null);
        this.getContentPane().add(lblfondo, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(lblImagemap, null);
        lblfondo.setIcon(new ImageIcon("fondo.jpg"));
     y.setIcon(new ImageIcon("s.png"));
        btnSuma.setText("+");
        btnSuma.setBounds(new Rectangle(475, 325, 45, 45));
        btnSuma.setToolTipText("null");
        btnSuma.setFont(new Font("Dialog", 1, 16));
        btnSuma.setSize(new Dimension(45, 45));
        btnSuma.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnSuma_actionPerformed(e);
                    }
                });
        btnResta.setText("-");
        btnResta.setBounds(new Rectangle(475, 285, 40, 30));
        btnResta.setToolTipText("null");
        btnResta.setFont(new Font("Dialog", 1, 12));
        btnResta.setSize(new Dimension(40, 30));
        btnResta.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnResta_actionPerformed(e);
                    }
                });
        btnMulti.setText("x");
        btnMulti.setBounds(new Rectangle(425, 285, 40, 30));
        btnMulti.setToolTipText("null");
        btnMulti.setFont(new Font("Dialog", 1, 11));
        btnMulti.setSize(new Dimension(40, 30));
        btnMulti.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnMulti_actionPerformed(e);
                    }
                });
        jLabel1.setBounds(new Rectangle(390, 25, 120, 115));
        jLabel2.setText("Primer   numero");
        jLabel2.setBounds(new Rectangle(185, 295, 105, 20));
        jLabel2.setForeground(new Color(247, 247, 247));
        jLabel3.setText("Segundo numero");
        jLabel3.setBounds(new Rectangle(185, 320, 100, 20));
        jLabel3.setForeground(new Color(247, 247, 247));
        txt1.setBounds(new Rectangle(290, 290, 50, 25));
        txt2.setBounds(new Rectangle(290, 320, 50, 25));
        jLabel4.setText("Resultado");
        jLabel4.setBounds(new Rectangle(185, 350, 100, 20));
        jLabel4.setForeground(new Color(247, 247, 247));
        txtSol.setBounds(new Rectangle(290, 350, 50, 25));
        txtSol.setEditable(false);
        jButton1.setText("/");
        jButton1.setBounds(new Rectangle(425, 330, 40, 35));
        jButton1.setFont(new Font("Dialog", 1, 11));
        jButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton1_actionPerformed(e);
                    }
                });
        lblImagemap.setBounds(new Rectangle(65, -10, 300, 374));
        lblImagemap.setSize(new Dimension(300, 374));
        y.setText("jLabel5");
        y.setBounds(new Rectangle(0, -20, 195, 180));
        btnpt.setText("x ^ y");
        btnpt.setBounds(new Rectangle(430, 375, 60, 30));
        btnpt.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnpt_actionPerformed(e);
                    }
                });
        btnpt1.setText("x ^ y");
        btnpt1.setBounds(new Rectangle(430, 375, 60, 30));
        btnpt1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnpt_actionPerformed(e);
                    }
                });
        jButton2.setText("x^ 1/y");
        jButton2.setBounds(new Rectangle(430, 415, 90, 30));
        jButton2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton2_actionPerformed(e);
                    }
                });
        jLabel6.setText("¿Desea realizar otras ");
        jLabel6.setBounds(new Rectangle(15, 295, 125, 25));
        jLabel6.setForeground(Color.white);
        jLabel7.setText("otras operaciones?");
        jLabel7.setBounds(new Rectangle(25, 315, 120, 25));
        jLabel7.setForeground(Color.white);
        btncuad.setText("Area de un cuadrado");
        btncuad.setBounds(new Rectangle(10, 350, 155, 25));
        btncuad.setBackground(new Color(198, 0, 0));
        btncuad.setForeground(Color.white);
        btncuad.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btncuad_actionPerformed(e);
                    }
                });
        btnRectan.setText("Area de un rectangulo");
        btnRectan.setBounds(new Rectangle(10, 385, 155, 25));
        btnRectan.setBackground(Color.blue);
        btnRectan.setForeground(Color.white);
        btnRectan.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnRectan_actionPerformed(e);
                    }
                });
        jButton3.setText("Area de una circulo");
        jButton3.setBounds(new Rectangle(10, 425, 155, 25));
        jButton3.setForeground(Color.white);
        jButton3.setBackground(new Color(0, 99, 0));
        jButton3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton3_actionPerformed(e);
                    }
                });
        jButton4.setText("Cuantas letras tiene mi nombre");
        jButton4.setBounds(new Rectangle(10, 465, 160, 25));
        jButton4.setForeground(Color.white);
        jButton4.setBackground(new Color(165, 66, 255));
        jButton4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton4_actionPerformed(e);
                    }
                });
        jButton5.setText("Clima  Mundial");
        jButton5.setBounds(new Rectangle(10, 25, 155, 25));
        jButton5.setBackground(new Color(0, 132, 132));
        jButton5.setFont(new Font("Dialog", 1, 13));
        jButton5.setForeground(Color.white);
        jButton5.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton5_actionPerformed(e);
                    }
                });
        jButton6.setText("Buscaminas");
        jButton6.setBounds(new Rectangle(210, 410, 120, 25));
        jButton6.setBackground(new Color(49, 49, 255));
        jButton6.setForeground(new Color(231, 231, 0));
        jButton6.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton6_actionPerformed(e);
                    }
                });
        jButton7.setText("Pinball");
        jButton7.setBounds(new Rectangle(210, 445, 120, 25));
        jButton7.setForeground(Color.white);
        jButton7.setBackground(new Color(174, 0, 0));
        jButton7.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton7_actionPerformed(e);
                    }
                });
        jButton8.setText("Enviar por Bluetooth");
        jButton8.setBounds(new Rectangle(365, 235, 165, 25));
        jButton8.setBackground(Color.black);
        jButton8.setForeground(Color.white);
        jButton8.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton8_actionPerformed(e);
                    }
                });
        jButton9.setText("Paint");
        jButton9.setBounds(new Rectangle(210, 485, 120, 25));
        jButton9.setForeground(Color.white);
        jButton9.setBackground(new Color(0, 117, 117));
        jButton9.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton9_actionPerformed(e);
                    }
                });
        jButton10.setText("Otras aplicaciones");
        jButton10.setBounds(new Rectangle(5, 235, 185, 25));
        jButton10.setBackground(Color.black);
        jButton10.setForeground(Color.white);
        jButton10.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jButton10_actionPerformed(e);
                    }
                });
        
    }

    private void btnSuma_actionPerformed(ActionEvent e) {
    a=Double.parseDouble(txt1.getText());
        b=Double.parseDouble(txt2.getText());
        s=a+b;
        txtSol.setText(""+s);
    }

    private void btnResta_actionPerformed(ActionEvent e) {
        a=Double.parseDouble(txt1.getText());
            b=Double.parseDouble(txt2.getText());
            s=a-b;
            txtSol.setText(""+s);
    }

    private void btnMulti_actionPerformed(ActionEvent e) {
        a=Double.parseDouble(txt1.getText());
            b=Double.parseDouble(txt2.getText());
            s=a*b;
            txtSol.setText(""+s);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        a=Double.parseDouble(txt1.getText());
            b=Double.parseDouble(txt2.getText());
            s=a/b;
            txtSol.setText(""+s);
    }

    private void btnpt_actionPerformed(ActionEvent e) {
        a=Double.parseDouble(txt1.getText());
            b=Double.parseDouble(txt2.getText());
            s=Math.pow(a,b);
            txtSol.setText(""+s);
    }

    private void jButton2_actionPerformed(ActionEvent e) {
        a=Double.parseDouble(txt1.getText());
            b=Double.parseDouble(txt2.getText());
            s=Math.pow(a,(1/b));
            txtSol.setText(""+s);
    }

    private void btncuad_actionPerformed(ActionEvent e) {
    int area,a;
    a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese lado del cuadrado"));
    area=a*a;
    JOptionPane.showMessageDialog(null,"El area del cuadrado es:  "+area);
    }

    private void btnRectan_actionPerformed(ActionEvent e) {
    
        int arear,a,x;
        a=Integer.parseInt(JOptionPane.showInputDialog("Ancho del rectangulo"));
        x=Integer.parseInt(JOptionPane.showInputDialog("largo del rectangulo"));
        arear=a*x;
        JOptionPane.showMessageDialog(null,"El area del rectangulo es:  "+arear);
    }

    private void jButton3_actionPerformed(ActionEvent e) {
        Double arear,a,x;
        a=Double.parseDouble(JOptionPane.showInputDialog("Ingresar radio de la circunferencia"));
        
        arear=3.14*a*a;
        JOptionPane.showMessageDialog(null,"El area del circulo es:  "+arear);
    }

    private void jButton4_actionPerformed(ActionEvent e) {
      int h;
      String  a=(JOptionPane.showInputDialog("Ingresar Palabra"));
      h=a.length();
        JOptionPane.showMessageDialog(null,"La palabra   "+a+ " contiene  "+h+"  letras");
    }

    private void jButton5_actionPerformed(ActionEvent e) {
        String  a;
        int c=0;
    for(int i=0;i<5;i++){
        JOptionPane.showMessageDialog(null,"La Aplicacion aun no esta disponible");
        JOptionPane.showMessageDialog(null,"Es posible que necesite de una contraseña");
        JOptionPane.showMessageDialog(null,"Consulte con su distribuidor");
          a=(JOptionPane.showInputDialog("Por favor ingrese contraseña"));
   
    if(a.equalsIgnoreCase("pastilla123")){
        JOptionPane.showMessageDialog(null,"Instale los controladores de video en su pc"); 
    }else{
        c=c+1;   
    }
    
    
    }
    if(c>4){
        JOptionPane.showMessageDialog(null,"Consulte con su distribuidor"); 
    }
        if(c==5){
            System.exit(0); 
        }
       
    }

    private void jButton6_actionPerformed(ActionEvent e) {
        try {
                 Runtime.getRuntime().exec("winmine.exe ");
             }catch (IOException f) {
                 System.out.println("ERROR:"+f.getMessage());
    }
}

    private void jButton7_actionPerformed(ActionEvent e) {
        try {
                 Runtime.getRuntime().exec("pinball.exe");
             }catch (IOException f) {
                 System.out.println("ERROR:"+f.getMessage());
        }
    }

    private void jButton8_actionPerformed(ActionEvent e) {
        try {
                 Runtime.getRuntime().exec("fsquirt.exe");
             }catch (IOException f) {
                 System.out.println("ERROR:"+f.getMessage());
        }
    }

    private void jButton9_actionPerformed(ActionEvent e) {
        try {
                 Runtime.getRuntime().exec("mspaint.exe");
             }catch (IOException f) {
                 System.out.println("ERROR:"+f.getMessage());
        }
    }

    private void jButton10_actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"La Aplicacion aun no esta disponible");
        JOptionPane.showMessageDialog(null,"Es posible que necesite de una contraseña");
        JOptionPane.showMessageDialog(null,"Consulte con su distribuidor");
      String    a=(JOptionPane.showInputDialog("Por favor ingrese contraseña"));
    }
}
