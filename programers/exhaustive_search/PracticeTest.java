package programers.exhaustive_search;

import java.util.*;

class PracticeTest {
	 public int[] solution(int[] answers) {
	        int[] answer1 = {1, 2, 3, 4, 5};
	        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
	        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
	        int[] answerArr = {0, 0, 0};
	        
	        for (int i = 0; i < answers.length; i++) {
	            //1번 수포자 답안 체크
	            if (isAnswer(answer1, i, answers[i])) {
	                answerArr[0]++;
	            }
	            
	            //2번 수포자 답안 체크
	            if (isAnswer(answer2, i, answers[i])) {
	                answerArr[1]++;
	            }
	            
	            //3번 수포자 답안 체크
	            if (isAnswer(answer3, i, answers[i])) {
	                answerArr[2]++;
	            }
	        }
	        
	        int max = getMaxNum(answerArr);
	        
	        return getAnswer(answerArr, max);
	    }
	    
	    //수포자 정답 체크 기능
	    private boolean isAnswer(int[] answer, int num, int realAnswer) {
	        return (answer[(num % answer.length)] == realAnswer);
	    }
	    
	    //가장 많은 정답 반환 기능
	    private int getMaxNum(int[] answerArr) {
	        int max = 0;
	        for (int i = 0; i < answerArr.length; i++) {
	            if (max < answerArr[i]) {
	                max = answerArr[i];
	            }
	        }
	        
	        return max;
	    }
	    
	    //최종 정답자 반환
	    private int[] getAnswer(int[] answerArr, int max) {
	        ArrayList<Integer> arrAnswer = new ArrayList<Integer>();
	        for (int i = 1; i <= answerArr.length; i++) {
	            if (max == answerArr[i - 1]) {
	                arrAnswer.add(i);
	            }
	        }
	        
	        int[] result = new int[arrAnswer.size()];
	        for (int j = 0; j < arrAnswer.size(); j++) {
	            result[j] = arrAnswer.get(j);
	        }
	        
	        Arrays.sort(result);
	        
	        return result;
	    }
}
