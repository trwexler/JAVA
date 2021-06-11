import java.util.ArrayList;
import java.util.Arrays;

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

    //find # of array items greater than y parameter
    public void moreThanY(int[] arr, int y){
        int counter = 0;
        for(int i : arr){
            if(i>y){
                counter++;
            }
        }

        System.out.println(counter);
    }

    //sq the values
    public static void sqVals(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];	
		}
        System.out.println(Arrays.toString(nums));
	}

    //turn negs to 0
    public static void negToZero(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]<0){
                nums[i]=0;
            }	
		}
        System.out.println(Arrays.toString(nums));
	}


    //return an arr containing max, min, avg of arr param
    public static void maxMinAvg(int[] nums) {

        ArrayList<Integer> newArr = new ArrayList<Integer>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;;
        int avg = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {

            sum+=nums[i];

            if(nums[i]<min){
                min=nums[i];
            }	

            else if(nums[i]>max){
                max=nums[i];
            }	

        }
        avg = sum/nums.length;
        newArr.add(min);
        newArr.add(max);
        newArr.add(avg);

        System.out.println(newArr);
    }



}



