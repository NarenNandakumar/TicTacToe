package defaul;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame {

    public TicTacToe() {
        setTitle("Centered Rectangle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RectanglePanel panel = new RectanglePanel();
        getContentPane().add(panel);

        setUndecorated(true); // Remove window decorations
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Fullscreen mode
        setVisible(true);

        panel.requestFocusInWindow(); // Request focus for key events
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TicTacToe::new);
    }
}

class RectanglePanel extends JPanel {
	public void rerepaint() {
		repaint();
	}
   static int[][] clicks = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
   static Rectangle restartButton;
   static Rectangle lu;
   static Rectangle lm;
   static Rectangle ld;
   static Rectangle mu;
   static Rectangle mm;
   static Rectangle md;
   static Rectangle ru;
   static Rectangle rm;
   static Rectangle rd;
   
   static Rectangle lus;
   static Rectangle lms;
   static Rectangle lds;
   static Rectangle mus;
   static Rectangle mms;
   static Rectangle mds;
   static Rectangle rus;
   static Rectangle rms;
   static Rectangle rds;
   static boolean drawLus = false;
   static boolean drawLms = false;
   static boolean drawLds = false;
   static boolean drawMus = false;
   static boolean drawMms = false;
   static boolean drawMds = false;
   static boolean drawRus = false;
   static boolean drawRms = false;
   static boolean drawRds = false;
   
   static int turn = +1;
   
   static int lut = 0;
   static int lmt = 0;
   static int ldt = 0;
   static int mut = 0;
   static int mmt = 0;
   static int mdt = 0;
   static int rut = 0;
   static int rmt = 0;
   static int rdt = 0;
   
   static int luc = 1;
   static int lmc = 1;
   static int ldc = 1;
   static int muc = 1;
   static int mmc = 1;
   static int mdc = 1;
   static int ruc = 1;
   static int rmc = 1;
   static int rdc = 1;
    //private Rectangle rect;

    public RectanglePanel() {
        setFocusable(true); // Allow panel to receive key events
//        addKeyListener(new KeyAdapter() {
//        	@SuppressWarnings("unused")
//			@Override
//        	public void keyClicked(KeyEvent e) {
//        		if (e.getKeyChar() == 'e') {
//        			setVisible(false);
//        		}
//        	}
//        });
        addMouseListener(new MouseAdapter() {
            @SuppressWarnings("unused")
			@Override
            public void mouseClicked(MouseEvent e) {
            	if (restartButton.contains(e.getX(), e.getY())) {
                	//System.out.println("d");
                	clicks[0][0] = 0;
                	clicks[0][1] = 0;
                	clicks[0][2] = 0;
                	clicks[1][0] = 0;
                	clicks[1][1] = 0;
                	clicks[1][2] = 0;
                	clicks[2][0] = 0;
                	clicks[2][1] = 0;
                	clicks[2][2] = 0;
                	Game.restart();
                	repaint();
                }
            	if (Win.gameEnd) {
            		return;
            	}
            if (lu.contains(e.getX(), e.getY())) {            
	            if (lut == 0) {
	            	drawLus = true;
	            	if (turn == 1) {
	            		clicks[0][0] = 1;
	            	}
	            	else {
	            		clicks[0][0] = 2;
	            	}
	                repaint();
	                if (Win.checkWin("player1", clicks)) {
	                	System.out.println("PLAYER 1 WON!");
	                	Win.gameEnd = true;
	                }
	                else if (Win.checkWin("player2",  clicks)) {
	                	System.out.println("PLAYER 2 WON!");
	                	Win.gameEnd = true;
	                }
	                
	            }
            }
            else if (lm.contains(e.getX(), e.getY())) {
	            if (lmt == 0) {
	            	drawLms = true;
	            	if (turn == 1) {
	            		clicks[1][0] = 1;
	            	}
	            	else {
	            		clicks[1][0] = 2;
	            	}
	                repaint();
	                if (Win.checkWin("player1", clicks)) {
	                	System.out.println("PLAYER 1 WON!");
	                	Win.gameEnd = true;
	                }
	                else if (Win.checkWin("player2",  clicks)) {
	                	System.out.println("PLAYER 2 WON!");
	                	Win.gameEnd = true;
	                }
	            }
            }
            else if (ld.contains(e.getX(), e.getY())) {
            if (ldt == 0) {
        drawLds = true;
        if (turn == 1) {
    		clicks[2][0] = 1;
    	}
    	else {
    		clicks[2][0] = 2;
    	}
                repaint();
                if (Win.checkWin("player1", clicks)) {
                	System.out.println("PLAYER 1 WON!");
                	Win.gameEnd = true;
                }
                else if (Win.checkWin("player2",  clicks)) {
                	System.out.println("PLAYER 2 WON!");
                	Win.gameEnd = true;
                }
        }
            }
            else if (mu.contains(e.getX(), e.getY())) {
            if (mut == 0) {
        drawMus = true;
        if (turn == 1) {
    		clicks[0][1] = 1;
    	}
    	else {
    		clicks[0][1] = 2;
    	}
                repaint();
                if (Win.checkWin("player1", clicks)) {
                	System.out.println("PLAYER 1 WON!");
                	Win.gameEnd = true;
                }
                else if (Win.checkWin("player2",  clicks)) {
                	System.out.println("PLAYER 2 WON!");
                	Win.gameEnd = true;
                }
        }
            }
            else if (mm.contains(e.getX(), e.getY())) {
            if (mmt == 0) {
        drawMms = true;
        if (turn == 1) {
    		clicks[1][1] = 1;
    	}
    	else {
    		clicks[1][1] = 2;
    	}
                repaint();
                if (Win.checkWin("player1", clicks)) {
                	System.out.println("PLAYER 1 WON!");
                	Win.gameEnd = true;
                }
                else if (Win.checkWin("player2",  clicks)) {
                	System.out.println("PLAYER 2 WON!");
                	Win.gameEnd = true;
                }
        }
            }
            else if (md.contains(e.getX(), e.getY())) {
            if (mdt == 0) {
        drawMds = true;
        if (turn == 1) {
    		clicks[2][1] = 1;
    	}
    	else {
    		clicks[2][1] = 2;
    	}
                repaint();
                if (Win.checkWin("player1", clicks)) {
                	System.out.println("PLAYER 1 WON!");
                	Win.gameEnd = true;
                }
                else if (Win.checkWin("player2",  clicks)) {
                	System.out.println("PLAYER 2 WON!");
                	Win.gameEnd = true;
                }
        }
            }
            else if (ru.contains(e.getX(), e.getY())) {
            if (rut == 0) {
        drawRus = true;
        if (turn == 1) {
    		clicks[0][2] = 1;
    	}
    	else {
    		clicks[0][2] = 2;
    	}
                repaint();
                if (Win.checkWin("player1", clicks)) {
                	System.out.println("PLAYER 1 WON!");
                	Win.gameEnd = true;
                }
                else if (Win.checkWin("player2",  clicks)) {
                	System.out.println("PLAYER 2 WON!");
                	Win.gameEnd = true;
                }
        }
            }
            else if (rm.contains(e.getX(), e.getY())) {
            if (rmt == 0) {
        drawRms = true;
        if (turn == 1) {
    		clicks[1][2] = 1;
    	}
    	else {
    		clicks[1][2] = 2;
    	}
                repaint();
                if (Win.checkWin("player1", clicks)) {
                	System.out.println("PLAYER 1 WON!");
                	Win.gameEnd = true;
                }
                else if (Win.checkWin("player2",  clicks)) {
                	System.out.println("PLAYER 2 WON!");
                	Win.gameEnd = true;
                }
        }
            }
            else if (rd.contains(e.getX(), e.getY())) {
            if (rdt == 0) {
        drawRds = true;
        if (turn == 1) {
    		clicks[2][2] = 1;
    	}
    	else {
    		clicks[2][2] = 2;
    	}
                repaint();
                if (Win.checkWin("player1", clicks)) {
                	System.out.println("PLAYER 1 WON!");
                	Win.gameEnd = true;
                }
                else if (Win.checkWin("player2",  clicks)) {
                	System.out.println("PLAYER 2 WON!");
                	Win.gameEnd = true;
                }
        }
            }
            
            // win message
            if (Win.gameEnd) { 
            	
            	repaint();
            }
            }
       
        });
    }
//    Rectangle rect;
   
   
   
    @Override
    protected void paintComponent(Graphics g) {
  
        super.paintComponent(g);
        if (Win.gameEnd) { 
            String status = "";
            if (turn == 1) {
            	status = "PLAYER 1 WON!";
            }
            else {
            	status = "PLAYER 2 WON!";
            }
            Text victory = new Text(status, 50, 650,190, g);
            victory.draw();
        }
        restartButton = new Rectangle(1400, 700, 100, 100, Color.green, g);
        restartButton.draw(g);
        lu = new Rectangle(550, 300, 150, 150, Color.red, g);
        lu.draw(g);
        lm = new Rectangle(550, 500, 150, 150, Color.red, g);
        lm.draw(g);
        ld = new Rectangle(550, 700, 150, 150, Color.red, g);
        ld.draw(g);
        mu = new Rectangle(750, 300, 150, 150, Color.red, g);
        mu.draw(g);
        mm = new Rectangle(750, 500, 150, 150, Color.red, g);
        mm.draw(g);
        md = new Rectangle(750, 700, 150, 150, Color.red,g);
        md.draw(g);
        ru = new Rectangle(950, 300, 150, 150, Color.red, g);
        ru.draw(g);
        rm = new Rectangle(950, 500, 150, 150, Color.red, g);
        rm.draw(g);
        rd = new Rectangle(950, 700, 150, 150, Color.red, g);
        rd.draw(g);
        lus = new Rectangle(575, 325, 100, 100, Color.black, g);
        lms = new Rectangle(575, 525, 100, 100, Color.black, g);
        lds = new Rectangle(575, 725, 100, 100, Color.black, g);
        mus = new Rectangle(775, 325, 100, 100, Color.black, g);
        mms = new Rectangle(775, 525, 100, 100, Color.black, g);
        mds = new Rectangle(775, 725, 100, 100, Color.black, g);
        rus = new Rectangle(975, 325, 100, 100, Color.black, g);
        rms = new Rectangle(975, 525, 100, 100, Color.black, g);
        rds = new Rectangle(975, 725, 100, 100, Color.black, g);
        //lus.draww();
        if (drawLus) {
        if (lut == 0) {
        if (turn == 1) {
            lus.draw(g);
            luc = 2;
            }
            else {
            lus.setColor(Color.BLUE);
            lus.draw(g);
            luc = 1;
            }
            turn *= -1;
            lut = 1;
        }
        else {
        if (luc == 2) {
        lus.draw(g);
        }
        else if (luc == 1) {
        lus.setColor(Color.BLUE);
        lus.draw(g);
        }
       
        }
           
        }
        if (drawLms) {
        if (lmt == 0) {
        if (turn == 1) {
            lms.draw(g);
            lmc = 2;
            }
            else {
            lms.setColor(Color.BLUE);
            lms.draw(g);
            lmc = 1;
            }
            turn *= -1;
            lmt = 1;
        }
        else {
        if (lmc == 2) {
        lms.draw(g);
        }
        else if (lmc == 1) {
        lms.setColor(Color.BLUE);
        lms.draw(g);
        }
        }
        }
        if (drawLds) {
        if (ldt == 0) {
        if (turn == 1) {
            lds.draw(g);
            ldc = 2;
            }
            else {
            lds.setColor(Color.BLUE);
            lds.draw(g);
            ldc = 1;
            }
            turn *= -1;
            ldt = 1;
        }
        else {
        if (ldc == 2) {
        lds.draw(g);
        }
        else if (ldc == 1) {
        lds.setColor(Color.BLUE);
        lds.draw(g);
        }
        }
        }
        if (drawMus) {
        if (mut == 0) {
        if (turn == 1) {
            mus.draw(g);
            muc = 2;
            }
            else {
            mus.setColor(Color.BLUE);
            mus.draw(g);
            muc = 1;
            }
            turn *= -1;
            mut = 1;
        }
        else {
        if (muc == 2) {
        mus.draw(g);
        }
        else if (muc == 1) {
        mus.setColor(Color.BLUE);
        mus.draw(g);
        }
        }
        }
        if (drawMms) {
        if (mmt == 0) {
        if (turn == 1) {
            mms.draw(g);
            mmc = 2;
            }
            else {
            mms.setColor(Color.BLUE);
            mms.draw(g);
            mmc = 1;
            }
            turn *= -1;
            mmt = 1;
        }
        else {
        if (mmc == 2) {
        mms.draw(g);
        }
        else if (mmc == 1) {
        mms.setColor(Color.BLUE);
        mms.draw(g);
        }
        }
        }
        if (drawMds) {
        if (mdt == 0) {
        if (turn == 1) {
            mds.draw(g);
            mdc = 2;
            }
            else {
            mds.setColor(Color.BLUE);
            mds.draw(g);
            mdc = 1;
            }
            turn *= -1;
            mdt = 1;
        }
        else {
        if (mdc == 2) {
        mds.draw(g);
        }
        else if (mdc == 1) {
        mds.setColor(Color.BLUE);
        mds.draw(g);
        }
        }
        }
        if (drawRus) {
        if (rut == 0) {
        if (turn == 1) {
            rus.draw(g);
            ruc = 2;
            }
            else {
            rus.setColor(Color.BLUE);
            rus.draw(g);
            ruc = 1;
            }
            turn *= -1;
            rut = 1;
        }
        else {
        if (ruc == 2) {
        rus.draw(g);
        }
        else if (ruc == 1) {
        rus.setColor(Color.BLUE);
        rus.draw(g);
        }
        }
        }
        if (drawRms) {
        if (rmt == 0) {
        if (turn == 1) {
            rms.draw(g);
            rmc = 2;
            }
            else {
            rms.setColor(Color.BLUE);
            rms.draw(g);
            rmc = 1;
            }
            turn *= -1;
            rmt = 1;
        }
        else {
        if (rmc == 2) {
        rms.draw(g);
        }
        else if (rmc == 1) {
        rms.setColor(Color.BLUE);
        rms.draw(g);
        }
        }
       
        }
        if (drawRds) {
        if (rdt == 0) {
        if (turn == 1) {
            rds.draw(g);
            rdc = 2;
            }
            else {
            rds.setColor(Color.BLUE);
            rds.draw(g);
            rdc = 1;
            }
            turn *= -1;
            rdt = 1;
        }
        else {
        if (rdc == 2) {
        rds.draw(g);
        }
        else if (rdc == 1) {
        rds.setColor(Color.BLUE);
        rds.draw(g);
        }
        
        
        }
        }
    }
}

class Rectangle {
    private int width;
    private int height;
    private int xPos;
    private int yPos;
    private Color color;
    private Graphics g;

    public Rectangle(int xPos, int yPos, int width, int height, Color color, Graphics g) {
        this.width = width;
        this.height = height;
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
        this.g = g;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(xPos, yPos, width, height);
       
    }
    public void redraw(Graphics g, String direction, int num) {
    if (direction.equals("right")) {
    g.clearRect(xPos - 10, yPos, width, height);
    }
    else if (direction.equals("left")) {
    g.clearRect(xPos + 10, yPos, width, height);
    }
    else if (direction.equals("up")) {
    g.clearRect(xPos, yPos + 10, width, height);
    }
    else {
    g.clearRect(xPos, yPos - 10, width, height);
    }
   
    g.setColor(color);
        g.fillRect(xPos, yPos, width, height);
   
    }

    public void move(String direction, int num) {
        if (direction.equals("right")) {
        xPos += num;
        }
        else if (direction.equals("left")) {
        xPos -= num;
        }
        else if (direction.equals("up")) {
        yPos -= num;
        }
        else {
        yPos += num;
        }
    }
    public boolean contains(int x, int y) {
    if (x >= xPos && x <= xPos + width && y >= yPos && y <= yPos + height) {
    return true;
    }
    return false;
    }
    public void draww() {
    System.out.println("j");
    this.draw(g);
    }
    public void setColor(Color color) {
    this.color = color;
    }
}
class Text {
	private String content;
	private int size;
	private int xPos;
	private int yPos;
	private static Graphics2D g2d;
	private Graphics g;
	public Text(String c, int s, int x, int y, Graphics g) {
		content = c;
		size = s;
		xPos = x;
		yPos = y;
		this.g = g;
		g2d = (Graphics2D) g;
	}
	public void draw() {
		Font font = new Font("Arial", Font.BOLD, size); // Creating a larger font
        g2d.setFont(font);
        g2d.drawString(content, xPos, yPos);
	}
}
