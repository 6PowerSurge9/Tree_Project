

public class tree_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		btnode_int root = new btnode_int(5);//
		btnode_int loot = new btnode_int(5);
		int[] arr = {5,6,7,4,9};
		root.setData(5);
		root.setLeft(new btnode_int(3));
		root.getLeft().setLeft(new btnode_int(1));
		root.getLeft().setRight(new btnode_int(4));
		root.setRight(new btnode_int(9));
		root.getRight().setLeft(new btnode_int(6));
		root.inorderPrint();
		root.Search_in_binary_tree(root,4);
		
    	System.out.println("\nbuild");

    	btnode_int.Build(arr); 
    	
	 
	}
	
	
}
