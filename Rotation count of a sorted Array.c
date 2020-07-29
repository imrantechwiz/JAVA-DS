int rotationCount(int a[], int size)
{
  int i,min=a[0],pos=0;
  for(i=0;i<size;i++){
    if(min>a[i]){
      min=a[i];
      pos=i;
    }
  }
  if(pos==0){
    return -1;
  }else{
    return pos;
  }
}
// find index of minimum element
