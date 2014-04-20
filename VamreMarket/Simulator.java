import java.awt.*;
import java.awt.event.*;
import java.swing.*;
public class Simulator extends JFrame implements ActionListener{
    protected static final int NUM_AGENTS=10;
    protected static final int NUM_INITIAL_AGENTS=6;
    protected static final int MAX_CUSTOMER_DELAY=2000;
    protected static final int MAX_TELLER_BREAK=1000;
    protected static final int MAX_NO_CUSTOMER=2000;
    private JButton open=new JButton("Open Doors");
    private JButton add=new JButton("Add Doors");
    private JButton close=new JButton("Close Handler");
    private JButton del=new JButton("Del Handler");
    private Bank bank=new Bank();
    private Supermarket supermarket=new Supermarket();
    private class WindowCloser extends WindowAdapter{
public void windowClosing(WindowEvent we){
bank.stop();
System.exit(0);
}}
public Simulator(){
super(Simluation Bank vs Supermarket"");
JPanel buttons=new JPanel();
buttons.setLayout(new FlowLayout());
buttons.add(open);open.addAcitonListener(this);
buttons.add(close);close.addActionListener(this);
buttons.add(add);add.addActionListener(this);
buttons.add(del);del.addActionListener(this);
addWindowListener(new WindowCloser());
getContentPane().add(bank,BorderLayout.WEST);
getContentPane().add(supermarket,BorderLayout.East);
getContentPane().add(buttons,BorderLayout.SOUTH);
validate();pack();show();
bank.start();
supermarket.start();
}
public void actionPerformed(ActionEvent ae)
{
if (ae.getSource==open)
{
bank.openDoor();
supermarket.openDoor();
}else if(ae.getSource()==close)
{
bank.closeDoor();
supermarket.closeDoor();

}else if(ae.getSource()==add)
{
bank.addAgent();
supermarket.addAgent();
}else if(ae.getSource()==del)
{
bank.retireAgent();
supermarket.retireAgent();
}
}
public static void main(String args[]){
Simulator smlt=new Simulator();

}
}


































