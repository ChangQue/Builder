//ConcreteBuilderOne.java
import javax.swing.*;
public class ConcreteBuilderOne implements Builder{
      private PanelProduct panel;
      ConcreteBuilderOne(){
            panel=new PanelProduct();
      } 
      public void buildButton(){
            panel.button=new JButton("��ť");
      }
      public void buildLabel(){
           panel.label=new JLabel("��ǩ");
      }
      public void buildTextField(){
           panel.textField=new JTextField("�ı���");
      }
      public JPanel  getPanel(){
           panel.add(panel.button);
           panel.add(panel.label);
           panel.add(panel.textField);
           return panel;
      }
} 
