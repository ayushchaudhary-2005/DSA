class Solution {
    public boolean uniformArray(int[] arr) {
        boolean notFoundEven=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                continue;
            }
            else{
                boolean found=false;
                for(int j=0;j<arr.length;j++){
                    if(i!=j){
                        if((arr[i]-arr[j])%2==0){
                            found=true;
                            break;
                        }
                    }

                }
                if(!found){
                    notFoundEven=true;
                    break;
                }
            }
        }
        if(!notFoundEven){
            return true;
        }
        boolean notFoundOdd=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                continue;
            }
            else{
                boolean found=false;
                for(int j=0;j<arr.length;j++){
                    if(i!=j){
                        if((arr[i]-arr[j])%2!=0){
                            found=true;
                            break;
                        }
                    }

                }
                if(!found){
                    notFoundOdd=true;
                    break;
                }
            }
        }
        if(!notFoundOdd){
            return true;
        }
        return false;
        
    }
}