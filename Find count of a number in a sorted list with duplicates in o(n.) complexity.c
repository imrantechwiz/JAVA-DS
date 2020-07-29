//Using binary search divide into two parts 
// In first check its first existing position and in last find its last pos.
#include <stdio.h>
int find(int a[],int ,int );
int left(int a[],int ,int ,int ,int );
int right(int a[],int ,int ,int ,int );
int main()
{
  int cases,x,y,i,z;
  scanf("%d",&cases);
  while(cases--){
    scanf("%d%d",&x,&y);
    int a[x];
    for(i=0;i<x;i++){
      scanf("%d",&a[i]);
    }
    z=find(a,x,y);
    printf("%d\n",z);
  }
}
int find(int a[],int x,int y){
  int i,j;
  i=left(a,0,(x-1),y,x);
  if(i==-1)
    return 0; //if number doesnot exist
	j=right(a,i,(x-1),y,x);
    return (j-i+1);
}
int left(int a[],int low,int high,int find,int x){
  if(high>=low){
 		int mid=(low+high)/2;
    if(mid==0 || (a[mid-1]<find && a[mid]==find)){
			return mid;
    }else if(a[mid]<find){
      return left(a,(mid+1),high,find,x);
    }else{
		return left(a,low,(mid-1),find,x);
    }
  }
  return -1;
}
int right(int a[],int low,int high,int find,int x){
  //printf("%d ",x);
  if (high >= low) 
  { 
    int mid = (low + high)/2; 
    if( ( mid == x-1 || find < a[mid+1]) && a[mid] == find) 
      return mid; 
    else if(find < a[mid]) 
      return right(a, low, (mid -1), find, x); 
    else
      return right(a, (mid + 1), high, find, x);       
  } 
  return -1; 
}
