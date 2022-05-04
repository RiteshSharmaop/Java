public class ArrayClone {
    public static void main(String[]args){
        int [] []arr={{3,6,9},{5,6,7}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }System.out.println();
        }

        int [][] ok=arr.clone();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }System.out.println();
        }
    }
}
