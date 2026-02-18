static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int price = 0;
        int neg = -1;
        for (int i=0; i<keyboards.length ; i++){
                for(int j=0 ; j<drives.length; j++){
                        if(keyboards[i] + drives[j] >= price && keyboards[i] + drives[j] <= b){
                                price = keyboards[i] + drives[j];
                        }
                }
        }
        if(price == 0){
                return neg;
        }
        else{
                return price;
        }

    }
