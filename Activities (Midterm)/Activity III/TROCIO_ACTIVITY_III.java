public class TROCIO_ACTIVITY_III {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int [][] scores = new int[5][5];
      for(int x=0; x<scores.length ; x++){
        for(int y=0; y<scores.length ; y++){
            System.out.println("Enter the Column "+(x+1)+" of row"+(y+1)+" : ");
       scores[x][y] = sc.nextInt();
        }
        
    }
 }
}

