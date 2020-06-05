package cw1_3;

public class Circle extends Figure {
	float radius;
	
	Circle(){
		super();
		this.radius =0;
	}
	
	Circle(float radius){
		this.radius = radius;
		System.out.println("Okrąg o promieniu "+ this.radius);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rysuję Okrąg o promieniu "+ this.radius);
	}
	
	
	
	
}
