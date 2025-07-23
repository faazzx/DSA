class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return gainHelper(s, 'a', 'b', x, y);
        } else {
            return gainHelper(s, 'b', 'a', y, x);
        }
    }

    private int gainHelper(String s, char first, char second, int firstVal, int secondVal) {
        StringBuilder remaining = new StringBuilder();
        int total = 0;
        
        // First pass: remove all (first + second) pairs (the higher gain pair)
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
                total += firstVal;
            } else {
                stack.push(c);
            }
        }

        // Now the stack has leftover characters in reverse
        // Build remaining string for second pass
        while (!stack.isEmpty()) {
            remaining.append(stack.removeLast());
        }

        // Second pass: remove all (second + first) pairs (lower gain)
        stack.clear();
        for (char c : remaining.toString().toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == second && c == first) {
                stack.pop();
                total += secondVal;
            } else {
                stack.push(c);
            }
        }

        return total;
    }
}
