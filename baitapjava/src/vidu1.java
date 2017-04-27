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
public class vidu1 extends Frame implements ActionListener{
    Label lblCounter=new Label("Counter");
    TextField txtCounter=new TextField("0");
    Button btnCounter=new Button("Count");
            int dem=0;
    public vidu1()
    {
        this.add(lblCounter);
        this.add(txtCounter);
        this.add(btnCounter);
        btnCounter.addActionListener(this);
        txtCounter.setEditable(false);
        this.setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnCounter)
        {
            ++dem;
            
           this.txtCounter.setText(dem + "");
        }
    }
    public static void main(String[] args) {
        vidu1 vd1=new vidu1();
        vd1.setTitle("ViDu1");
        vd1.setSize(300,200);
        
        vd1.setVisible(true);
    }
}
