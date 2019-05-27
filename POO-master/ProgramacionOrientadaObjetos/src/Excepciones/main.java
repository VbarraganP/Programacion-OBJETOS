
package Excepciones;

public class main {
    public static void main(String[] args) {

        try{
            Division d=new Division();
        }catch(FabianException d){//ArithmeticException
            System.out.println("Esta dividiendo por 0");
        }

    }
}
