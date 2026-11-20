public class practice {
    public static void main(String[] args) {
        int[] scores = {10, 15, 20, 25, 30};

        for(int i = 0; i < scores.length; i++){
            if(scores[i] % 2 == 0){
                System.out.println(scores[i] + "은(는) 짝수 입니다");
            }
        }
    }
}