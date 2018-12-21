/* 
   12/9/14
   JDK 1.7
   Array Program 3 
 */
import javax.swing.JOptionPane;
public class ArrayProgram3 {
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog(null,"Enter how many scores:");
        int number = Integer.parseInt(input);
        int scores[]=new int[number];
        for(int i=0; i<scores.length; i++){
            input=JOptionPane.showInputDialog(null,"Enter score");
            scores[i] = Integer.parseInt(input);
        }
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for(int i=0;i<scores.length;i++){
            sum += scores[i];
            if(scores[i]>max){
                max = scores[i];
            }
            if(scores[i]<min){
                min = scores[i];
            }
        }
        JOptionPane.showMessageDialog(null,"The sum is " + sum +
                "\nThe average is " + sum/scores.length +
                "\nThe maximum score is " + max +
                "\nThe minimum score is " + min);
    }   
}