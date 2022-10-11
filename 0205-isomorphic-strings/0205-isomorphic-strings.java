class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map= new HashMap<>();
        int l1= s.length(), l2=t.length();
        if(l1!=l2)
            return false;
        for(int i=0;i<l1; i++ ){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else {
                 if(map.containsValue(t.charAt(i)))
                     return false;
                
                map.put(s.charAt(i),t.charAt(i));
                        
            }
            
        }
        return true;
    }
}