import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOEException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Draw extends JComponent{
	 private BufferedImage image;
	 private URL resource = getClass().getResource("run0.png");


	 // circle's position
	 	private int x = 30;
	 	private int y = 30;

public Draw(){
	try{
		 image = ImageIO.read(resorce);
	}
	catch(IOException e){
		 e.printStackTrace();
	}
}
	 	public void moveUp(){
	 		y =y - 5
	 	}
	 	public void moveDown(){
	 		y =y + 5
	 	}
	 	public void moveLeft(){
	 		y =y - 5
	 	}
	 	public void moveRight(){
	 		y =y + 5
	 	}


	 public void paintComponents (Graphics g) {
	     super.paintComopnent(g);
	     g.setColor(Color.Yellow);
	     g.fillOval(30, 30, 50, 50);
	     g.drawImage(Image, x, y, this);
	 }
}