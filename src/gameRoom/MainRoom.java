package gameRoom;

import java.util.ArrayList;
import java.util.List;

import player.Player;

/*
	설명)
	메인룸에는 여러개의 서브룸(하늘, 강, 숲, 들)이 포함된다.  
	
*/
public class MainRoom {
	
	private int roomId; // 룸 ID	
    private List<Player> userList; // 메인룸에 있는 유저정보 
    private String roomOwner; // 방장
    private String roomTitle; // 방제목
    
    // 방을 만들때 
    public MainRoom(String nickName,String roomTitle,int roomId) {
    	// 방장객체 만들고 유저정보리스트를 만든다음 방장을 넣어줌 
    	Player master = new Player(nickName);     	
    	userList = new ArrayList<Player>();
    	userList.add(master);    	    	
    	
    	// 게임방의 방장, 제목, 방번호 설정 
    	this.roomOwner = nickName;
    	this.roomTitle = roomTitle;
    	this.roomId = roomId;
	}
    
    // 플레이어가 방에 참가할때 
    public void enterPlayer(String nickName) {
    	Player player = new Player(nickName);
        userList.add(player);
    }

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public List<Player> getUserList() {
		return userList;
	}

	public void setUserList(List<Player> userList) {
		this.userList = userList;
	}

	public String getRoomOwner() {
		return roomOwner;
	}

	public void setRoomOwner(String roomOwner) {
		this.roomOwner = roomOwner;
	}

	public String getRoomTitle() {
		return roomTitle;
	}

	public void setRoomTitle(String roomTitle) {
		this.roomTitle = roomTitle;
	}
    
    
    
    
    
    
}
