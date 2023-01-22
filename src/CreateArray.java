public class CreateArray {

    private int[] _arr;
    public int[] createArr(){
        _arr = new int[(int) (Math.random()*30)];
        for(int i = 0; i < _arr.length; i++){
            _arr[i] = (int)(Math.random()*30);
        }
        return _arr;
    }
}
