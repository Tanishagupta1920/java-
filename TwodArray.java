class TwodArrays{
    public static void main(String[] args) {
        int[][] a=new int[2][3];
        a[0][0]=10;
        a[0][1]=20;
        a[1][0]=30;
        a[1][1]=40;
        System.out.println(a);
        System.out.println(a.length);
        System.out.println(a[0]);
        System.out.println(a[0].length);
        System.out.println(a[0][0]);

        //matrix array

        int[][] b={{10,20,30},{40,50,60}};
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[1].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        //jagged array
        int[][] c={{10,20,30},{40,50},{60,70,80,90}};
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}