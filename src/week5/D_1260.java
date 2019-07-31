package week5;

import sun.awt.image.ImageWatched;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D_1260 {
    //인접리스트로 문제 해결하기
    static ArrayList<Integer>[] neighborDot;
    static  boolean[] visited;

    static  void DFS(int start){
        if(visited[start]){
            return;
        }
        visited[start] = true;
        System.out.print(start + " ");
        for(int y: neighborDot[start]){
            if(!visited[y]){
                DFS(y);
            }
        }
    }

    static void BFS(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int x = q.remove();
            System.out.print(x + " ");
            for(int y : neighborDot[x]){
                if(!visited[y]) {
                    visited[y] = true;
                    q.add(y);
                }
            }
        }
    }
    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int dots = Integer.parseInt(st.nextToken());
        int lines = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        neighborDot =(ArrayList<Integer>[]) new ArrayList[dots+1];

        for(int i=1; i<=dots; i++){
            neighborDot[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<lines; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            neighborDot[a].add(b);
            neighborDot[b].add(a);
        }


        for(int i=1; i<=dots; i++){
            Collections.sort(neighborDot[i]);
        }

        visited = new boolean[dots+1];
        DFS(start);
        System.out.println(" ");
        visited = new boolean[dots+1];
        BFS(start);
        System.out.println();
    }
}
