
public class Main {

	public static void main(String[] args) {
		Wheel[] front = new Wheel[2];
		Wheel[] rear = new Wheel[2];
		
		front[0] = new Wheel("G",20);
		front[1] = new Wheel("G",20);
		
		rear[0] = new Wheel("G",20);
		rear[1] = new Wheel("G",20);
		
		Car car = new Car("R", 100, "Toy");
		car.setFront(front);
		car.setRear(rear);
		
		System.out.println(car);
                //lol tengoq ue revisar mejor este programa
                
		

	}

}
