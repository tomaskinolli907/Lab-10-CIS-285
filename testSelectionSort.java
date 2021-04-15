import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
	private SelectionSort temp;
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		//testDuplicates();
	}
	public testSelectionSort() {
	}
	public void testPositive(){
		temp = new SelectionSort();
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		arr = temp.basicSelectionSort(arr);
		assertArrayEquals("Pos Works", Sortedarr, arr);
		}
	public void testNegative(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;


		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		arr = temp.basicSelectionSort(arr);
		assertArrayEquals("Neg Works", Sortedarr, arr);
	}
	public void testMixed(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = 7;
		arr[3] = -10;
		arr[4] = 2;


		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = 2;
		Sortedarr[4] = 7;
		arr = temp.basicSelectionSort(arr);
		assertArrayEquals("Mix Works", Sortedarr, arr);
	}
	public void testDuplicates(){
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = 7;
		arr[3] = -10;
		arr[4] = 2;
		arr[5] = 2;


		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = 2;
		Sortedarr[4] = 2;
		Sortedarr[5] = 7;
		arr = temp.basicSelectionSort(arr);
		assertArrayEquals("Mix Works", Sortedarr, arr);
	}
}
