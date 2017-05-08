/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LamIT
 */
import java.awt.*;
import java.awt.event.*;
public class tinhtong extends Frame implements ActionListener, WindowListener{
    Label lblA=new Label("A=");
    Label lblB=new Label("b=");
    Label lblKQ=new Label("KQ");
    TextField txtA=new TextField(10);
    TextField txtB=new TextField(10);
    TextField txtKQ=new TextField(20);
    Button btnTong=new Button("Tong");
   
    public tinhtong()
    {
        this.add(lblA);
        this.add(txtA);
        this.add(lblB);
        this.add(txtB);
        this.add(btnTong);
        btnTong.addActionListener(this);
       
        this.add(lblKQ);
        this.add(txtKQ);
        txtKQ.setEditable(false);
        addWindowListener(this);
        
        
        this.setLayout(new FlowLayout());
        this.setBackground(Color.cyan);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnTong)
        {
            long a=Integer.parseInt(txtA.getText());
            long b=Integer.parseInt(txtB.getText());
            long c=a+b;
            txtKQ.setText(c + ""); 
        }
        
    }
    public static void main(String[] args) {
        tinhtong tt=new tinhtong();
        tt.setTitle("tinhtong");
        tt.setSize(300,200);
        
        tt.setVisible(true);
    }

    @Override
   public void windowClosing(WindowEvent evt) {
      System.exit(0);  // Terminate the program
   }
 
   // Not Used, but need to provide an empty body to compile.
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   @Override public void windowIconified(WindowEvent evt) { }
   @Override public void windowDeiconified(WindowEvent evt) { }
   @Override public void windowActivated(WindowEvent evt) { }
   @Override public void windowDeactivated(WindowEvent evt) { }
}
