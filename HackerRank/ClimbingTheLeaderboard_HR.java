// Initial faulty approach
public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        ArrayList<Integer> scores = new ArrayList<>();
        for (int i=0 ; i<player.size(); i++){
                if(player.get(i)<= ranked.get(ranked.size()-1)){
                        scores.add(ranked.indexOf(ranked.get(ranked.size()-1)));
                }
                for(int j=0; j<ranked.size(); j++){
                        if(player.get(i) > ranked.get(j)){
                                int newScore = ranked.indexOf(ranked.get(j)) + 1;
                                scores.add(newScore);
                                break;
                        }
                }
        }
        return scores;
    }

// Second faulty approach
public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<Integer> newRanked = new ArrayList<>();
        for (int k=0; k< ranked.size(); k++){
                if(!newRanked.contains(ranked.get(k))){
                        newRanked.add(ranked.get(k));
                }
        }
        for (int i=0 ; i<player.size(); i++){
                if(player.get(i)<= newRanked.get(newRanked.size()-1)){
                        scores.add(newRanked.indexOf(newRanked.get(newRanked.size()-1)));
                }
                for(int j=newRanked.size()-1; j>=0; j--){
                        if(player.get(i) < newRanked.get(j)){
                                int newScore = newRanked.indexOf(newRanked.get(j)) + 1;
                                scores.add(newScore);
                                break;
                        }
                }
        }
        return scores;
    }

// Third faulty approach
public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<Integer> newRanked = new ArrayList<>();
        // We first clean up the default ranked list by removing duplicated values
        int lastAdd = 0;
        for (int k=0; k< ranked.size(); k++){
                if(ranked.get(k) != lastAdd){
                        newRanked.add(ranked.get(k));
                        lastAdd = ranked.get(k);
                }
        }
        // if the first element of "player" is smaller than the last element of "newRanked"
        // Then the first score of the player is the last index of "newRanked" + 1
        // if the first element of "player" is bigger than the last element of "newRanked"
        // Then we iterate until its smaller than an element, when we find it, the next score of the element in the "player" list is the index of that specific element in "newRanked" +1
                for (int i=0 ; i<player.size(); i++){
                        for(int j=0; j< newRanked.size(); j++){
                            if(player.get(i) <= newRanked.get(newRanked.size()-j)){
                                scores.add(newRanked.size()-j+1);
                            }
                        }    
                }
        return scores;

    }
