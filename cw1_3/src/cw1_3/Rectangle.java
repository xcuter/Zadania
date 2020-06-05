package cw1_3;

public class Rectangle extends Figure {
	Rectangle(){
		super();
	}
	
	Rectangle(int height, int width){
		super(height,width);
		System.out.println("Prostokąt");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rysuję prostokąt o wymiarach "+this.height+" na "+this.width);
	}
	
	
}
