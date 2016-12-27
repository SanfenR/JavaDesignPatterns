package composite;

/**
 * Created by sanfen on 2016/12/26.
 * 组合模式（Composite）
 *
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便.
 *
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);

        System.out.println("build this tree finish!");
    }

}
