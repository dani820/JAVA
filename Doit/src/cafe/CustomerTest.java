package cafe;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerLim = new Customer("임나연", 9000);
		Starbucks starbucks = new Starbucks();
		Kong kong = new Kong();
		
		customerLim.takeStar(starbucks, 4000);
		customerLim.takeKong(kong, 4500);
		customerLim.showInfo();
		
	}
	
}
