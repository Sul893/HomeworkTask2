public class Main{
	public static void main(String[] args) {
		Person[] humans = new Person[2];
		humans[0] = new Person1();
		humans[1] = new Person2();

		for(Person i : humans){
			i.hi();
		}
	}
}