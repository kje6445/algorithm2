package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class C_11724 {
    static ArrayList<Integer>[] neighborDot;
    static boolean[] visited;

    static  void DFS(int i){
        visited[i] = true;
        for(int c : neighborDot[i])
            if(visited[c]==false)
                DFS(c);
    }

     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
         int dots =Integer.parseInt(st.nextToken());
         int lines = Integer.parseInt(st.nextToken());

          neighborDot = new ArrayList[dots+1]; //dot의 개수 만큼 배열을 생성한다.

         for(int i=1; i<=dots; ++i)
             neighborDot[i] = new ArrayList<>(); //각각의 ArrayList에 또 하나의 배열을 생성한다.

         for(int i=1; i<=lines; ++i){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            neighborDot[a].add(b);
            neighborDot[b].add(a);
         }

         visited = new boolean[dots+1];

         int count=0;
         for(int i=1; i<=dots; i++){
             if(visited[i] == false){
                 ++count;
                 DFS(i);
             }
         }
         System.out.println(count);
    }

}
