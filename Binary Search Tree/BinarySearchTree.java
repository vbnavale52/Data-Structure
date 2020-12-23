package bst;

public class BinarySearchTree 
{
	private Node root;
	
	public BinarySearchTree()
	{
		root=null;
	}

	public Node getRoot() 
	{
		return root;
	}

	public void setRoot(Node root) 
	{
		this.root = root;
	}
	
	public boolean insert(int data)
	{
		Node newNode = new Node(data);
		if( newNode == null )
			return false;
		if( root == null )
		{
			root = newNode ;
			return true;
		}
		Node temp=root;
		while(true)
		{
			if(data==temp.getData())
				return false;
			if(data<temp.getData())
			{
				if(temp.getLeft() == null )
				{
					temp.setLeft(newNode);
					return true;
				}
				temp=temp.getLeft();
			}	
			else
			{
				if(temp.getRight() == null )
				{
					temp.setRight(newNode);
					return true;
				}
				temp=temp.getRight();
			}	
		}
	}
	
	public void  inOrder(Node temp)
	{
		if(temp != null)
		{
			inOrder(temp.getLeft());
			System.out.print(" "+temp.getData()+" ");
			inOrder(temp.getRight());
		}
	}

	public boolean delete(int data)
	{
		if(root==null)
			return false;
		Node del,parent;
		del=parent=root;
		while( del.getData() != data )
		{
			parent=del;
			if(del.getData()>data)
				del=del.getLeft();
			else
				del=del.getRight();
			if( del == null )
				return false;
		}
		while(true)
		{
			if( del.getLeft() == null && del.getRight() == null )
			{
				if( root == del)
				{
					root = null ;
					return true;
				}
				if( parent.getLeft() == null )
					parent.setLeft(null);
				else
					parent.setRight(null);
				return true;
			}
			if(del.getLeft() != null )
			{
				parent=del;
				Node max=del;
				while( max.getRight() != null )
				{
					parent=max;
					max=max.getLeft();
				}
				int temp=del.getData();
				del.setData(max.getData());
				max.setData(temp);
				del=max;
			}
			else
			{
				parent=del;
				Node min=del;
				while( min.getRight() != null )
				{
					parent=min;
					min=min.getLeft();
				}
				int temp=del.getData();
				del.setData(min.getData());
				min.setData(temp);	
				del=min;
			}	
		}
	}
	
}
