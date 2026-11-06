class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        for(int i = 0;  i < operations.length; i++){

            if(operations[i].equals("+")){
                int x = stack.pop();
                int newTop = x + stack.peek();
                stack.push(x);
                stack.push(newTop);
                
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                int x = stack.peek();
                stack.push(stack.peek()*2);
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        for(Integer i : stack){
            score += i;
        }
        
        return score;
    }
}