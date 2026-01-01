public static void miniMaxSum(List<Integer> arr) {
        List<Long> sumList = new ArrayList<>();
        List<Long> resultList = new ArrayList<>();
        long totalSum = 0; 
        for(int i = 0; i < arr.size(); i++){ // Find the sum of given list elements
            totalSum += arr.get(i);
        }
        for(int j = 0; j < arr.size(); j++){ // Add sum iterations to the sumList by deducting each element from arr
            sumList.add(totalSum - arr.get(j));
        }
        resultList.add(Collections.min(sumList)); // Get the min value from sumList and add to a new resultList
        resultList.add(Collections.max(sumList)); // Get the max value from sumList and add to a new resultList
        System.out.print(resultList.get(0));
        System.out.print(" ");
        System.out.print(resultList.get(1));
    }
