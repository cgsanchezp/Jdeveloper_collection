package pckPanel;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PnlEncabezado extends JPanel {


    private JLabel lbltem = new JLabel();

    public PnlEncabezado() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(761, 310));
        this.setBackground(Color.black);
        lbltem.setBounds(new Rectangle(80, -5, 660, 310));
        lbltem.setSize(new Dimension(660, 310));
        this.add(lbltem, null);
        lbltem.setIcon(new ImageIcon("pie.jpg"));
        lbltem.setBackground(Color.black);
    }
}
