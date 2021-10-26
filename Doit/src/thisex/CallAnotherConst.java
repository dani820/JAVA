package thisex;

class Person {
	String name;
	int age;
	
	// 기본생성자
	// this를 사용해 매개변수가 있는 생성자를 호출
	
	// !important
	// this로 다른 생성자를 호출할 때 호출하는 코드 이전에 다른 코드를 넣을 수 없다.
	// 생성자는 클래스가 생성될 때 호출되므로 클래스 생성 완료되지 않은 시점에 다른 코드가 있으면 오류가 발생할 수 있다.
	// 이는 즉 아래와 같이 디폴트 생성자에서 생성이 완료되는 것이 아니라 this를 사용해 다른 생성자를 호출하기 때문.
	// 따라서 this를 활용한 문장이 가장 먼저 와야 한다.
	Person() {
//		this.name = name; --> 작성 불가
		this("이름 없음", 1);
	}
	
	// 매개변수가 있는 생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 반환형
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}
