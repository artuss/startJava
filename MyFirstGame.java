class MyFirstGame {
    
    public static void main(String[] args) {
        int riddleNum = 1;
        System.out.println("Компьютер загадал число - " + riddleNum);
        int playerOneNum = 4;
        int playerTwoNum = 7;
        while (true) {
            if (playerOneNum == riddleNum) {
                System.out.println("Игрок 1 победил!");
                break;
            } else if (playerOneNum < riddleNum) {
                System.out.println("Число " + playerOneNum + "меньше того, что загадал компьютер");
                playerOneNum++;
            } else if (playerOneNum > riddleNum) {
                System.out.println("Число " + playerOneNum + ",больше того, что загадал компьютер");
                playerOneNum--;
            }
            if (playerTwoNum == riddleNum) {
                System.out.println("Игрок 2 победил!");
                break;
            } else if (playerTwoNum < riddleNum) {
                System.out.println("Число " + playerTwoNum + "меньше того, что загадал компьютер");
                playerTwoNum++;
            } else if (playerTwoNum > riddleNum) {
                System.out.println("Число " + playerTwoNum + ",больше того, что загадал компьютер");
                playerTwoNum--;
            }
        }
    }
}