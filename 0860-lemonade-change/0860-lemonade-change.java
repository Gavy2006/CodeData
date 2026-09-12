class Solution {
    public boolean lemonadeChange(int[] bills) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < bills.length; i++) {

            int no = bills[i];

            if (no == 5) {

                map.put(5, map.getOrDefault(5, 0) + 1);

            } else if (no == 10) {

                if (map.getOrDefault(5, 0) >= 1) {

                    map.put(5, map.get(5) - 1);
                    map.put(10, map.getOrDefault(10, 0) + 1);

                } else {
                    return false;
                }

            } else if (no == 20) {

                if (map.getOrDefault(10, 0) >= 1 &&
                    map.getOrDefault(5, 0) >= 1) {

                    map.put(10, map.get(10) - 1);
                    map.put(5, map.get(5) - 1);

                } else if (map.getOrDefault(5, 0) >= 3) {

                    map.put(5, map.get(5) - 3);

                } else {
                    return false;
                }

            } else {
                return false;
            }
        }

        return true;
    }
}