public class Plasticfactory {
        private String checkFlamable(Integer factor) {
                switch (factor){
                         case (0): return "Low";
                         case (1): return "Mid";
                         case (2): return "High" ;
                        default: return null;
        }}
        public static void main(String[] args) {
                Plasticfactory p = new Plasticfactory();

                System.out.println(p.checkFlamable(2));
                System.out.println(p.checkFlamable(3) );
                //System.out.println(p.checkFlamable (null) );
        }
}