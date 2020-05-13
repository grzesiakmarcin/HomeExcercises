package codingBat;


/*

https://codingbat.com/java/Array-1

Basic array problems -- no loops.. Use a[0], a[1], ... to access elements in an array, a.length is the length (note that
 s.length() is for Strings). Allocate a new array like this: int[] a = new int[10]; // length 10 array
 */

public class Arrays {
    public static void main(String[] args) {

        int [] tab1={1,2,1,3,6};
        int [] tab2={1,6};
        int [] tab3={0,2,1,3};
        int [] tab4={0,2,1,3,4};

TestClass tc = new TestClass();

        System.out.println( tc.firstLast(tab2));

    }

}

class TestClass{

    public boolean firstLast(int[] nums){

        if(nums[0]==6|| nums[nums.length-1]==6){
            return true;
        }


        return false;

    }


public boolean sameFirstLast(int[] nums){
    if(nums[0]==nums[nums.length-1]){
            return true;
        }

        return false;
}




}
