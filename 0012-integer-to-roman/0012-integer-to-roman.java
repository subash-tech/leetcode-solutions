class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> hash=new HashMap<>();
        hash.put(1,"I");
        hash.put(4,"IV");
        hash.put(5,"V");
        hash.put(9,"IX");
        hash.put(10,"X");
        hash.put(40,"XL");
        hash.put(50,"L");
        hash.put(90,"XC");
        hash.put(100,"C");
        hash.put(400,"CD");
        hash.put(500,"D");
        hash.put(900,"CM");
        hash.put(1000,"M");
       
        int val[]= new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String res="";
        for(int i=0;i<val.length;i++){
            if(num>=val[i]){
            int q=num/val[i];
            num=num%val[i];
                
                for(int j=0;j<q;j++){
                    res+=hash.get(val[i]);
                }
                }
        }
        return res;
    }
}