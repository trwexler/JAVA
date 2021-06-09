public class FizzBuzz {
    public String divisible(int num) {
        String word = null;
        if((num % 3 == 0) && (num % 5 == 0)){
            word = "fizzbuzz";
        }
        else if(num % 5 == 0){
            word = "buzz";
        }
        else if( num % 3 == 0){
            word = "fizz";
        }
        else{
            word = String.valueOf(num);
        }
        return word;
    }
}

