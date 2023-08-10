// Merge Sort :- 
// Time Complexity :- O(N^2)
// Space Complexity :- O(1)

class countSort
{
    static int findMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
              max = arr[i];
            }
        }
        return max;
    }
    static void countSort(int arr[])
    {
        int max = findMax(arr);
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                arr[k++] = i;
            }
        }
    }

    static void displayArr(int[] arr)
    {
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {10,1,7,3,10,9,1,7,10};
        int n = arr.length;
        System.out.println("Array before sorting :- ");
        displayArr(arr);
        countSort(arr);
        System.out.println("Array after sorting :- ");
        displayArr(arr);
        
    }
}