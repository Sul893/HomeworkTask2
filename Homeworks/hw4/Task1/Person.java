public abstract class Person{
	private int age;
	private int height;
	private int a;
	public Person(int age, int height){
		this.age = age;
		this.height = height;
	}

	public Person(int age, int height, int a){
		this(age,height);
		this.a=a;
	}

	public abstract void move();
	public abstract void stop();

	public void hi(){
		System.out.println("Hello");
	}
}