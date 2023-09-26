package pckPresentacion;

import java.awt.Dimension;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import pckPanel.PnlEncabezado;
import pckPanel.Pnlcontenido;
import pckPanel.Pnlpie;

public class FrmContenido extends JFrame {


    private PnlEncabezado pnlEncabezado1 = new PnlEncabezado();
    private PnlEncabezado pnlEncabezado2 = new PnlEncabezado();
    private Pnlcontenido pnlcontenido1 = new Pnlcontenido();

    public FrmContenido() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(858, 1042));
        this.setTitle("usuario/contenido");
        pnlEncabezado2.setBounds(new Rectangle(15, -20, 645, 195));
        pnlEncabezado1.setBounds(new Rectangle(180, 100, 1, 1));
        pnlEncabezado2.setBounds(new Rectangle(0, -75, 865, 215));
        pnlcontenido1.setBounds(new Rectangle(0, 140, 865, 875));
        this.getContentPane().add(pnlcontenido1, null);
        this.getContentPane().add(pnlEncabezado2, null);
        this.getContentPane().add(pnlEncabezado1, null);
        this.setResizable(false);
    }
}
