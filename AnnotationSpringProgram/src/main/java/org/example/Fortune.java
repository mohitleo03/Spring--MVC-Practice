package org.example;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

@Component
public class Fortune implements IFortune{
    public String getFortune() {
        BufferedReader bufReader = null;
        try {
            bufReader = new BufferedReader(new FileReader("C:\\Users\\Mohit\\IdeaProjects\\AnnotationSpringProgram\\src"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ArrayList<String> listOfLines = new ArrayList<>();
        String line = null;
        try {
            line = bufReader.readLine();
            while (line != null)
            {
                listOfLines.add(line);
                line = bufReader.readLine();
            }
        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            bufReader.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Random r = new Random();
        int randomNumber = r.nextInt(listOfLines.size());


        return listOfLines.get(randomNumber);
    }
}