import java.util.Arrays;

public class Week3 {
    public static int[] ages = {3,9,23,64,2,8,28,93};
    static int[] forSum = {1,2,3,4,5,6,7,8,9};
    static int rock;

    //Take doubles array checks
    static double[] first = {345,2345,6532,665,773};
    static double[] second = {1,2,3,4,5,6,7,8,9,10};


    static String[] names= {"Sam","Tommy","Tim","Sally","Buck","Bob"};
    static int sum;
    public static void main(String[] args) {
        System.out.println("Question 1 part A: ");
        System.out.println(sumFirstLast(ages));
        System.out.println("Question 1 part C: ");
        System.out.println(average(ages));
        System.out.println("Question 2 part A");
        System.out.println(charIterate(names));
        System.out.println("Question 2 part B");
        System.out.println(nameCon(names));
        System.out.println("Method: 5");
        System.out.println(Arrays.toString(addLength(names)));
        System.out.println("Method: 6");
        sumLength(addLength(names));
        System.out.println("Method: 7");
        System.out.println(printNumTimes("Hello", 3));//7
        System.out.println("Method: 8");
        System.out.println(firstNLastN("Monty","Defreitas")); //8
        System.out.println("Method: 9");
        System.out.println(sumArray(forSum));
        System.out.println("Method: 10");
        System.out.println(takeDouble(first));
        System.out.println("Method: 11");
        System.out.println(takeTwoArrFindAvg(first,second));//11
        System.out.println("Method: 12");
        System.out.println(willBillyDrink(true, 10.32));
    }
//Question 1: Part a
    public static int sumFirstLast(int[] ages){
        for(int eleOne : ages){
            if (eleOne == ages[0]) {
                rock = eleOne + ages[ages.length-1];
            }
        }
        return rock;
        //rock = ages[0]- ages[ages.length - 1];
    }
    //Question 1: Part c
    public static double average(int[] ages){
        double average = 0;
        for (int age : ages) {
            average += age;
        }
        return average / ages.length;
    }
    //Question 2: Part a
    static int charIterate(String[] names){
        int totChar = 0;
        for(String name : names){
            totChar += name.length();
        }
        return totChar;
    }
    //Question 2: Part b
    static String nameCon(String[] names){
        StringBuilder cCat = new StringBuilder();
        for(String name : names){
            cCat.append(name).append(" ");
        }
        return cCat.toString();
    }
    //Question 5
    static int[] addLength(String[] names){
        int[] nameLengths = new int[names.length];
        for(int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        return nameLengths;
    }
    //Question 6
    static void sumLength(int[] nLength){
        int nameSum = 0;
        for (int name : nLength) {
            nameSum += name;
        }
        System.out.println(nameSum);
    }
    //Question 7
    static String printNumTimes(String word, int num) {
        StringBuilder ope = new StringBuilder(" ");
        int counter = 0;
        while(counter < num) {

            ope.append(word);
            counter ++;
        }
        return ope.toString();
    }
    //Question 8
    static String firstNLastN(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    //Question 9
    static boolean sumArray(int[] numbers) {
        int sum =0;
        for(int num : numbers){
            sum += num;
        }
        return sum > 100;
    }
    //Question 10
    static double takeDouble(double[] numbers){
        double average = 0;
        for (double num : numbers) {
            average += num;
        }
        return average / numbers.length;
    }
    //Question 11
    static boolean takeTwoArrFindAvg(double[] set1, double[] set2) {
        double avg1 = 0;
        double avg2 = 0;
         for(double numSet1 : set1){
             avg1 += numSet1;
         }
         avg1 /= set1.length;

         for (double numSet2 : set2){
             avg2 += numSet2;
         }
         avg2 /= set2.length;
        return avg1 > avg2;
    }
    static int sumOfDigits(int number) {
        int digit = 0;
        while(number > 0) {
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }

    //Question 12
    static boolean willBillyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    //Created method
    /* This methods purpose is to take in a number and determine if that number is a prime number or not. I created this method because as a kid I remembered sucking at math and
    wanted to create something that could help young kids get their math homework done sooner.
     */
    private static boolean isPrime(int number){
        // First edge case 2 can't be prime
        if (number == 2){
            return false;
        }
        // Second edge case any number below 2 can't be prime.
        if (number < 2 ){
            return false;
        }
        // This loops will increase multiplying the number by each iteration, if its only divisible by itself we know its prime
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        //return true in order for the boolean in primeNumbers to evaluate true.
        return true;
    }

}
