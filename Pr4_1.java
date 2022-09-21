//This program is prepared by bhautik_21ce151
public class Pr4_1 {
    public static void main(String args[]){
        // ArithmeticException
        try {
            int data=100/0; //may throw exception
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }

        // ArrayIndexOutOfBoundsException
        int arr[]= {1,3,5,7};
        try {
            System.out.println(arr[10]); //may throw exception
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Bhautik_21CE151");
    }
}