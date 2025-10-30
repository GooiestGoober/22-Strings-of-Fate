

public class StringySpells {

    public static String middleFinder(String i){
        int len1 = i.length();
        int mid1 = len1 / 2;
        return i.substring(mid1,mid1+1);

    }

    public static String alphaOmega(String a, String b){
        String alpha = a.substring(0,1);
        int len1 = b.length();
        String Omega = b.substring(len1-1,len1);
        return alpha+Omega;
    }

    public static String subtractive(String a, int b){

        return a.substring(0,b) + a.substring(b+1);
    }

    public static String flipper(String i, String b){
        String dos = b.substring(0,1);
        String unos = i.substring(1);
        return dos+unos;
    }

    public static double aveLen(String i, String d){
        double len1 = i.length();
        double len2 = d.length();
        return (len1 + len2)/2;

    }


}