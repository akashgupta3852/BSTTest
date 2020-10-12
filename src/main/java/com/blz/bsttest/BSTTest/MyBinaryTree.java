package com.blz.bsttest.BSTTest;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public void printWelcome() {
		System.out.println("Welcome to My Binary Tree Data Structure");
	}

	public void add(K key) {
		this.root = addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return (current == null) ? 0 : 1 + getSizeRecursive(current.left) + getSizeRecursive(current.right);
	}

	public boolean search(K key) {
		return searchRecursively(root, key);
	}

	private boolean searchRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return false;
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return true;
		if (compareResult < 0)
			return searchRecursively(current.left, key);
		if (compareResult > 0)
			return searchRecursively(current.right, key);
		return false;
	}
}
