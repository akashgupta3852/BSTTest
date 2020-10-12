package com.blz.bsttest.BSTTest;

public class MyBinaryNode<K extends Comparable<K>> {
	public K key;
	public MyBinaryNode<K> left, right;

	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
