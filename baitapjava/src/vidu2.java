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
public class vidu2 extends Frame implements ActionListener{
    Label lblNhap=new Label("Nhập số nguyên:");
    Label lblSTL=new Label("Số Tính Lũy");
    TextField txtNhap=new TextField(10);
    TextField txtSTL=new TextField(10);
    private int sum = 0;
    public vidu2()
    {
        this.add(lblNhap);
        this.add(txtNhap);
        this.add(lblSTL);
        this.add(txtSTL);
        txtNhap.addActionListener(this);
        txtSTL.setEditable(false);
        
        this.setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent evt) {
      // Get the String entered into the TextField tfInput, convert to int
      int numberIn = Integer.parseInt(txtNhap.getText());
      sum += numberIn;      
      txtNhap.setText("");  
      txtSTL.setText(sum + ""); 
   }
    public static void main(String[] args) {
        vidu2 vd2=new vidu2();
        vd2.setTitle("ViDu2");
        vd2.setSize(300,200);
        vd2.setVisible(true);
    }
    
}
