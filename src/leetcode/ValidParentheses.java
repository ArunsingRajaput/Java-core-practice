package leetcode;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == '(' ) {
                parentheses.push(ch);
            } else if (ch == '[') {
                parentheses.push(ch);
            } else if (ch == '{') {
                parentheses.push(ch);
            } else {
                if (parentheses.empty()) {
                    return false;
                } else {
                    if (ch == ']') {
                        if(parentheses.peek() == '[') {
                            parentheses.pop();
                        }
                    } else if (ch == ')'){
                        if(parentheses.peek() == '(') {
                            parentheses.pop();
                        }
                    } else if (ch == '}'){
                        if(parentheses.peek() == '{') {
                            parentheses.pop();
                        }
                    } else {
                        return false;
                    }
                }
            }
        }

        if(parentheses.empty()){
            return true;
        }

        return false;
    }
    public static void main(String[] args){
        String s ="({{[](){[]}}()})";
        ValidParentheses vp = new ValidParentheses();
        boolean ans = vp.isValid(s);
        System.out.println(ans);
    }
}
