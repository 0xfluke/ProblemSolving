// This is the brute-force version with O(n2) complexity
public static int birthday(List<Integer> s, int d, int m) {
        int chocolate = 0;
        for(int i=0 ; i < s.size() - (m-1); i++){
            int newSum = 0;
            for(int y = i; y < i + m ; y++){
                newSum += s.get(y);
            }
            if(newSum == d){
                chocolate++;
            }
        }
        return chocolate;
    }

// This is the window sliding technique used version with O(n) complexity
public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        int firstSum = 0;
        for (int i=0 ; i < m; i++){
            firstSum += s.get(i);
        }
        if(firstSum == d){
            result++;
        }
        int windowSum = firstSum;
        for (int j = m ; j < s.size(); j++){
            windowSum += (s.get(j) - s.get(j - m));
            if(windowSum == d){
                result++;
            }
        }
        return result;
    }
