// This was a silly approach but worked
public static int sockMerchant(int n, List<Integer> ar) {
        int pairCounter = 0;
        int pairNum = 0;
        for(int i=0 ; i<ar.size(); i++){
                 pairNum = ar.get(i);
                 ar.set(i, 111222333);
                 if(ar.contains(pairNum)){
                        pairCounter++;
                        ar.set(ar.indexOf(pairNum), 111222333);
                 }
                                   
                }
        return pairCounter/2; // Since the loop reads my placeholder pairs too, I need to divide the result by 2 to get rid of the ghost pairs
        }
