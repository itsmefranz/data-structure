import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading N

        for (int i = 0; i < N; i++) {
            String parentheses = scanner.nextLine();
            if (isBalanced(parentheses)) {
                System.out.println("BALANCED");
            } else {
                System.out.println("NOT BALANCED");
            }
        }
    }

private static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char c : parentheses.toCharArray()) {
            if (c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == '}') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing parenthesis
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == '}' && top != '{')) {
                    return false; // Mismatched opening and closing parenthesis
                }
            }
        }

        return stack.isEmpty(); // Stack should be empty for balanced parentheses
        }
    }
