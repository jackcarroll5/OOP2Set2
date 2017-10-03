/*This driver class will form objects based on characters created by
* the user where the objects contain the name,power-up and type of class
* the game character is*/

import javax.swing.JOptionPane;

public class Problem7 {
    public static void main(String[] args) {

        String name1,powerUp1,type1,text = "";

        Game char1 = new Game();
        text += "Calling the no-argument constructor:";
        text += "\n" + char1;

        Game char2 = new Game("Eagle Birdman","Supercharged Dive","Predator");
       text += "\n\nCharacter 2:\n" + char2;


        name1 = JOptionPane.showInputDialog("\nPlease enter the name of the character: ");
        powerUp1 = JOptionPane.showInputDialog("Please enter the power-up for the character: ");
       type1 = JOptionPane.showInputDialog("Please enter the type of class of the character: ");

       Game char3 = new Game(name1,powerUp1,type1);
      text += "\n\nCharacter 3: " + char3;

      JOptionPane.showMessageDialog(null,text,"Game Character",JOptionPane.INFORMATION_MESSAGE);


    }
}
