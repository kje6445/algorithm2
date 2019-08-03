package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class A_2606 {
    //BFS로 문제 풀이

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int computers = Integer.parseInt(st.nextToken());
        int linkedComputers = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] linked = new ArrayList[computers+1];
        boolean[] infection = new boolean[computers+1];

        for(int i=1; i<=computers; i++){
            linked[i] = new ArrayList<>();
        }
        for(int i=1; i<=linkedComputers; ++i){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            linked[a].add(b);
            linked[b].add(a);
        }


        int count=0;

        Queue<Integer> q = new LinkedList<>();
        q.add(1);

        while(!q.isEmpty()){
            int x = q.remove();
            System.out.print(x + " ");
            for(int y : linked[x]){
                if(!infection[y]){
                    infection[y] = true;
                    q.add(y);
                }
            }
        }
        for(int i=2;i<=infection.length-1; i++)
            if(infection[i])
                count++;

        System.out.println();
        System.out.println(count);
    }
}

