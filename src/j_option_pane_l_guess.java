import javax.swing.JOptionPane;

public class j_option_pane_l_guess {
    public static void main(String[] args){
        //JOptionPane = pop up a standard dialog box that prompts the user for a value
        // or informs them for of something

       // JOptionPane.showMessageDialog(null, "This is some useless information", "title", JOptionPane.PLAIN_MESSAGE);


       // JOptionPane.showMessageDialog(null, "Here is more useless information", "title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, " really this is useless information?", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This is the last piece of information l will give you!", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "You need more information to understand this file.Come back later", "title", JOptionPane.ERROR_MESSAGE);

    }
}

/*
import javax.swing.*;
class j_option_pane_I_guess{
    public static void main(String[] args){
        String userInput;
        userInput = JOptionPane.showInputDialog("your name: ");
        System.out.println("Hello " + userInput + " !");
    }
}

 */