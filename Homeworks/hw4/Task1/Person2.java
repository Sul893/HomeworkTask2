public class Person2 extends Person{
	private String name;

	public void talk(){
		System.out.println("Person2 is talking");
	}

	public Person1(int age, int height){
		super(Person(age, height));
	}

	public Person1(int age, int height,String name){
		this(age,height);
		this.name=name;
	}

	@Override
	public void move(){
		System.out.println("Person2 poshel");
	}

	@Override
	public void hi(){
		System.out.println("Goodbye2");
	}
}