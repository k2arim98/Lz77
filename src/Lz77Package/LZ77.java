package Lz77Package;
import java.util.ArrayList;
import java.util.Scanner;




public class LZ77 {

    public static void main(String[] args) {
       
        ArrayList<Integer> positions = new ArrayList<Integer>();
        ArrayList<Integer> listOfLength = new ArrayList<Integer>();
        ArrayList<Character> listNextSymbol = new ArrayList<Character>();
        String word;
        String abc="";

        int searchSize;
        int lookSize;
        word = "STSTREAMTRSTMSTREAMSTR";
        searchSize = 8;
        lookSize = word.length();
        int wordSize = word.length();
         String search, look;
        for (int i = 0; i < wordSize; i++) {// ( i ) l'itérateur s'arrête toujours au début du tampon d'anticipation
           
            if (i <=searchSize) search = word.substring(0, i);

            else search = word.substring(i - searchSize, i);//la taille de recherche de i-searchSize à i

            if (wordSize - i < lookSize+1)
                look = word.substring(i, wordSize);//quand le regard sur le côté droit du texte

            else look = word.substring(i, i + lookSize+1);//lorsque le regard sur le côté gauche ou au milieu du texte

            int position = 0;
            int count=0;
           
            for (int index = 1; index <= look.length(); index++) {//index 1 et <= car le dernier index de la sous-chaîne n'est pas inclus
                int lastIndexOf = search.lastIndexOf(look.substring(0, index));
                                                    	       


                if (lastIndexOf == -1 || index == look.length()) {
                        System.out.print("Gauche: "+"'"+search+"'");
                         System.out.print("  Droite: "+"'"+look+"'");
                         System.out.print("\n");
                	            

                    positions.add(position);
                    //la longueur du symbole que nous trouvons 
                    listOfLength.add(index - 1);
                    abc+=look.charAt(index-1);


                    i += index - 1;
                    break;
                } else {
                    int indexOfSymbol = lastIndexOf;//index du symbole dans la recherche
                    position = (search.length() - indexOfSymbol)-1;
//la longueur entre le look et le symbole
                }

            }
        }
         System.out.print("Code: \n");
        for (int tag = 0; tag < positions.size(); tag++) {
            int position = positions.get(tag);
            int length = listOfLength.get(tag);
           			if (tag ==  positions.size()-1){
                                           
                                                System.out.println("<" + (position) + " , " + (length+1) + " , " + "'' " + ">");
                                }
                                else{        
                                               System.out.println("<" + (position) + " , " + length + " , " + abc.charAt(tag) + ">");
                                }
            
        }
    }
}
 