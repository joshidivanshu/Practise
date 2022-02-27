class Solution {
    class Pair
    {
        Integer diff;
        Integer ind;
        Pair(Integer diff, Integer ind)
        {
            this.diff = diff;
            this.ind = ind;
        }
        
    }
    class MySort implements Comparator<Pair>{
        public int compare(Pair a1,Pair a2)
            {
                return a2.diff.compareTo(a1.diff);
            }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(
            new MySort()
            // new Comparator<Pair>(){
            // public int compare(Pair a1,Pair a2)
            // {
            //     return a2.diff.compareTo(a1.diff);
            // }
            // }
        );
        int n = arr.length;
        for(int i=0;i<k;i++)
        {
            pq.add(new Pair(Math.abs(arr[i]-x),i));
        }
        for(int i=k;i<n;i++)
        {
            int diff = Math.abs(arr[i]-x);
            if(pq.peek().diff > diff)
            {
                pq.poll();
                pq.add(new Pair(diff,i));
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        while(!pq.isEmpty())
        {
            res.add(arr[pq.poll().ind]);
        }
        Collections.sort(res);
        return res;
    }
}