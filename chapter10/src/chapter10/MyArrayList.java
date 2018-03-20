package chapter10;

/*
 * 模拟实现JDK提供的ArrayList类
 */
public class MyArrayList {
	
	Object[] value;
	
	int size;
	
	public MyArrayList() {
        this.value = new Object[16];
    }
	
	public MyArrayList(int size) {
        this.value = new Object[size];
    }
	
	public void add(Object obj) {
		value[size] = obj;
		size++;
	}
	
	public Object get(int index) {
		if(index < 0 || index > size-1){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value[index];
	}

}
