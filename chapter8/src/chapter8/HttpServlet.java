package chapter8;

public class HttpServlet {
	public void service(){
		System.out.println("My Service");
		doGet();
	}
	
	public void doGet() {
		System.out.println("HttpService doGet");
	}
}
