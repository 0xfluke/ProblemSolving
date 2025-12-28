public static String kangaroo(int x1, int v1, int x2, int v2) {
        String result = "";
        int count = 0;
        for (int i=0 ; i < 10000 ; i++){
            x1 += v1;
            x2 += v2;
            if(x1 == x2){
            count++;
            }
            else{}
        }
        if(count > 0){
            result = "YES";
        }
        else{
            result = "NO";
        }
        return result;
    }
