class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();
        String fb = "FizzBuzz";
        String f = "Fizz";
        String b = "Buzz";
        for(int i = 1 ; i <= n ; i++){
            if(i % 3 == 0 && i % 5 == 0){
                output.add(fb);
            }
            else if(i % 3 == 0){
                output.add(f);
            }
            else if(i % 5 == 0){
                output.add(b);
            }
            else if(i % 3 != 0 && i % 5 != 0){
                output.add(String.valueOf(i));
            }
        }
        return output;

    }
}
