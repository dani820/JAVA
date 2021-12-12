package generics;

public class GenericPrinter<T extends Materials> {
	private T material; // T 자료형으로 선언한 변수
	
	public void setMaterial(T material) {
		this.material = material;
	}

	// 메소드 선언부나 메소드 매개변수로 자료형 매개변수 T 를 사용한 메소드는 '제네릭 메소드'
	// 일반 메소드 뿐 아니라 static 메소드에서도 활용할 수 있다.
	// T 자료형 변수 material을 반환하는 제네릭 메소드
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); // 상위 클래스 Material 의 메소드 호출
	}
}
