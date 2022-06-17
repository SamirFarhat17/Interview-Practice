// Write any import statements here

class Solution {
  
  public int getMaximumEatenDishCount(int N, int[] D, int K) {
    // Write your code here
    LinkedList<Integer> fifo = new LinkedList<>();
    int eaten = 0;
    for(int d: D) {
      if(!fifo.contains(d)) {
        eaten++; 
        if(fifo.size() < K) {
          fifo.add(d);
        }
        else {
          fifo.removeFirst();
          fifo.add(d);
        }
      }
      Integer str = fifo.listIterator(1).previous();
      System.out.println(fifo.toString());
    }
    
    return eaten;
  }
  
}
