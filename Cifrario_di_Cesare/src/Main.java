public class Main {
    public static String cifrario(String s){
        String rit = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = (int)c;
            if((65<=ascii && ascii<=90) || (97<=ascii && ascii<=122)){
                c = (char)(ascii==122||ascii==90? ascii-25:ascii+1);
            }
            rit+=c+"";
        }
        return rit;
    }

    public static String decifrario(String s){
        String rit = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = (int)c;
            if((65<=ascii && ascii<=90) || (97<=ascii && ascii<=122)){
                c = (char)(ascii==97||ascii==65? ascii+25:ascii-1);
            }
            rit+=c+"";
        }
        return rit;
    }

    public static void main(String[] args) {
        System.out.println(cifrario("abczZ ."));
        System.out.println(decifrario(cifrario("abczZ .")));
    }
}