public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // a.size() number of movements generate the same list
        List<Integer> newList = new ArrayList<Integer>();
        List<Integer> finalList = new ArrayList<Integer>();
        k = k % a.size();
        for(int i=0; i<a.size(); i++){
                newList.add(a.get((a.size() - k + i)% a.size()));
        }
        for(int j=0; j<queries.size(); j++){
                finalList.add(newList.get(queries.get(j)));
        }
        return finalList;

    }
