import java.util.ArrayList;

public class ArrThread {

    private ArrayList<Thread> _arr;
    public ArrayList<Thread> crArrThread(int num){
        _arr = new ArrayList<>();
        for(int i = 0; i < num; i++){
            _arr.add(new Thread(new RunThread()));
        }
        return _arr;
    }
}
