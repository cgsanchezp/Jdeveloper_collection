package pck_promedio;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrmCalcularPromedio extends JFrame {
    private JLabel jLabel1 = new JLabel();
    private JComboBox cbocurso = new JComboBox();
    private JLabel jLabel2 = new JLabel();
    private JTextField txtnt = new JTextField();
    private JLabel jLabel3 = new JLabel();
    private JTextField txtnl = new JTextField();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JLabel jLabel6 = new JLabel();
    private JTextField txtep = new JTextField();
    private JTextField txtef = new JTextField();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JTextField txtpc = new JTextField();
    private JLabel jLabel9 = new JLabel();
    private JTextField txta = new JTextField();
    private JLabel jLabel10 = new JLabel();
    private JLabel jLabel11 = new JLabel();
    private JButton btncalcular = new JButton();
    private JLabel lblpromedio = new JLabel();

    public FrmCalcularPromedio() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(557, 400));
        this.setTitle( "PROMEDIO-CODIGO" );
        jLabel1.setText("ELIJA CODIGO DEL CURSO");
        jLabel1.setBounds(new Rectangle(5, 10, 160, 25));
        cbocurso.setBounds(new Rectangle(145, 10, 105, 20));
        jLabel2.setText("nota de trabajo:");
        jLabel2.setBounds(new Rectangle(30, 95, 85, 30));
        txtnt.setBounds(new Rectangle(105, 95, 40, 25));
        jLabel3.setText("nota de laboratorio:");
        jLabel3.setBounds(new Rectangle(30, 135, 100, 25));
        txtnl.setBounds(new Rectangle(125, 135, 40, 25));
        jLabel4.setBounds(new Rectangle(20, 75, 160, 110));
        jLabel4.setBorder(BorderFactory.createTitledBorder("Evaluacion aplicativa"));
        jLabel5.setText("examen parcial");
        jLabel5.setBounds(new Rectangle(225, 90, 75, 25));
        jLabel6.setText("examen final");
        jLabel6.setBounds(new Rectangle(225, 130, 70, 20));
        txtep.setBounds(new Rectangle(305, 90, 40, 25));
        txtef.setBounds(new Rectangle(305, 125, 40, 25));
        jLabel7.setBounds(new Rectangle(210, 70, 160, 115));
        jLabel7.setBorder(BorderFactory.createTitledBorder("Evaluacion continua"));
        jLabel8.setText("participacion en clase");
        jLabel8.setBounds(new Rectangle(90, 225, 105, 25));
        txtpc.setBounds(new Rectangle(200, 225, 45, 25));
        jLabel9.setText(" asistencias");
        jLabel9.setBounds(new Rectangle(90, 265, 110, 25));
        txta.setBounds(new Rectangle(200, 265, 45, 25));
        jLabel10.setBounds(new Rectangle(75, 205, 195, 115));
        jLabel10.setBorder(BorderFactory.createTitledBorder("Evaluacion actitudinal"));
        jLabel11.setBounds(new Rectangle(10, 55, 375, 285));
        jLabel11.setBorder(BorderFactory.createTitledBorder("INGRESAR"));
        btncalcular.setText("calcular");
        btncalcular.setBounds(new Rectangle(415, 95, 75, 30));
        btncalcular.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btncalcular_actionPerformed(e);
                    }
                });
        lblpromedio.setBounds(new Rectangle(400, 140, 125, 70));
        lblpromedio.setBorder(BorderFactory.createTitledBorder("Promedio"));
        this.getContentPane().add(lblpromedio, null);
        this.getContentPane().add(btncalcular, null);
        this.getContentPane().add(jLabel11, null);
        this.getContentPane().add(jLabel10, null);
        this.getContentPane().add(txta, null);
        this.getContentPane().add(jLabel9, null);
        this.getContentPane().add(txtpc, null);
        this.getContentPane().add(jLabel8, null);
        this.getContentPane().add(jLabel7, null);
        this.getContentPane().add(txtef, null);
        this.getContentPane().add(txtep, null);
        this.getContentPane().add(jLabel6, null);
        this.getContentPane().add(jLabel5, null);
        this.getContentPane().add(jLabel4, null);
        this.getContentPane().add(txtnl, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(txtnt, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(cbocurso, null);
        this.getContentPane().add(jLabel1, null);
        cbocurso.addItem("f101");
        cbocurso.addItem("f102");
        cbocurso.addItem("f103");
    }
    private Double aplicativa(Double t,Double l){
        Double p1;
        
        p1=(t+l)/2;
        int curso=cbocurso.getSelectedIndex();
        switch(curso){
            case 0:
            p1=0.6*p1;
            break;
            case 1:
            p1=0.4*p1;
            break;
            case 2:
            p1=0.45*p1;
            break;
        }
        return p1;
    }
    private Double continua(Double ep,Double ef){
        Double p2;
        p2=(ep+ef)/2;
        int curso=cbocurso.getSelectedIndex();
        switch(curso){
            case 0:
            p2=0.3*p2;
            break;
            case 1:
            p2=0.5*p2;
            break;
            case 2:
            p2=0.45*p2;
            break;
        }
        return p2;
    }
    private Double actitud(Double pc,Double a){
        Double p3;
        p3=(pc+a)/2;
        int curso=cbocurso.getSelectedIndex();
        switch(curso){
            case 0:
            p3=0.1*p3;
            break;
            case 1:
            p3=0.1*p3;
            break;
            case 2:
            p3=0.1*p3;
            break;
        }
        return p3;
    }
    private void btncalcular_actionPerformed(ActionEvent e) {
    Double t,l,ep,ef,pc,a,x;
    t=Double.parseDouble(txtnt.getText());
    l=Double.parseDouble(txtnl.getText());
    ep=Double.parseDouble(txtep.getText());
    ef=Double.parseDouble(txtef.getText());
    pc=Double.parseDouble(txtpc.getText());
    a=Double.parseDouble(txta.getText());
    
    x=aplicativa(t,l)+continua(ep,ef)+actitud(pc,a);
    lblpromedio.setText(""+x);
    }
}
