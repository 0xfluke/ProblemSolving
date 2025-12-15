public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();
        for(Integer grade : grades){
            if(grade <= 37){
                finalGrades.add(grade);
            }
            else if(grade % 5 == 3){
                grade += 2;
                finalGrades.add(grade);
            }
            else if(grade % 5 == 4){
                grade += 1;
                finalGrades.add(grade);
            }
            else{
                finalGrades.add(grade);
            }            
        }
        return finalGrades;

    }
