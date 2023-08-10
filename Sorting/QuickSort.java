// Quick Sort :-
// Time Complexity :- O(N^2)
// Space Complexity :- O(1)

class QuickSort
{
    static int partition(int[] arr,int start,int end)
    {
        int pivot = arr[start];
        int countEle=0;

        for(int i=start+1;i<=end;i++)
        {
            if(arr[i] < pivot)
            countEle++;
        }

        int pivotInd = start + countEle;
        swap(arr,start,pivotInd);

        int i =start;
        int j = end;
        while(i < pivotInd && j > pivotInd)
        {
            while(arr[i] <= pivot)       
            i++;
            while(arr[j] > pivot)
            j--;

            if(i < pivotInd && j > pivotInd)
            swap(arr,i,j);
            i++;
            j--;
        }
        return pivotInd;
    }
    static void quickSort(int arr[],int start,int end)
    {
      if(start >= end)
      return;

      int pi = partition(arr,start,end);
      quickSort(arr,start,pi-1);
      quickSort(arr,pi+1,end);
    }
    

    static void swap(int[] arr,int x,int y)
    {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
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
        int arr[] = {0,1,7,3,9,1,4};
        int n = arr.length;
        System.out.println("Array before sorting :- ");
        displayArr(arr);
        quickSort(arr,0,arr.length-1);
        System.out.println("Array after sorting :- ");
        displayArr(arr);
    }
}
