package src.threads.l3;

public class psvm {
    public static void main(String[] args) {
        final GraphNode root = new GrapthBuilder().build(XOField.Figure.X,new XOField());
        System.out.println(root.getNode());
        GrapthHelper.show(root,0);
        System.out.println(GrapthHelper.countNodes(root));
    }
}
