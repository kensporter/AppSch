import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PatientDemo extends Frame {
    JTextField MRN;
    JTextField LastName;
    JTextField FirstName;
    JTextField MI;
    JTextField Email;
    JLabel MRNLabel;
    JLabel LastNameLabel;
    JLabel FirstNameLabel;
    JLabel MILabel;
    JLabel AdrsLn1Label;
    JLabel AdrsLn2Label;
    JLabel CityLabel;
    JLabel StateLabel;
    JLabel EMailLabel;
    JLabel PhoneLabel;
    JTextField AdrsLn1;
    JTextField AdrsLn2;
    JTextField City;
    JTextField State;
    JTextField Phone;
    JButton Save;
    JButton Cancel;
    JLabel ZipCodeLabel;
    JTextField ZipCode;

    public PatientDemo() {
        PatientDemoLayout customLayout = new PatientDemoLayout();

        setFont(new Font("Helvetica", Font.PLAIN, 12));
        setLayout(customLayout);

        MRN = new JTextField("");
        add(MRN);

        LastName = new JTextField("");
        add(LastName);

        FirstName = new JTextField("");
        add(FirstName);

        MI = new JTextField("");
        add(MI);

        Email = new JTextField("");
        add(Email);

        MRNLabel = new JLabel("MRN#");
        add(MRNLabel);

        LastNameLabel = new JLabel("Last Name");
        add(LastNameLabel);

        FirstNameLabel = new JLabel("First Name");
        add(FirstNameLabel);

        MILabel = new JLabel("MI");
        add(MILabel);

        AdrsLn1Label = new JLabel("Address Line 1");
        add(AdrsLn1Label);

        AdrsLn2Label = new JLabel("Address Line 2");
        add(AdrsLn2Label);

        CityLabel = new JLabel("City");
        add(CityLabel);

        StateLabel = new JLabel("State");
        add(StateLabel);

        EMailLabel = new JLabel("EMail");
        add(EMailLabel);

        PhoneLabel = new JLabel("Phone");
        add(PhoneLabel);

        AdrsLn1 = new JTextField("");
        add(AdrsLn1);

        AdrsLn2 = new JTextField("");
        add(AdrsLn2);

        City = new JTextField("");
        add(City);

        State = new JTextField("");
        add(State);

        Phone = new JTextField("");
        add(Phone);

        Save = new JButton("Save");
        add(Save);

        Cancel = new JButton("Cancel");
        add(Cancel);

        ZipCodeLabel = new JLabel("Zip Code");
        add(ZipCodeLabel);

        ZipCode = new JTextField("");
        add(ZipCode);

        setSize(getPreferredSize());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            	System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        PatientDemo window = new PatientDemo();

        window.setTitle("PatientDemo");
        window.pack();
        window.show();
    }
}

class PatientDemoLayout implements LayoutManager {

    public PatientDemoLayout() {
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);

        Insets insets = parent.getInsets();
        dim.width = 767 + insets.left + insets.right;
        dim.height = 570 + insets.top + insets.bottom;

        return dim;
    }

    public Dimension minimumLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        return dim;
    }

    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();

        Component c;
        c = parent.getComponent(0);
        if (c.isVisible()) {c.setBounds(insets.left+88,insets.top+48,72,24);}
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+248,insets.top+48,72,24);}
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+456,insets.top+56,72,24);}
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+680,insets.top+56,32,24);}
        c = parent.getComponent(4);
        if (c.isVisible()) {c.setBounds(insets.left+96,insets.top+328,184,24);}
        c = parent.getComponent(5);
        if (c.isVisible()) {c.setBounds(insets.left+0,insets.top+48,72,24);}
        c = parent.getComponent(6);
        if (c.isVisible()) {c.setBounds(insets.left+168,insets.top+48,72,24);}
        c = parent.getComponent(7);
        if (c.isVisible()) {c.setBounds(insets.left+344,insets.top+48,72,24);}
        c = parent.getComponent(8);
        if (c.isVisible()) {c.setBounds(insets.left+576,insets.top+56,72,24);}
        c = parent.getComponent(9);
        if (c.isVisible()) {c.setBounds(insets.left+0,insets.top+128,144,32);}
        c = parent.getComponent(10);
        if (c.isVisible()) {c.setBounds(insets.left+368,insets.top+128,144,32);}
        c = parent.getComponent(11);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+232,72,24);}
        c = parent.getComponent(12);
        if (c.isVisible()) {c.setBounds(insets.left+312,insets.top+232,72,24);}
        c = parent.getComponent(13);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+328,72,24);}
        c = parent.getComponent(14);
        if (c.isVisible()) {c.setBounds(insets.left+312,insets.top+328,72,24);}
        c = parent.getComponent(15);
        if (c.isVisible()) {c.setBounds(insets.left+152,insets.top+128,200,32);}
        c = parent.getComponent(16);
        if (c.isVisible()) {c.setBounds(insets.left+520,insets.top+128,240,32);}
        c = parent.getComponent(17);
        if (c.isVisible()) {c.setBounds(insets.left+112,insets.top+232,72,24);}
        c = parent.getComponent(18);
        if (c.isVisible()) {c.setBounds(insets.left+424,insets.top+232,72,24);}
        c = parent.getComponent(19);
        if (c.isVisible()) {c.setBounds(insets.left+416,insets.top+328,176,24);}
        c = parent.getComponent(20);
        if (c.isVisible()) {c.setBounds(insets.left+40,insets.top+432,72,24);}
        c = parent.getComponent(21);
        if (c.isVisible()) {c.setBounds(insets.left+280,insets.top+432,200,40);}
        c = parent.getComponent(22);
        if (c.isVisible()) {c.setBounds(insets.left+528,insets.top+232,72,24);}
        c = parent.getComponent(23);
        if (c.isVisible()) {c.setBounds(insets.left+632,insets.top+232,72,24);}
    }
}
