package Week-3;

public class RevealCardsInIncreasingOrder {
        Arrays.sort(deck);
        int n=deck.length;
        int[] ans=new int[n];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.offer(i);
        }
        int index=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            ans[curr]=deck[index++];
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return ans;
    }
}
