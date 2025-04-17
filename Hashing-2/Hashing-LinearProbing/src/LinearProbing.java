import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCelLNumber;

    LinearProbing(int size){
        hashTable = new String[size];
        usedCelLNumber =0;
    }

    public int modASCIIHashFunction(String word,int M){
        char ch[];
        ch = word.toCharArray();
        int i, sum;
        for(sum=0,i=0;i<word.length();i++){
            sum = sum+ ch[i];
        }
        return sum % M;
    }

    public double getLoadFactor(){
        double loadFactor = usedCelLNumber* 1.0/hashTable.length;
        return loadFactor;
    }
    //rehash
    public void rehashKeys(String word){
        usedCelLNumber =0;
        ArrayList<String> data = new ArrayList<>();
        for (String s: hashTable){
            if(s!=null){
                data.add(s);
            }
            data.add(word);
            hashTable = new String[hashTable.length*2];
            for (String str :data){
                //insert in hashtable
                insertInHashTable(str);
            }
        }
    }

    //inser in hashtable
    public void insertInHashTable(String word){
        double loadFactor = getLoadFactor();
        if(loadFactor>=0.75){
            rehashKeys(word);
        }else {
            int index = modASCIIHashFunction(word,hashTable.length);
            for (int i =index;i<index +hashTable.length;i++){
                int newIndex = i% hashTable.length;
                if(hashTable[newIndex]==null){
                    hashTable[newIndex]=word;
                    System.out.println("the "+word+" Successfully Inserted at location "+newIndex);
                    break;
                }
                else {
                    System.out.println(newIndex+ " is alreday occupied,trying for next empty cell");
                }
            }
        }
        usedCelLNumber++;
    }
    public void displayHashtable(){
        if(hashTable==null){
            System.out.println("HashTable does not exist");
        }
        else {
            System.out.println("\n---------HashTable----------\n");
            for(int i=0;i<hashTable.length;i++){
                System.out.println("Index" +i+" , Key "+hashTable[i]);
            }
        }
    }

    //search
    public boolean search(String word){
        int index = modASCIIHashFunction(word,hashTable.length);
        for(int i = index;i<index+hashTable.length;i++){
            int newIndex = i%hashTable.length;
            if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word)){
                System.out.println(word+ " found at location  "+newIndex);
                return true;
            }
        }
        System.out.println(word+" not found");
        return false;
    }
    //delete
    public void delete(String word){
        int index = modASCIIHashFunction(word,hashTable.length);
        for(int i =index;i<index+hashTable.length;i++){
            int newIndex = i%hashTable.length;
            if(hashTable[newIndex]!=null && hashTable[newIndex].equals(word)){
                hashTable[newIndex] = null;
                System.out.println(word+" has been deleted");
                return;
            }
        }
        System.out.println(word+" not found 8in hashtable");
    }
}
