package TEATIME;
public class print_1_to_100 {
    public static void main(String args[]) {
    System.out.println("\nDivided by 3: ");		
    for (int i=1; i<100; i++) {
        if (i%3==0) 
        System.out.print(i +", ");			
    }			
            
    System.out.println("\n\nDivided by 5: ");
    for (int i=1; i<100; i++) {
        if (i%5==0) System.out.print(i +", ");			
    }
            
    System.out.println("\n\nDivided by 3 & 5: ");			
    for (int i=1; i<100; i++) {
        if (i%3==0 && i%5==0) System.out.print(i +", ");			
    }
    System.out.println("\n");
}
}
