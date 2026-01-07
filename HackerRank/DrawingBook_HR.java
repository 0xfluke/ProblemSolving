public static int pageCount(int n, int p) {
        // n = book length, p = desired page
        int pageTurns = 0;
        if(p == n || p==1){
            pageTurns = 0;
        }
        else{
            if(p-1 < n-p){
                if(p-1 <= 1){
                pageTurns = p-1;
            }
                if(p % 2 == 0){
                pageTurns = p/2;
            }
                else if(p % 2 != 0){
                pageTurns = (p-1)/2;
            }
            }
            else if(p-1 >= n-p){
                if(n % 2 == 0){
                pageTurns = (Math.round(n+1-p)/2);
                }
                else{
                pageTurns = (n-p)/2;
                }
            }
        }
        return pageTurns;
    }
