package Object;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate dt = (MyDate)obj;
			if(this.day == dt.day && this.month == dt.month && this.year == dt.year) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.day * 10 + this.month * 101 + year * 102;
	}
	
	
}

public class MydateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(9,18,2004);
		MyDate date2 = new MyDate(9,18,2004);
		
		System.out.println(date1.equals(date2));
		
		System.out.println("date1의 hashCode : " + date1.hashCode());
		System.out.println("date2의 hashCode : " + date2.hashCode());
		
		System.out.println("date1의 실제 주소값 : " + System.identityHashCode(date1));
		System.out.println("date2의 실제 주소값 : " + System.identityHashCode(date2));
	}
}
