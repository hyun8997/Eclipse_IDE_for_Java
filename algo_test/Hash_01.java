package algo_test;

// 해시 완주하지 못한 선수	https://programmers.co.kr/learn/courses/30/lessons/42576?language=java

//수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//
//마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
//
//제한사항
//마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//completion의 길이는 participant의 길이보다 1 작습니다.
//참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//참가자 중에는 동명이인이 있을 수 있습니다.
import java.util.Arrays;

public class Hash_01 {
	public static void main(String[] args) {
		String [] P = { "ana", "cat", "dog", "bongo", "shaun"};
		String [] A = { "ana", "cat", "dog", "bongo"};
		String ANS="0";
		
		Solution sol = new Solution () ;
		
		ANS=sol.solution(P, A);
		
		System.out.println(ANS);
	}
}

//배열복사, 이중 for문, 효율성X
//class Solution {
//	public String solution(String[] participant, String[] completion) {
//		String [] cl_par = participant.clone();				//배열 목사
//		int count=0;															//일치 카운트
//		for(int i=0; i<participant.length; i++) {
//			for(int j=0; j<completion.length; j++) {
//	       		
//				if (participant[i] == completion[j]) {
//					for (int k =i; k < participant.length-1; k++) {
//						cl_par[k-count] = cl_par[k+1-count];
//					}
//					count++;
//					break;
//				}
//	       		
//			}
//		}
//	   	
//		String answer = cl_par[0];
//		return answer;
//	   }
//}


//boolean 써보기, 이중 for문, 효율성 X
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        int [] check_1 = new int [participant.length]; 				// 0,1 위치 파악용 배열
//        int check_2 = 0;																// 정답 위치 제시용 정수
//        
//        for(int i=0; i<participant.length; i++) {
//        	for(int j=0; j<completion.length; j++) {
//        		if(participant[i] == completion[j]){
//                    check_1 [i]=1;
//                }
//        	}
//        }
//        
//    	for(int k=0; k<participant.length; k++){
//            if(check_1[k]==0){
//                check_2=k;
//            }
//        }
//    
//        String answer = participant[check_2];
//        //String answer = "";
//        return answer;
//    }
//}

//Arrays유틸, sort사용
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "0";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<completion.length; i++){
            String tmp = participant[i];						// tmp
            if(!tmp.equals(completion[i])){					// sort 후 서로 다르면 정답으로
                answer = tmp;
                break;
            }
        }
        
        if(answer == "0"){									
            return participant[participant.length-1];
        } else {
            return answer;
        }
    }
}

//HashMap, HashTable 유틸 사용법 익혀야 할 듯
// 자료구조, 자료형 공부

