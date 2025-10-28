import javax.swing.JOptionPane;

public class JOption {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name ");
        JOptionPane.showMessageDialog(null, "Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        JOptionPane.showMessageDialog(null, "hello your age is " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height "));
        JOptionPane.showMessageDialog(null, " hello you height is " + height);
    }

}
