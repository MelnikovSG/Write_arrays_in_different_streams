public class RunThread implements Runnable{
    private final CreateArray _createArray = new CreateArray();
    private final WritingToFile _writingFile = new WritingToFile();
    private final ReadFromFile _readFromFile = new ReadFromFile();

    private static int _plusPath = 0;

    @Override
    public void run() {
        int[] arr = _createArray.createArr();
        String path = "arr";
        String tmp = String.copyValueOf(path.toCharArray());
        tmp += _plusPath;
        _writingFile.WriteToFile(arr, tmp);
        _readFromFile.ReadFile(tmp);
        _plusPath++;
    }
}
