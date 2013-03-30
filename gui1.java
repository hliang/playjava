import javax.swing.*;
import java.awt.*;

class gui{
  public static void main(String args[]){
    // main window
    JFrame mainwin = new JFrame("ChatChatChat");

    // menu 
    JMenuBar topmenu = new JMenuBar();
    JMenu m1 = new JMenu("File");
    JMenu m2 = new JMenu("About");
    JMenuItem m11 = new JMenuItem("Open");
    JMenuItem m12 = new JMenuItem("Save");
    JMenuItem m13 = new JMenuItem("Exit");
    JMenuItem m21 = new JMenuItem("Version");
    JMenuItem m22 = new JMenuItem("Credits");
    topmenu.add(m1);
    topmenu.add(m2);
    m1.add(m11);
    m1.add(m12);
    m1.add(m13);
    m2.add(m21);
    m2.add(m22);

    // text area in the center
    JTextArea textarea = new JTextArea("here is textfield"); // text area can have multiple lines, while text field can have only one

    // bottom panel
    JPanel bottompanel = new JPanel();
    JLabel bottomlabel = new JLabel("Enter text:");
    JTextField inputfield = new JTextField(8); // accepts upto 8 characters
    JButton buttonsend = new JButton("Send");
    JButton buttonreset = new JButton("Reset");
    bottompanel.add(bottomlabel);
    bottompanel.add(inputfield);
    bottompanel.add(buttonsend);
    bottompanel.add(buttonreset);

    mainwin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainwin.setSize(400,200);
    mainwin.setVisible(true);

    // Adding Components to the frame.
    //frame.getContentPane().add(BorderLayout.NORTH,mb);
    mainwin.getContentPane().add(BorderLayout.NORTH,topmenu);
    mainwin.getContentPane().add(BorderLayout.SOUTH,bottompanel);
    mainwin.getContentPane().add(BorderLayout.CENTER,textarea);

  }
}
