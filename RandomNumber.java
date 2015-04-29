import java.util.Random;

public class RandomNumber {
    public static void main (String [] args){
        int [] x = {1, 10, 3, 7};
        int [] y = {2, 3, 4, 5, 10, 6};
        System.out.print(overlap(x,y));
    }
     public static int[] overlap(int x[],int y[]){
    int temp[];
    if( x.length>y.length){
        temp=new int[x.length+1];
    }
    else{
        temp=new int[y.length+1];
    }
    
    //room enough for all common ints AND count
    temp[0]=0; //count the number of shared entries
    for(int j=0;j<x.length;j++){
        for(int k=0;k<y.length;k++){
            if(x[j]==y[k]){
                temp[0]++;//increment BEFORE storing
                temp[temp[0]]=x[j];
            }
        }
    }
    return temp;

}
}

