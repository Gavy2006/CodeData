class Solution {
    public int thirdMax(int[] nums) {

        PriorityQueue<Integer> qu = new PriorityQueue<>();

        for (int no : nums) {

            if (!qu.contains(no)) {
                qu.add(no);

                if (qu.size() > 3) {
                    qu.poll();
                }
            }
        }

        if (qu.size() < 3) {
            return Collections.max(qu);
        }

        return qu.peek();
    }
}