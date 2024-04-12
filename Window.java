import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow {
    private JFrame frame;
    private JLabel label;

    public MyWindow() {
        frame = new JFrame("My Window");
        label = new JLabel("Hello, World!");

        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow window = new MyWindow();
    }
}
