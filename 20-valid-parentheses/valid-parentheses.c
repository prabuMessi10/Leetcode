bool isValid(char* s) {
    int length = 0;
    while (s[length] != '\0') length++;  // calculate string length

    char* stack = (char*)malloc(sizeof(char) * length);
    int top = -1;

    for (int i = 0; i < length; i++) {
        char c = s[i];

        // If opening bracket, push it to the stack
        if (c == '(' || c == '[' || c == '{') {
            stack[++top] = c;
        } else {
            // If stack empty or top doesn't match closing bracket, invalid
            if (top == -1) {
                free(stack);
                return false;
            }
            char open = stack[top--];
            if ((c == ')' && open != '(') ||
                (c == ']' && open != '[') ||
                (c == '}' && open != '{')) {
                free(stack);
                return false;
            }
        }
    }

    bool isValid = (top == -1);  // valid if stack empty at the end
    free(stack);
    return isValid;
}