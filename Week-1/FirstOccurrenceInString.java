class Solution {
    public int strStr(String h,String n) {
        int hLen=h.length(),nLen=n.length();
        for(int i=0;i<=hLen-nLen;i++){
            int j=0;
            while(j<nLen && h.charAt(i+j)==n.charAt(j))
                j++;
            if(j==nLen)
                return i;
        }
        return -1;
    }
}
