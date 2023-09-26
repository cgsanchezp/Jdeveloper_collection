package pckPresentacion;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class FrmAcceso extends JFrame {
    private JLabel lblFondo = new JLabel();
    FrmContenido principal= new FrmContenido();
   
    private JLabel jLabel1 = new JLabel();
    GregorianCalendar fecha=new GregorianCalendar();
    private JLabel lblFecha = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTextField txtUsuario = new JTextField();
    private JLabel lblhora = new JLabel();
    private JButton btnAceptar = new JButton();
    private JButton btnCancelar = new JButton();
    String usuario,contraseña;
    int cont=0;
    private JLabel lblInc = new JLabel();
    private JPasswordField txtps = new JPasswordField();

    public FrmAcceso() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(398, 311));
        this.setTitle("SCHOOLBOOK.NET/acceso de usuario");
        lblFondo.setBounds(new Rectangle(0, -5, 405, 311));
        lblFondo.setSize(new Dimension(405, 311));
        this.getContentPane().add(txtps, null);
        this.getContentPane().add(lblInc, null);
        this.getContentPane().add(btnCancelar, null);
        this.getContentPane().add(btnAceptar, null);
        this.getContentPane().add(lblhora, null);
        this.getContentPane().add(txtUsuario, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(lblFecha, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(lblFondo, null);
        
        lblFondo.setIcon(new ImageIcon("fondoacces.jpg"));
        jLabel1.setText("Usuario:");
        jLabel1.setBounds(new Rectangle(40, 105, 105, 25));
        jLabel1.setFont(new Font("Dialog", 1, 17));
        jLabel1.setForeground(Color.white);
        this.setResizable(false);
        lblFecha.setBounds(new Rectangle(275, 60, 125, 25));
        int dia=fecha.get(fecha.DAY_OF_MONTH);
        int mes=fecha.get(fecha.MONTH);
        int año=fecha.get(fecha.YEAR);
        lblFecha.setText(""+dia+"/"+mes+"/"+año);
        lblFecha.setFont(new Font("Dialog", 1, 12));
        lblFecha.setForeground(new Color(247, 247, 247));
        jLabel2.setText("Contraseña:");
        jLabel2.setBounds(new Rectangle(40, 140, 105, 25));
        jLabel2.setFont(new Font("Dialog", 1, 17));
        jLabel2.setForeground(Color.white);
        txtUsuario.setBounds(new Rectangle(150, 110, 95, 20));
        lblhora.setBounds(new Rectangle(280, 255, 105, 25));
      
        int segundo=fecha.get(fecha.SECOND);
        int minuto=fecha.get(fecha.MINUTE);
        int hora=fecha.get(fecha.HOUR_OF_DAY);
        lblhora.setText(""+(hora-12)+":"+minuto+":"+segundo);
        btnAceptar.setBounds(new Rectangle(155, 180, 80, 25));
        btnAceptar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnAceptar_actionPerformed(e);
                    }
                });
        btnCancelar.setText("Cancelar");
        btnCancelar.setBounds(new Rectangle(155, 215, 90, 25));
        btnCancelar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        btnCancelar_actionPerformed(e);
                    }
                });
        lblInc.setBounds(new Rectangle(255, 135, 145, 30));
        lblInc.setForeground(new Color(174, 0, 0));
        txtps.setBounds(new Rectangle(150, 145, 95, 20));
        txtps.setSize(new Dimension(95, 20));
        btnAceptar.setIcon(new ImageIcon("iniciar.jpg"));
    }
    
    
    void ingresar(){
        usuario=txtUsuario.getText();
        contraseña=txtps.getText();
    }
    void verificar(){
        if(contraseña.equalsIgnoreCase("log")){
            principal.setVisible(true);
        }else{
            cont=cont+1;
        }
        
        
    }
    
    void denegar(){
        if(cont==1){
            lblInc.setText(" contraseña incorrecta");
        }
        if(cont==2){
            lblInc.setText("vuelva a intentarlo");
        }
        
        if(cont==3){
            System.exit(0);
        }
    }
    

    private void btnAceptar_actionPerformed(ActionEvent e) {
    ingresar();
    verificar();
    denegar();
    }

    private void btnCancelar_actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
