bool isAnagram(char* s, char* t) {
    int n = strlen(s);
    int m = strlen(t);
    int fq1[27] = {0},fq2[27] = {0};
    if(n != m )
        return false;
    
       for(int i=0;s[i]!='\0';i++){
            fq1[s[i] - 'a']++;
       }
       for(int i=0;t[i]!='\0';i++){
            fq2[t[i] - 'a']++;
       }
       for(int i=0;i<27;i++ ){
            if(fq1[i] !=fq2[i])
                return false;
       }
    return true;
}