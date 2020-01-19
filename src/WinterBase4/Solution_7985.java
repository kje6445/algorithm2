package WinterBase4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Rooted Binary Tree 재구성

class Node{
    int data;
    Node left;
    Node right;

	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class Solution_7985 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			int k = Integer.parseInt(br.readLine());
			String tree = br.readLine();

		}
	}
}
