public class BinaryTree {
    NodeTree root;

    public BinaryTree(){
        root = null;
    }

    public BinaryTree(int _data){
        NodeTree newRoot = new NodeTree(_data);
        root = newRoot;
    }

    public void Insert(int _data){
        NodeTree newNode = new NodeTree(_data);
        if(root == null)
            root = newNode;
        else{
            insert(newNode, root);
        }
    }

    private void insert(NodeTree _node, NodeTree _root){
        if(_node != null && _root != null) {
            if (_node.GetData() > _root.GetData()) {
                if (_root.GetRight() != null)
                    insert(_node, _root.GetRight());
                else
                    _root.SetRight(_node);
            } else {
                if (_root.GetLeft() != null)
                    insert(_node, _root.GetLeft());
                else
                    _root.SetLeft(_node);
            }
        }
    }

    public void Delete(int _data){
        if(root == null)
            System.out.println("Tree empty");
        else{
            delete(root, _data);
        }
    }

    private void delete(NodeTree _root, int _data){
        if(root.GetData() == _data){ // root is the target
            NodeTree newRoot = root.GetRight(); // Could be Null
            NodeTree newRootLeft = null;

            if(newRoot != null)
                newRootLeft = newRoot.GetLeft(); // Could be null

            // Insert all left nodes of new root to old left node
            insert(newRootLeft, root.GetLeft());

            // Set all the left nodes of old root to new Root
            newRoot.SetLeft(root.GetLeft());

            // Assign new root
            root = newRoot;
        }
        else if(_root.GetRight() != null && _root.GetRight().GetData() == _data){ // Right node is the target
            NodeTree target = _root.GetRight();
            if(target.GetRight() != null){ // Replace target with right node
                NodeTree leftTarget = target.GetLeft(); // Could be null
                NodeTree newRoot = target.GetRight();

                // Disconnect target node
                target.SetLeft(null);
                target.SetRight(null);

                // Insert leftTarget nodes to newRoot
                insert(leftTarget, newRoot);

                // Assign new leftNode to its root
                _root.SetRight(newRoot);
            }
            else if(target.GetLeft() != null){ // Replace target with left node
                _root.SetRight(target.GetLeft());
            }
            else{ // Delete leaf node
                _root.SetRight(null);
            }
        }
        else if(_root.GetLeft() != null &&  _root.GetLeft().GetData() == _data){ // Left node is the target
            NodeTree target = _root.GetLeft();
            if(target.GetRight() != null){ // Replace target with right node
                NodeTree leftTarget = target.GetLeft(); // Could be null
                NodeTree newRoot = target.GetRight();

                // Disconnect target node
                target.SetLeft(null);
                target.SetRight(null);

                // Insert leftTarget nodes to newRoot
                insert(leftTarget, newRoot);

                // Assign new leftNode to its root
                _root.SetLeft(newRoot);
            }
            else if(target.GetLeft() != null){ // Replace target with left node
                _root.SetLeft(target.GetLeft());
            }
            else{ // Delete leaf node
                _root.SetLeft(null);
            }
        }
        else if(_data > _root.GetData()){ // Down to right
            delete(_root.GetRight(), _data);
        }
        else if(_data < _root.GetData()){ // Down to left
            delete(_root.GetLeft(), _data);
        }
    }

    public void PrintDFS(){
        printDFS(root);
        System.out.println("*");
    }

    private void printDFS(NodeTree _root){
        if(_root != null) {
            printDFS(_root.GetLeft());
            printDFS(_root.GetRight());
            System.out.println(_root.GetData());
        }
    }
}
