
public class TreeNode {
	Integer nodeValue;
	Integer lchild;
	Integer rchild;
	public Integer getNodeValue() {
		return nodeValue;
	}
	public void setNodeValue(Integer nodeValue) {
		this.nodeValue = nodeValue;
	}
	public Integer getLchild() {
		return lchild;
	}
	public void setLchild(Integer lchild) {
		this.lchild = lchild;
	}
	public Integer getRchild() {
		return rchild;
	}
	public void setRchild(Integer rchild) {
		this.rchild = rchild;
	}
	
	
	
	public TreeNode() {
		super();
	}
	
	
	public TreeNode(Integer nodeValue, Integer lchild, Integer rchild) {
		super();
		this.nodeValue = nodeValue;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	
	

}
