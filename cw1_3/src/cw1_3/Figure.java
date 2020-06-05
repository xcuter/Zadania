package cw1_3;

public abstract class Figure {
	
	Figure(){
		this.width = 0;
		this.height = 0;
		System.out.println("Konstruuje domyślną figurę");
	}
	
	Figure(int height, int width){
		this.height = height;
		this.width = width;
		System.out.println("Konstruuje figurę o wymiarach wysokość= "+this.height+" szerokość= "+this.width+" ta figura to :");
	}
	
	int width;
	int height;
	
	public abstract void draw();
	
	static void fDraw(Object obj) {
		System.out.println(obj.getClass().getSimpleName());
	}
}
