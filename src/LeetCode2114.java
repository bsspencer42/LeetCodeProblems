public class LeetCode2114 {

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (int i = 0; i < sentences.length;i++){
            if (sentences[i].split(" ").length > maxWords){
                maxWords = sentences[i].split(" ").length;
            }
        }
        return maxWords;
    }
}
