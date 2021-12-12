package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class cPerson1 = Class.forName("classex.Person");
		
		Constructor[] conss = cPerson1.getConstructors();
		for(Constructor cc : conss) {
			System.out.println(cc);
		}
		
		System.out.println("methods");
		Method[] methods = cPerson1.getMethods();
		for(Method met : methods) {
			System.out.println(met);
		}
		
		// 변수가 모두 private 이므로 public 으로 바꿔주면 값을 가져올 수 있다.
		System.out.println("fields");		
		Field[] ffields = cPerson1.getFields();
		for(Field ff : ffields) {
			System.out.println(ff);
			System.out.println(ff.getName());
		}
	}
}
