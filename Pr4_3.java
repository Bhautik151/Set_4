//Bhautik_21CE151
public class Pr4_3 {
    public static void main(String args[]){
        // ArithmeticException
        try {
            int data=100/0; //throw exception
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("ArithmeticException");
        }

        // ArrayIndexOutOfBoundsException
        int arr[]= {1,3,5,7};
        try {
            System.out.println(arr[10]); //throw exception
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("Bhautik_21CE151");
    }
}