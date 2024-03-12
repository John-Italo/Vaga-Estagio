package questao5;
public class Questao5 {
    public static void main(String[] args) {
        String s = "John";
        String invertida = reverseString(s);
        System.out.println("String s: " + s);
        System.out.println("String invertida: " + invertida);
    }
    public static String reverseString(String str){
        char[] chars = str.toCharArray();
        int inicio = 0;
        int fim = chars.length - 1;
        
        while(inicio < fim){
            char temp = chars[inicio];
            chars[inicio] = chars[fim];
            chars[fim] = temp;
            inicio++;
            fim--;
        }
        return new String(chars);
    } 
    
}
