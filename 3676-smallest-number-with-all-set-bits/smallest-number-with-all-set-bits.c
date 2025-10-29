int smallestNumber(int n) {
    int arr[10] = {1,3,7,15,31,63,127,255,511,1023};
    int i;
    for(i=0;i<10;i++){
        if(n <=arr[i])
            break;
    }
    return arr[i];
}