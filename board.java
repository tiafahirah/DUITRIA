import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class board {
    public static void main(String[] args) {
        Random g = new Random();
        System.out.println("Hello world");
        System.out.println("Testing");
        System.out.println("Testing testing...");
       JFrame gui = new JFrame();
       gui.setSize(800, 600);
       gui.setVisible(true);
       JLabel title = new JLabel("title");
       gui.add(title);
       JButton dice = new JButton("Roll");
       JLabel diceRoll = new JLabel("");

       ActionListener roll = new ActionListener(){
        public void actionPerformed (ActionEvent e){
            int diceGain = g.nextInt(1, 7);
            diceRoll.setText(""+ diceGain);

        }};

        dice.addActionListener(roll);
        gui.add(dice);
        gui.add(diceRoll);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}



