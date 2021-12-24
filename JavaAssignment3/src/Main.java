import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("NewFile1.xml");
		Employee e = (Employee) applicationContext.getBean("emp123");
		Laptop l = (Laptop) applicationContext.getBean("mylaptop");
		System.out.println(e);
		System.out.println(l);
	}

}
