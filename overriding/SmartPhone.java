package overriding;

public class SmartPhone extends Androidphone {
	public void takeVideo()
	  {
		  System.out.println("take video smartphone");
	  }
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone();
		sp.takeVideo();
		Androidphone ap=new Androidphone();
		ap.takeVideo();
	}
}
