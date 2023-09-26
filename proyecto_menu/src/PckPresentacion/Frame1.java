package PckPresentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Frame1 extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem mnsalir = new JMenuItem();
    private JMenu menuHelp = new JMenu();
    private JLabel statusBar = new JLabel();
    private JToolBar toolBar = new JToolBar();
    private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen = new ImageIcon(Frame1.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(Frame1.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(Frame1.class.getResource("help.gif"));
    private JMenu jMenu1 = new JMenu();
    private JMenuItem jMenuItem3 = new JMenuItem();
    private JMenu jMenu2 = new JMenu();
    private JMenuItem Mn1solitario = new JMenuItem();
    private JMenuItem Mn2buscamina = new JMenuItem();
    private JMenu jMenu3 = new JMenu();
    private JMenuItem Mnpaint = new JMenuItem();
    private JMenuItem Mncalcu = new JMenuItem();
    private JMenu jMenu4 = new JMenu();
    private JMenuItem Mnuacerca = new JMenuItem();
    private JMenuItem mnabrir = new JMenuItem();
    private JFileChooser ven = new JFileChooser();
    private JLabel lbli = new JLabel();

    public Frame1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setJMenuBar( menuBar );
        this.getContentPane().setLayout( layoutMain );
        panelCenter.setLayout( null );
        this.setSize(new Dimension(514, 428));
        menuFile.setText("Archivo");
        mnsalir.setText("Salir");
        mnsalir.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) {
                        fileExit_ActionPerformed(ae);
                    } } );
        menuHelp.setText("Entrenimiento");
        statusBar.setText( "" );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        jMenu1.setText("Reportes");
        mnsalir.setText("Salir");
        jMenuItem3.setText("Filtros");
        jMenu2.setText("Juego");
        Mn1solitario.setText("Solitario");
        Mn1solitario.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Mn1solitario_actionPerformed(e);
                    }
                });
        Mn2buscamina.setText("Buscamina");
        Mn2buscamina.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Mn2buscamina_actionPerformed(e);
                    }
                });
        jMenu3.setText("Acceso");
        Mnpaint.setText("Paint");
        Mnpaint.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Mnpaint_actionPerformed(e);
                    }
                });
        Mncalcu.setText("Calculadora");
        Mncalcu.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Mncalcu_actionPerformed(e);
                    }
                });
        jMenu4.setText("Ayuda");
        Mnuacerca.setText("Acerca de");
        Mnuacerca.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Mnuacerca_actionPerformed(e);
                    }
                });
        mnabrir.setText("Abrir");
        mnabrir.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        mnabrir_actionPerformed(e);
                    }
                });
        ven.setBounds(new Rectangle(505, 345, 5, 5));
        lbli.setBounds(new Rectangle(250, 15, 235, 155));
        mnsalir.setText("Salir");
        menuFile.add( mnsalir );
        menuFile.add(mnabrir);
        menuFile.add(mnsalir);
        menuFile.add(mnsalir);
        menuBar.add(menuFile);
        jMenu2.add(Mn1solitario);
        jMenu2.add(Mn2buscamina);
        menuHelp.add(jMenu2);
        jMenu3.add(Mnpaint);
        jMenu3.add(Mncalcu);
        menuHelp.add(jMenu3);
        menuBar.add(menuHelp);
        jMenu1.add(jMenuItem3);
        menuBar.add(jMenu1);
        jMenu4.add(Mnuacerca);
        menuBar.add(jMenu4);
        this.getContentPane().add(statusBar, BorderLayout.SOUTH);
        toolBar.add(buttonOpen);
        toolBar.add(buttonClose);
        toolBar.add(buttonHelp);
        this.getContentPane().add(toolBar, BorderLayout.NORTH);
        panelCenter.add(lbli, null);
        panelCenter.add(ven, null);
        this.getContentPane().add(panelCenter, BorderLayout.CENTER);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    void helpAbout_ActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, new Frame1_AboutBoxPanel1(), "About", JOptionPane.PLAIN_MESSAGE);
    }

    private void Mn1solitario_actionPerformed(ActionEvent e) {
        //codigo:
                try {
                    Runtime.getRuntime().exec("sol.exe");
                }catch (IOException f) {
                    System.out.println("ERROR:"+f.getMessage());
    }
}

    private void Mn2buscamina_actionPerformed(ActionEvent e) {//codigo:
        try {
            Runtime.getRuntime().exec("winmine.exe");
        }catch (IOException f) {
            System.out.println("ERROR:"+f.getMessage());
    }
}

    private void Mnpaint_actionPerformed(ActionEvent e) {
        try {
            Runtime.getRuntime().exec("mspaint.exe");
        }catch (IOException f) {
            System.out.println("ERROR:"+f.getMessage());
        }
        }

    private void Mncalcu_actionPerformed(ActionEvent e) {
        try {
            Runtime.getRuntime().exec("calc.exe");
        }catch (IOException f) {
            System.out.println("ERROR:"+f.getMessage());
        }
        }

    private void Mnuacerca_actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, new Frame1_AboutBoxPanel1(), "Acerca de", JOptionPane.PLAIN_MESSAGE);
        
    }

    private void mnabrir_actionPerformed(ActionEvent e) {
        int r=ven.showOpenDialog(this);
                  File nombre=ven.getSelectedFile();
           JOptionPane.showMessageDialog(null,nombre.toString());
          lbli.setIcon(new ImageIcon(nombre.toString()));
    }
}

