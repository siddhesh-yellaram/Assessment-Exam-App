package techlab.test.layer;

import techlab.business.layer.ClassA;
import techlab.data.layer.ClassB;

public class ClassTest {
	public static void main(String []args) {
		ClassA a = new ClassA(new ClassB());
		a.bar();
	}
	
}
