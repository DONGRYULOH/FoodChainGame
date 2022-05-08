package animal;

/*
 	 동물별 계급)
 	 1.사자
 	 2.독수리  
 	 3.하이에나 
 	 4.카멜레온,청둥오리,토끼,사슴,쥐,뱀,까마귀
 	 
 	 동물별 승리 조건)
 	 1.사자 : 마지막라운드까지 생존 
 	 2.독수리 : 마지막라운드까지 생존
 	 3.하이에나 : 사자의 죽음
 	 4.카멜레온 : 마지막라운드까지 생존
 	 5.청둥오리 : 마지막라운드까지 생존
 	 6.토끼 :마지막라운드까지 생존
 	 7.사슴:마지막라운드까지 생존
 	 8.쥐:사자의 승리
 	 9.뱀:마지막라운드 종료시 7명이상 죽으면 승리
 	 
 	 동물별 패배 조건)
 	 1.사자 : 한라운드 굶으면 죽음 
 	 2.독수리 : 두라운드 굶으면 죽음
 	 3.하이에나 : 세라운드 굶으면 죽음
 	 4.카멜레온 : 죽었을때
 	 5.청둥오리 : 죽었을때
 	 6.토끼 :죽었을때
 	 7.사슴:죽었을때
 	 8.쥐:사자의 죽음
 	 9.뱀:승리조건 충족 못할시 
 	 
 	 동물별 주 거주지)
 	 1.사자 : 들 
 	 2.독수리 : 하늘
 	 3.하이에나 : 들
 	 4.카멜레온 : 숲
 	 5.청둥오리 : 하늘
 	 6.토끼 :숲
 	 7.사슴:들
 	 8.쥐:숲
 	 9.뱀:숲 
 	 
 	 동물별 가지 못하는 지역)
 	 1.사자 : 하늘
 	 2.독수리 : 없음
 	 3.하이에나 : 하늘
 	 4.카멜레온 : 하늘
 	 5.청둥오리 : 없음
 	 6.토끼 :하늘
 	 7.사슴:하늘
 	 8.쥐:하늘
 	 9.뱀:하늘
 	 
 	 동물별 능력)
 	 1.사자 : 없음
 	 2.독수리 : 없음
 	 3.하이에나 : 없음
 	 4.카멜레온 : 다른 플레이어가 엿보기를 했을때 정체를 속일수 있음
 	 5.청둥오리 : 청둥오리, 토끼, 사슴 중 생존해 있는 동물들이 모두 한 장소에 있으면 무적
 	 6.토끼 :청둥오리, 토끼, 사슴 중 생존해 있는 동물들이 모두 한 장소에 있으면 무적
 	 7.사슴:청둥오리, 토끼, 사슴 중 생존해 있는 동물들이 모두 한 장소에 있으면 무적
 	 8.쥐:2명의 플레이어 엿보기 
 	 9.뱀:상대방 공격불가능, 피식자와 포식자 상관없이 자신을 공격하는 모든 동물 죽음
 */
public class Animal {
	
	// 동물번호(PK)
	private int animalNumber;
	
	// 동물이름 
	private String animalName;
	
	// 엿보기 횟수  
	private int detectCount;
	
	// 계급
	private int animalRank;
	
	// 주 거주지역 
	private String habitat;
	
	// 주 거주지 아닌곳 머무른 횟수
	private int outCount;
	
	// Animal 클래스 생성자 
	public Animal(int animalNumber) {
		this.animalNumber = animalNumber;
		switch (animalNumber) {
			case 1: // 사자
				this.animalName = "사자";
				this.detectCount = 1;
				this.animalRank = 1;
				this.habitat = "들";
				this.outCount = 0;
				break;
			case 2: // 독수리
				this.animalName = "독수리";
				this.detectCount = 1;
				this.animalRank = 2;
				this.habitat = "하늘";
				this.outCount = 0;
				break;
			case 3: // 하이에나
				this.animalName = "하이에나";
				this.detectCount = 1;
				this.animalRank = 3;
				this.habitat = "들";
				this.outCount = 0;
				break;
			case 4: // 카멜레온
				this.animalName = "카멜레온";
				this.detectCount = 1;
				this.animalRank = 4;
				this.habitat = "숲";
				this.outCount = 0;
				break;
			case 5: // 청둥오리
				this.animalName = "청둥오리";
				this.detectCount = 1;
				this.animalRank = 4;
				this.habitat = "하늘";
				this.outCount = 0;
				break;
			case 6: // 토끼
				this.animalName = "토끼";
				this.detectCount = 1;
				this.animalRank = 4;
				this.habitat = "숲";
				this.outCount = 0;
				break;
			case 7: // 사슴
				this.animalName = "사슴";
				this.detectCount = 1;
				this.animalRank = 4;
				this.habitat = "들";
				this.outCount = 0;
				break;
			case 8: // 쥐
				this.animalName = "쥐";
				this.detectCount = 2;
				this.animalRank = 4;
				this.habitat = "숲";
				this.outCount = 0;
				break;
			case 9: // 뱀
				this.animalName = "뱀";
				this.detectCount = 1;
				this.animalRank = 4;
				this.habitat = "숲";
				this.outCount = 0;
				break;									
			default:
				break;
		}
	}

	
	// Animal 클래스의 멤버변수 getter, setter
	public int getAnimalNumber() {
		return animalNumber;
	}


	public void setAnimalNumber(int animalNumber) {
		this.animalNumber = animalNumber;
	}


	public String getAnimalName() {
		return animalName;
	}


	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	public int getDetectCount() {
		return detectCount;
	}


	public void setDetectCount(int detectCount) {
		this.detectCount = detectCount;
	}


	public int getAnimalRank() {
		return animalRank;
	}


	public void setAnimalRank(int animalRank) {
		this.animalRank = animalRank;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public int getOutCount() {
		return outCount;
	}


	public void setOutCount(int outCount) {
		this.outCount = outCount;
	}
	
	
}
