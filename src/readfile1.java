
//readfile 1 Reader.read() method
/*
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class readfile1 {
    public static void main(String[] args) {
        String fileName="example3.txt";
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) !=-1) {
                System.out.print((char)character);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
*/


//readfile 2 FileInputStream
/*
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class readfile1 {
    public static void main(String[] args) {
        String fileName="example4.txt";
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int byteValue;
            while ((byteValue = fis.read()) !=-1) {
                System.out.print((char)byteValue);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
 */

//readfile 3 readAllLines

/*
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class readfile1 {
    public static void main(String[] args) {
        String fileName="example3.txt";
        try  {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
 */


//deletefile 1
/*
import java.io.File;
public class readfile1 {
    public static void main(String[] args) {
        File file = new File("example9.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("file deleted succefully");
            } else {
                System.out.println("failed to delete the file");
            }
        } else {
            System.out.println("file does not exist");
        }
    }
}
 */

//write a java program to create,delete,read,write a file in file handling concept

import java.io.*;

public class readfile1 {
    public static void main(String[] args) {
        try {
            File file = new File("geeta.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a test file.\nFile handling in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
