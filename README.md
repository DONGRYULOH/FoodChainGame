# FoodChainGame

### 프로젝트 기간(2022.05.05 ~ 2022.07.31)

### 작업일정
- 1주차(2022.05.05 ~ 2022.05.08) : 패키지 구조 설계, 스토리 보드(화면 UI)
- 2주차(2022.05.09 ~ 2022.05.15) : 메인화면 UI 구현(스윙사용) 방만들기, 방참가하기 기능 구현 

### 게임 프로세스 
1.먹이사슬 게임을 플레이하기 위해 메인화면에 접속한다. 
- 1.1. 게임방 만들기(방제, 닉네임 입력) 
- 1.2. 만들어진 게임방에 참가(닉네임 입력)

1.9명의 플레이어가 모두 참가했을 경우 방장은 게임시작 버튼을 누른다. 
- 1.1. 게임방에 입장한 순서대로 동물번호를 랜덤으로 부여한다.(방장은 1순위로 부여) 

2.첫번째 턴이 시작되기 전에 카멜레온을 뽑은 플레이어는 동물중 하나를 선택해서 위장(상대 플레이어가 엿볼시 위장한 동물로 보임) 

3.메인광장(메인룸)에서 각 장소(서브룸)로 이동하기 전에 1분동안 9명의 플레이어는 대화 가능, 엿보기 사용 가능(쥐의 경우 2번 가능)

4.30초 동안 가고싶은 장소를 선택해서 이동 
- 메인룸의 채팅방은 중단 
- 각 동물마다 가지 못하는 장소와 갈 수 있는 장소가 구분
- 2턴 연속으로 자신의 주거주지가 아닌 장소에 머무를수 없음(1라운드에 주거주지가 아닌 곳에 있었으면 2라운드에서는 주거주지로 가야됨)

5.1분동안 각 장소에 있는 플레이어끼리 공격하거나 대화 
- 공격횟수는 제한없음 
- 공격을 하지 않고 턴종료 가능 
- A플레이어가 B플레이어를 공격했을때 사망하면 "A플레이어가 B플레이어를 공격했습니다... B플레이어 사망" 라는 문구가 해당 장소의 채팅방에만 표시된다.

6.턴이 종료되면 생존조건을 충족하지 못하는 플레이어는 사망 
ex) 사자는 한턴만 굶어도 사망

7.마지막 턴이 종료되면 모든 플레이어들의 승리조건을 확인하고 게임종료

### 스토리 보드 
https://ovenapp.io/project/MyLznZ4mKSLqTqspD3tRMY3quCc7LNRB#kSdEA
