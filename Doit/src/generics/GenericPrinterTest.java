package generics;

public class GenericPrinterTest {
	public static void main(String[] args) {
		// T 위치에 사용한 Powder형은 대입된 자료형
		// Powder를 대입해 만든 GenericPrinter<Powder> 는
		// 제네릭 자료형(Generic type), 매개변수화된 자료형(parameterized type)
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		// 제네릭 자료형에서 어떤 자료형을 사용할지 명시했으므로(Powder)
		// getMaterial() 에서 반환할 때 명시적 형 변환 하지 않음
		Powder powder = powderPrinter.getMaterial();  
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
//		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		
	}
}
