public class ArraysStringsPractice {

    public static void main(String[] args){
        boolean x = isUnique("string");
        System.out.println(" the string is unique?" +x);
    }
    public static boolean isUnique(String str){
        boolean[] charSet = new boolean[256];
        for(int i = 0; i < str.length();i++){
            int val = str.charAt(i);
            if(charSet[val]) return false;
            charSet[val] = true;
        }
        return true;
    }
}

