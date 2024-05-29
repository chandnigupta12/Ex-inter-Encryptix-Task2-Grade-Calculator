import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;


public class Student {
    private JTextField txtStname;
    private JButton calButton;
    private JPanel txtStudentname;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtMarks4;
    private JTextField txtMarks5;
    private JTextField txtTotal;
    private JTextField txtAvarage;
    private JTextField txtGrade;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().txtStudentname);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,m4,m5,Total;
                double avg;

                m1 = Integer.parseInt(txtMarks1.getText());
                m2 = Integer.parseInt(txtMarks2.getText());
                m3 = Integer.parseInt(txtMarks3.getText());
                m4 = Integer.parseInt(txtMarks4.getText());
                m5 = Integer.parseInt(txtMarks5.getText());

                Total = m1 + m2 + m3 + m4 + m5;
                txtTotal.setText(String.valueOf(Total));
                avg = Total/5;
                txtAvarage.setText(String.valueOf(avg));
                if(avg<=100)
                {
                    txtGrade.setText("Fail");
                }
                else{
                    txtGrade.setText("Pass");
                }

            }
        });
    }
}
