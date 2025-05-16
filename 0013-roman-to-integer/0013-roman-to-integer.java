class Solution {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character,Integer> rom = new HashMap<>();
        rom.put('I',1);
        rom.put('V',5);
        rom.put('X',10);
        rom.put('L',50);
        rom.put('C',100);
        rom.put('D',500);
        rom.put('M',1000);
        for(int i=0;i<s.length()-1;i++){
            if(rom.get(s.charAt(i)) < rom.get(s.charAt(i+1))){
                result -= rom.get(s.charAt(i));
            }else{
                result += rom.get(s.charAt(i));
            }
        }
        return result + rom.get(s.charAt(s.length()-1));
    }
}