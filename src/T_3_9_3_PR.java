public class T_3_9_3_PR {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int currentVolume = 0;
        int time = 0;
        while (true) {
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            time++;
            if (currentVolume == volume) {
                break;
            }
        }
        System.out.println("Время = " + time);


    }
}
