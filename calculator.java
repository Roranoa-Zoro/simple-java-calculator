import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

   class Calculator implements ActionListener{
   
                     /*Global variable declaration*/     

                
     boolean isOperatorClicked =false; // boolean value for clicking a button
     String oldValue;
     String newValue;
     String operator; 

    JFrame jf;
    JLabel displayLabel;

    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;
    JButton dotButton;
    JButton equalButton;
    JButton divButton;
    JButton mullButton;
    JButton subButton;
    JButton addButton;
    JButton clearButton;
    
     @Override
    public void actionPerformed(ActionEvent e) {

    
       String buttonText= ((JButton) e.getSource()).getText(); //buttonText will contain the text label of the button clicked.
       ((JButton)e.getSource()).setBackground(Color.gray); //on clicking a button its backgound changes to grey colour 
    
  if (buttonText.matches("[0-9]")) 
        {
           if (isOperatorClicked) {
                displayLabel.setText(buttonText);
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + buttonText);
            }
        }
           else if (buttonText.equals("."))
        {
           if (!displayLabel.getText().contains(".")) {
                displayLabel.setText(displayLabel.getText() + buttonText);
            }
        }
           else if (buttonText.equals("CLEAR")) {
            displayLabel.setText("");
        } 
        else if (buttonText.equals("=")) {
            float newValue = Float.parseFloat(displayLabel.getText());

            switch (operator) {
                case "+":
                    displayLabel.setText(Float.toString(Float.parseFloat(oldValue) + newValue));
                    break;
                case "-":
                    displayLabel.setText(Float.toString(Float.parseFloat(oldValue) - newValue));
                    break;
                case "x":
                    displayLabel.setText(Float.toString(Float.parseFloat(oldValue) * newValue));
                    break;
                case "/":
                    displayLabel.setText(Float.toString(Float.parseFloat(oldValue) / newValue));
                    break;
            }
        } else
           {
            isOperatorClicked = true;
            operator = buttonText;
            oldValue = displayLabel.getText();
            }
    }     
    public Calculator(){
             jf=new JFrame("Calculator");
             jf.setLayout(null);              
             jf.setSize(600, 600);  // frame size 
             jf.setLocation(150, 150);      //frame display location on screen

             displayLabel=new JLabel();
             displayLabel.setBounds(30, 40, 540, 40 );
             displayLabel.setBackground(Color.gray);
             displayLabel.setOpaque(true);
             displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
             displayLabel.setForeground(Color.white);
             jf.add(displayLabel);


             sevenButton=new JButton("7");                      //seven button
             sevenButton.setBounds(30, 130, 80, 80);     
             sevenButton.addActionListener(this);
             sevenButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for 7
             sevenButton.setBackground(Color.gray);
             jf.add(sevenButton);


             eightButton=new JButton("8");                      //eight button
             eightButton.setBounds(130, 130, 80, 80);   
             eightButton.addActionListener(this);
             eightButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for 8
             eightButton.setBackground(Color.gray);
             jf.add(eightButton);


             nineButton=new JButton("9");                       //nine button
             nineButton.setBounds(230, 130, 80, 80);   
             nineButton.addActionListener(this);
             nineButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for 9
             nineButton.setBackground(Color.gray);
             jf.add(nineButton);


             fourButton=new JButton("4");                       //four button
             fourButton.setBounds(30, 230, 80, 80);    
             fourButton.addActionListener(this);
             fourButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for 4
             fourButton.setBackground(Color.gray);
             jf.add(fourButton);

        
            fiveButton=new JButton("5");                        //five button
            fiveButton.setBounds(130, 230, 80, 80);      
            fiveButton.addActionListener(this); 
            fiveButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for 5
            fiveButton.setBackground(Color.gray);
            jf.add(fiveButton);


            sixButton=new JButton("6");                       //six button
            sixButton.setBounds(230, 230, 80, 80);         
            sixButton.addActionListener(this);
            sixButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for 6        
            sixButton.setBackground(Color.gray);
            jf.add(sixButton);


           oneButton=new JButton("1");                      //one button
           oneButton.setBounds(30, 330, 80, 80);     
           oneButton.addActionListener(this);
           oneButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for 1
           oneButton.setBackground(Color.gray);
           jf.add(oneButton);

        
           twoButton=new JButton("2");                      //two button
           twoButton.setBounds(130, 330, 80, 80);      
           twoButton.addActionListener(this);
           twoButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for 2
           twoButton.setBackground(Color.gray);
           jf.add( twoButton);


           threeButton=new JButton("3");                        //three button
           threeButton.setBounds(230, 330, 80, 80);       
           threeButton.addActionListener(this);
           threeButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for 3 
           threeButton.setBackground(Color.gray);
           jf.add(threeButton);  



           dotButton=new JButton(".");                      //dot button
           dotButton.setBounds(30, 430, 80, 80);     
           dotButton.addActionListener(this);
           dotButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for .
           dotButton.setBackground(Color.gray);
           jf.add(dotButton);

        
           zeroButton=new JButton("0");                         //zero button
           zeroButton.setBounds(130, 430, 80, 80);     
           zeroButton.addActionListener(this);
           zeroButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for 0
           zeroButton.setBackground(Color.gray);
           jf.add( zeroButton);


           equalButton=new JButton("=");                        //equal button
           equalButton.setBounds(460, 430, 80, 80);      
           equalButton.addActionListener(this);
           equalButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for =
           equalButton.setBackground(Color.gray);
           jf.add(equalButton);  

           


            divButton=new JButton("/");                             // division buttom
            divButton.setBounds(360, 130, 80, 80);     
            divButton.addActionListener(this);
            divButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for /
            divButton.setBackground(Color.gray);
            jf.add(divButton);


            mullButton=new JButton("x");                             //multiplication button
            mullButton.setBounds(360, 230, 80, 80);     
            mullButton.addActionListener(this);
            mullButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40 for x
            mullButton.setBackground(Color.gray);
            jf.add(mullButton);


            subButton=new JButton("-");                         // subtraction button
            subButton.setBounds(360, 330, 80, 80);      
            subButton.addActionListener(this);
            subButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40
            subButton.setBackground(Color.gray);
            jf.add(subButton);


            addButton=new JButton("+");                          //addition button
            addButton.setBounds(360, 430, 80, 80);     
            addButton.addActionListener(this);
            addButton.setFont(new Font("Arial",Font.PLAIN,40)); //Arial 40
            addButton.setBackground(Color.gray);
            jf.add(addButton);

            clearButton=new JButton("CLEAR");                    //clear button
            clearButton.setBounds(230, 430, 80, 80); 
            clearButton.addActionListener(this);
            clearButton.setFont(new Font("Arial",Font.BOLD,14)); //Arial 14
            clearButton.setBackground(Color.gray);
            jf.add(clearButton);



      jf.setVisible(true); 
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //stop running the program when closed the frame
     
    }
      public static void main(String[] args) {
        
      
                new Calculator();

    }
}
