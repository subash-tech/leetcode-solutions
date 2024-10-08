class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);
        
        int n=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i+1<s.length() && hash.get(s.charAt(i+1))>hash.get(c)){
                n+=hash.get(s.charAt(i+1))-hash.get(c);
                i+=1;
            }
            else n+=hash.get(c);
        }
        
        return n;        
    }
}