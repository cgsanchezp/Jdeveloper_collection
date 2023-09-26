package pckPanel;

import java.awt.Dimension;

import javax.swing.JPanel;

public class Pnlacceso extends JPanel {
    public Pnlacceso() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( null );
        this.setSize(new Dimension(396, 306));
    }
}
