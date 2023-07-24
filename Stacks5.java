import java.util.Stack;

/**
 * Stacks5
 */
public class Stacks5 {

    public static int postfix(String s){

        Stack<Integer> stack = new Stack<>();
        //entering integers
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                stack.push(Integer.parseInt(String.valueOf(c)));
            }else{
                int a = stack.pop();
                int b = stack.pop();

                switch(c){
                    case '+':
                        stack.push(b+a);
                        break;
                    case '-':
                        stack.push(b-a);
                        break;
                    case '*':
                        stack.push(b*a);
                        break;
                    case '/':
                        stack.push(b/a);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        //Evaluation of Postfix Expression using Stack
        System.out.println(postfix("231*+9-"));
    }
}