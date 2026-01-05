// First and super messy approach with brute forcing my way :D
public static String dayOfProgrammer(int year) {
        ArrayList<Integer> months = new ArrayList<>();
        months.add(0, 31);
        months.add(1, 0);
        months.add(2, 31);
        months.add(3, 30);
        months.add(4, 31);
        months.add(5, 30);
        months.add(6, 31);
        months.add(7, 31);
        months.add(8, 30);
        months.add(9, 31);
        months.add(10, 30);
        months.add(11, 31);
        boolean isLeapYear = false;
        if(year < 1918){
                if(year % 4 == 0){
                        isLeapYear = true;
                }
        }else if(year == 1918){
                isLeapYear = false;
                months.set(1, 15);
        }else if(year > 1918){
                if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
                        isLeapYear = true;
                }
        }
        int programmerDay = 0;
        int decrementCount = 0;
        int day = 0;
        String result = "";
        if(isLeapYear && year != 1918){
                months.set(1, 29);
        }
        else if (!isLeapYear && year != 1918) {
                months.set(1, 28);
        }
        for(int i = 0 ; i < months.size() - 3; i++){
                programmerDay += months.get(i);
                if(programmerDay > 256){
                        for(int j = 0; j<30 ; j++){
                                programmerDay --;
                                decrementCount ++;
                                if(programmerDay == 256){
                                      day = 30 - decrementCount;
                                      if(day > 9){
                                        result = day + ".09."+ year;
                                      }
                                      else if(day <= 9){
                                        result = "0" + day + ".09."+ year;
                                      }
                                      
                                }
                        }
                }
        }
        return result;
    }
