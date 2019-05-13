import java.util.Arrays;

public class Car {
   private String marca;
   private Engire m;
   private Wheel[] front;
   private Wheel[] rear;

   public Car(String marcaM, double potencia, String marcaC) {
	  this.m = new Engire(marcaM, potencia);
	  this.marca = marcaC;
   }
   
   
   public Engire getM() {
	return m;
   }

 
   public Wheel[] getFront() {
	return front;
   }	

   public void setFront(Wheel[] front) {
	   this.front = front;
   }

   public Wheel[] getRear() {
	   return rear;
   }

   public void setRear(Wheel[] rear) {
	   this.rear = rear;
	   //Relacion bidireccional
	   //Rueda con motor
	   for (int i = 0; i < rear.length; i++) {
		   this.rear[i].setAxle(this.m);
	   }
	   //Motor con rueda
	   this.m.setAxle(rear);
	   
   }


public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}


@Override
public String toString() {
	return "Car [marca=" + marca + ", m=" + m + ", front=" + Arrays.toString(front) + ", rear=" + Arrays.toString(rear)
			+ "]";
}

  

   
   
   
}
