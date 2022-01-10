package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 1. 직렬화에 사용할 Person 클래스 생성
// 5. 직렬화하겠다는 의도를 표시하기 위해 Serializable 인터페이스를 추가한다. 
class Person implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 6412276319311846923L;
//	private static final long serialVersionUID = -1503252402544036183L;
	String name;
	transient String job;
	
	public Person() {}
	
	// 2. 이름, 직업을 생성자의 매개변수로 받아 생성
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			// 3. writeObject() 메소드 호출하면 각 매개변수의 값이 파일에 쓰인다.
			// serial.out 파일을 열어보면 읽을 수 없는 내용으로 저장되어 있다.
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			// 4. 값을 원래 상태로 복원할 때는 readObject() 를 사용해 저장된 순서대로 읽어들인다.
			// readObject() 메소드 반환 값은 Object 이므로 원래 자료형인 Person 으로 형 변환을 한다.
			// 역직렬화할 때 클래스 정보가 존재하지 않을 수 있으므로 ClassNotFoundException 처리 필수
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
