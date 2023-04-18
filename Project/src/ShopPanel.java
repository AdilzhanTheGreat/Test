import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ShopPanel extends JPanel {
    String str;
    String path;
    JButton button1 = new JButton("Add new Product");
    JButton button2 = new JButton("Delete my Product");
    JLabel label1 = new JLabel("This is Shop");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    private JPanel newProduct(String str, String path){
        JPanel panel = new JPanel();
        panel.setSize(200, 200);
        panel.setLayout(new BorderLayout());
        JLabel label = new JLabel(str);
        panel.add(label, BorderLayout.PAGE_END);
        JLabel label2 = new JLabel();
        label2.setIcon(new ImageIcon(path));
        panel.add(label2);
        panel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLUE));
        return panel;
    }
    ShopPanel(){
        ArrayList<JPanel> panels = new ArrayList<>();
        setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());
        JPanel panel3 = new JPanel(new GridLayout(2, 1));
        panel3.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() instanceof JButton){
                    newProd();
                    JPanel newpan = newProduct(str, path);
                    System.out.println(str);
                    System.out.println(path);
                    panels.add(newpan);
                    remove(panel1);
                    panel1.setLayout(new GridLayout(panels.size() / 3 + 1 ,3));
                    for(JPanel p : panels){
                        panel1.add(p);
                    }
                    add(panel1);
                }
            }
        });
        panel3.add(button2);
        panel2.add(panel3, BorderLayout.PAGE_START);
        panel1.setLayout(new GridLayout(panels.size() / 3 + 1 ,3));
        for(JPanel p : panels){
            panel1.add(p);
        }
        add(panel1);
        add(panel2, BorderLayout.EAST);
    }
    private void newProd(){
        JFrame f = new JFrame();
        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel(new GridLayout(2,1));
        JPanel panel2 = new JPanel(new GridLayout(2,1));
        JLabel label1 = new JLabel("Enter URL:");
        JLabel label2 = new JLabel("Enter the name:");
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();
        panel1.add(label1);
        panel1.add(label2);
        panel2.add(text1);
        panel2.add(text2);
        JButton button = new JButton("Confirm");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newstr = text1.getText();
                String newurl = text2.getText();
                str = newstr;
                System.out.println(str);
                path = newurl;
                System.out.println(path);
                f.dispose();
            }
        });
        main.add(panel1, BorderLayout.WEST);
        main.add(panel2);
        main.add(button, BorderLayout.PAGE_END);
        f.add(main);
        f.setLocationRelativeTo(null);
        f.setSize(500,200);
        f.add(main);
        f.setVisible(true);
    }
}
