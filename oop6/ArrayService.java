public class ArrayService {
	
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	//	�迭 �̵���Ű�� array1
	//	array1 �迭���� ������ ���� �� �ڷ� ������ ��ĭ�� ��� �迭�� ��ȯ�ϱ�
	public int[] move(int value) {
		int[] result = new int[arr.length];
		boolean code = false;
		
		for (int i=0; i<arr.length; i++) {
			
			if (value != arr[i] && !code) {
				result[i] = arr[i];
			} else if (value != arr[i] && code) {
				if (i < 9) { 
					result[i] = arr[i+1];
				} else {
					result[i] = value;
				}
			} else if (value == arr[i] && !code) {
				code = true;
				result[i] = arr[i+1];
			
			}
		}	
		return result;
	}

	//	�迭 �����ϱ� array2
	//	array2 �迭�� ������ ��ġ���� ������ ������ �迭�� ��ȯ�ϱ�
	public int[] copy(int begin) {
		int[] result = new int[arr.length-begin+1];
		int x = 0;

		for (int i=(begin-1); i<arr.length; i++) {
			result[x] = arr[i];
			x++;
		}

		return result;
	}

	//	�迭 �߶󳻱� array3
	//	array3 �迭�� ������ ��ġ���� ������ ��ġ���� ������ �迭�� ��ȯ�ϱ�
	public int[] copy(int begin, int end) {
		int[] result = new int[end-begin+1];
		int x = 0;

		for (int i=(begin-1); i<arr[end-1]; i++) {
			result[x] = arr[i];
			x++;
		}

		return result;
	}

	//	{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	//	{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	//	array4 left shift �����Ͽ� ��ȯ�ϱ�???
	public int[] shift(int begin, int length) {
		int[] result = new int[arr.length];
		boolean code = false;
		int position = 0;
		
		if (begin <= length) {
			position = (10-length)+begin-1;
		} else {
			position = begin-length-1;
		}
		
		// ��¹� ���°� �˼� ����
		
		

		return result;
	}

}