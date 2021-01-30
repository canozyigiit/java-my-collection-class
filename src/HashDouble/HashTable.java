package HashDouble;

public class HashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    public HashTable(int size){
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);
    }

    public void displayTable(){
        System.out.print("Tablo");
        for(int i = 0; i < arraySize; i++){
            if(hashArray[i] != null)
                System.out.print(hashArray[i].getKey() + " ");
            else
                System.out.print("** ");
        }
        System.out.println("");
    }

    public int hashFunction1(int key){
        return key % arraySize;
    }

    public int hashFunction2(int key){
        return 5 - key % 5;
    }

    public void insert(DataItem item){
        int key = item.getKey();
        int hashVal = hashFunction1(key);
        int stepSize = hashFunction2(key);

        while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){
            hashVal += stepSize;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item;
    }

    public DataItem delete(int key){
        int hashVal = hashFunction1(key);
        int stepSize = hashFunction2(key);

        while (hashArray[hashVal]!=null){
            if (hashArray[hashVal].getKey()==key){
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal]=nonItem;
                return temp;
            }
            hashVal += stepSize;
            hashVal %= arraySize;
        }
        return null;
    }

    public DataItem find(int key){
        int hashVal = hashFunction1(key);
        int stepSize = hashFunction2(key);
        while(hashArray[hashVal]!=null){
            if (hashArray[hashVal].getKey()==key)
                return hashArray[hashVal];
            hashVal += stepSize;
            hashVal %= arraySize;
        }
        return null;
    }

}
