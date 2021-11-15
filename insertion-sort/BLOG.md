## Tracing :

Sample Array: [8,4,23,42,16,15]

public static int[] sort(int[] arr){

        for (int i =1; i< arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]){
                arr[j+1]= arr[j];
                j = j-1;
            }
            arr[j+1] = current;
        }
        return arr;
    }

+ **Pass 1 :**

  j=0 , current = 1

  --> currrent = arr[i] = 8 ,  j= 4

  4 < 8 --> then move 8 after 4   -->     : 4,8,23,42,16,15

+ **Pass 2 :**

currrent = 23 , j = 8

8 < 23 -> then 23 will be after the 8 -->  : 4,8,23,42,16,15 

+ **Pass 3 :**

currrent = 42 , j = 23

23 < 42 -> then 42 will be after the 23 -->: 4,8,23,42,16,15 


+ **Pass 4 :**

currrent = 16 , j = 42

16 < 42 --> then 42 will be after the 16 
then comapre 16 with 23 then it will move 23 after then compare with 8 so 16 > 8 and it will be after the 8

 --> : 4,8,16,23,42,15 

+ **Pass 5 :**

currrent = 15 , j = 42

15 < 42 --> then 42 will be after the 15 then compare again 15 with 23 so the 23 will be after and agin with the 16 and the 16 will be after then with 8 so 15 > 8 so 15 will be after the 8     --->      : 4,8,15,16,23,42 