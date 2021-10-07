import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        String[] vNames = {"dieDamage", "accMod", "attMod", "dieNum", "name", "desc", "specEffs", "conditions", "bonusStat", "attBonStat"};
        String[] vTypes = {"int", "int", "int", "int", "String", "String", "String", "String", "String", "String"};
        makeSets(vNames, vTypes);
        makeGets(vNames, vTypes);
    }
    private static boolean isPrime(int n)
    {
        for(int i = 0; i < primes.size(); i++)
        {
            if(primes.get(i) == n)
            {
                return true;
            }
        }
        return false;
    }
    private static ArrayList<Integer> ar = new ArrayList<Integer>();
    private static ArrayList<Integer> primes = new ArrayList<Integer>();
    private static ArrayList<Boolean> pr = new ArrayList<Boolean>();
    public static void sieveOfAristh(int limit) {
        boolean addTerm = true;
        for(int i = 2; i <= limit; i++) {
            addTerm = true;
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0) { addTerm = false; }
            }
            if(addTerm) { primes.add(i); }
        }
        for(int i = 2; i <= limit; i++)
        {
            ar.add(i);
        }
        /*for(int i = 0; i < primes.size(); i++){
            for(int j = 2; j < primes.get(i) ; j++)
            {
                System.out.println("DEBUG: J IS " + j + " AND PRIMES ARE " + primes.get(i));
                if(primes.get(i) % j == 0)
                {
                    primes.remove(i);
                    break;
                }
            }
        }*/
    }
    public static void makeGets(String[] varNames, String[] varType) {
        for(int i = 0; i < varNames.length; i++)
        {
            System.out.println("public " + varType[i] + " get" + capFirst(varNames[i]) + "() { return " + varNames[i] + "; }");
        }
    }
    public static void makeSets(String[] varNames, String[] varType){
        for(int i = 0; i < varNames.length; i++)
        {
            System.out.println("public void set" + capFirst(varNames[i]) + "(" + varType[i] + " n) { " + varNames[i] + " = n; }" );
        }
    }
    public static String capFirst(String n)
    {

        String capLett = n.substring(0, 1).toUpperCase();
        String rest = n.substring(1);
        return capLett + rest;

    }
}

