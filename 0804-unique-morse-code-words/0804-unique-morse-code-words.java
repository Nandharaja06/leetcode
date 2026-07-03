class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String>set=new HashSet<>();

        for(String word :words)
        {
           String s=" ";
           for(int i=0;i<word.length();i++)
           {

            char ch =word.charAt(i);
            s+=morse[ch-'a'];
           }
           set.add(s); 
        }
        return set.size();  
    }
}