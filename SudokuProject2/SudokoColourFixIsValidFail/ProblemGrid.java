import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public abstract class ProblemGrid extends JFrame {
    protected static final long serialVersionUID = 1L;
    protected static JTextField txtCell[] = new JTextField[81];
    static final Color formColour = new Color(200,220,240); 
    
    public void showForm(){
        final JFrame gridFrame = new JFrame("Sudoku");
        gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridFrame.setMinimumSize(new Dimension(320,320));
        gridFrame.setLocation(200,100);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.setBackground(formColour);
       
        JPanel grid = new JPanel();
        grid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        grid.setLayout(new GridLayout(9,9,3,3));
        grid.setBackground(formColour);
                
        for (int i=0; i<81; i++){
            txtCell[i] = new JTextField(" ");
            txtCell[i].setName(""+i);
            txtCell[i].setBorder(new BevelBorder(1));
            Font numberFont = new Font("Arial", Font.BOLD,22);
            txtCell[i].setFont(numberFont);
            txtCell[i].setBackground(Color.WHITE);
            txtCell[i].setHorizontalAlignment(JTextField.CENTER);
            txtCell[i].setEditable(true);
            grid.add(txtCell[i]);
        }
        panel1.add(BorderLayout.CENTER,grid);   
             
        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel2.setBackground(formColour); 
        JButton cmdExit = new JButton("   Exit   ");
        cmdExit.setBorder(new CompoundBorder(new BevelBorder(0), new BevelBorder(0)));
        panel2.add(BorderLayout.CENTER,cmdExit);
     
        panel1.add(BorderLayout.SOUTH,panel2);
        
        gridFrame.add(panel1);
        gridFrame.pack();
        gridFrame.setVisible(true);  
              
        cmdExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(1);
        }});
         
        for(int i=0; i<81; i++){
             String t1 = txtCell[i].getName();
             final int t2 = Integer.parseInt(t1.trim());
             txtCell[i].addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    enterNumber(t2);
                 }
             });
        
         }
    }
    
    abstract void enterNumber(int cellNo);          
    
    public static void cellEntry(int cellNo, String value, String foreColor){
        txtCell[cellNo].setText(value);
        if(foreColor.equals("blue")){
            txtCell[cellNo].setForeground(Color.blue);
            txtCell[cellNo].setBackground(Color.pink);
        }else{
            txtCell[cellNo].setForeground(Color.black);
            txtCell[cellNo].setBackground(Color.white);
        }    
        txtCell[cellNo].grabFocus();
    }
    
    public static String obtainEntry(int cellNo){
       return txtCell[cellNo].getText().trim();
    }
    
    public static void setEntry(int cellNo, String value){
       txtCell[cellNo].setText(value);               //Number stored in working array transferred to textbox
    }
    
     public static void focusCell(int cellNo){
       txtCell[cellNo].grabFocus();                  //position mouse pointer in cell CellNo.
    }
}        
