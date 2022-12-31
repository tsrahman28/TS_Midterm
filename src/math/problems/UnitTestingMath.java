package math.problems;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        //Finding Missing number of an array
        FindMissingNumber myobj = new FindMissingNumber();
        int [] array = new int[]{1, 2, 3, 5};
        System.out.println("The missing number is: "+ myobj.MissingNumber(array));
    }
}
