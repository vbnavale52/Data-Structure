package bst;

public class TestBST {

	public static void main(String[] args) 
	{
		BinarySearchTree bst=new BinarySearchTree();
		System.out.println(bst.insert(50));
		System.out.println(bst.insert(20));
		System.out.println(bst.insert(15));
		System.out.println(bst.insert(30));
		System.out.println(bst.insert(10));
		System.out.println(bst.insert(18));
		System.out.println(bst.insert(80));
		System.out.println(bst.insert(60));
		System.out.println(bst.insert(65));
		System.out.println(bst.insert(70));
		System.out.println(bst.insert(50));
		System.out.println(bst.insert(20));
		bst.inOrder(bst.getRoot());

	}

}
