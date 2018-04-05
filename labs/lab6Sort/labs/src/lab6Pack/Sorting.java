package lab6Pack;

public class Sorting 
{
    public static void selectionSort(Comparable<Object>[] list)
    {
        /*int min;
        Comparable<Object> temp;
        for (int index = 0;index < list.length-1; index ++)
        {
            min = index;
            for (int scan = index + 1; scan < list.length; scan ++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }*/
    	// modify the selection sort from ascending to descending
    	int max;
        Comparable<Object> temp;
        for (int index = 0;index < list.length-1; index ++)
        {
            max = index;
            for (int scan = index + 1; scan < list.length; scan ++)
                if (list[scan].compareTo(list[max]) > 0)
                    max = scan;
            temp = list[max];
            list[max] = list[index];
            list[index] = temp;
        }
    }
    
    public static void insertionSort(Comparable<Object>[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable<Object> key = list[index];
            int position = index;
            while (position > 0 && key.compareTo(list[position-1]) < 0)
            {
                list[position] = list[position-1];
                position--;
            }
            list[position] = key;
        }
    }
}
