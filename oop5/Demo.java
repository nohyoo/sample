package kr.co.jhta;

//import kr.co.l2.*;
//import kr.co.l2.sub.*;

import kr.co.l2.Employee;
import kr.co.l2.sub.Family;

public class Demo {
	public static void main(String[] args) {

		System.out.println("��Ű�� ���� ���ø����̼�");

		Person p = new Person();
		p.setName("����");
		
		System.out.println(p);
		System.out.println(p.getName());

		Employee e = new Employee();
		e.setName("����");
		System.out.println(e);
		System.out.println(e.getName());

		Family f = new Family();
		System.out.println(f);

	}
}