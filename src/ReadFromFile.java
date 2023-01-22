import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFromFile {
    public void ReadFile(String path){
        try(Scanner sc = new Scanner(Path.of((path + ".txt")), StandardCharsets.UTF_8)){
            System.out.println(sc.nextLine());
        }catch (IOException e){
            System.out.println("файл не найден");
        }
    }
}
