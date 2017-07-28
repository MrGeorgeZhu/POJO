import java.util.ArrayList;

public class Runner
	{
	static ArrayList <Dog> kennel = new ArrayList <Dog>();
	public static void main(String[] args)
		{
		//instantiate dog objects
		kennel.add(new Dog(7, "老狗"));
		kennel.add(new Dog(3, "小狗"));
		
		//测试toString
		System.out.println(kennel);
		
		//测试getters
		System.out.println(kennel.get(0).getName());
		System.out.println(kennel.get(1).getAge());
		
		//测试setters
		kennel.get(0).setName("lmao");
		kennel.get(1).setAge(4);
		
		System.out.println(kennel);
		}

	}
