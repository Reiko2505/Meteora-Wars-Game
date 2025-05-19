package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage player;
	
	public static BufferedImage speed;

    public static BufferedImage blueLaser, greenLaser, redLaser;
	
	public static void init()
	{
		player = Loader.ImageLoader("/res/ships/witchspaceship.png");
		
		speed = Loader.ImageLoader("/res/effects/firemagic2.png");

        blueLaser = Loader.ImageLoader("/res/lasers/laserBlue01.png");
		
		greenLaser = Loader.ImageLoader("/res/lasers/laserGreen11.png");
		
		redLaser = Loader.ImageLoader("/res/lasers/laserRed01.png");
	}
	
}