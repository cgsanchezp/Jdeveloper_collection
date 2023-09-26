package PckPresentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Frame1_AboutBoxPanel1 extends JPanel {
    private JLabel labelTitle = new JLabel();
    private JLabel labelAuthor = new JLabel();
    private JLabel labelCopyright = new JLabel();
    private JLabel labelCompany = new JLabel();
    private GridBagLayout layoutMain = new GridBagLayout();
    private Border border = BorderFactory.createEtchedBorder();

    public Frame1_AboutBoxPanel1() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout( layoutMain );
        this.setBorder( border );
        this.setSize(new Dimension(619, 391));
        labelTitle.setText("Empresa Compucyvert");
        labelTitle.setForeground(Color.red);
        labelTitle.setFont(new Font("Forte", 1, 35));
        labelAuthor.setText("AngeloOyolo ");
        labelAuthor.setForeground(Color.blue);
        labelAuthor.setFont(new Font("Monospaced", 1, 20));
        labelCopyright.setText("SISE");
        labelCopyright.setForeground(Color.blue);
        labelCopyright.setFont(new Font("Monospaced", 1, 20));
        labelCompany.setText("2º Siclo del II modulo");
        labelCompany.setForeground(Color.blue);
        labelCompany.setFont(new Font("Monospaced", 1, 20));
        this.add(labelTitle, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, 
                    new Insets(5, 15, 0, 15), 0, 0));
        this.add( labelAuthor, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 15, 0, 15), 0, 0) );
        this.add( labelCopyright, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 15, 0, 15), 0, 0) );
        this.add( labelCompany, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 15, 5, 15), 0, 0) );
    }
}
