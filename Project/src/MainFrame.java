import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    JButton button1 = new JButton("Menu");
    JButton button2 = new JButton("My Profile");
    JButton button3 = new JButton("Shop");
    JButton button4 = new JButton("Settings");
    JButton button5 = new JButton("Exit");
    JButton button6 = new JButton();
    JPanel panel2 = new JPanel();
    MainFrame(){
        ArrayList<JPanel> panels = new ArrayList<>();
        panels.add(new MenuPanel());
        panels.add(new BasePanel());
        panels.add(new ShopPanel());
        panels.add(new SettingsPanel());
        panel2 = new MenuPanel();
        Dimension dim = getToolkit().getScreenSize();
        dim.height *= 0.7;
        dim.width *= 0.7;
        setSize(dim);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        JPanel panel12 = new JPanel(new BorderLayout());
        panel1.setLayout(new GridLayout());
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        ImageIcon icon = new ImageIcon("src/images/refresh-512.png");
        button6.setIcon(icon);
        Dimension dim2 = new Dimension(50,50);
        button6.setPreferredSize(dim2);
        panel12.add(button6, BorderLayout.EAST);
        panel12.add(panel1);
        add(panel12, BorderLayout.PAGE_START);
        add(panel2);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JButton){
                    remove(panel2);
                    panel2 = panels.get(0);
                    add(panel2);
                    panel2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
                    setVisible(true);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JButton){
                    remove(panel2);
                    panel2 = panels.get(1);
                    add(panel2);
                    panel2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
                    setVisible(true);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JButton){
                    remove(panel2);
                    panel2 = panels.get(2);
                    add(panel2);
                    panel2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
                    setVisible(true);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JButton){
                    remove(panel2);
                    panel2 = panels.get(3);
                    add(panel2);
                    panel2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
                    setVisible(true);

                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JButton){
                    dispose();
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
            }
        });
        panel1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
        panel2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
    }
    public static void main(String[] args){
        MainFrame main = new MainFrame();
        main.setVisible(true);
    }
}
