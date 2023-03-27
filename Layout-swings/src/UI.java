import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI{
    JFrame frame = new JFrame();
    JButton button = new JButton("South btn");
    JButton button2 = new JButton("East btn");
    JButton button3 = new JButton("Westasdasdasdasd me");
    JButton button4 = new JButton("Westasdasdasdasd me");

    String[] options = {"Option 1", "Option 2", "Option 3", "Option 4"};
    JComboBox<String> dropdown = new JComboBox<>(options);

    void render() {

        JPanel p1 = new JPanel();

        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();


//        p5.setLayout(new GridLayout(3,3));
//        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
//        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
//        p1.add(new Button("Top button"));
//        p1.add(new Button("Top button"));
//        p1.add(new Button("Top button"));
//
//        p2.add(new Button("Tool bar"));
//
//
//        p3.add(new Button("Tool bar"));
//        p3.add(new Button("Tool bar"));
//        p3.add(new Button("Tool bar"));
//        p3.add(new Button("Tool bar"));
//        p4.add(new Button("Tool bar"));
//        p5.add(new Button("Center"));
//        p5.add(new Button("Center"));
//        p5.add(new Button("Center"));
//        p5.add(new Button("Center"));
//        p5.add(new Button("Center"));
//        p5.add(new Button("Center"));
        p5.add(new JLabel("XYZABC"));
        p5.add(new JLabel("XYZABC"));
        p5.add(new JLabel("XYZABC"));


        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.GREEN);
        p4.setBackground(Color.YELLOW);
        p5.setBackground(Color.pink);

        frame.setLayout(new BorderLayout());

        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.EAST);
        frame.add(p3,  BorderLayout.WEST);
        frame.add(p4, BorderLayout.SOUTH);
        frame.add(p5, BorderLayout.CENTER);


        frame.setLocationRelativeTo(null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
