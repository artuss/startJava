class MyFirstGame {
    
    public static void main(String[] args) {
        int riddleNum = 4;
        System.out.println("Компьютер загадал число - " + riddleNum);
        int playerNum = 4;
        while (true) {
            if (playerNum == riddleNum) {
                System.out.println("Вы победили!");
                break;
            } else if (playerNum < riddleNum) {
                System.out.println("Число " + playerNum + ", меньше того, что загадал компьютер");
                playerNum++;
            } else if (playerNum > riddleNum) {
                System.out.println("Число " + playerNum + ",больше того, что загадал компьютер");
                playerNum--;
            }
        }
    }
}