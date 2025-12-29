public static List<Integer> breakingRecords(List<Integer> scores) {
        Integer initScore = scores.get(0);
        Integer minRecordCount = 0;
        Integer minRecord = initScore;
        Integer maxRecordCount = 0;
        Integer maxRecord = initScore;
        for (int i = 1 ; i < scores.size(); i++){
            if(scores.get(i) > initScore){
                if(scores.get(i) > maxRecord){
                    maxRecord = scores.get(i);
                    maxRecordCount++;
                }
            }
            else if(scores.get(i) < initScore){
                if(scores.get(i) < minRecord){
                    minRecord = scores.get(i);
                    minRecordCount++;
                }
            }
        }
        List<Integer> result  = new ArrayList<>();
        result.add(maxRecordCount);
        result.add(minRecordCount);
        return result;
        }
