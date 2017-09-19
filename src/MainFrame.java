import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    private Button btnExit = new Button("EXIT");
    private Button btnAdd = new Button("ADD");
    private Button btnLoss = new Button("LOSS");
    private Label lab = new Label("0");
    private static int n = 0;

    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(100, 100, 400, 300);
        this.setLayout(null);
        btnExit.setBounds(300, 250, 80, 30);
        btnAdd.setBounds(100, 100, 80, 30);
        btnLoss.setBounds(250, 100, 80, 30);
        lab.setBounds(200, 100, 80, 30);
        lab.setFont(new Font(null, Font.BOLD,20));
        btnAdd.setBackground(new Color(67, 223, 114));
        btnLoss.setBackground(new Color(67, 223, 114));
        btnExit.setBackground(new Color(201, 135, 251));
        this.add(btnExit);
        this.add(btnAdd);
        this.add(btnLoss);
        this.add(lab);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lab.setText(Integer.toString(n));
            }
        });
        btnLoss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n--;
                lab.setText(Integer.toString(n));
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
