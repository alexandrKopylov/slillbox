public class T_2_11_2_PR {
    public static void main(String[] args) {
        int vasyaAge = 30;
        int katyaAge = 30;
        int mishaAge = 30;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст
        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
            if (katyaAge >= mishaAge) {
                middle = katyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = katyaAge;
            }

        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
            if (vasyaAge >= mishaAge) {
                middle = vasyaAge;
                min = mishaAge;
            } else {
                middle = mishaAge;
                min = vasyaAge;
            }
        } else {
            max = mishaAge;
            if (vasyaAge >= katyaAge) {
                middle = vasyaAge;
                min = katyaAge;
            } else {
                middle = katyaAge;
                min = vasyaAge;
            }
        }


        System.out.println(" Minimal age: " + min);
        System.out.println(" Middle age: " + middle);
        System.out.println(" Maximal age: " + max);


    }
}
