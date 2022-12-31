package string.problems;
import java.util.*;
public class DuplicateWord {
    // TODO first we wrote a function to find the duplicate element with its frequency with the help of hashmap
    public static HashMap<String,Integer> duplicateElement(String source){
        HashMap<String,Integer> hash = new HashMap<String,Integer>();

        String [] words = source.split("\\s+");

        for(String x:words){
            if(x.contains(".")){
                x=x.replace(".","");
                x = x.toLowerCase();
            }
            if(hash.containsKey(x)){
                hash.put(x,hash.get(x)+1);
            }else{
                hash.put(x,1);
            }
        }

        hash.entrySet().removeIf(x->(1==x.getValue()));
        return hash;
    }


    public static double averageLengthOfWords(String source){

        double avg = 0;
        String [] words = source.split("\\s+");
        int sum=0;
        for(String x:words){
            if(x.contains(".")){
                x=x.replace(".","");
            }
            sum += x.length();
        }
        avg = (double)sum/words.length;
        return avg;
    }

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        //String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        //String word ="Java";

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        HashMap<String,Integer> frequencyCount = new HashMap<String,Integer>();
        frequencyCount = duplicateElement(st);

        System.out.println("Duplicate Element : Frequency");
        for(Map.Entry<String,Integer> x:frequencyCount.entrySet()){
            System.out.println(x.getKey()+" : "+x.getValue());
        }

        System.out.println("Average Length of Words in String : "+String.format("%4f",averageLengthOfWords(st)));
    }
            }






