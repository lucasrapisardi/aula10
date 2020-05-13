import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TextTela extends JFrame implements ActionListener{
   private JTextField txtEntrada;
   private JLabel lblEntrada;
   
   private JButton btnMostra, btnLimpa, btnSai; 
   
   public void actionPerformed(ActionEvent e ){
      if(e.getSource() == btnMostra){
         JOptionPane.showMessageDialog(null, txtEntrada);
      }  
         else if (e.getSource() == btnLimpa){
            txtEntrada.setText("");
         }
            else if (e.getSource() == btnSai){
               System.exit(0);
            }
   }
    
   
   public TextTela(){
      super ("Caixa de texto");
      JPanel painelDadosEntrada = new JPanel (new GridLayout(4,2));
      JPanel painelEntrada = new JPanel (new FlowLayout());
      
      txtEntrada = new JTextField (60);
      lblEntrada = new JLabel ("Digite seu texto: ");
 
      
         painelDadosEntrada.add(lblEntrada);
         painelDadosEntrada.add(txtEntrada);
      
      painelEntrada.add(painelDadosEntrada);
      JPanel painelBotoes = new JPanel (new FlowLayout());
              
         btnMostra = new JButton ("Mostrar");
         btnLimpa = new JButton ("Limpar");
         btnSai = new JButton ("Sair");
         
         btnMostra.addActionListener(this);
         btnLimpa.addActionListener(this);
         btnSai.addActionListener(this);
         
         painelBotoes.add(btnMostra);
         painelBotoes.add(btnLimpa);
         painelBotoes.add(btnSai);
         
         Container painelConteudo = getContentPane();
         
         painelConteudo.setLayout (new BorderLayout());
         
         painelConteudo.add(painelEntrada, BorderLayout.NORTH);
         painelConteudo.add(painelBotoes, BorderLayout.SOUTH);
   
         setSize (710, 190);
         setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo (null);
         setVisible (true);
         
   }
   
   public static void main (String [] args){
      SwingUtilities.invokeLater (new Runnable (){
         public void run (){
            new TextTela();
         }
      });
   }
}

