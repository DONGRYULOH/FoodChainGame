package player;

import animal.Animal;
import animal.Chameleon;
import animal.Deer;
import animal.Duck;
import animal.Eagle;
import animal.Hyena;
import animal.Lion;
import animal.Rabbit;
import animal.Rat;
import animal.Snake;
import gameRoom.MainRoom;
import gameRoom.SubRoom;

public class Player {

	// 플레이어 닉네임 
	private String nickName;
	
	// 플레이어가 속한 메인룸 
	private MainRoom mainRoom;
	
	// 플레이어가 속한 서브룸(강, 하늘, 숲, 들)  
	private SubRoom subRoom;
	
	// 플레이어가 가지고 있는 동물정보 
	private Animal animalInfo;
			
	// 닉네임 정보로 플레이어 생성 
	public Player(String nickName) {
		this.nickName = nickName;
	}
	
	// 플레이어 동물지정 
	public void setPlayerAnimal(int number) {		
		switch (number) {
			case 1: // 사자
				animalInfo = new Lion(number);
				break;
			case 2: // 독수리
				animalInfo = new Eagle(number);
				break;
			case 3: // 하이에나
				animalInfo = new Hyena(number);
				break;
			case 4: // 카멜레온
				animalInfo = new Chameleon(number);
				break;
			case 5: // 청둥오리
				animalInfo = new Duck(number);
				break;
			case 6: // 토끼
				animalInfo = new Rabbit(number);
				break;
			case 7: // 사슴
				animalInfo = new Deer(number);
				break;
			case 8: // 쥐
				animalInfo = new Rat(number);
				break;
			case 9: // 뱀
				animalInfo = new Snake(number);
				break;									
			default:
				break;
		}
	}
	
	// 멤버변수 getter, setter 
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public MainRoom getMainRoom() {
		return mainRoom;
	}

	public void setMainRoom(MainRoom mainRoom) {
		this.mainRoom = mainRoom;
	}

	public SubRoom getSubRoom() {
		return subRoom;
	}

	public void setSubRoom(SubRoom subRoom) {
		this.subRoom = subRoom;
	}

	public Animal getAnimalInfo() {
		return animalInfo;
	}

	public void setAnimalInfo(Animal animalInfo) {
		this.animalInfo = animalInfo;
	}

	
	
}
