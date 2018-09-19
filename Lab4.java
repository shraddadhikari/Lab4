import java.lang.NullPointerException;
//[1, 2 ,3, 4, 5]
//[2, 4, 6, 8, 10]
//[1, 3, 5, 9, 11]
//[2, 7, 5, 3, 12]
//[3, 5, 6, 3, 43]

public class Lab4 {
	public static void main(String[] args) 
	{
		int [] array1 = {1, 2 ,3, 4, 5};
		int [] array2 = {10, 4, 6, 8, 10};
		int [] array3 = {1, 3, 5, 9, 11};
		int [] array4 = {2, 7, 5, 3, 12};
		int [] array5 = {3, 5, 6, 3, 43};
		
		Lab4.sortArray(array4);
		Lab4.sortArray(array5);
		Lab4.sortArray(array1);
		Lab4.sortArray(array2);
		Lab4.sortArray(array3);
		
	}
	public static void sortArray(int [] array)
	{
		try {
		int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
        System.out.println("");
		}
      catch (NullPointerException e)
      {
    	  System.out.println("Null array entered");
      }
	
}
}
