class arrayrotation
{
    void LR(int[] arr,int d,int n)
    {
        for(int i=0;i<d;i++)
        {
            LRby1(arr,n);
        }

    }
public static void LRby1(int[] arr,int n)
    {
        int temp;
        temp=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};
        arrayrotation ob=new arrayrotation();
        ob.LR(arr,2,7);
        for(int i=0;i<7;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }
}