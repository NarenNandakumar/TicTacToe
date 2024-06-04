package defaul;

public class Game {
	
	
	public static void restart() {
		//RectanglePanel panel = new RectanglePanel();
		RectanglePanel.drawLus = false;
		RectanglePanel.drawLms = false;
		RectanglePanel.drawLds = false;
		RectanglePanel.drawRus = false;
		RectanglePanel.drawRms = false;
		RectanglePanel.drawRds = false;
		RectanglePanel.drawMus = false;
		RectanglePanel.drawMms = false;
		RectanglePanel.drawMds = false;
		RectanglePanel.turn = 1;
		RectanglePanel.lut = 0;
		RectanglePanel.lmt = 0;
		RectanglePanel.ldt = 0;
		RectanglePanel.rut = 0;
		RectanglePanel.rmt = 0;
		RectanglePanel.rdt = 0;
		RectanglePanel.mut = 0;
		RectanglePanel.mmt = 0;
		RectanglePanel.mdt = 0;
		RectanglePanel.luc = 1;
		RectanglePanel.lmc = 1;
		RectanglePanel.ldc = 1;
		RectanglePanel.ruc = 1;
		RectanglePanel.rmc = 1;
		RectanglePanel.rdc = 1;
		RectanglePanel.muc = 1;
		RectanglePanel.mmc = 1;
		RectanglePanel.mdc = 1;
		Win.gameEnd = false;
		//panel.rerepaint();
	}
}
