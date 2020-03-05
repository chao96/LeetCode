import java.util.Stack;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {
    private Stack<Integer> data;
    private Stack<Integer> helper;

    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        data.push(x);
        if(helper.isEmpty() || x <= helper.peek()){
            helper.push(x);
        }
    }
    
    public void pop() {
        if(!data.isEmpty()){
            int x = data.pop();
            if(x == helper.peek()){
                helper.pop();
            }
        }
        throw new RuntimeException("栈内无元素");
    }
    
    public int top() {
        if(!data.isEmpty()){
            return data.peek();
        }
        throw new RuntimeException("栈内无元素");
    }
    
    public int getMin() {
        if(!helper.isEmpty()){
            return helper.peek();
        }
        throw new RuntimeException("栈内无元素");
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

