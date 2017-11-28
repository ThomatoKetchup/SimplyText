import java.util.Scanner;

public class IMC {

    static Scanner sc = new Scanner(System.in);
    static String taille; 
    static String poids; 
    static boolean valide;
    static Double p=0.0; 
    static Double t=0.0;
    
        public static boolean estValideDouble(String str) {
                try {
                        str = str.replaceAll(",", "."); 
                        Double.parseDouble(str);
                } catch (Exception e) {
                    return false;
                }
                return true;        
        }
    
        public static double saisiPoids() {
        	do{
                    System.out.println("Quel est votre poids ?");
                    poids = sc.nextLine();  //pour récupérer n'importe quel type

                    valide = estValideDouble(poids); 

                    if(valide){
                        poids = poids.replaceAll(",", "."); 
                        p = Double.parseDouble(poids);
                        if(p < 30){
                            System.out.println("Erreur: Poids trop faible");
                            valide = false;
                        }
                        if(p > 129){
                            System.out.println("Erreur: Poids trop important");
                            valide = false;
                        }
                    }else
                            System.out.println("Erreur: Le poids doit être un chiffre");              

                }while(valide == false);
        	return p;
        }
        
    public static void main(String[] args) {
        
        p = saisiPoids();
        
        do{
            System.out.println("Quelle est votre taille ?");
            taille = sc.nextLine(); 

            valide = estValideDouble(taille); 

            if(valide){
                taille = taille.replaceAll(",", "."); 

                t = Double.parseDouble(taille); 

                if (t > 100)
                        t = t/100;

                if(t<0.3){
                    System.out.println("Erreur: Taille trop petite.");
                    valide = false;
                }
                if( t>2.10) {
                    System.out.println("Erreur: Taille trop grande");
                    valide = false;
                }

            }else
                    System.out.println("Erreur: La taille doit être un chiffre");
        }while(valide == false); 
        
        
        double imc = p / (t*t); 
        
        System.out.println("IMC vaut: "+imc);
    }
    
}
