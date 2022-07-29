package Leetcode202207;

public class Leetcode593 {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        var list = new int[4][2];
        list[0] = p1;
        list[1] = p2;
        list[2] = p3;
        list[3] = p4;
        var distance = new long[4][3];
        for(int i=0;i<4;i++){
            int idx = 0;
            for(int j=0;j<4;j++){
                if(i != j){
                    long t=1L*(list[i][0]-list[j][0])*(list[i][0]-list[j][0])+(list[i][1]-list[j][1])*(list[i][1]-list[j][1]);
                    distance[i][idx++] = t;
                }
            }
        }
        for(int i=0;i<4;i++) Arrays.sort(distance[i]);
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++) System.out.print(distance[i][j]);
            System.out.println();
        }
        long t = distance[0][2];
        for(int i=0;i<2;i++){
            if(distance[i][0]!=distance[i][1]) return false;
            if(t != distance[i][2]) return false;
        }
        for(int i=0;i<3;i++){
            if(distance[i][0]!=distance[i+1][0]) return false;
            if(distance[i][1]!=distance[i+1][1]) return false;
            if(distance[i][2]!=distance[i+1][2]) return false;
        }
        for(int i=0;i<4;i++){
            if(distance[i][0]==distance[i][2]) return false;
        }
        return true;
    }    
}
