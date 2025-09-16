class Solution {
    void merge(int arr[],int l,int mid,int r)
    {
        int i=l;
        int j=mid+1;
        ArrayList<Integer>res=new ArrayList<>();
    
        while(i<=mid && j<=r)
        {
            if(arr[i]<=arr[j])
            {
                res.add(arr[i]);
                i++;
            }
            else
            {
              res.add(arr[j]);
                j++;
            }
        }
        while(i<=mid)
        {
             res.add(arr[i]);
                i++;
        }
        
         while(j<=r)
        {
             res.add(arr[j]);
                j++;
        }
        for(int k=l;k<=r;k++)
        {
            arr[k]=res.get(k-l);
        }
    }


     
    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r)
        return ;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        
        merge(arr,l,mid,r);
        
    }
}