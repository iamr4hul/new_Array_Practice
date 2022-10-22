 class ArrayPractice {
     /*
     static void min(int[] arr) {
         int min = arr[0];
         for (int j : arr)
             if (min > j)
                 min = j;

         System.out.println(min);
     }

     public static void main(String[] args) {
         /*
     1st practice.   int[] a  = new int[4];
          we can also write as :
         int nextA[] = new int[5];
        int[] a = {3,5,6,6,7,7}; //Single line Declaration,instantiation,and initialization of java array
         a[0] = 10;
         a[1] = 20;
         a[2] = 21;

         for(int i =0; i<a.length;i++){
             System.out.println(a[i]);

             // we can also write for-each loop instead of for loop;
             for(int ab : a){
                 System.out.println(ab);
             }
         }

   ----------------------------------------------------------------------------
         // PASSING ARRAY TO A METHOD IN JAVA;

             int[] a ={33,10,4,5};//declaring and initializing an array
             min(a);//passing array to method
         }}



 -------------------------------Anonymous Array -----------------------------------------------------

         static void printArray(int[] arr) {
             for (int j : arr) {
                 System.out.println(j);

             }
         }
      public static void main(String[] args) {
         printArray(new int[]{10,22,44,66});



--------------------------------Returning Array from the Method------------------------------------
     static int[] get(){
         return new int[]{1,2,3,4};
     }
     public static void main(String[] args) {
      int[] arr = get();
      for (int i:arr)
          System.out.println(i);
     }


    //---------------------------------------------------------------------------------------------

     public static void main(String[] args) {
         //declaring a 2D array with odd columns
         int arr[][] = new int[3][];
         arr[0] = new int[3];
         arr[1] = new int[4];
         arr[2] = new int[2];
         //initializing a jagged array
         int count = 0;
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 arr[i][j] = count++;
             }
         }

         //printing the data of a jagged array
         for (int i =0; i<arr.length; i++) {
             for (int j=0; j<arr[i].length;j++) {
                 System.out.print(arr[i][j]+ " ");
             }
             System.out.println();//new line
         }
     }


      //-----------------------------------COPYING ARRAY------------------------------------------------

     public static void main(String[] args) {
         // SOURCE ARRAY DECLARATION
         char[] copyFrom = {'a','b','c','d','e','f','g'};
         // DECLARING DESTINATION ARRAY
         char[] copyTo = new char[5];
         // COPYING ARRAY USING SYSTEM.ARRAYCOPY() METHOD
         System.arraycopy(copyFrom,1,copyTo,0,5);
         System.out.println(String.valueOf(copyTo));
     }
   }
     */
//------------------------------CLONING ARRAY IN JAVA----------------------------------------------
     public static void main(String[] args) {
         int[] arr = {1,3,5,6,7,4,8,2};
         System.out.println("Printing original array");
         for(int i:arr)
             System.out.println(i);

         System.out.println("Printing Clone of the Array");
         int[] carr=arr.clone();
         for(int i: carr)
             System.out.println(i);
         System.out.println("are both equal");
         System.out.println(arr == carr);
     }
  }
