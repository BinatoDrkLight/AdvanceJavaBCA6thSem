package basics;

import java.io.IOException;
import java.io.File;

public class A16CreateFile{
    public static void main(String[] args){
        try{
            File myFile = new File("myFile.txt");
            if(myFile.createNewFile()){
                System.out.println("File created successfully " + myFile.getName());
            } else {
                System.out.println("Couldn't create file " + myFile.getName());
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}