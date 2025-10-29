int smallestNumber(int n) {
    // int arr[10] = {1,3,7,15,31,63,127,255,511,1023};
    // int i;
    // for(i=0;i<10;i++){
    //     if(n <=arr[i])
    //         break;
    // }
    // return arr[i];
    if(n==1)
        return 1;
    else if(n <= 3)
        return 3;
    else if(n <=7)
        return 7;
    else if(n<=15)
        return 15;
    else if(n<=31)
        return 31;
    else if(n<=63)
        return 63;
    else if(n<=127)
        return 127;
    else if(n<=255)
        return 255;
    else if(n<=511)
        return 511;
    
        return 1023;
}