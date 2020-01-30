package com.epam.izh.rd.online.service;



public class SimpleMathService implements MathService {

    /**
     * Метод возвращает 0, если value1 = value2.
     * Метод возвращает -1, если value1 < value2.
     * Метод возвращает 1, если value1 > value2.
     * <p>
     * Например для (-1, -1) метод должен вернуть 0;
     * Например для (-3, -1) метод должен вернуть -1;
     * Например для (3, 1) метод должен вернуть 1;
     */
    @Override
    public int compare(int value1, int value2) {
        if (value1 > value2) {
            return 1;
        } else if (value1 < value2) {
            return -1;
        } else {
            return 0;

        }


    }

    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override
    public int maxFrom(int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else if (value1 < value2) {
            return value2;
        } else {

            return -1;
        }
    }

    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int max = 0;
        for (int i = 1; i < values.length; i++) {
            max = values[i];

            if (values[i] > values[i - i]) {
                max = values[i];
            } else if (values[i] < values[i - 1]) {
                max = values[i - 1];
            } else {
                max = values[i];
            }
        }
        return max;
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {

        int sumDigitArray = 0;

        for (int i = 0; i < values.length; i++) {

            sumDigitArray += values[i];

        }
        return sumDigitArray;
    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int inbexOfEvenNumberArray = 0;
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                count++;
            }
        }
        int[] evenNumberArray = new int[count];
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenNumberArray[inbexOfEvenNumberArray] = values[i];
                inbexOfEvenNumberArray++;
            }
        }

        return evenNumberArray;
    }

    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        long rezault = 1L;
        for (int i = 1; i <= initialVal; i++) {
            rezault = rezault * i;

        }

        return rezault;
    }

    /**
     * Метод возвращает число, которе находится на заданной позиции (счет начинается с нуля) в ряду фибоначчи.
     * <p>
     * Ряд фибоначчи - ряд, следующие элементы которого состоят из суммы двух предыдущих.
     * Ряд начинается 0 и 1.
     * Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
     * <p>
     * Для числа 9 метод должен вернуть 34
     * Для числа 0 метод должен вернуть 0
     */
    @Override
    public long calcFibonacci(int number) {

        long[] arr = new long[number +1];
          if( number == 0 ) return number;
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i <= number; i++){
                arr[i] = arr[i -1] + arr[i-2];
            }


        return arr[number];
    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        for(int i = values.length-1; i>0;i--){
            for(int j =0; j<i;j++){

                if(values[j]> values[j+1]){
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                }
            }
        }


        return values;

    }

    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     * <p>
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
            boolean primeNumber = false;
            if(number == 2) return primeNumber = true;
        for (int i = 2; i< number; i++){
           if(number %i ==0){
                 return    primeNumber = false;

                }else {primeNumber = true;}
            }
        return primeNumber;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     * <p>
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        int count = 0;
        for(int i = 0; i< values.length; i++){
            count++;
        }

        int[] array = new int[count];
        for (int i =0; i< count; i++){
         array[i] = values[count-i -1];
        }

        return array;
    }
}
