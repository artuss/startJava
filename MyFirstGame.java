class MyFirstGame {
    
    public static void main(String[] args) {
        int hiddenNum = 7;
        System.out.println("Компьютер загадал число - " + hiddenNum);
        int playerNum = 4;
        while (playerNum != hiddenNum) {
            if (playerNum < hiddenNum) {
                System.out.println("Число " + playerNum + ", меньше того, что загадал компьютер");
                playerNum++;
            } else if (playerNum > hiddenNum) {
                System.out.println("Число " + playerNum + ",больше того, что загадал компьютер");
                playerNum--;
            }
        }
        System.out.println("Вы победили!");
    }
}