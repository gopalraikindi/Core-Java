package W3school.java.tutorials;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class B2filereader {

    public static void main(String[] args) throws FileNotFoundException {
        creatingthefile();
        Writinginthefile();
        ReadingFile();
        GetFileInfo();
        DeleteFile();
        DeleteFolder();
    }

    public static void creatingthefile() {
        File abc=new File("D:\\scannerresume\\rahul.txt");
       try{
          // abc.createNewFile();this line creates the file
        if(abc.createNewFile()){
           System.out.println("File Name:" + abc.getName());
       }else{
            System.out.println("Error:" + "File already exists.");
        }
        }catch(Exception e){
            System.out.println("you are so great");
        }
    }


    public static void Writinginthefile() {

        try {
            FileWriter abc = new FileWriter("D:\\scannerresume\\rahul.txt");
            abc.write("Hello, this is a sample text written to the file.\n");
            abc.write("You can write multiple lines by calling write() multiple times.\n");
            abc.write("Goodbye!\n");
            abc.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
          //  System.out.println("An error occurred while writing to the file.");
           // e.printStackTrace();
        }
    }
    public static void ReadingFile() throws FileNotFoundException {
        File abc=new File("D:\\scannerresume\\rahul.txt");
        Scanner xyz=new Scanner(abc);
        while(xyz.hasNextLine()){
            String data=xyz.nextLine();
            System.out.println("Print the data:" + data);
        }
    }

    public static void GetFileInfo() {
        File myObj = new File("D:\\scannerresume\\rahul.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }


    public static void DeleteFile() {
        File myObj = new File("D:\\scannerresume\\gopal.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    //folder must be empty
    public static void DeleteFolder() {
        File myObj = new File("D:\\Resume directory");
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
