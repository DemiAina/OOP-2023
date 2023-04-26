package ie.tudublin;

import processing.core.PApplet;
// My please
public class BugZap extends PApplet
	
{

	interface enitity{
		public void draw();
		public void checkCollision();
		public void shootBullet();
	}

	class player implements enitity{
		private float x;
		private float y;
		private float width; 
		public player(float x, float y, float width) {
			this.x = x;
			this.y = y;
			this.width = width;
		}
		
	}

	class cpu{
		private float x;
		private float y;
		private float width;
		public cpu(float x, float y, float width) {
			this.x = x;
			this.y = y;
			this.width = width;
		}
	}

	float playerX = 50;
	float playerY = 50;
	float playerWidth = 50;

	float CpuX = 50;
	float CpuY = 50;
	float CpuWidth = 50;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
	}

	
	public void draw() {
		clear();
		playerY += 1;
		CpuY += 1;
		checkCollision(playerX, playerY, playerWidth);
		drawPlayer(playerX,playerY,playerWidth);
		drawCpu(CpuX,CpuY,CpuWidth);
		randomCpu();

	}

	public void drawPlayer(float x, float y, float w){
		triangle(x, y, x+20, y - 50, x + 40, y);
	}

	public void drawCpu(float x, float y, float w){
		triangle(x, y, x+20, y - 50, x + 40, y);
	}

	public void checkCollision(float x, float y, float w){
		System.out.println(playerX + " " + playerY + " " + playerWidth);
		if( playerY > height){
			playerY = 500;
		}
		if(playerX > 450){
			playerX = 450;
		}
		if(playerX < 0){
			playerX = 0;
		}
	}

	public void shootBullet(float x, float y, float w){
		colorMode(RGB);
		stroke(255,0,0);
		line(x, y, x - 50, y - 50);
	}

	public void randomCpu(){
		if((frameCount % 60) == 0){
		CpuX = random(0,450);
		CpuY = random(0,500);
		CpuWidth = random(0,500);
		}
		
	}

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
			playerX -= 10;

		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
			playerX += 10;
		}

		if(keyCode == UP)
		{
			System.out.println("Up arrow pressed");
			playerY -= 10;
		}

		if(keyCode == DOWN)
		{
			System.out.println("Down arrow pressed");
			playerY += 10;
		}

		if (key == ' ')
		{
			System.out.println("SPACE key pressed");
			shootBullet(playerX,playerY,playerWidth);
		}
	}	


	
}
