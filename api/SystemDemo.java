import java.io.*;

public class SystemDemo {
	public static void main(String[] args) throws Exception {
/*
		long today1 = System.currentTimeMillis();
		long today2 = System.currentTimeMillis();
		long today3 = System.currentTimeMillis();
		long today4 = System.currentTimeMillis();
		long today5 = System.currentTimeMillis();
		long today6 = System.currentTimeMillis();
		long today7 = System.currentTimeMillis();
		long today8 = System.currentTimeMillis();
		long today9 = System.currentTimeMillis();
		long today10 = System.currentTimeMillis();

		for (int i=0 ; i <999999999; i++ ) {
			i--;
			i++;
		}

		long today11 = System.currentTimeMillis();
		long today12 = System.currentTimeMillis();
		long today13 = System.currentTimeMillis();
		long today14 = System.currentTimeMillis();
		long today15 = System.currentTimeMillis();
		long today16 = System.currentTimeMillis();
		long today17 = System.currentTimeMillis();
		long today18 = System.currentTimeMillis();
		long today19 = System.currentTimeMillis();
		long today20 = System.currentTimeMillis();
		long nano = System.nanoTime();
		System.out.println(today1);
		System.out.println(today2);
		System.out.println(today3);
		System.out.println(today4);
		System.out.println(today5);
		System.out.println(today6);
		System.out.println(today7);
		System.out.println(today8);
		System.out.println(today9);
		System.out.println(today10);
		System.out.println(today11);
		System.out.println(today12);
		System.out.println(today13);
		System.out.println(today14);
		System.out.println(today15);
		System.out.println(today16);
		System.out.println(today17);
		System.out.println(today18);
		System.out.println(today19);
		System.out.println(today20);
		System.out.println(nano);
*/

	//	ȯ�溯���� ��ȸ
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println(javaHome);
		
		String path = System.getenv("path");
		System.out.println(path);



	//	get Property
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);


	//	���� �ý����� �ٹٲ޹��� ��ȸ
		String newLineChar = System.getProperty("line.separator");
		System.out.println("abcd "+newLineChar+" efg");

	//	���� �ý����� ����� Ȩ ���丮 ��ȸ
		

	//	���� �����ϱ�
		FileWriter writer = new FileWriter("a.txt");


	} // end main();
}