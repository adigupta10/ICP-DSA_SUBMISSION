import java.util.Stack;

public class SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length,mod=1000000007;
        Stack<Integer> stack=new Stack<>();
        int[] leftCount=new int[n];
        int[] rightCount=new int[n];

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
                stack.pop();
            if(stack.isEmpty())
                leftCount[i]=i+1;
            else
                leftCount[i]=i-stack.peek();
            stack.push(i);
        }

        stack.clear();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                stack.pop();
            if(stack.isEmpty())
                rightCount[i]=n-i;
            else
                rightCount[i]=stack.peek()-i;
            stack.push(i);
        }

        long sum=0;
        for(int i=0;i<n;i++){
            sum+=(long)arr[i]*leftCount[i]*rightCount[i];
            sum%=mod;
        }
        return (int)sum;
    }
}
