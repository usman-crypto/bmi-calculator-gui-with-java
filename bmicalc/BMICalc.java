
package bmicalc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author My Pc
 */
public class BMICalc implements ActionListener{
    JButton b1,b2,b3,b4;
    JFrame f;
    JTextField tf;
    static int operator = 0;
    private int a;
    private int b;
    private int result;
    BMICalc(){
        f=new JFrame("My First APP");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(null);
        b1= new JButton("1");
        b2= new JButton("+");
        b3= new JButton("3");
        b4= new JButton("=");
        f.add(b1);
        b1.setBounds(150,100 , 200, 50);
        f.add(b2);
        b2.setBounds(150,200 , 200, 50);
        f.add(b3);
        b3.setBounds(150,300 , 200, 50);
        f.add(b4);
        b4.setBounds(150,400 , 200, 50);
        tf= new JTextField();
        tf.setBounds(150, 500, 200, 50);
        f.add(tf);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        tf.addActionListener(this);
    }
     @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            tf.setText(tf.getText().concat("1"));
            
        }
        if(ae.getSource()==b2){
            tf.setText(tf.getText().concat("+"));
        }
        if(ae.getSource()==b3){
            tf.setText(tf.getText().concat("3"));
        }
        if (ae.getSource()==b2){
            a=Integer.parseInt(tf.getText());
            operator = 1;
            tf.setText("");
        }
        if(ae.getSource()==b4)
        {
            b=Integer.parseInt(tf.getText());
            switch(operator)
           {
            case 1: result=a+b;
            break;
            default: result=0;
            }
        tf.setText("" +result);
        /*int x=Integer.parseInt(b1.getText());
        int y=Integer.parseInt(b3.getText());
        int z=x+y;*/
        
    
        }
    }
    
    public static void main(String[] args) {
        new BMICalc();
    }
}
