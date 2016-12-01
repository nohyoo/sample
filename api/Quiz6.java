import java.util.*;

public class Quiz6 {
	public static void main(String[] args) {
	/*
		이름, 부서, 직위, 급여를 담을 수 있는 Employee 클래스 정의하기
		(필드 정의, 기본생성자, getter/setter)

		^를 기준으로 문자열 잘라서 배열에 담기

		배열에 사원정보를 하나씩 추출해서 ,로 잘라 배열에 담기

		Employee 객체를 만들어서 사원정보의 각 데이터를 Employee 객체에 저장하기

		Employee 객체를 employees 배열에 저장하기

		Employee 배열에 저장된 정보 출력하기
	*/
		String text = "홍길동,영업팀,과장,200^김유신,영업팀,부장,300^강감찬,총무부,대리,150^이순신,총무부,차장,250";
		StringTokenizer stz = new StringTokenizer(text, "^");

		Employee[] employees = new Employee[4];

		String[] arr = new String[4];
		String[] data = new String[4];

		
		int i=0;
		while (stz.hasMoreTokens()) {
			arr[i] = stz.nextToken();
			i++;
		}

		
		for (int j=0; j<data.length; j++) {
		//	data = arr[j].split(",");
			System.out.println(arr[j]);
		}
		

	} // end main();
}