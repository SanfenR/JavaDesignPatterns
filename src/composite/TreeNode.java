package composite;

import apple.laf.JRSUIUtils;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by sanfen on 2016/12/26.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;

    private Vector<TreeNode> childer = new Vector<>();

    public TreeNode(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode node){
        childer.add(node);
    }

    public void remove(TreeNode node){
        childer.remove(node);
    }

    public Enumeration<TreeNode> getChildren() {
        return childer.elements();
    }

}
