import java.util.Stack;

class Solution {
    public String smallestSubsequence(String s,int k,char letter,int r) {
        int remainingLetters=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==letter)
                remainingLetters++;

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            while(!stack.isEmpty()
                    && stack.peek()>ch
                    && (s.length()-i+stack.size()>k)
                    && (stack.peek()!=letter || remainingLetters>r)){
                if(stack.pop()==letter)
                    r++;
            }

            if(stack.size()<k){
                if(ch==letter){
                    stack.push(ch);
                    r--;
                } else if(k-stack.size()>r){
                    stack.push(ch);
                }
            }

            if(ch==letter)
                remainingLetters--;
        }

        StringBuilder sb=new StringBuilder(stack.size());
        for(Character ch:stack)
            sb.append(ch);

        return sb.toString();
    }
}
