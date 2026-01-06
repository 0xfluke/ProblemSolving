public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sharedSum = 0;
        for (int i=0 ; i < bill.size(); i++){
                sharedSum += bill.get(i);
        }
        sharedSum -= bill.get(k);
        if((sharedSum / 2) == b){
                System.out.println("Bon Appetit");
        }
        else{
                System.out.println(Math.abs((sharedSum / 2) - b));
        }

    }
