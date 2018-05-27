package br.seletivo.exercicio9;

public class BinaryTree {
	
	private BinaryTree node;

	private int value;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree() {
		
	}

	public BinaryTree(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValor(int valor) {
		this.value = valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	public void printBinaryTree() {
		if(this.node != null) {
			printBinaryTree(this.node);
		} else {
			System.out.println("Arvore vazia!");
		}
	}

	public void printBinaryTree(BinaryTree node) {
		System.out.print(node.value + " ");
		if (node.left != null) {
			printBinaryTree(node.left);
		}

		if (node.right != null) {
			printBinaryTree(node.right);
		}
	}
	
	public void createTree(int value) {
		createTree(this.node, value);
	}

	public void createTree(BinaryTree node, int value) {
		
		if (this.node == null) {
			this.node = new BinaryTree(value);
		} else {
			
			if (value < node.getValue()) {
				if(node.left != null) {
					createTree(node.getLeft(), value);
				} else {
					node.setLeft(new BinaryTree(value));
				}
			} else {
				if(node.getRight() != null) {
					createTree(node.getRight(), value);
				} else {
					node.setRight(new BinaryTree(value));
				}
			}
		}
	}
	
	public int sum() {
		return sum(this.node);
	}
	
	private int sum(BinaryTree node) {
		
		if(node == null) {
			return 0;
		} else {		
			return node.getValue() + sum(node.getLeft()) + sum(node.getRight());
		}
	}
	
	public int sumByNode(int value) {
		return sumByNode(this.node, value);
	}
	
	private int sumByNode(BinaryTree node, int value) {
		
		if(this.node.value == value) {
			return this.node.getValue() + sum(node.getLeft()) + sum(node.getRight());
		} else if (node.getLeft().getValue() == value) {
			return sum(node.getLeft());
		} else if (node.getRight().getValue() == value) {
			return sum(node.getRight());
		} else {		
			return 0;
		}
	}
}
