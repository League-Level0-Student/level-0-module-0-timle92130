package _04_amazing_games._1_scary_maze;

import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;
	
	boolean started = false;
	BufferedImage maze;
	final int frameWidth = 500;
	final int frameHeight = 500;

	ScaryMaze() throws Exception {
		
		
		maze = ImageIO.read(getClass().getResource("standardMaze.png"));
		
		
		
		
		
		
		addMouseMotionListener(this);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);	
		System.out.println(mouseColor);
		
		//5.  Run your program and move your mouse over the START COLOR. A number will be printed to the console
		
		
		int startColor=-5317;
		
		if (!started  && mouseColor==startColor) {
			started = true;
		}
		
		
		int backGroundColor = -1499549;
		int endColor = -7617718;

		
		
		if (started) {
		
		
			if (mouseColor == backGroundColor) {
				scare(); 
			}
			if (mouseColor == endColor) {
				JOptionPane.showMessageDialog(null,"You Won!!!");
			
			
			}
		
		}
	}

	private void scare() {
		
		//Scare your player with scary messages, sounds and pictures
		
		System.out.println("BOO!");
		
		if (canPlaySounds) {

			/**********  PLAY A SOUND ***************/
			//10. Find a scary sound and put it in the _04_amazing_games._1_scary_maze package (where you put your maze picture). 
			//    You can find a sound on freesound.org. Log in as leagueofamazing/code4life.		
			//11. Play the scary sound. Hint: use the playScarySound method with the name of your sound file		
			
			
		}	
		/**********  SHOW A PICTURE ***************/

		//12. Find a scary image and drop it into the _04_amazing_games._1_scary_maze package. 
		//    Use the showScaryImage method below and send it the name of your picture file
		playScarySound("shiny-objects.wav");
		
	}
	

	
	/**********  DO NOT CHANGE THE CODE BELOW THIS LINE ***************/
	
	private void playScarySound(String soundName) {
		File sound = new File("src/_04_amazing_games/_1_scary_maze/"+soundName);
		if (sound.exists()) {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}
 		}
		else {
			System.out.println("File does not exist");
		}
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Could not find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Scary Maze");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);

	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}



