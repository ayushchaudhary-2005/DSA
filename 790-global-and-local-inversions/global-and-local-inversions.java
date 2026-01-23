class Solution {
    public int merge(int arr[],int s,int mid,int e){
        int count=0;
        int i=s;
        int j=mid+1;
        int temp[]=new int[e-s+1];
        int k=0;
        while(i<=mid && j<=e){
            if(arr[i]>arr[j]){
                count=count+(mid-i+1);
                temp[k++]=arr[j];
                j++;
            }
            else{
                temp[k++]=arr[i];
                i++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];

        }
        for(i=0;i<temp.length;i++){
            arr[s+i]=temp[i];
        }
        return count;
    }
    public int find(int arr[],int s,int e){
        if(s>=e){
            return 0;
        }
        int mid=s+(e-s)/2;
        int count=0;
        count+=find(arr,s,mid);
        count+=find(arr,mid+1,e);
        return count+merge(arr,s,mid,e);
    }
    public boolean isIdealPermutation(int[] arr) {
         int li=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                li++;
            }

        }
        int gi = find(arr,0,arr.length-1);
        if(li==gi){
            return true;
        }
        return false;
        
    }
}