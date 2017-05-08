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
public class tinhtonguocsosonguyentophantich extends Frame implements ActionListener, WindowListener{
    Label lblN=new Label("Nhập N:");
    Label lblKQ=new Label("Kết Quả:");
    TextField txtN=new TextField(10);
    TextField txtKQ=new TextField(10);
    
    
    Button btnThuchien=new Button("Thực hiện");
   
    public tinhtonguocsosonguyentophantich()
    {
        this.add(lblN);
        this.add(txtN);
        this.add(lblKQ);
        this.add(txtKQ);
        this.add(cbxTong);
        this.add(btnThuchien);
        btnThuchien.addActionListener(this);
        
      
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
        tinhtonguocsosonguyentophantich bai3=new tinhtonguocsosonguyentophantich();
        bai3.setTitle("tinhtong-uocso-songuyento-phantich");
        bai3.setSize(500,200);
        
        bai3.setVisible(true);
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

