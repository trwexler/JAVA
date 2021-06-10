import java.util.ArrayList;

public class BigTwelve{



    // ArrayList<Integer> arr = new ArrayList<Integer>();

    //print 1-255
    public void printNums(){
        for(int i = 0; i<256; i++){
            System.out.println(i);
        }
    }

    //print odds 1-255
    public void printOdds(){
        for(int i = 1; i<256; i+=2){
            System.out.println(i);
        }
    }

    //print sum of all printed #s 1-255
    public void printSum(){
        long sum = 0;

        for(int i = 0; i<256; i++){
            sum += i;
            System.out.println(String.format("New Number: %d Sum: %d", i, sum));
        }
    }

    //print as you iterate through array
    public void iterateArr(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }

    //print array max
    public void findMax(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
    }

    //Alternate to get max. Integer class has built in 
    //methods for highest/lowest #s ints can hold:

    // public void findMax(int[] arr) {
	// 	int max = Integer.MIN_VALUE;
	// 	for(int i: arr){
	// 		if(i > max)
	// 			max = i;
	// 	}
	// 	return max;
	// }

    //find min in array (alt above works here too)
    public void findMin(int[] arr){
        int min = arr[0];
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        System.out.println(min);
    }

    //find average of #s in an array
    public void findAvg(float[] arr){
        float sum = 0;
        for(float i : arr){
            sum += i;
        }
        float avg = sum / arr.length;
        System.out.println(avg);
    }





}



