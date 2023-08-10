// Bubble Sort :- 
// Time Complexity :- O(N^2)
// Space Complexity :- O(1)

class bubbleSort
{
    static void bubblesort(int arr[])
    {
        int n = arr.length;
        boolean flag = false;
        for(int i=0;i<n-1;i++)
        {
            //last i element already at correct sorted position so no need to check them
            for(int j=0;j<n-i-1;j++)
            {
                //swap if j element is greater than j+1 element
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag=true;
                }
            }
            if(!flag)  // have any swap happened
            {
                return;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = {0,1,7,3,9,1,4};
        bubblesort(arr);

        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}