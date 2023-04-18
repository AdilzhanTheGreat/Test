import javax.swing.*;
import java.awt.*;

public class BasePanel extends JPanel {
    JLabel label1 = new JLabel("This is Profile");
    JButton button1 = new JButton();
    BasePanel(){
        label1.setIcon(new ImageIcon("src/images/360_F_526724825_fEKkOFrsAnTBW3G5Qc9VCZxArl3zWEdT.jpg"));

        add(label1);
    }
}
