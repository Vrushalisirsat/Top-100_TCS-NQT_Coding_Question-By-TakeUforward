// Bubble Sort :- 
// Time Complexity :- O(N^2)
// Space Complexity :- O(1)

class selectionSort
{
    static void selectionsort(int arr[])
    {
        int n = arr.length;
        
        for(int i=0;i<n-1;i++)  //i represent the current index
        {
            //find min element in unsorted part of array

            int min_ind = i;
            for(int j=i+1;j<n;j++)
            {
                //swap if j element is greater than j+1 element
                if(arr[j] < arr[min_ind])
                {
                    min_ind = j;
                }
            }
            //swap current element and min element -> current index i will have correct element
            //a[min_ind] & arr[i]
                    int temp = arr[i];
                    arr[i] = arr[min_ind];
                    arr[min_ind] = temp;
                    
        }
    }
    public static void main(String args[])
    {
        int arr[] = {70,1,7,3,9,1,4};
        selectionsort(arr);

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}