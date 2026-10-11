

class Solution {
    boolean isMatch(char open, char close) {
        switch (open) {
            case '(':
                return close == ')';

            case '[':
                return close == ']';

            case '{':
                return close == '}';

            default:
                return false;
        }
    }

    boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOpen(c)) {
                stk.push(c);

            } else {
                if (stk.isEmpty()) {
                    return false;
                }

                if (isMatch(stk.peek(), c)) {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }
}