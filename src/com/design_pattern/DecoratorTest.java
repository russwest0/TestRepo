package com.design_pattern;

public class DecoratorTest {
	
	public static void main(String[] ags){
		Human p=new Person();
		Decorator decorator=new Decorate_two(new Decorate_zero(p));
		
		decorator.run();
		//decorator.sing();
	}
}

interface Human{
	public void sing();
	public void run();
}

class Decorator implements Human{
	
	Human human;
	public Decorator(Human human){
		this.human=human;
	}

	@Override
	public void sing() {
		//System.out.println("装饰器...sing....");
		human.sing();
	}

	@Override
	public void run() {
		//System.out.println("装饰器....run....");
		human.run();
	}
	
}
//装饰一
class Decorate_zero extends Decorator{
//	Human human;
	Decorate_zero(Human human){
//		this.human=human;
		super(human);
	}
	
	public void zero_run(){
		System.out.println("zero-decorator...run...");
	}
	
	public void zero_sing(){
		System.out.println("zero-decorator...sing...");
	}

	/* (non-Javadoc)
	 * @see com.design_pattern.Decorator#sing()
	 */
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		super.sing();
		zero_sing();
	}

	/* (non-Javadoc)
	 * @see com.design_pattern.Decorator#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		zero_run();
	}
	
	
}

class Decorate_two extends Decorator{
//	Human human;
	public Decorate_two(Human human){
//		this.human=human;
		super(human);
	}
	
	public void two_run(){
		System.out.println("two_decorator...run...");
	}
	public void two_sing(){
		System.out.println("two_decorator...sing...");
	}

	/* (non-Javadoc)
	 * @see com.design_pattern.Decorator#sing()
	 */
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		super.sing();
		two_sing();
	}

	/* (non-Javadoc)
	 * @see com.design_pattern.Decorator#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		two_run();
	}
	
	
}

//被装饰者
class Person implements Human{

	/* (non-Javadoc)
	 * @see com.design_pattern.Human#sing()
	 */
	@Override
	public void sing() {
		System.out.println("person...sing...");
		
	}

	/* (non-Javadoc)
	 * @see com.design_pattern.Human#run()
	 */
	@Override
	public void run() {
		System.out.println("person...run...");
	}
	
}

