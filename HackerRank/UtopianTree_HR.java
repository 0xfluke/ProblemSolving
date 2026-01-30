public static int utopianTree(int n) {
        
        int initialHeight = 1;
        for (int i=1; i<=n; i++){
                if(i%2 != 0){
                        initialHeight = 2*initialHeight;
                }
                else {
                        initialHeight++;
                }
        }
        return initialHeight;
    }
