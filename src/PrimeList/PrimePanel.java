package PrimeList;

// ****************************************************************
// PrimePanel.java
//
// Represents the panel for a program that displays all primes
// up to a number input by the user.
// ****************************************************************
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PrimePanel extends JPanel
{
    private JTextField number;
private JButton computeButton;
private JTextArea primeList;
private JScrollPane scrollPane;
// ----------------------------------------------------------
// Sets up a panel with a heading, a labeled text field
// for the user to enter an integer, a button to trigger
// the calculation, and a text area to display the list
// of primes.
// ----------------------------------------------------------
public PrimePanel ()
{
JLabel heading = new JLabel ("Prime Number Listing");
heading.setFont (new Font("Helvetica", Font.BOLD, 30));
JLabel inputLabel = new JLabel ("Enter a number: ");
number = new JTextField (8);
computeButton = new JButton ("Click to see all primes up to your number!");
primeList = new JTextArea (10, 30);
scrollPane = new JScrollPane(primeList);
scrollPane.setVerticalScrollBarPolicy(22);  
computeButton.addActionListener(new ButtonListener());
// Add the components to the panel
add (heading);
add (inputLabel);
add (number);
add (computeButton);
add (scrollPane);
setPreferredSize (new Dimension (400, 320));
setBackground (Color.yellow);
}
    // *****************************************************************
    // Represents a listener for the click of the button.
    // *****************************************************************
    public class ButtonListener implements ActionListener
    {
    // -----------------------------------------------------------
    // Generates and displays a list of primes when the
    // button is clicked.
    // -----------------------------------------------------------
    public void actionPerformed (ActionEvent event)
    {
    try{
        String textNum = number.getText();
    int num = 0;
        num = Integer.parseInt (textNum);
    String ans = "";
    int count = 0;
    if (num < 2)
        ans = "There no primes less than " + num;
    else{
    ans = " " + 2;
    count++;
    for (int i = 3; i <= num; i += 2){
        boolean foundDivisor = false;
        int j = 3;
        while (j < Math.floor(i^2) && !foundDivisor){
            if (i % j == 0)
                foundDivisor = true;
            else
                j++;
        }
        // Add i to the list if it is prime
        if (!foundDivisor){
            ans += " " + i;
            count++;
            if (count % 10 == 0)
                ans += "\n";
            }
        }
    }
    primeList.setText (ans);
    }
    catch(NumberFormatException e){
        System.out.println(e + "The input should be integer only.");
    }
    
    }
}
}