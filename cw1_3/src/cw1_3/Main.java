package cw1_3;

import java.util.Random;

public class Main {
	
	static void ReDrawFigure(Figure [] figures) {
		for(int iTemp =0 ;iTemp < figures.length;iTemp++) {
			figures[iTemp].draw();
		}
	}
	
	static void fillInFigureTab(Figure [] figures) {
		Random genrand = new Random();
		for(int iTemp=0; iTemp < figures.length; iTemp++) {
			int iTemp2 = genrand.nextInt(3);
			switch(iTemp2) {
			
			case 1: {
				figures[iTemp] = new Circle((genrand.nextFloat())*(10.0F));
				break;
			}
			
			case 2: { 
				figures[iTemp] = new Rectangle(genrand.nextInt(10),genrand.nextInt(15));
				break;
			}
					
			default: 
				{
					figures[iTemp] = new Square(genrand.nextInt(10));
			}
			
			}
		}
	}

	static void RedrawFigurear(Figure ... args) {
		for(var figure: args) {
			figure.draw();
			Figure.fDraw(figure);
		}
	}

	
	
	public static void main(String args[]) {
				
		System.out.println();
		System.out.println();
		
		Figure[] figures = new Figure[7];
		fillInFigureTab(figures);
		
		System.out.println();
		System.out.println();
		
		ReDrawFigure(figures);
		
		System.out.println();
		System.out.println();
		
		RedrawFigurear(figures);
		
		System.out.println();
		System.out.println();
	}
}
