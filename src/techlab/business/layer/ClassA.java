package techlab.business.layer;
import techlab.core.layer.IFooable;

public class ClassA{

	private IFooable f;
	public ClassA(IFooable foo) {
		this.f = foo;
	}
	public void bar() {
		f.foo();
	}
	
}
