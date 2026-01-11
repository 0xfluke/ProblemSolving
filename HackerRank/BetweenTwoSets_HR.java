// Correct approach

























// First <Faulty> approach
public static int getTotalX(List<Integer> a, List<Integer> b) {
        ArrayList <Integer> factors = new ArrayList<>();
        int maxListA = 0;
        for(int j=0 ; j< a.size(); j++){
                if(a.get(j)> maxListA){
                        maxListA = a.get(j);
                }
        }
        int maxListB = 0;
        for(int k=0 ; k< b.size(); k++){
                if(b.get(k)> maxListB){
                        maxListB = b.get(k);
                }
        }
        for(int i=1; i < 1000 ; i++){
                if(i >= maxListA && i<= maxListB){
                      factors.add(i);  
                }
        }
        for(int l=0 ; l< factors.size(); l++){
                for(int v=0; v< a.size(); v++){
                        if(factors.get(l) % a.get(v) == 0){
                                factors.remove(factors.get(l));
                        }
                }
        for(int m=0; m<factors.size(); m++){
                for(int t=0 ; t< b.size(); t++){
                       if(b.get(t) % factors.get(m) != 0){
                                factors.remove(factors.get(m));
                        } 
                }
        }
        }
        return factors.size();

    }
