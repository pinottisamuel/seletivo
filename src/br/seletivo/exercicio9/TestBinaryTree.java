package br.seletivo.exercicio9;

import java.util.Arrays;
import java.util.List;

public class TestBinaryTree {

	public static void main(String[] args) {
		
		BinaryTree node = new BinaryTree();
		
		List<Integer> valuesToTree = Arrays.asList(15, 10, 19, 20, 8, 17, 7);
		
		for (Integer values : valuesToTree) {
			node.createTree(values);
		}
		
		node.printBinaryTree();
		
		System.out.println("");
		
		System.out.println("Soma total: " + node.sum());
		
		System.out.println("Soma a partir de um nó: " + node.sumByNode(15));
		
	}
}
