package intro.assignment6;

class VampireNumber {
    Boolean Flag = false;
    public int[] breakNumber(int number) {
        int remainder= 0;
        int index=0;
        int length = (int) (Math.log10(number) + 1);
        int array[] = new int[length];
        while (number != 0) {
            remainder = number % 10;
            array[index] = remainder;
            number = number / 10;
            index++;
        }
        return array;
    }

    Boolean checkVampireNumber(int[] arr, int number) {
        int firstPart = 0;
        int secondPart = 0;
        for (int i = 0; i < (arr.length) / 2; i++) {
            firstPart += arr[i] * Math.pow(10, (arr.length) / 2 - i - 1);
        }
        for (int i = (arr.length) / 2; i < arr.length; i++) {
            secondPart += arr[i] * Math.pow(10, (arr.length - i - 1));
        }
        if (firstPart * secondPart == number) {
            return true;
        }
        return false;
    }

    void permutaionFinder(int[] arr, int index, int number) {
        if (index >= arr.length - 1) {
            if (this.checkVampireNumber(arr, number)) {
                Flag = true;
            }
        }
        for (int i = index; i < arr.length; i++) {
            int t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
            permutaionFinder(arr, index + 1, number);
            t = arr[index];
            arr[index] = arr[i];
            arr[i] = t;
        }
    }
};


public class TaskOne {
    public static void main(String[] args) {
        VampireNumber v=new VampireNumber();
        int inputNumber =1000;
        int count=1;
        while (count<=100){
            if(((int)(Math.log10(inputNumber)+1))%2==0){
                int[] arr=v.breakNumber(inputNumber);
                v.permutaionFinder(arr,0,inputNumber);
                if(v.Flag){
                    System.out.println(inputNumber);
                    count++;
                    v.Flag=false;
                }
            }
            inputNumber++;
        }
    }
}
