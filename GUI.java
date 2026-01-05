//Vladislav Ebert 241RDB316 7.gruppa
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Main extends JFrame implements ActionListener {

    private JLabel label;
    private JTextField textField;
    private JButton btnOK, btnNewGame;
    private Random random = new Random();
    private int throwNumbers;
    private int count;
    private boolean go;

    public Main() throws Exception {
        setSize(300,300);
        GridLayout layout = new GridLayout(5, 1);
        JPanel p = new JPanel();
        p.setLayout(layout);
        p.setBorder(BorderFactory
                .createEmptyBorder(15, 15, 15, 15));
        p.add(new JLabel("Input number (1-10):"));
        textField = new JTextField();
        p.add(textField);
        count = 3;
        label = new JLabel("You have 3 attempts to guess a number");
        p.add(label);
        JPanel btnPanel = new JPanel();
        btnOK = new JButton("OK");
        btnOK.addActionListener(this);
        btnPanel.add(btnOK);
        p.add(btnPanel);
        btnNewGame = new JButton("New Game");
        btnNewGame.addActionListener(this);
        btnPanel = new JPanel();
        btnPanel.add(btnNewGame);
        p.add(btnPanel);
        add(p,BorderLayout.CENTER);
        setTitle("Guess a number");
        throwNumbers = random.nextInt(10)+1;
        go = true;
    }

    public static void main(String[] args)
            throws Exception {

        Main win = new Main();
        win.setDefaultCloseOperation(
                EXIT_ON_CLOSE);
        win.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg) {

        try {
            if (arg.getSource() == btnOK)

                if (go) {
                    if (Integer.parseInt(textField.getText()) == throwNumbers) {
                        label.setText("You win!");
                        go = false;
                    } else if (count-- < 1) {
                        label.setText("You lose!");
                        go = false;
                    } else if (Integer.parseInt(textField.getText()) > 10
                            || Integer.parseInt(textField.getText()) < 1) {
                        label.setText("error");
                    } else if (Integer.parseInt(textField.getText()) < throwNumbers) {
                        label.setText("Quest number is bigger than yours");
                    } else if (Integer.parseInt(textField.getText()) > throwNumbers) {
                        label.setText("Quest number is smaller than yours");
                    }


                } else {

                    textField.setText("");
                    throwNumbers = random.nextInt(10) + 1;
                    count = 3;
                    label.setText("Left only " + count + " attempts to guess number");
                    go = true;
                }
                } catch(Exception e){
                label.setText("Error");
                go = false;
            }
        }
    }