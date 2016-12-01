public class Score {
	
		String name;
		int kor;
		int eng;
		int math;

		// 기본 생성자
		public Score() {
			name = "나나";
			kor = 70;
			eng = 80;
			math = 90;
		}

		public Score(String n, int k, int e, int m) {
			this.name = n;
			this.kor = k;
			this.eng = e;
			this.math = m;
		}


		public int total() {
			return kor + eng + math;
		}


		public double average() {
			return total()/3.0;
		}
}