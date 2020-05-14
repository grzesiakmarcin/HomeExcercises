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

Methods tc = new Methods();

        System.out.println( tc.firstLast(tab2));

    }

}

class Methods {

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


    public int[] makePi() {
        int[] pi = new int[3];
        pi[0]=3;
        pi[1]=1;
        pi[2]=4;


        return pi;


    }

    public boolean commonEnd(int[] a, int[] b) {

        if( a[0]==b[0]   || a[a.length-1]==b[b.length-1]){
            return true;

        }
        return false;
    }

    public int sum3(int[] nums) {
        return nums[0]+nums[1]+nums[2];
    }



    public int sum31(int[] nums) {
        int a=0;
        for (int mojInt :nums) {
            a=a+mojInt;

        }

        return a;
    }



    public int[] rotateLeft3(int[] nums) {
        int [] rotatedLeft = {nums[1],nums[2],nums[0]};

        return rotatedLeft;
    }


    public int[] reverse3(int[] nums) {
        int[] reversed = {nums[2],nums[1],nums[0]};

        return reversed;
    }

    public int[] maxEnd3(int[] nums) {

        int newArray[] = new int[3];

//        if(nums[0]>nums[2]){
//            newArray = {nums[0], nums[0], nums[0]};
//        }
//
//        else{
//            newArray = {nums[2], nums[2], nums[2]};
//        }


        return newArray;
    }



        public int sum2(int[] nums) {

            if(nums.length>1){
                return nums[0]+nums[1];
            }

            else if (nums.length==1){
                return nums[0];
            }
            return 0;

        }


    public int[] middleWay(int[] a, int[] b) {
        int[] middle = {a[1],b[1]};

        return middle;
    }



















    }








