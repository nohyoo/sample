public class DisplayChartApp {
	public static void main(String[] args) {

	//	Chart 구현 객체 만들기
	Chart xls = new XLSChart();
	Chart cld = new CloudChart();

	//	Chart류 객체를 전달해서 Display 객체 만들기
	Display xc = new Display(xls);
	Display cc = new Display(cld);


	// 그래프 그리기
	xc.drawGraph();
	cc.drawGraph();



	} // end main();
}