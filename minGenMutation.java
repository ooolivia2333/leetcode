
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class minGenMutation {
    // 433. Minimum Genetic Mutation

    public int minMutation(String startGene, String endGene, String[] bank) {
        Queue<String> queue = new LinkedList();
        Set<String> seen = new HashSet<String>();
        Set<String> banks = new HashSet<>();
        for (String str: bank) banks.add(str);
        queue.add(startGene);
        seen.add(startGene);
        int step = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String curr = queue.poll();
                if (curr.equals(endGene)) return step;
                for (int i = 0; i < curr.length(); i++) {
                    for (char c: new char[]{'A', 'C', 'G', 'T'}) {
                        String newStr = curr.substring(0, i) + c + curr.substring(i+1);
                        if (!seen.contains(newStr) && banks.contains(newStr)) {
                            queue.offer(newStr);
                            seen.add(newStr);
                        }
                    }
                }
            }
            step++;
        }

        return -1;
    }

    public static void main(String[] args) {
        String start = "AACCGGTT", end = "AAACGGTA";
        String[] bank = new String[]{"AACCGGTA","AACCGCTA","AAACGGTA"};
        minGenMutation mutation = new minGenMutation();
        System.out.println(mutation.minMutation(start, end, bank));
    }
}
