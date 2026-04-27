// Java program to reverse a string
class ReverseString {
    static void reverse(StringBuilder str, int start, int end) {
        if (start >= end) 
            return;
        char temp = str.charAt(start);
        str.setCharAt(start, str.charAt(end));
        str.setCharAt(end, temp);
        reverse(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Geeks for Geeks");
        reverse(str, 0, str.length() - 1);
        System.out.println(str);
    }
}
