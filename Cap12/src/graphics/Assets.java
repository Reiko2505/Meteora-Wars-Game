package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage player;
	
	public static BufferedImage speed;

    public static BufferedImage blueLaser, greenLaser, redLaser;

	public static BufferedImage[] bigs = new BufferedImage[4];
	public static BufferedImage[] meds = new BufferedImage[2];
	public static BufferedImage[] smalls = new BufferedImage[2];
	public static BufferedImage[] tinies = new BufferedImage[2];
	
	public static void init()
	{
		player = Loader.ImageLoader("/res/ships/witchspaceship.png");
		
		speed = Loader.ImageLoader("/res/effects/firemagic2.png");

        blueLaser = Loader.ImageLoader("/res/lasers/laserBlue01.png");
		
		greenLaser = Loader.ImageLoader("/res/lasers/laserGreen11.png");
		
		redLaser = Loader.ImageLoader("/res/lasers/laserRed01.png");
	
	    for(int i = 0; i < bigs.length; i++)
			bigs[i] = Loader.ImageLoader("/res/meteors/meteorGrey_big"+(i+1)+".png");
		
		for(int i = 0; i < meds.length; i++)
			meds[i] = Loader.ImageLoader("/res/meteors/meteorGrey_med"+(i+1)+".png");
		
		for(int i = 0; i < smalls.length; i++)
			smalls[i] = Loader.ImageLoader("/res/meteors/meteorGrey_small"+(i+1)+".png");
		
		for(int i = 0; i < tinies.length; i++)
			tinies[i] = Loader.ImageLoader("/res/meteors/meteorGrey_tiny"+(i+1)+".png");
	}
}