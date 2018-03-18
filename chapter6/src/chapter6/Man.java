package chapter6;

public class Man {
	int age = 23;
	String name = "Devon";
	
	Man(int _age){
		//构造方法
		age = _age;
	}
	
	Man(String _name){
		//构造方法重载
		name = _name;
	}
	
	void play() {
		System.out.println("123");
	}
}
