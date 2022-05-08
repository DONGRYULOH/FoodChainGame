package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import etc.RandomNumber;
import gameRoom.MainRoom;
import gameRoom.RoomManager;
import player.Player;

public class Main {

	public static void main(String[] args) {
		
		// 1.닉네임과 방제목을 입력해서 게임방을 만든다.    			
		Scanner sc = new Scanner(System.in);
		String nickName = sc.next();  
		String roomTitle = sc.next();

		RoomManager roomManager = new RoomManager(); // 게임방을 관리하는 객체 
		MainRoom mainRoom = roomManager.createRoom(nickName, roomTitle); // 닉네임과 방제목을 입력받아서 게임방을 생성한다.
						
		// 2.기존에 만들어진 방에 닉네임을 입력후 참가한다. (TODO:참가할 방을 클릭후 참가하는 것으로 구현 Swing UI 사용) 
		for(int i=0;i<8;i++) {
			System.out.println("게임에서 사용할 닉네임을 입력하세요:");
			nickName = sc.next();
			mainRoom.enterPlayer(nickName);
			System.out.println("현재방의 참가인원(" + mainRoom.getUserList().size() + "/9)");			
		}					

		// 3.플레이어가 모두 참여하고 방장이 게임시작 버튼을 누르면 게임이 시작된다. 
		ArrayList<Player> playerList = new ArrayList<Player>();
		RandomNumber random = new RandomNumber();
		
		// 3.1 첫번째 플레이어인 방장부터 랜덤하게 동물을 부여하고 게임방에 입장한 순서대로 플레이어한테 동물번호를 부여 
		for(int i=0;i<mainRoom.getUserList().size();i++) {								
			Player player = mainRoom.getUserList().get(i);	
			player.setPlayerAnimal(random.getRandomNumber(i)); // 랜덤으로 동물번호 뽑기			
			playerList.add(i, player); 
		}
		// 3.2 모든 플레이어의 동물뽑기가 끝나면 게임방에 플레이어 동물정보 추가  
		mainRoom.setUserList(playerList);
		
		// 9명의 플레이어 동물정보 확인
		List<Player> p = mainRoom.getUserList();			
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i).getNickName() + "플레이어의 동물이름: " + p.get(i).getAnimalInfo().getAnimalName());						
		}
		
	}

}
