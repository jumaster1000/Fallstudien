package Vorlesung1;

public class MaxFinder {
    void main(){
        int maximum = max(3,5,2,8,1);
        System.out.println("Das Maximum ist: " + maximum);
    }

    public static int max(int... numbers){
        int max = numbers[0];
        for (int number : numbers){
            if(number > max){
                max = number;
            }
        }
        return max;
    }

}
