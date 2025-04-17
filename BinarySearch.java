import java.util.Arrays;

public class BinarySearch
{
	//remember bottom top and middle
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);

		int bottom = 0;
		int middle = 0;
		int top = ray.length;

		while(bottom <= top)
		{
			middle = (bottom+top)/2;
			//too high
			if(ray[middle] > item)
				top = middle - 1;
			
			//too low
			else if(ray[middle] < item)
				bottom = middle + 1;
			//else if(bottom > top && ray[middle] != item)
				//return -1;
			else if(ray[middle] == item)
				return middle;
			
		}

		return -1;
	}
}
