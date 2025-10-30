public class Runner {
    public static void main(String[] args){
        String i = "Dog";
        String b = "aplus";
        String c = "cato";
        int inty = 3;
        double avg1 = StringySpells.aveLen(i, b);
        System.out.println("aveLen of " + i + " and " + b + ": " + avg1);
        String avg2 = StringySpells.middleFinder(i);
        System.out.println("middleFinder of " +i + ": " + avg2);
        String avg67 = StringySpells.middleFinder(c);
        System.out.println("middleFinder of " +c + ": " + avg67);
        String  avg3 = StringySpells.alphaOmega(i,b);
        System.out.println("alphaOmega of " + i + " and " + b+ ": " + avg3);
        String avg4 = StringySpells.flipper(i,b);
        System.out.println("flipper of " + i + " and " + b+ ": " + avg4);
        String avg5 = StringySpells.subtractive(b,inty);
        System.out.println("subtractive of " + b + " and " + inty + ": " + avg5);
    }
}
