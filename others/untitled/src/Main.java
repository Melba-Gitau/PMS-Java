import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       Main main=new Main();
       main.romanToInt("MCMX");

    }
    public int romanToInt(String s) {
        Map map=new HashMap<String,Double>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        if(s.length()>=1){
         String thousand="";
         String hundred="";
         String tens="";
         String ones="";
            char []  romans=s.toCharArray();
            if(s.contains("M")){


                for (int i=0; i<romans.length;i++) {
                    if(romans[i]!='M'){
                        break;
                    }
                    else{
                        thousand+=romans[i];
                    }
                }


            }

            if(s.contains("CM")){
                for (int i=thousand.length();i<romans.length;i++){
                    if(romans[i]=='M'){
                        hundred+=romans[i];
                        break;
                    }
                    else{
                        hundred+=romans[i];
                    }
                }
            }
            System.out.print("thousands="+thousand);
            System.out.print("hundreds="+hundred);
        }



    return 0;
    }
}