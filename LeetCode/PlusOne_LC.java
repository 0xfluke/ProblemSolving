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

// Second and Correct Approach
public int[] plusOne(int[] digits) {
        int carry = 1;
        digits[digits.length-1] += carry;
        int[] newDigits = new int[digits.length + 1];
        for(int i = digits.length - 1; i >= 0 ;i--){
            if(digits[i] <= 9){
                return digits;
            }
            else if (digits[i] > 9) {
                if(digits[0] > 9){
                    newDigits[0] = 1;
                    for(int j = 0; j< digits.length; j++){
                        newDigits[j+1] = 0;
                    }
                    return newDigits;
                }
                digits[i] = 0;
                digits[i-1]++;
            }
        }
        if(newDigits[0] == 1){
            return newDigits;
        }
        else{
            return digits;
        }
    }
