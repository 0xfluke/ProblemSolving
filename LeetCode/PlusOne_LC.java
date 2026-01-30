// Initial Faulty Approach
public int[] plusOne(int[] digits) {
        int initialNumber = 0;

        for(int i=0; i<digits.length ; i++){
            initialNumber += digits[i]*Math.powExact(10,digits.length-1);
        }
        int finalNumber = initialNumber + 1; // 124
        int[] finalDigits = new int[digits.length+1];
        for(int j=0; j<digits.length+1; j++){
            finalDigits[j] = finalNumber / Math.powExact(10,digits.length-j-1);
            finalNumber -= finalDigits[j];
        }
        return finalDigits;
    }

// Second Approach
