class Solution {
    public int[] dailyTemperatures(int[] temp) {

     int[] arr = new  int[temp.length] ;
     Stack<Integer> st = new Stack<>() ;

     int i = temp.length -1 ;
      
      while(i>=0){
       
       if(st.isEmpty()){
        st.push(i) ;
        arr[i] = 0 ;
       }

       else{

        while(!st.isEmpty() && temp[st.peek()] <= temp[i]){
            st.pop() ;
        }

        if(st.isEmpty()){
        st.push(i) ;
        arr[i] = 0 ;
       }

       else {
        
        arr[i] = st.peek() - i  ;

        st.push(i) ;
        }
       }

        i-- ;
      }


      return arr ;
    }
}