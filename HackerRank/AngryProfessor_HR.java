public static String angryProfessor(int k, List<Integer> a) {
        int attendedOnTime = 0;
        for(int i=0; i<a.size(); i++){
                if(a.get(i)<=0){
                        attendedOnTime++;
                }
        }
        if(k>attendedOnTime){
                return "YES";
        }
        else{
                return "NO";
        }

    }
