public class array {
    //question one
    public static boolean arrayT(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }


    // //question second O(log n)

    // //smallest elemetn index
    // public static int minsearch(int num[]){
    //     int start = 0;
    //     int end = num.length-1;
    //     while (start<end) {
    //         int mid = start + (end - start)/2;
    //         if(mid>0 && num[mid-1]>num[mid]){
    //             return mid;
    //         }else if(num[start] <= num[mid] && num[mid] > num[end]){
    //             start = end+1;
    //         }else{
    //             end = mid-1;
    //         }
    //     }
    //     return start;
    // }
    // //binary search to find target in left to right boundary
    // public static int Target(int num[] ,int start , int end , int target){
    //     int s = start;
    //     int e = end;
    //     while (s<=e){
    //         int mid = s+(e-s)/2;
    //         if(target==num[mid]){
    //             return mid;
    //         }else if(target < num[mid]){
    //             e = mid-1;
    //         }else {
    //             s = mid+1;
    //         }
    //     }
    //     return -1;
    // }

    // public static int Search(int num[] ,int target){
    //     //min will have index of minimum element of nums
    //     int min  = minsearch(num);
    //     //find in sorted left
    //     if(num[min] <= target && target<=num[num.length-1]){
    //         return Target(num,min,num.length-1,target);
    //     }
    //     //find in sorted right
    //     else{
    //         return Target(num,0,min,target);
    //     }
    // }


    //question 3.
    public static int buydSell(int prices[]){
        int buyp = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            if(buyp < prices[i]){
                maxprofit = Math.max(prices[i]-buyp, maxprofit);
            }else{
                buyp=prices[i];
            }
        }
        return maxprofit;

    }


    //question 4
    public static int trapwater(int height[]){
        int n = height.length;
        int leftMax[] = new int[height.length];
        //left max
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //right max
        int rightMax[] = new int[height.length];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //trap water
        int trapw = 0;
        for(int i=0;i<n;i++){
            int waterlev = Math.min(leftMax[i], rightMax[i]);

            trapw += waterlev - height[i];
        }
        return trapw;
    }

    //question five
    // public static void triplet(int num[]){
    //     for(int i=0;i<num.length;i++){
    //         for(int j=i+1;j<num.length;j++){
    //             for(int k=j+1; k<num.length; k++){
    //                 if(num[i]+num[j]+num[k] == 0){
                        
    //                 }
    //             }
    //         }
    //     }
    // }
    
    
    
    
    public static void main(String[] args) {
        
        // int num[] = {1,2,3,4};
        // System.out.println(arrayT(num));
        
        
        //question second O(log n)
        // int num[] = {4,5,6,7,0,1,2};
        // int target = 0;
        

        // int prices[] = {7,6,4,3,1};
        // System.out.println(buydSell(prices));
        

        // int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // System.out.println(trapwater(height));

    }
}