import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class wordCounter extends JFrame implements ActionListener {

    JFrame frame = new JFrame("WORD COUNTER & CHARACTER COUNTER");
    JTextArea textArea;
    JButton b1, b2;

    wordCounter() {
        frame.setBounds(400, 100, 1200, 800);
        // frame.setSize(1200, 800);
        frame.setLayout(null);
        frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("CODSOFT WORD COUNTER APPLICATION");
        label.setForeground(Color.RED);
        Font labelFont = new Font("Monospaced", Font.BOLD, 40);
        label.setFont(labelFont);
        label.setBounds(200, 10, 1000, 40);
        frame.add(label);

        textArea = new JTextArea();
        textArea.setBounds(10, 80, 1160, 600);
        Font font = new Font("Monospaced", Font.BOLD, 18);
        textArea.setFont(font);

        b1 = new JButton("WORD");
        b1.setBounds(440, 700, 180, 45);
        b1.setFont(font);
        b1.setBackground(Color.GREEN);
        b1.addActionListener(this);

        b2 = new JButton("CHARACTER");
        b2.setBounds(650, 700, 180, 45);
        b2.setFont(font);
        b2.setBackground(Color.GREEN);
        b2.addActionListener(this);

        JPanel buttoPanel = new JPanel();
        buttoPanel.add(b1);
        buttoPanel.add(b2);

        frame.add(b1);
        frame.add(b2);

        frame.add(textArea);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();

        if (textArea.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "System did not found any word");
        }

        else if (e.getSource() == b1) {
            String words[] = text.split("\\s");
            int wordsLen = words.length;
            JOptionPane.showMessageDialog(this, "Total Words: " + wordsLen, "Word Count",
                    JOptionPane.INFORMATION_MESSAGE);

        }
        else if (e.getSource() == b2) {
            JOptionPane.showMessageDialog(this, "Total Characters with space: " + text.length(), "Character Counter",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new wordCounter();
    }
}
