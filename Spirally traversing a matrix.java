class Result
{
  static void printSpiral(int a[][], int r, int c)
  {
    int row=r,col=c,l=0,k=0,i;
    //1   2 3 l=0 k=0;
    //4   5 6
    //7   8 9
    //10 11 12
  while(k<row && l<col){
    
			for(i=l;i<col;i++){
				System.out.println(a[k][i]);
			}
			k++;
			for(i=k;i<row;i++){
				System.out.println(a[i][col-1]);
			}
			col--;
			if(k<row) {
				for(i=col-1;i>=l;i--) {
					System.out.println(a[row-1][i]);
				}
				row--;
			}
			if(l<col){
				for(i=row-1;i>=k;i--) {
					System.out.println(a[i][l]);
				}
				l++;
			}
		}
   }
}

