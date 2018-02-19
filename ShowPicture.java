import javax.swing.*;

/**
 * Created by David on 10/9/17.
 */
public class ShowPicture {

    public static void main(String args[]){

        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("BusinessDave2.png");
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
    }
}
