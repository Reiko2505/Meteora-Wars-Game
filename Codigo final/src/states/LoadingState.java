package states;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import gameObject.Constants;
import graphics.Assets;
import graphics.Loader;
import graphics.Text;
import math.Vector2D;
import java.awt.image.BufferedImage;


public class LoadingState extends State{
	private BufferedImage backgroundImage;

	private Thread loadingThread;
	
	private Font font;
	
	public LoadingState(Thread loadingThread) {
		this.loadingThread = loadingThread;
		this.loadingThread.start();
		font = Loader.loadFont("/res/fonts/MonsterFriendFore.otf", 23);
		backgroundImage = Loader.ImageLoader("/res/others/brujita.png");
	}
	
	@Override
	public void update(float dt) {
		if(Assets.loaded) {
			State.changeState(new MenuState());
			try {
				loadingThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void draw(Graphics g) {
		GradientPaint gp = new GradientPaint(
				Constants.WIDTH / 2 - Constants.LOADING_BAR_WIDTH / 2,
				Constants.HEIGHT / 2 - Constants.LOADING_BAR_HEIGHT / 2,
				Color.WHITE,
				Constants.WIDTH / 2 + Constants.LOADING_BAR_WIDTH / 2,
				Constants.HEIGHT / 2 + Constants.LOADING_BAR_HEIGHT / 2,
				Color.PINK
				);
		
		Graphics2D g2d = (Graphics2D)g;

		if(backgroundImage != null) {
           g2d.drawImage(backgroundImage, 450, 80, 100, 100, null);
        }
		
		g2d.setPaint(gp);
		
		float percentage = (Assets.count / Assets.MAX_COUNT);
		
		g2d.fillRect(Constants.WIDTH / 2 - Constants.LOADING_BAR_WIDTH / 2,
				Constants.HEIGHT / 2 - Constants.LOADING_BAR_HEIGHT / 2,
				(int)(Constants.LOADING_BAR_WIDTH * percentage),
				Constants.LOADING_BAR_HEIGHT);
		
		g2d.drawRect(Constants.WIDTH / 2 - Constants.LOADING_BAR_WIDTH / 2,
				Constants.HEIGHT / 2 - Constants.LOADING_BAR_HEIGHT / 2,
				Constants.LOADING_BAR_WIDTH,
				Constants.LOADING_BAR_HEIGHT);
		
		Text.drawText(g2d, "METEORA WARS GAME", new Vector2D(Constants.WIDTH / 2, Constants.HEIGHT / 2 - 50),
				true, Color.WHITE, font);
		
		
		Text.drawText(g2d, "LOADING...", new Vector2D(Constants.WIDTH / 2, Constants.HEIGHT / 2 + 40),
				true, Color.WHITE, font);
		
	}

}