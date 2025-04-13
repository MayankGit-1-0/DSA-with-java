public class WaveformMatrix {
    public static void row1wave(int[][] mat){
        int n=mat.length;
        int m=mat.length;
        for(int i=0;i<n;i++){
            if(i%2==0) for(int j=0;j<m;j++) System.out.print(mat[i][j]+" ");
            else for(int j=m-1;j>=0;j--) System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
    public static void row2wave(int[][] mat){
        int n=mat.length;
        int m=mat.length;
        for(int i=0;i<n;i++){
            if(i%2==1) for(int j=0;j<m;j++) System.out.print(mat[i][j]+" ");
            else for(int j=m-1;j>=0;j--) System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
    public static void col1wave(int[][] mat){
        int n=mat.length;
        int m=mat.length;
        for(int i=0;i<n;i++){
            if(i%2==0) for(int j=0;j<m;j++) System.out.print(mat[j][i]+" ");
            else for(int j=m-1;j>=0;j--) System.out.print(mat[j][1]+" ");
            System.out.println();
        }
    }
    public static void col2wave(int[][] mat){
        int n=mat.length;
        int m=mat.length;
        for(int i=0;i<n;i++){
            if(i%2==1) for(int j=0;j<m;j++) System.out.print(mat[j][i]+" ");
            else for(int j=m-1;j>=0;j--) System.out.print(mat[j][1]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        row1wave(mat);
        System.out.println();
        row2wave(mat);
        System.out.println();
        col1wave(mat);
        System.out.println();
        col2wave(mat);
    }
}
