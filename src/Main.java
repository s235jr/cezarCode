public class Main {

    public static void main(String[] args) {

        String codeOryginal = "ala ma kota";
        int slide = 2;
        String codAfterSlide = "";
        String codeAfterDecode = "";

        for (int i = 0; i < codeOryginal.length(); i++) {
            int charAfterSlide = codeOryginal.charAt(i) + slide;
            if (charAfterSlide > 'z') {
                charAfterSlide = charAfterSlide - ('z' -'a');
            }
            codAfterSlide = codAfterSlide + (char) charAfterSlide;
        }
        for (int i = 0; i < codAfterSlide.length(); i++) {
            int charAfterSlide = codAfterSlide.charAt(i) - slide;
            if (charAfterSlide < 'a' && charAfterSlide != ' ') {
                charAfterSlide = charAfterSlide + ('z' -'a');
            }
            codeAfterDecode = codeAfterDecode + (char) charAfterSlide;
        }
        System.out.println(codeOryginal);
        System.out.println(codAfterSlide);
        System.out.println(codeAfterDecode);
    }
}
