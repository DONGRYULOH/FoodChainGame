package gameRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
 	설명)
 	- 게임방을 생성하고 삭제한다. 방을 관리하는 역할을 담당 
 	
 */
public class RoomManager {

	private static List roomList = new ArrayList(); // 만들어진 모든 방의 리스트
    private static AtomicInteger atomicInteger = new AtomicInteger(); // 방번호 채번 
    
    
    /**
     * Desc : 방을 생성
     * @param nickName(방장), roomTitle(방제목)
     * @return MainRoom
     */
    public static MainRoom createRoom(String nickName, String roomTitle) { 
        int roomId = atomicInteger.incrementAndGet();// 방번호 채번
        
        // 방을 만들고 방을관리하는 리스트에 담기 
        MainRoom room = new MainRoom(nickName,roomTitle,roomId);        
        roomList.add(room);
        
        System.out.println("게임방 생성 완료! ");
        return room;
    }

}
