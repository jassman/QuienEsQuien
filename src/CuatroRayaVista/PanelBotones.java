/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuatroRayaVista;

import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class PanelBotones extends JPanel{
    private PanelBotones1 botones1;
    private PanelBotones2 botones2;
    
    public PanelBotones(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        botones1 = new PanelBotones1();
        botones2 = new PanelBotones2();
        
        add(botones1);
        add(botones2);
    }
    
    public void setActionListenerPanel1(ActionListener a){
        botones1.setActionListener(a);
    }
    
    public void setActionListenerPanel2(ActionListener a){
        botones2.setActionListener(a);
    }
    
    public void opSexo(){
        botones2.opSexo();
    }
    
    public void opPelo(){
        botones2.opPelo();
    }
    
    public void opOjos(){
        botones2.opOjos();
    }
    
    public void opNariz(){
        botones2.opNariz();
    }
    
    public void opBoca(){
        botones2.opBoca();
    }
    
    public void opGafas(){
        botones2.opGafas();
    }
    
    public void opSombrero(){
        botones2.opSombrero();
    }
    
    public void opBigote(){
        botones2.opBigote();
    }
}
