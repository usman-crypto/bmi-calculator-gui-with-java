
package bmicalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculator implements ActionListener{
    int x, y, z;
    int swit=0;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd, bSub, bDiv, bMul,bEq,bDel,bClr;
    JFrame j;
    JTextField tf;
    
    Calculator(){
        tf=new JTextField();
        j=new JFrame("Calculator");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bDiv=new JButton("/");
        bMul=new JButton("*");
        bAdd=new JButton("+");
        bSub=new JButton("-");
        bEq=new JButton("=");
        bDel=new JButton("Del");
        /*bClr=new JButton("C");
        */
        
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        b0.setBounds(110,310,50,40);
        bDiv.setBounds(250,100,50,40);
        bMul.setBounds(250,170,50,40);
        bAdd.setBounds(250,310,50,40);
        bSub.setBounds(250,240,50,40);
        bEq.setBounds(180,310,50,40);
        tf.setBounds(30,40,280,30);
        bDel.setBounds(60,380,100,40);
        /*bClr.setBounds(180,380,100,40);
        */
        
        j.add(tf);
        j.add(b7);
        j.add(b8);
        j.add(bDiv);
        j.add(b9);
        j.add(b4);
        j.add(b5);
        j.add(b6);
        j.add(bMul);
        j.add(b1);
        j.add(b2);
        j.add(b3);
        j.add(bSub);
        j.add(b0);
        j.add(bAdd);
        j.add(bEq);
       j.add(bDel);
        /* j.add(bClr);
        */
       
       
        
        
        j.setVisible(true);
        j.setSize(350, 500);
        j.setLayout(null);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bAdd.addActionListener(this);
        bDiv.addActionListener(this);
        bMul.addActionListener(this);
        bSub.addActionListener(this);
        bDel.addActionListener(this);
        /*bClr.addActionListener(this);*/
        bEq.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            tf.setText(tf.getText().concat("1"));
        }
        if(ae.getSource()==b2){
            tf.setText(tf.getText().concat("2"));
        }
        if(ae.getSource()==b3){
            tf.setText(tf.getText().concat("3"));
        }
        if(ae.getSource()==b4){
            tf.setText(tf.getText().concat("4"));
        }
        if(ae.getSource()==b5){
            tf.setText(tf.getText().concat("5"));
        }
        if(ae.getSource()==b6){
            tf.setText(tf.getText().concat("6"));
        }
        if(ae.getSource()==b7){
            tf.setText(tf.getText().concat("7"));
        }
        if(ae.getSource()==b8){
            tf.setText(tf.getText().concat("8"));
        }
        if(ae.getSource()==b9){
            tf.setText(tf.getText().concat("9"));
        }
        if(ae.getSource()==b0){
            tf.setText(tf.getText().concat("0"));
        }
        if(ae.getSource()==bAdd){
            tf.setText(tf.getText().concat("+"));
        }
        if(ae.getSource()==bDiv){
            tf.setText(tf.getText().concat("/"));
        }
        if(ae.getSource()==bSub){
            tf.setText(tf.getText().concat("-"));
        }
        if(ae.getSource()==bMul){
            tf.setText(tf.getText().concat("*"));
        }
        
        if(ae.getSource()==bAdd){
            swit=1;
        }
        if(ae.getSource()==bDiv){
            swit=2;
        }
        if(ae.getSource()==bMul){
            swit=3;
        }
        if(ae.getSource()==bSub){
            swit=4;
        }
        if(ae.getSource()==bEq){
        switch(swit){
            case 1:
               z=x+y; break;
            case 2:
                z=x/y; break;
            case 3:
                z=x*y; break;
            case 4:
                z=x-y; break;
            default:
                z=0;
        }
        
        tf.setText(z);
    }
    }
    
    public static void main(String[] args) {
        new Calculator();
    }

    
}
