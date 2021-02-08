package programers.exhaustive_search;

import java.util.*;

class PracticeTest {
    public int[] solution(int[] answers) {
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answerArr = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++) {
            if (isAnswer(answer1, i, answers[i])) {
                answerArr[0]++;
            }
            
            if (isAnswer(answer2, i, answers[i])) {
                answerArr[1]++;
            }
            
            if (isAnswer(answer3, i, answers[i])) {
                answerArr[2]++;
            }
        }
        
        int max = 0;
        for (int j = 0; j < answerArr.length; j++) {
            if (max < answerArr[j]) {
                max = answerArr[j];
            }
        }
        
        ArrayList<Integer> arrAnswer = new ArrayList<Integer>();
        for (int k = 0; k < answerArr.length; k++) {
            if (max == answerArr[k]) {
                arrAnswer.add(k + 1);
            }
        }
        
        int[] result = new int[arrAnswer.size()];
        for (int z = 0; z < arrAnswer.size(); z++) {
            result[z] = arrAnswer.get(z);
        }
        Arrays.sort(result);
        
        return result;
    }
    
    public boolean isAnswer(int[] answer, int num, int realAnswer) {
        return (answer[(num % answer.length)] == realAnswer);
    }
}
