package week1.day1;

public class Mobile {
	
	String phoneBrand = "Oneplus";
	double phoneSize = 7.25;
	boolean isSmartPhone = true;
	long phoneNumber = 7418967661l;
	String modelNumber = "Oneplus5T";
	int phonePrice = 35000;
	String simType ="Dual";
	
	public void sendSms() {
		System.out.println("sms sent");

	}
public void makeCall() {
	// TODO Auto-generated method stub
System.out.println("call connected");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile mob = new Mobile();
mob.sendSms();
mob.makeCall();
System.out.println(mob.phoneBrand);
double size = mob.phoneSize;
System.out.println(size);
System.out.println(mob.isSmartPhone);
System.out.println(mob.phoneNumber);
System.out.println(mob.modelNumber);
System.out.println(mob.phonePrice);
System.out.println(mob.simType);
	}

}
