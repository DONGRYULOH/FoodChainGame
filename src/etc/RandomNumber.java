package etc;

/*
 	Desc : 랜덤 동물번호 추출 
 */
public class RandomNumber {
	
	// 플레이어의 랜덤 동물번호(고정)
	private int[] playerRandomNumber = {0,0,0,0,0,0,0,0,0}; 
		
	// 중복되지 않는 랜덤 번호 뽑기 
	public int getRandomNumber(int playerIndex) {
		
		int randomNumber = 0; 	
		boolean numberCheck = true; 
		int count;
		
		// 두번째 플레이어부터 이전의 플레이어가 뽑았던 랜덤번호를 제외한 번호뽑기 				
		while(numberCheck) {
			
			randomNumber = (int)((Math.random() * 9) + 1); // 1이상 10미만의 랜덤번호 추출 
			count = 0; // 플레이어의 번호 중복 체크 
			for(int j=0;j<playerIndex+1;j++) {
				if(randomNumber == playerRandomNumber[j]) {
					count++; // 중복되는 번호가 있으면 중복횟수 증가 
					break; // 가장 가까운 반복문인 for문 탈출 
				}
			}
			// 다른 플레이어와 중복되는 번호가 없는 경우 플레이어번호배열에 랜덤으로 뽑은 번호를 넣기 
			if(count == 0) {				
				playerRandomNumber[playerIndex] = randomNumber;
				numberCheck = false;
			}
		}			
		
		return randomNumber;
	}
}
