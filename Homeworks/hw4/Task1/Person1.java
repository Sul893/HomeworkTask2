public class Person1 extends Person{
	private String name;

	public void talk(){
		System.out.println("Person is talking");
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
		System.out.println("Person poshel");
	}

	@Override
	public void hi(){
		System.out.println("Goodbye");
	}
}