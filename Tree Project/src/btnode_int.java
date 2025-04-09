import org.w3c.dom.Node;

class btnode_int{
		private int data;
		private btnode_int left;
		private btnode_int right;
		// methods
		public btnode_int(int initialData) {
			this.data = initialData;
			this.left = null;
			this.right = null;// constructor
		}
		public int getData(){
			return this.data;
		}
		public btnode_int getLeft( ) {
			return this.left;// Gets reference to left child
		}
		public btnode_int getRight( ) {
			return this.right;// Gets reference to right child
		}
		public void setData(int newData) {
			this.data = newData;// Set data of this node
		}
		public void setLeft(btnode_int newLeft) {
			this.left = newLeft;// Set left child
		}
		public void setRight(btnode_int newRight){
			this.right = newRight;// Set right child
		}
		 
		 
	
		public void inorderPrint()
		{
		if (left != null)
		left.inorderPrint( );
		System.out.println(data);
		if (right != null)
		right.inorderPrint( );
		}
	    
	 
	    
	    public btnode_int Search_in_binary_tree (btnode_int root, int key) {
			if (root == null || root.data == key) {
				System.out.print(root.data);
				return root;
			}
			if (key < root.data) {
				return Search_in_binary_tree (root.left, key);
			}
			else {
				return Search_in_binary_tree (root.right, key);
			}
	    }
			//bulid a node form an array and call the build tree
	    
	    public static btnode_int Build(int [] arr2) {
	    	if(arr2.length == 0) {
	    	return null;
	    	}
	    	btnode_int root = new btnode_int(arr2[0]);
	    	for (int i = 0; i < arr2.length; i++) {
	    		int key = arr2[i];
	    		Build_tree(root, key);
	    	}
	    	return root;
	    }
	    
		public static btnode_int Build_tree (btnode_int root, int key) {
				if (root == null) {
					btnode_int Node = new btnode_int(key);
					return Node;
				}
				if (root.data > key) {
					if (root.left != null) {
						Build_tree(root.left, key);
					}
					else {
						root.left = new btnode_int(key);
					}
				}
				
				if (root.data < key) {
					if (root.right != null) {
						Build_tree(root.right, key);
					}
					else {
						root.right = new btnode_int(key);
					}
				}
				System.out.println(root.data);
				return root;
				
		}
	    
	}
