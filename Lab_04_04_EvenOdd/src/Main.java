public class Main {
    public static void main(String[] args) {
        int numToExamine = 3;
        int mod = numToExamine % 2;
        String value = "Undetermined";
        if (mod == 0)
            value = "Even.";
        else
            value = "Odd.";
        System.out.println(numToExamine + " modulus 2 is " + mod + " so the number is " + value);
    }
}