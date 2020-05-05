import pojo.Student;

import java.util.*;

/**
 * Created by yue
 * 2020/4/17 14:46
 */
public class TestThread implements Runnable {

	private String value;

	public void run() {
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		value = "we have data now";
		Object oj = new Object();
	}

	public static void main(String[] args) throws InterruptedException {
		TestThread ts = new TestThread();
		List<Student> studentList = new ArrayList();
		Set<Student> studentSet = new HashSet<Student>();
		Map<Integer,Student> studentMap = new HashMap();
		Thread t = new Thread(ts);
		t.start();
//		while(ts.value==null){
//			Thread.currentThread().sleep(100);
//		}
		t.join();
		System.out.println("value"+ ts.value);
	}
}
