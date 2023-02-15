package ie.tudublin;

import processing.core.PApplet;



public class Loops extends PApplet {


	int mode = 0;

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	public void setup() {
		colorMode(HSB);
	}

	public void keyPressed() {

		mode = key - '0';
		println(mode);
	}

	float off = 0;

	public void draw() {
		background(0);
		fill(255);
<<<<<<< HEAD
=======
		noStroke();

		switch (mode) {
			case 0:
				int numCircles = (int) max(1, mouseX / 50.0f);
				float d = width / numCircles;
				for (int j = 0; j < numCircles; j++) {
					for (int i = 0; i < numCircles; i++) {
						float x = (d * 0.5f) + (d * i);
						float y = (d * 0.5f) + (d * j);
						float c = ((i + j) / ((numCircles - 1) * 2.0f)) * 255.0f;
						fill((c + off) % 256, 255, 255);
						circle(x, y, d);
					}
				}
				off += (mouseY / 50.0f);
				break;
			case 1:
				break;
			default:
				break;
		}
>>>>>>> 45c2a18a801f6c0cfa6482c3f9e641adf08ca969

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
