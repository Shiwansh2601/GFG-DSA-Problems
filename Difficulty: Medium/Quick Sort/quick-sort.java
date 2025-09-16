class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high)
        {
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
            
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivot=arr[high];
        int i=low;
        for(int j=low;j<=high;j++)
        {
            if(arr[j]<=pivot)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        return i-1;
    }
}