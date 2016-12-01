public class ArrayService {
	
	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	//	배열 이동시키기 array1
	//	array1 배열에서 지정된 값을 맨 뒤로 보내고 한칸씩 당긴 배열을 반환하기
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

	//	배열 복사하기 array2
	//	array2 배열을 지정된 위치부터 끝까지 복사한 배열을 반환하기
	public int[] copy(int begin) {
		int[] result = new int[arr.length-begin+1];
		int x = 0;

		for (int i=(begin-1); i<arr.length; i++) {
			result[x] = arr[i];
			x++;
		}

		return result;
	}

	//	배열 잘라내기 array3
	//	array3 배열을 지정된 위치부터 지정된 위치까지 복사한 배열을 반환하기
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
	//	array4 left shift 적용하여 반환하기???
	public int[] shift(int begin, int length) {
		int[] result = new int[arr.length];
		boolean code = false;
		int position = 0;
		
		if (begin <= length) {
			position = (10-length)+begin-1;
		} else {
			position = begin-length-1;
		}
		
		// 출력물 형태가 알수 없음
		
		

		return result;
	}

}