/**Implemented circular queue here by using rear=(rear+1)%length method     **/


package queues;
import java.util.Scanner;
public class QueueImplementation {

	private static int front=-1,rear=-1;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int queue[]=new int [N];
		Enqueue(queue,5);
		Enqueue(queue,7);           /** The dequeue operation will just increase the front index hence the element inserted at the first will be deleted and the front will now point next inserted element.**/ 
		Enqueue(queue,1);
		Enqueue(queue,3);
		Enqueue(queue,56);
		Enqueue(queue,23);
		Enqueue(queue,13);
		Enqueue(queue,20);
		Dequeue(queue);
	    Dequeue(queue);
		Dequeue(queue);
		Dequeue(queue);
		front(queue);
		printQueue(queue);
	}
	private static boolean IsEmpty() {
		if(front==-1 && rear==-1) {
			return true;
		}
		else {
			return false;
		}
	}
    private static boolean isFull(int queue[]) {
    	if((rear+1)%queue.length==front) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	private static void Enqueue(int queue[],int element) {
		if(isFull(queue)) {
		    System.out.println("Queue is full can't insert");
		}
		else if(IsEmpty()) {
			front=0;
			rear=0;
		    queue[rear]=element;
		}
		else {
			rear=(rear+1)%queue.length;
		    queue[rear]=element;
		}
	        
	}
	private static void Dequeue(int queue[]) {
		if(IsEmpty()) {
			System.out.println("Queue is Empty can't dequeue");
		}
		else if(front==rear) { // then make it an empty queue
			front=-1;
			rear=-1;
		}
		else {
			front=(front+1)%queue.length;
		}
		
	}
	private static void front(int queue[]) {
		if(IsEmpty()) {
			System.out.println("Queue has no element to print");
		}
		else {
			int element=queue[front];
			System.out.println("The Queue has :"+element);
		}
	}
	 private static void printQueue(int[] queue) {
	        System.out.println("Printing full Queue --->");
	        while (!IsEmpty()) {
	            front(queue);
	            Dequeue(queue);
	        }
	    }
	

}
