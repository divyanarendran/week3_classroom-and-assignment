package inheritanceconcept;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsapp()
	{
		System.out.println("connect whatspp");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     SmartPhone sp= new SmartPhone();
     sp.sendMessage();
    sp.makeCall();
     sp.saveContact();
     sp.takeVideo();
     sp.connectWhatsapp();
	}

	

}
