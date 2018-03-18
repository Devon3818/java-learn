package com.devonhello;

public class TestObj {
	public static void main(String[] args){
		TestObj to = new TestObj();
		System.out.println(to.toString());
	}
	
	//重写Object toString
	public String toString() {
        return Integer.toHexString(hashCode());
    }
}
