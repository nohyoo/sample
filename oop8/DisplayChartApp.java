public class DisplayChartApp {
	public static void main(String[] args) {

	//	Chart ���� ��ü �����
	Chart xls = new XLSChart();
	Chart cld = new CloudChart();

	//	Chart�� ��ü�� �����ؼ� Display ��ü �����
	Display xc = new Display(xls);
	Display cc = new Display(cld);


	// �׷��� �׸���
	xc.drawGraph();
	cc.drawGraph();



	} // end main();
}