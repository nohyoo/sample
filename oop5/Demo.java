package kr.co.jhta;

//import kr.co.l2.*;
//import kr.co.l2.sub.*;

import kr.co.l2.Employee;
import kr.co.l2.sub.Family;

public class Demo {
	public static void main(String[] args) {

		System.out.println("패키지 데모 애플리케이션");

		Person p = new Person();
		p.setName("가가");
		
		System.out.println(p);
		System.out.println(p.getName());

		Employee e = new Employee();
		e.setName("나나");
		System.out.println(e);
		System.out.println(e.getName());

		Family f = new Family();
		System.out.println(f);

	}
}