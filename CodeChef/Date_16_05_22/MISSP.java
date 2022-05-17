public class MISSP {
    public static void main(String[] args){
    // int t,n;
    // cin>>t;
    // while(t!=0){
    //     cin>>n;
    //     int arr[n];
    //     int ran = 0;
    //     for(int i=0;i<n;i++){
    //         cin>>arr[i];
    //         ran = ran^arr[i];
    //     }
        
        
    //     cout<<ran;
    //     t--;
    // }

    Scanner sc = new Scanner(System.in);
	int t,n;
    t = sc.nextInt();
    while(t!=0){
        n = sc.nextInt();
        int arr[] = new int[n];
        int ran = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            ran = ran^arr[i];
        }
        
        
        System.out.println(ran);
        t--;
    }
    }
}
