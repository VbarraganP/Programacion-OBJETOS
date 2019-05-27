
package Excepciones;

public class Division {
    Division()throws FabianException{
        this.dividir(0);
    }
    public void dividir(int x)throws FabianException{
        int r=0;
        if(r==0){
            throw new FabianException("Error");
            
        }else{
            r=5/x;
        }
    }
}
