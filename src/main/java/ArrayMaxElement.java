
public class ArrayMaxElement {
	public static int arrayMaxElement(int a[]) {
		int max=a[0];
		for(int i:a)
		{
			if(i>max) {
				max=i;
			}
		}
		return max;
	}

}
