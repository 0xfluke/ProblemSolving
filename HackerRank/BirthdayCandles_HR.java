public static int birthdayCakeCandles(List<Integer> candles) {
        int candlesCount = 0;
        int maxCandle = Collections.max(candles); //Finding the max value candles
        for(int i = 0; i < candles.size(); i++){
            if(candles.get(i) == maxCandle){ // Counting the occurence of max value candles
                candlesCount++;
            }
        }
        return candlesCount;

    }
