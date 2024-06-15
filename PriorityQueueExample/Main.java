import java.util.PriorityQueue;
class Main{
    public static void main(String[] args) {
        PriorityQueue<String>pq=new PriorityQueue<>();
        
        pq.add("sejal");
        pq.add("nikhil");
        pq.add("priya");
        pq.add("samiksha");
       //pq.add("sejal");
        System.out.println(pq);
        //first element and then removed
        System.out.println(pq.poll());
        System.out.println(pq);

        //gives first element (it is not removed)
        System.out.println(pq.peek());
        System.out.println(pq);

        //
        System.out.println(pq.remove());
        System.out.println(pq);
    }
}