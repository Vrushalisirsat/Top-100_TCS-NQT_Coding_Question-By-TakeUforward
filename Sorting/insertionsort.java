// Bubble Sort :- 
// Time Complexity :- O(N^2)
// Space Complexity :- O(1)

class insertionsort
{
    static void insertionSort(int arr[])
    {
        int n = arr.length;
        
        for(int i=1;i<n;i++)  //i represent the current index
        {
            int j=i;
            while( j > 0 && arr[j] < arr[j-1])
            {
                //a[j] & arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
            }
           
          
        }
    }
    public static void main(String args[])
    {
        int arr[] = {70,1,7,3,9,1,4};
        insertionSort(arr);

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}