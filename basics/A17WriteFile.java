package basics;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;

public class A17WriteFile{
    public static void main(String[] args){
		/*try(FileWriter myFileWriter = new FileWriter("myFile.txt")){
			myFileWriter.write("This is the first line using file writer");
			System.out.println("Successfully written to the file myFile.txt");
		} catch(IOException e){
			e.printStackTrace();
		}*/


        //BufferedWriter
		/*try(BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt", true))){
			bw.newLine();
			bw.write("This is the second line");
			bw.newLine();
			bw.write("This is the third line");
			System.out.println("Successfully written to the file myFile.txt");
		} catch(IOException e){
			e.printStackTrace();
		}*/

        //FileOutputStream
        try(FileOutputStream output = new FileOutputStream("myFile.txt", true)){
            output.write("\nThis is from FileOutputStream".getBytes());
            System.out.println("Successfully written over the file myFile.txt");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
