import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WritingToFile {

    public void WriteToFile(int[] arr, String nameFile) {

        File file = new File(nameFile + ".txt");
        try(FileWriter fw = new FileWriter(file, false);) {
            if(file.exists()){
                fw.write(Arrays.toString(arr));
            } else{
                file.createNewFile();
                WriteToFile(arr, nameFile+ ".txt");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
