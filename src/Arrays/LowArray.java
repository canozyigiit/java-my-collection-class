package Arrays;

public class LowArray {
    private long[] dizi;

    public LowArray(int size){
        dizi = new long[size];
    }

    public void setElem(int index, long value){
        dizi[index] = value;
    }

    public long getElem(int index){
        return dizi[index];
    }
}
