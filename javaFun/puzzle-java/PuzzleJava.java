import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;



public class PuzzleJava{

    // prt sums of nums in array and prt #s > y
    public void sumAndGreater(int arr[], int y){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        long sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]> y){
                newArr.add(arr[i]);
            }
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println(newArr);

    }


    // Make array w given strings. Suffle arr and prt. Rtn names>5 chars
    public void shuffleAndGrtThan(){

        String[] newArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<String> newArr1 = new ArrayList<String>();
        ArrayList<String> newArr2 = new ArrayList<String>();

        for(int i = 0; i<newArr.length; i++){
            newArr1.add(newArr[i]);
            if(newArr[i].length()>5){
                newArr2.add(newArr[i]);
            }
        }

        Collections.shuffle(newArr1);
        System.out.println(newArr1);
        System.out.println(newArr2);

    }


    // Crt arr w 26 abcs. Shfl & prt lst & fst ltr of arr. If 1st = vowel prt msg. 
    public void abc(){

        String[] newArr = {"a", "b", "c", "d", "e","f", "g", "h", "i", "j","k", "l", "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w", "x", "y", "z" };

        ArrayList<String> newArr1 = new ArrayList<String>();
        ArrayList<String> newArr2 = new ArrayList<String>();

        for(int i = 0; i<newArr.length; i++){
            newArr1.add(newArr[i]);
        }
        Collections.shuffle(newArr1);

        String first = newArr1.get(0);
        String last = newArr1.get(25);
        System.out.println(newArr1);

        if(first == "a" || first == "e" || first == "i" || first == "o" || first == "u"){
            System.out.println("A vowel!");
        }
        else{
            System.out.println(first);
        }

        System.out.println(last);

    }



}