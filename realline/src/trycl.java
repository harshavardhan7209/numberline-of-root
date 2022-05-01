import java.util.*;
public abstract class trycl {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter you name: ");
		String name = a.next();
		String nname = name.substring(0,1).toUpperCase() + name.substring(1);
		System.out.print("Enter you age: ");
		int age = a.nextInt();
		System.out.println("There was once a man named " + nname);
		System.out.println("He was " + age + " years old");
		System.out.println("He really liked being a " + nname);
		System.out.println("But, he didnt like being " + age + " years old");
	}

}
