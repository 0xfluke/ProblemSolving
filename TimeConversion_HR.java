public static String timeConversion(String s) {
        
        int militaryHour = Integer.parseInt(s.substring(0,2));
        Integer militaryConversion = 0;
        if(militaryHour == 12 && s.contains("PM")){
            String time = s.substring(0,8);
            return time;
        }
        else if(s.contains("PM")){
            String time = s.substring(2,8);
            militaryConversion = militaryHour + 12;
            militaryConversion.toString();
            String finalTime = militaryConversion + time;
            return finalTime;
        }
        else if(militaryHour == 12 && s.contains("AM")){
            String time = s.substring(2,8);
            militaryConversion = militaryHour - 12;
            militaryConversion.toString();
            String finalTime = "0" + militaryConversion + time;
            return finalTime;
        }
        else{
            String time = s.substring(0,8);
            return time;
        }

    }
