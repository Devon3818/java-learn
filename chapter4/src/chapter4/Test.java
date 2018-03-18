package chapter4;

public class Test {
	
	int a;	//默认为0,a为成员变量，从属于对象
	static int b; //静态变量，从属于类
	final int c = 1;		//常量，声明后不能更改
	//c = 3;		会报错，常量不可更改
	final double PI = 3.14;	//常量一般大写 如MAX_VALUE
	
	{
		//块的局部变量
		int age;
		age = 1;
	}
	
	//age = 1;    编译错误，无法使用变量
	
	/*
	 * 整型变量
	 */
	//byte 1字节 8位 -128~127
	//short 2字节 -32768~32767
	//int 4字节
	//long 8字节
	
	
	
	/*
	 * 字节型
	 */
	char str = 'H';
}
