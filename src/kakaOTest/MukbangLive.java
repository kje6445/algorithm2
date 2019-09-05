package kakaOTest;

public class MukbangLive {
	public static void main(String[] args) {
		int[] food_times = {3, 1, 2};
		long k = 5;

		System.out.println(solution(food_times, k));
	}

	public static class CircularQueue<pulic> {
		private int front;
		private int rear;
		private int queueSize;
		private int itemArray[];

		public CircularQueue(int queueSize){
			this.front=0;
			this.rear=0;
			this.queueSize = queueSize;
			itemArray = new int[queueSize];
		}

		public void enQueue(int item){
			if(isFull()){
				System.out.println("큐가 포화상태");
			}else{
				rear = (rear+1)%(queueSize);
				itemArray[rear] =item;
			}
		}

		public int deQueue(){ //하나 줄게하는 공식
			if(isEmpty()){
				System.out.println("큐가 공백상태");
				return 0;
			}else{
				front = (front+1)%queueSize;
				int num = itemArray[front];
				System.out.println("num1: "+num);
				--num;
				System.out.println("num2: "+num);
			//	itemArray[front]= num;
				itemArray[front]=num;
				return num;
			}
		}

		public int peek(){
			if(isEmpty()){
				System.out.println("큐가 비어있음");
				return 0;
			}else {
				return itemArray[(front+1)%queueSize];
			}
		}

		public void print(){
			if(isEmpty()){
				System.out.println("큐가 비어있음");
			}else{
				int f= front;

				while (f!=rear){
					f = (f+1)%queueSize;
					System.out.print(itemArray[f]+" ");
				}
				System.out.println();
			}
		}

		public  boolean isFull(){
			return (rear == this.queueSize-1);
		}

		public boolean isEmpty(){
			if(front == rear){
				front = -1;
					rear = -1;
			}
			return (front == rear);
		}
	}

	public static int solution(int[] food_times, long k) { //원형큐를 이용하여 문제를 해결한다.
		int answer = 0;
		int waitTime = (int) k;

		CircularQueue queue = new CircularQueue(food_times.length+1);

		for(int i=0; i<food_times.length; i++){
			queue.enQueue(food_times[i]);
		}
		queue.print();

		for(int i=0; i<k; i++){
			//queue.deQueue();
			System.out.println("queue.deQueue() "+queue.deQueue());
			System.out.print(i+"번째 ");
			queue.print();
		}
		return answer;
	}
}
