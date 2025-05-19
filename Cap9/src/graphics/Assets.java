package graphics;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage player;
	
	// effects
	
	public static BufferedImage speed;
	
	public static void init()
	{
		player = Loader.ImageLoader("/res/ships/witchspaceship.png");
		
		speed = Loader.ImageLoader("/res/effects/firemagic.png");
	}
	
}