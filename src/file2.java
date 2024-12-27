/*
//writefile
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file2 {
    public static void main(String[] args) {
        String fileName = "example4.txt";
        File file = new File(fileName);
        try{
            if(file.createNewFile()){
                System.out.println("file created successfully");
            }
            else {
                System.out.println("file already exists");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("welcome to bijapur ");
            writer.write("welcome to tutorials points");
            System.out.println("content written to the file successfully");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
 */



/*
//constracator
import java.io.FileOutputStream;
import java.io.IOException;

public class file2 {
    public static void main(String[] args) {
        String fileName = "two.jpeg";
        String content = "wolf.jpeg";
        try (FileOutputStream fos = new FileOutputStream(fileName)){
           byte[] bytes = content.getBytes();
           fos.write(bytes);
           System.out.println("content has to be writen to the file.");
        } catch (IOException e){
            System.out.println(e);
        }
        }
    }
 */


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//write method
public class file2 {
    public static void main(String[] args) {
        String fileName = "example6.txt";
        String content = "geeta khandare";
        try{
            Files.write(Paths.get(fileName),content.getBytes());
            System.out.println("File written successfuly");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}