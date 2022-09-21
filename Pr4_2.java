//Bhautik_21CE151
import java.io.IOException;
public class Pr4_2 {
    void m() throws IOException {
        throw new IOException("Error");//checked exception
    }

    public static void main(String args[]){
        Pr4_2 obj=new Pr4_2();
        try {
            obj.m();
        }
        catch(IOException e){
            System.out.println("Exception Handled");
        }
        System.out.println("Bhautik_21CE151");
    }
}