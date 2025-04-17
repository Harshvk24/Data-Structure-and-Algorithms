import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;



public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize =5;

    DirectChaining(int size){
        hashTable = new LinkedList[size];
    }

    public int modASCIIHashFunction(String word,int M){
        //char ch[]=word.toCharArray();
//        ch = word.toCharArray();
        int i ,sum=0;
        for (i=0;i<word.length();i++){
            int acsiiv= word.charAt(i);
            sum = sum+ acsiiv;
        }
        return sum%M;
    }
    public void insertHashTable(String word){
        int newIndex = modASCIIHashFunction(word,hashTable.length);
        if(hashTable[newIndex]==null){
            hashTable[newIndex]=new LinkedList<String>();
            hashTable[newIndex].add(word);
        }else {
            hashTable[newIndex].add(word);
        }
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

    //searching
    public boolean searchHashTable(String word){
        int newIndex = modASCIIHashFunction(word,hashTable.length);
        if(hashTable[newIndex]!=null && hashTable[newIndex].contains(word)){
            System.out.println("\n" + "\""+word+"Found in hash table at " +newIndex);
            return true;
        }else {
            System.out.println("mot found in hashTAble");
            return false;
        }
    }

    public void deleteKeyHashTable(String word){
        int newIndex = modASCIIHashFunction(word,hashTable.length);
        boolean result = searchHashTable(word);
        if(result){
            hashTable[newIndex].remove(word);
            System.out.println("word has been deleted form hashtable");
        }else {
            System.out.println("value not found");
        }
    }
}
