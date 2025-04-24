Q. Evaluate Reverse Polish Notation

A.



class Solution {
    public int evalRPN(String[] tokens) {   ///  ["2","1","+","3","*"]

    Stack<Integer> stack = new Stack<>();

    for(String token : tokens){
        if(isOperator(token)){
            int b = stack.pop();
            int a = stack.pop();
            int res = applyOperator(token , a,b);
            stack.push(res);
        }
        else{
            stack.push(Integer.parseInt(token));
        }
    }

    return stack.pop();
        
    }



    private boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int applyOperator(String o , int a , int b){

        switch(o){
            case "+" : return a+b ;
             case "-" : return a-b ;
              case "*" : return a*b ;
               case "/" : return a/b ;
               default : throw new IllegalArgumentException("Invalid operator");
        }
    }


}
