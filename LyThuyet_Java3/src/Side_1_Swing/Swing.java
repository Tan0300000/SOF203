package Side_1_Swing;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends Frame implements ActionListener {

    Button btnYellow, btnRed;
    Label label = new Label();

    public Swing(String msg) {
        setTitle(msg);
        setLayout(new FlowLayout());
        btnYellow = new Button("Yellow");
        btnRed = new Button("Red");
        add(btnYellow);
        add(btnRed);
        add(label);
        btnYellow.addActionListener(this);
        btnRed.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("Yellow")) {
            label.setText("Bạn nhấn nút màu Vàng");
            this.setBackground(Color.yellow);
        }
        if (str.equals("Red")) {
            label.setText("Bạn nhấn nút màu Đỏ");
            this.setBackground(Color.red);
        }

    }

    public static void main(String[] args) {
        Frame dome = new Frame("He He");
        
        dome.setSize(500, 200);
        dome.show();
    }

}
