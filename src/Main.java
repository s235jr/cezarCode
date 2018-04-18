public class Main {

    public static void main(String[] args) {

        String codeOryginal = "ala ma kota";
        int slide = 2;
        String codAfterSlide = "";
        String codeAfterDecode = "";

        for (int i = 0; i < codeOryginal.length(); i++) {
            int charAfterSlide = codeOryginal.charAt(i) + slide;
            if (charAfterSlide > 122) {
                charAfterSlide = charAfterSlide - 26;
            }
            codAfterSlide = codAfterSlide + (char) charAfterSlide;
        }
        for (int i = 0; i < codAfterSlide.length(); i++) {
            int charAfterSlide = codAfterSlide.charAt(i) - slide;
            if (charAfterSlide < 97 && charAfterSlide != 32) {
                charAfterSlide = charAfterSlide + 26;
            }
            codeAfterDecode = codeAfterDecode + (char) charAfterSlide;
        }
        System.out.println(codeOryginal);
        System.out.println(codAfterSlide);
        System.out.println(codeAfterDecode);
    }
}
