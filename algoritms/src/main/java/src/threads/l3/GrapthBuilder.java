package src.threads.l3;

import java.util.HashSet;
import java.util.Set;

public class GrapthBuilder {
    public GraphNode build(final XOField.Figure currentFigure, final XOField xoField){
        final XOField.Figure nextF = currentFigure == XOField.Figure.O?XOField.Figure.X : XOField.Figure.O;
        final Set<GraphNode> children = new HashSet<>();
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (xoField.getFigure(x,y)!=null){
                    continue;
                }
                final XOField newField = new XOField(xoField);
                newField.setFigure(x,y,nextF);
                children.add(build(nextF,newField));
            }
        }
        return new GraphNode(xoField,children);
    }
}
