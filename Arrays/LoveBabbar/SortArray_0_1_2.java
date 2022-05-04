public class SortArray_0_1_2 {
    public static void main(String[] args){
        int arr[] = {1,0,2,2,0,1,1,};
        int i,countZero,countOne,countTwo;
        countZero= 0;
        countOne= 0;
        countTwo= 0;
        
        // Approach 1
        // i= 0;
        // while(i<arr.length){
        //     if(arr[i]==0){
        //         countZero++;
        //     }else if(arr[i]==1){
        //         countOne++;
        //     }else if(arr[i]==2){
        //         countTwo++;
        //     }
            
        //     for(int j = 0;j<countZero;j++){
        //         arr[j] = 0;
        //     }
        //     for(int j = countZero;j<countZero+countOne;j++){
        //         arr[j] = 1;
        //     }
        //     for(int j = countOne;j<countOne+countTwo;j++){
        //         arr[i] = 2;
        //     }
            
        //     i++;
        // }








        // Approach 2


        for(i = 0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }else if(arr[i]==1){
                countOne++;
            }else{
                countTwo++;
            }
        }

        i= 0;
        while(countZero !=0){
            arr[i] =0;
            
            countZero--;
            i++;
        }
        while(countOne!=1){
            arr[i] =1;
            countOne--;
            i++;
        }
        while(countTwo!=2){
            arr[i] =2;
            countTwo--;
            i++;
        }



        // output
        for(i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
