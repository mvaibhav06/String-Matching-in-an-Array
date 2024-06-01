class StringMatching {
    public List<String> stringMatching(String[] words) {
        List<String> out = new ArrayList<>();
        Arrays.sort(words, (a,b)->Integer.compare(b.length(),a.length()));
        String sb = "";
        for(int i=0; i<words.length; i++){
            if(sb.contains(words[i])){
                out.add(words[i]);
            }
            sb += words[i] + ' ';
        }
        return out;
    }
}
