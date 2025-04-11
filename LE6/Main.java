public class Main
{
	public static void main(String[] args) {
	    Offering offering = new IceCream();
	    offering = new Gin(offering);
	    offering = new Rum(offering);
		System.out.println(offering.getName() + " " + offering.getPrice());
	}
}