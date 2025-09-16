import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayMaxElementTest72 {
	
		@Test
		public void testCase172()
		{
			int a[]= {1,2,3,4,5};
			Assertions.assertEquals(5,ArrayMaxElement.arrayMaxElement(a));
		}
		@Test
		public void testCase272()
		{
			int a[]= {-1,-2,-3,-4,-5};
			Assertions.assertEquals(-1,ArrayMaxElement.arrayMaxElement(a));
		}
}
