package project;
public class main {
    public static void main(String[] args) {
        String original = "Hello, world!";
         String reversa = reverseString(original);
         System.out.println(reversa);
     }
       
     public static String reverseString(String str) {
         char[] charArray = str.toCharArray();
         int left = 0;
         int right = charArray.length - 1;
         
         while (left < right) {
            
             char frase = charArray[left];
             charArray[left] = charArray[right];
             charArray[right] = frase;
             left++;
             right--;
         }
         return new String(charArray);
 }
}
