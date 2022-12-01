package kowatschpaul.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class excBuilder {
    /**
     * Writes the task of the chosen exercise into the CommandLine
     * */
    public static void buildExercise(String file){
        try {
            System.out.println("---------------");
            FileReader reader = new FileReader(Paths.get(file).toString());
            BufferedReader buffer = new BufferedReader(reader);
            String line = null;
            while((line = buffer.readLine()) != null){
                System.out.println(line);
            }
            buffer.close();
            System.out.println("---------------");
        }
        catch(IOException e){
            System.out.println("EXERCISE WAS NOT FOUND!");
        }
    }

    /**
     * On App Start this method reads in all the exercises and their corresponding sample Solutions
     * */
    public static String[][] onStartUp(){
        String[][] result = new String[6][];
        try {
            FileReader reader = new FileReader(Paths.get("resources/config.txt").toFile());
            BufferedReader buffer = new BufferedReader(reader);
            String element = null;
            int i = 0;
            while((element = buffer.readLine()) != null){
                result[i++] = getData(element);
            }
            buffer.close();

        }
        catch(IOException e){
            System.out.println("CONFIG FILE WAS NOT FOUND!");
        }
        return result;
    }
    /**
     * Splits the next Line in the File to single string objects and returns them
     * */
    private static String[] getData(String data){
        return data.split(" ");
    }
}
