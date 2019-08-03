package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*
public class A_2606 {
    //BFS로 문제 풀이
    static ArrayList<Integer>[] linked;
    static boolean[] infection;

    static void bfs(int computer){
        int count=0;
        Queue<Integer> q = new LinkedList<>();
        q.add(computer);
        infection[computer] = true;
        while(!q.isEmpty()){
            int x = q.remove();
            System.out.print(x + " ");
            for(int y : linked[x]){
                if(!infection[y]){
                    infection[y] = true;
                    q.add(y);
                    count++;
                }
            }
        }
        System.out.println(" ");
        System.out.print(count);
    }

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());

         int computers = Integer.parseInt(st.nextToken());
         int linkedComputers = Integer.parseInt(br.readLine());

         linked = new ArrayList[computers+1];

         for(int i=1; i<=computers; i++){
             linked[i] = new ArrayList<Integer>();
         }
         for(int i=1; i<=linkedComputers; ++i){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                linked[a].add(b);
                linked[b].add(a);
         }

         for(int i=1; i<=linkedComputers; ++i){
             Collections.sort(linked[i]);
         }

        infection = new boolean[computers+1];
         bfs(1);

    }
}
*/
