package polymorphism;

import java.util.ArrayList;

// 상위 클래스
class Animal1 {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

// 상위 클래스 Animal1 을 상속받은 하위 클래스 Human1
class Human1 extends Animal1 {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

//상위 클래스 Animal1 을 상속받은 하위 클래스 Tiger1
class Tiger1 extends Animal1 {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

//상위 클래스 Animal1 을 상속받은 하위 클래스 Eagle1
class Eagle1 extends Animal1 {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {
	// 배열 자료형 Animal 로 animal List 생성
	// 전역변수이자 멤버변수 aniList
	ArrayList<Animal1> aniList = new ArrayList<Animal1>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
	}
	
	public void addAnimal() {
		// 각각 Human1, Tiger1, Eagle1 인스턴스가 Human1 형으로 묵시적 형 변환 되어
		// 리스트에 담긴다.
		aniList.add(new Human1());
		aniList.add(new Tiger1());
		aniList.add(new Eagle1());
		
		// 상속 받은 하위클래스에서 메소드가 재정의되었기 때문에
		// 각각 알맞은 하위 클래스 메소드가 출력된다.
		// 배열 요소가 Animal 형이기 때문에
		// 다른 동물 클래스들에서 제공하는 readBook(), hunting() 등의 메소드는 사용할 수 없다.
		for(Animal1 ani : aniList) {
			ani.move();
		}
	}
	
	// 다른 동물 클래스에서 제공하는 메소드들을 사용하기 위해 다운캐스팅을 진행한다.
	public void testCasting() {
		// aniList 사이즈만큼 for 문을 돌려서 ani 라는 변수에 담고
		// 다운캐스팅 위해 인스턴스 자료형을 비교하여
		// 각각 해당 결과를 출력한다.
		for(int i = 0; i < aniList.size(); i++) {
			Animal1 ani = aniList.get(i);
			if(ani instanceof Human1) {
				Human1 h = (Human1)ani;
				h.readBook();
			}else if(ani instanceof Tiger1) {
				Tiger1 t = (Tiger1)ani;
				t.hunting();
			}else if(ani instanceof Eagle1) {
				Eagle1 e = (Eagle1)ani;
				e.flying();
			}else {
				System.out.println("지원되지 않는 형입니다.");
			}
			
		}
	}
}
