package d20201218;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class SwingEx07 extends JFrame implements ActionListener
{
   
   
   JScrollPane jp; 
    
     String [] str = {"서울","인천","대전","대구","울산","부산","광주","제주"};
   
   public SwingEx07() {
      super("JList, JcomboBox test");
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setBounds(1000,300,500,500);
      setLayout(new FlowLayout());
      
      //list
      JList<String> list = new JList<String>(str);
   
      add(list);
      
      //스크롤이 있는 리스트
      JList<String> scrollList =  new JList<String>(str);
      jp = new JScrollPane(scrollList,
            jp.VERTICAL_SCROLLBAR_ALWAYS,
            jp.HORIZONTAL_SCROLLBAR_NEVER);
      
      add(jp);
      
      //combobox
      JComboBox<String> comboBox = new JComboBox<String>(str);
      
      add(comboBox);
      
      JComboBox<String> comboBox2 = new JComboBox<String>();
      comboBox2.addItem("오늘은");
      comboBox2.addItem("금요일");
      comboBox2.addItem("내일은");
      comboBox2.addItem("토요일");
      
      
      for(int i=0; i<str.length; i++) {
         comboBox.addItem(str[i]);
      }
      add(comboBox2);
            
      comboBox2.addActionListener(this);
            
      setVisible(true);
   }//생성자 end
         public static void main(String[] args) {
            new SwingEx07();
         }
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JComboBox jcb = (JComboBox) e.getSource();
            int idx = jcb.getSelectedIndex();
            System.out.println(idx);
            
            
         }
}