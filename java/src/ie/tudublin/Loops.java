package ie.tudublin;

import processing.core.PApplet;



public class Loops extends PApplet {


	int mode = 0;
	public void settings() {
		size(1000, 1000);
	}

	public void setup() {
		colorMode(HSB);
	}



	public void keyPressed() {
		
		mode = key - '0';
		println(mode);
	}

	public void draw() {
		background(0);
		fill(255);

		switch(mode){
			case 0:
				int numCircle = 10;
				float dia = width /(float) numCircle;
				for(int i = 0; i < numCircle; i++){
					for(int j = 0; j < numCircle; j++){

					float x = (dia * 0.5f) + (dia * i);
					float y = (dia * 0.5f) + (dia * j);
					colour = ((i + j) / ((numCircle - 1)))
					circle(x, y, dia);
					}
				}
		}
		
	}


}
