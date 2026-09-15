class MinStack {

    List<Integer> list = new ArrayList<>();
    List<Integer> minList = new ArrayList<>();

    public MinStack() {

    }

    public void push(int value) {
        list.add(value);

         if (minList.isEmpty()) {
            minList.add(value);
        } else {
            minList.add(Math.min(value,
                    minList.get(minList.size() - 1)));
        }
    }

    public void pop() {

        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
            minList.remove(minList.size() - 1);

        }

        

    }

    public int top() {

        return list.get(list.size() - 1);

    }

    public int getMin() {

        return minList.get(minList.size() - 1);

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */