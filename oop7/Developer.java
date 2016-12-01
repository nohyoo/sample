public class Developer extends Employee {

	int todo;
	int completed;

	public void print() {
		System.out.println("사원번호 : " + no);
		System.out.println("사원이름 : " + name);
		System.out.println("해야될거 : " + todo);
		System.out.println("한    거 : " + completed);
		System.out.println("진 척 률 : " + (double)(completed*100/todo) + "%");
		System.out.println();
	}


	public void develop() {
		System.out.println("업무 수행");
		System.out.println();
		completed++;
	}


}