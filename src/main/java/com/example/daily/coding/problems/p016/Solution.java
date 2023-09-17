

package com.example.daily.coding.problems.p016;

/**
 *
 * @author Danielnaor
 */
public class Solution {
    // in this case n = 5
    private             int[]   log_Of_order_ids;
    private             int     index;

    
    public Solution(int n){
        log_Of_order_ids = new int[n];
        index = 0;
    }
    
    
    public static void main(String[] args) {
        
        Solution Log = new Solution(5);
        Log.record(1001);
        Log.record(1002);
        Log.record(1003);
        Log.record(1004);
        Log.record(1005);

        System.out.println(Log.get_last(1)); // should print 1005
        System.out.println(Log.get_last(3)); // should print 1003

        

        System.out.println(Log.get_last(1)); // should print 1007
        System.out.println(Log.get_last(5)); // should print 1003
        
        
        
        
        
    }
    
    
    
    public void record(int order_id){
        log_Of_order_ids[index] = order_id;
        index++;
    }
    
    
    public int get_last(int i){
        return log_Of_order_ids[log_Of_order_ids.length-i];
    }
}
