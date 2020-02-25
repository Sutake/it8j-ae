package modul7;

import javax.swing.*;
import java.awt.*;

public class Inkrementierer extends JFrame {

    public JButton meineSchaltflaeche;
    public JTextField meinTextfeld;

    public Inkrementierer(String title) {
        super(title);
        setBounds(100,100,300,200);
        meineSchaltflaeche = new JButton("+");

        meinTextfeld = new JTextField();
        meinTextfeld.setColumns(8);
        meinTextfeld.setText("0");
        this.getContentPane().add(meineSchaltflaeche);
        this.getContentPane().add(meinTextfeld);
        setLayout(new FlowLayout());
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        meineSchaltflaeche.addActionListener(e -> {
            try {
                int i = Integer.parseInt(meinTextfeld.getText());
                meinTextfeld.setBackground(Color.WHITE);
                i++;
                System.out.println(i);
                meinTextfeld.setText(Integer.toString(i));
            } catch (NumberFormatException ex) {
                meinTextfeld.setBackground(Color.RED);
            }
        });
    }

    public static void main(String[] args) {
        Inkrementierer inkrementierer = new Inkrementierer("Inkrementierer");
    }
}
