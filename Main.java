
    //skiping given letters from string
    public class Main {
        public static void main(String[] args) {

            skip("", "baccadahasar");

        }

        static void skip(String p, String up){
            if(up.isEmpty()){
                System.out.println(p);
                return;
            }

            char letter = up.charAt(0);

            if(letter =='a'){
                skip(p,up.substring(1));
            }else {
                skip(p + letter, up.substring(1));
            }
        }

    }

