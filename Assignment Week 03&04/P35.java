public class P35 {
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { 
                result.append((char) (ch - 32)); 
            } else if (ch >= 'A' && ch <= 'Z') { 
                result.append((char) (ch + 32)); 
            } else { 
                result.append(ch); 
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello Java 123!";
        String output = toggleCase(input);
        System.out.println("Toggled Case: " + output);
    }
    
}
