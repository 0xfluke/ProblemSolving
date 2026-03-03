public static int designerPdfViewer(List<Integer> h, String word) {
    // Define a list, from 0 to 25, respective to letters
    // Look at the word, take each letter, find its index --> for loop
    // Find each letter's corresponding height in the given list
    // Select the biggest number of height among letters
    // Multiply the biggest height with the length of the word
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int wordLength = word.length();
        int height = 0;
        for(int i=0; i< word.length(); i++){
                String letter = String.valueOf(word.charAt(i));
                for (int j=0; j<26; j++){
                       if(alphabet[j].matches(letter)){
                                if(h.get(j) > height){
                                        height = h.get(j);
                                }
                       } 
                }
                
        }
        int area = height * wordLength;
        return area;
        
    }
