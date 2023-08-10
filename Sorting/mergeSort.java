// Merge Sort :- 
// Time Complexity :- O(N^2)
// Space Complexity :- O(1)

class mergeSort
{
    static void merge(int[] arr,int l,int mid,int h)
    {
        int left = l;
        int right = mid+1;
        int k=0;
        int[] temp = new int[arr.length];

        while(left<=mid && right<=h)
        {
            if(arr[left] <= arr[right])
             temp[k++] = arr[left++];
            else 
             temp[k++] = arr[right++];
        }

        while(left <= mid)
         temp[k++] = arr[left++];
        
        while(right <= h)
         temp[k++] = arr[right++];
        

        // transfering all elements from temporary to arr 
        for (int i = l; i <= h; i++) {
            arr[i] = temp[i-l];
        }

    }
    static void MergeSort(int arr[],int l,int h)
    {
        int mid = (l+h)/2;
        
        if(l >= h)
        return;

        MergeSort(arr,l,mid);
        MergeSort(arr,mid+1,h);
        merge(arr,l,mid,h);
       
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
        MergeSort(arr,0,n-1);
        System.out.println("Array after sorting :- ");
        displayArr(arr);
        
    }
}