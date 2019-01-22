import java.swing.JFrame;
import java.awt.event.KeyEvent;
import jav.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener{
     Draw drawing;

     public MyFrame() {
     	this.drawing = new Draw();
     }


public void keyPressed(Keyevent e){
  if(e.getKeyCode() == KeyEvent.VK_UP){
  	 drawing.moveUp();
  	 System.out.printl("pos: " + drawing.x + "," + drawing.y);
 }

 else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
  	 drawing.moveRight();
  	 System.out.printl("pos: " + drawing.x + "," + drawing.y);
}
 else if(e.getKeyCode() == KeyEvent.VK_DOWN){
  	 drawing.movedown();
  	 System.out.printl("pos: " + drawing.x + "," + drawing.y);
 }

  else  if(e.getKeyCode()== KeyEvent.VK_LEFT){
  	 drawing.moveleft();
  	 System.out.printl("pos: " + drawing.x + "," + drawing.y);
  }
  }

public void keyReleased( KeyEvent e); {

}
public void keyTyped(KeyEvent e){

}

}
	 public static void main(String args[]) {
       MyFrame gameFrame= new MyFrame();
       Draw drawing = new Draw();

        gameFrame.setSize(600 ,600);
        gameFrame.defaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);
        gameFrame.getContentPanel().add(drawing);  
        gameFrame.addkeylistener(gameFrame); 
      System.out.println("practical programming");


}