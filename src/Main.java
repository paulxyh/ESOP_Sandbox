import java.util.Scanner;
import kowatschpaul.productive.practice.excBuilder;

public class Main {

    public static void main(String[] args) {
            String[][] exercises = excBuilder.onStartUp();
            Scanner in = new Scanner(System.in);
            int duration = 1;
            while(duration == 1) {
                System.out.println("Welcome to the ESOP Practice Tool!");
                System.out.println("Choose one of the following topics to practice! \nLog in the corresponding number!");
                System.out.println("Arrays(0)     |  Strings(1)");
                System.out.println("---------------------------");
                System.out.println("Methods(2)    |  Classes(3)");
                System.out.println("---------------------------");
                System.out.println("Recursion(4)  |  TestSim(5)");
                int choice = in.nextInt();
                System.out.println("Which exercise do you want to try?\nLog in the corresponding number!");
                for (int i = 0; i < exercises[choice].length; i++) {
                    System.out.println(exercises[choice][i] + "(" + i++ + ")");
                }
                int choiceExc = in.nextInt();
                String task = "resources/" + exercises[choice][choiceExc] + ".txt";
                //TODO ternäre Operation für TestSim einbauen
                excBuilder.buildExercise(task);
                System.out.println("Do you want to exit(0) or keep practicing(1)?");
                duration = in.nextInt();
            }
        }

}