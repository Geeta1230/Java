/*
//file using methods
import java.io.File;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) {
        String fileName = "example1.txt";
        File file = new File(fileName);
        try {
            if (file.createNewFile())
            {
                System.out.println("File created successfully!");
            }
            else {
                System.out.println("File already exists or failed to create!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
*/



/*
//file using constrsctor
import java.io.FileOutputStream;
import java.io.IOException;
public class file1 {
    public static void main(String[] args) {
        String fileName = "example2.txt";
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            System.out.println("successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
 */

/*
//file using write method
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class file1 {
    public static void main(String[] args) {
        String fileName = "example3.txt";
        try {
            Files.write(Paths.get(fileName), "name: getta, age: 23, branch: cse, college: VTU belagavi, sweet: jamun, hii geeta, hello Bro, akash... pillu.... kalpan...kavya...disha...".getBytes());
            System.out.println("Successfully!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
 */