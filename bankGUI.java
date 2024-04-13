
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// aplikacion qe kryen funksion rreggjistrimi klientesh te disa bankave. Ti jepet mundesia perdoruesit te
// shtoje nje lient te ri.
// PEr cdo klient duhet te vendoset emri mbliemri numri i llogarise dhe duhet te zgjidhet banka perkatese.
// Bankat mbahen
// nje liste qe do inicializohet me2 banka. Kur te klikohet butoni save te validohen te dhenat qe te mos jete bosh.
// Me pas duhet te ruhhet klienti i krijuar nje listen e klienteve te bankes se zgjedhur.
// Gjithashtu perdoruest ti jepet munesia qe te zgjedhe nje banke
// dhe te afishoje klientet e saj. te perdoret metoda printClients per afishimin e klienteve.
//
public class bankGUI {
    public static void main(String[] args){
        Bank b1 = new Bank("Bank 1");
        Bank b2 = new Bank("b2");
        JFrame frame = new JFrame("frame");
        JPanel panel = new JPanel();
        JLabel lname = new JLabel("name");
        JTextField tfname = new JTextField(20);
        JLabel lsname = new JLabel("surname");
        JTextField tfsname = new JTextField(20);
        JLabel laccNum = new JLabel("account number");
        JTextField tfAccNum = new JTextField(20);


        String s1[] = { "bank1", "bank2" };
        JComboBox c1 = new JComboBox(s1);
        JButton btn= new JButton("save");


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = tfname.getText();
                String surname = tfsname.getText();
                String accNum = tfAccNum.getText();
                String selectedBank = (String) c1.getSelectedItem();
                Client cl1 = new Client(name, surname, accNum);
                if (selectedBank.equals(b1.getName())) {
                    b1.addClient(cl1);
                } else {
                    b2.addClient(cl1);
                }
            }

        });
        JLabel lbla = new JLabel("");

        JComboBox c2 = new JComboBox(s1);
        JButton btn2 = new JButton("afisho");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedBank = (String) c2.getSelectedItem();
                if (selectedBank.equals(b1.getName())) {
                    System.out.println(b1.printClients());
                    lbla.setText(b1.printClients());
                } else {
                    System.out.println(b2.printClients());
                }
            }
        });

        panel.add(lname);
        panel.add(tfname);
        panel.add(lname);
        panel.add(tfsname);
        panel.add(laccNum);
        panel.add(tfAccNum);
        panel.add(c1);
        panel.add(btn);
        panel.add(c2);
        panel.add(btn2);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

}
