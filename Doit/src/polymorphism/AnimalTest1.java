package polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}
	
	// 해당 메소드는 어떤 인수가 매개변수로 넘어와도 모두 Animal 형으로 반환한다.
	// ex) Animal ani = new Human();
	public void moveAnimal(Animal animal) {
		// Animal 의 move() 가 아닌 매개변수로 넘어온 실제 인스턴스의 메소드를 호출한다.
		// 즉, 어떤 매개변수가 넘어왔느냐에 따라 출력문이 달라진다.
		animal.move();
	}
}