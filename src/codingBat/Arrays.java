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

    public int[] makeEnds(int[] nums) {
        int [] newArray={nums[0], nums[nums.length-1]};
        return newArray;
    }



    public boolean has23(int[] nums) {

        if(nums[0]==2||nums[0]==3||nums[1]==2||nums[1]==3){
            return true;

        }
        return false;
    }


    public boolean no23(int[] nums) {
        if(!(nums[0]==2|| nums[0]==3) ){
            return true;}

        else if (!(nums[1]==2) ||nums[1]==3){
            return true;
        }

        return false;
    }


    public int[] makeLast(int[] nums) {
        int[] newArray = new int[(nums.length*2)];
        newArray[newArray.length-1]=nums[nums.length-1];
        return newArray;
    }

    public boolean double23(int[] nums) {
        if(nums.length>1){

            if(nums[0]==2&&nums[1]==2||nums[0]==3&&nums[1]==3){
                return true;
            }

            return false;
        }

        return false;
    }




    public int[] fix23(int[] nums) {

        if ((nums[1] == 2 && nums[2] == 3)) {
            nums[2] = 0;

            return nums;
        } else if ((nums[0] == 2 && nums[1] == 3)) {
            nums[1] = 0;

            return nums;

        }

        return nums;
    }

    public int start1(int[] a, int[] b) {
        int indicator=0;

        if(a.length>0&& b.length>0){

            if(a[0]==1&&b[0]==1){
                indicator=2;
            }
            else if(a[0]==1||b[0]==1){
                indicator = 1;
            }

            return indicator;}


        else if(a.length==0&&b.length==0){
            return indicator;
        }
        else{


            if(a.length>0 && a[0]==1 ||b.length>0&& b[0]==1){
                indicator=1;
            }

        }


        return indicator;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        if(   a[0]+a[1]>b[0]+b[1]||a[0]+a[1]==b[0]+b[1]){
            return a;

        }

        return b;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] newArray = {a[0],a[1],b[0],b[1]};
        return newArray;



    }

    public int[] midThree(int[] nums) {

        int a=nums.length/2;
        int[]nums2= {nums[a-1], nums[a],nums[a+1]};

        return nums2;

    }

    public int maxTriple(int[] nums) {
        int a= nums[0];
        int b= nums[nums.length/2];
        int c = nums[nums.length-1];
        int result= nums[0];

        if(a>b&& a>c){
            result = a;
        }
        else if (a <b&& b>c){
            result =b;
        }

        else if (c>a&& c>b){
            result =c;
        }
        return result;
    }


    public int[] frontPiece(int[] nums) {
        if (nums.length>1){
            int[] newArray = {nums[0], nums[1]};
            return newArray;
        }
        return nums;
    }





    public boolean unlucky1(int[] nums) {
        if (nums.length<=1) {
            return false;
        }

        else if (nums.length ==2 && (nums[0] == 1 && nums[1] == 3)){
            return true;
        }

        else if (nums.length >2 &&nums[0] == 1 && nums[1] == 3 ||nums.length >2&& nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
            return true;

        }

        else if (nums.length >2 && nums[1] == 1 && nums[2] == 3 ||nums.length >2 &&  nums[nums.length - 3] == 1 && nums[nums.length - 2] == 3){
            return true;
        }

//wysypuje sie na 1 tescie

        return false;
    }




    public int[] make2(int[] a, int[] b) {

        int[] newArray={0,0};

        if(a.length==0){
            newArray[0]=b[0];
            newArray[1]=b[1];
        }
        else if (a.length==1){
            newArray[0]=a[0];
            newArray[1]=b[0];
        }
        else {
            newArray[0]=a[0];
            newArray[1]=a[1];
        }


        return newArray;
    }



    public int[] front11(int[] a, int[] b) {
        int[] newArray={0,0};
        int[] oneArray={0};
        int[] otherArray={};

        if(a.length>=1 && b.length>=1){
            newArray[0]=a[0];
            newArray[1]=b[0];
            return newArray;
        }

        else if (a.length==0 && b.length>1){
            oneArray[0]=b[0];

            return oneArray;
        }

        else if(a.length>1 && b.length==0){
            oneArray[0]=a[0];

            return oneArray;
        }

        else if (a.length==0 && b.length==1 ){
            oneArray[0]=b[0];
            return oneArray;
        }

        else if (b.length==0 && a.length==1 ){
            oneArray[0]=a[0];
            return oneArray;
        }


        return otherArray;
    }


    public int[] swapEnds(int[] nums) {
        int lastChar = nums[nums.length-1];
        int firstChar = nums[0];

        nums[0]=lastChar;
        nums[nums.length-1]=firstChar;

        return nums;
    }



}








