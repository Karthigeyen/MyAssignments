package week3.day2;

public class Samsung extends AndroidTV {
	public void playVid() {
		// TODO Auto-generated method stub
System.out.println("Play Video");
	}
	public void zoomIN() {
		// TODO Auto-generated method stub
System.out.println("Zoom In");
	}
public static void main(String[] args) {
	Samsung cl = new Samsung();
	cl.openAnApp();
	cl.playVid();
	cl.zoomIN();
}
}
