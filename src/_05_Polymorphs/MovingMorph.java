package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {

	public MovingMorph(int x, int y, int width, int height) {
		super(x, y,width,height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Random ran = new Random();
		x= ran.nextInt(5) +7;
		y = ran.nextInt(32) +9;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.yellow);
		g.fillRect(x, y, PolymorphWindow.WIDTH, PolymorphWindow.HEIGHT);
	}

}
