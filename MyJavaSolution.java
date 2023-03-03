class Solution {
    public int strStr(String haystack, String needle) {
        int y = 0;
        if(!haystack.contains(needle) || needle.length()>haystack.length()){
            return -1;
        }

        else{
            char c1;
            char c2;
            int x = 0;
            for(int i=0; i<needle.length(); i++){
                c1 = haystack.charAt(i);
                c2 = needle.charAt(i);
                if (c1==c2) {
                    y=i;
                    x++;
                }

            }
            if(x==needle.length()){
                y=needle.length()-1-y;

            }
        }
        return y;
    }
}
