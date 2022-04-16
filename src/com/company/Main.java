package com.company;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    private LinkedList<Integer> adjacency[];

    public Main(int v) {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacency[i] = new LinkedList<Integer>();
        }
    }

    public void insertedge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of vertex and edge:");
        int v = sc.nextInt();
        int e = sc.nextInt();
        Main g = new Main(v);
        System.out.print("enter edge:");
        for (int i = 0; i < e; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insertedge(s, d);
        }
    }
}


