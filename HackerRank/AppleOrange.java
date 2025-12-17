public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        List<Integer> inclusiveApples = new ArrayList<>();
        List<Integer> inclusiveOranges = new ArrayList<>();
        for(int apple : apples){
            if(apple > 0 && (a + apple)>= s && (a + apple) <= t){
                inclusiveApples.add(apple);
            }
        }
        for(int orange : oranges){
            if(orange < 0 && (b - Math.abs(orange)) <= t && (b - Math.abs(orange) >=s)){
                inclusiveOranges.add(orange);
            }
        }
        System.out.println(inclusiveApples.size());
        System.out.println(inclusiveOranges.size());
    }

}
