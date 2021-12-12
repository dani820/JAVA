package classex;

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 1. Person 의 생성자로 생성
		Person person1 = new Person();
		System.out.println(person1);
		
		// 2. Class 클래스의 newInstance() 메소드로 생성 
		Class pClass = Class.forName("classex.Person");
		// 2-1. Person 클래스의 디폴트 생성자가 호출되어 인스턴스 생성
		// 2-2. newInstance() 반환값이 Object 이므로 Person 클래스로 다운 캐스팅
		Person person2 = (Person)pClass.newInstance(); 
		System.out.println(person2);
	}
}
