package ru.itis;

public class Sum {
    public static int[] toArr(String num) {
        char[] numasCharArr = num.toCharArray();
        int[] numasIntArr = new int[numasCharArr.length];
        for (int i = 0; i < numasIntArr.length; i++) {
            numasIntArr[i] = numasCharArr[i] - '0';
        }
        for (int i = 0; i < numasIntArr.length / 2; i++) {
            int temp = numasIntArr[i];
            numasIntArr[i] = numasIntArr[numasIntArr.length - i - 1];
            numasIntArr[numasIntArr.length - i - 1] = temp;
        }
        return numasIntArr;
    }

    public static void SumOfDigit(int[] firstArray, int[] secondArray) {
        int length;
        int sum;
        int min;
        if (firstArray.length > secondArray.length) {
            length = firstArray.length + 1;
            min = secondArray.length;
        } else {
            length = secondArray.length + 1;
            min = firstArray.length;
        }
        int[] resultArray = new int[length];
        for (int i = 0; i < resultArray.length - 1; i++) {
            if (i < min) {
                sum = firstArray[i] + secondArray[i];
            } else if (firstArray.length > secondArray.length) {
                sum = firstArray[i];
            } else {
                sum = secondArray[i];
            }
            if (sum >= 10) {
                resultArray[i] += sum % 10;
                resultArray[i + 1] += sum / 10;
            } else {
                resultArray[i] += sum;
            }
        }


        for (int i = 0; i < resultArray.length / 2; i++) {
            int temp = resultArray[i];
            resultArray[i] = resultArray[resultArray.length - i - 1];
            resultArray[resultArray.length - i - 1] = temp;
        }

        System.out.println(" ");
        System.out.println("Cумма: ");
        if (resultArray[0] == 0) {
            for (int i = 0; i < resultArray.length - 1; i++) {
                resultArray[i] = resultArray[i + 1];
                System.out.print(resultArray[i]);
            }
        } else {
            for (int i = 0; i < resultArray.length; i++) {
                System.out.print(resultArray[i]);
            }
        }
    }
}
