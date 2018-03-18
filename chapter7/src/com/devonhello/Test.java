package com.devonhello;
/*
 * JAVA只有单继承，只有一个父类
 * 接口可以多继承
 * 类默认继承Object  extends Object
 */
public class Test extends Ex {
	Test(){
		super();	//默认调用父类的构造方法，不写编译器自动调价调用
		//调用继承的方法
		this.say();
		//更改继承的属性的值
		this.a = 2;
	}
	
	//方法的重写
	void say(int i){
		System.out.println("hi!!");
	}
}

class Ex {
	
	int a = 1;
	
	void say() {
		System.out.println("hi");
	}
}
