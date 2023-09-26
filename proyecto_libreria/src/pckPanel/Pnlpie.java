package pckPanel;

import java.awt.Dimension;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pnlpie extends JPanel {
    private JLabel lblImagen = new JLabel();

    public Pnlpie() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(598, 237));
        lblImagen.setBounds(new Rectangle(0, 0, 535, 240));
        this.add(lblImagen, null);
        lblImagen.setIcon(new ImageIcon("pie.jpg"));
    }
}
