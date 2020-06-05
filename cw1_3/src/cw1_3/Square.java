package cw1_3;



public class Square extends Rectangle {
	Square(){
		this.width=this.height=0;
	}
	
	Square(int a){
		super(a,a);
		System.out.println("to szczególny prostokąt");
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("tylko taki szczególny :) ");
	}
}
 