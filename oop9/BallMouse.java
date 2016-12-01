public class BallMouse implements Mouse, Cleanable {

	public void wheel() {
		System.out.println("빙글");
	}

	public void click() {
		System.out.println("클릭");
	}
	
	public void move() {
		System.out.println("움직");
	}


	public void clean() {
		System.out.println("Ball 청소 완료?!!");
	}



}