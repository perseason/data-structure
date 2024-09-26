package pers.lilpen.ds.base;

/**
 * @author : penghuaishun
 * @version : 1.0
 * @date : 2024-09-26 15:03
 **/
public class TreeNode<T> {
    public TreeNode<T> left;
    public TreeNode<T> right;
    public T val;

    public TreeNode(T val) {
        this.val = val;
    }
}
