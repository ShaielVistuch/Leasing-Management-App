package packLeasing;
import java.awt.*;
import java.util.Vector;

import javax.swing.*;

public class ListOfClientsPage {

    JFrame frame;
    JPanel panel;
    JScrollPane scrollPane;

    ListOfClientsPage(Vector<Client> clients) {

        frame = new JFrame("List of Clients");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(scrollPane);
        frame.setVisible(true);
    }


}
