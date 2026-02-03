// Initial faulty approach
public static int formingMagicSquare(List<List<Integer>> s) {
        int bigSum = 0;
        for(int i=0 ; i<s.size(); i++){
                for(int j=0; j<s.size(); j++){
                     bigSum += s.get(i).get(j);
                }
        }
        double avg = bigSum / Math.pow(s.size(), 2);
        int magicNumber = ((int)Math.round(avg*s.size()))+1;
        int cost = ((magicNumber*s.size()) - bigSum);
        return cost;        
    }

// Second Approach

