package kowatschpaul.utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class testRunner {
    public static void loadTest(String exc){
        try {
            Scanner file = new Scanner(System.in);
            FileWriter writer = new FileWriter("/Users/paulkowatsch/Desktop/Uni/PracticeToolEsop/src/kowatschpaul/productive/practice/" + exc + ".java");
            writer.write("package kowatschpaul.productive.practice;\n\n");
            writer.write("public class " + exc + "{\n");
            writer.write("\tpublic static void main(String[] args){\n\t");
            String endWrite = file.nextLine();
            while (!Objects.equals(endWrite, "end")) {
                writer.write(endWrite + "\n");
                endWrite = file.nextLine();
            }
            writer.write("}\n");
            writer.write("}\n");
            writer.close();
        }
        catch(IOException e){
            System.out.println("CLASS NOT FOUND");
        }
    }


}
