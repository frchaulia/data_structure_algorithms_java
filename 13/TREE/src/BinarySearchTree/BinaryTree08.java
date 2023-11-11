package BinarySearchTree;

import org.w3c.dom.Node;

public class BinaryTree08 {
    Node08 root;

    public BinaryTree08(){
        root = null;
    }
    boolean isEmpty(){
        return root==null;
    }

    void add(int data){
        if(isEmpty()){
            root = new Node08(data);
        } else {
            Node08 current = root;
            while(true){
                if(data<current.data){
                    if(current.left!=null){
                        current = current.left;
                    }else{
                        current.left = new Node08(data);
                        break;
                    }
                }else if(data>current.data){
                    if(current.right!=null){
                        current = current.right;
                    }else{
                        current.right = new Node08(data);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node08 current = root;
        while(current!=null){
            if(current.data==data){
                result = true;
                break;
            }else if(data<current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node08 node){
        if(node!=null){
            System.out.println("" + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node08 node){
        if(node!=null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(""+node.data);
        }
    }

    void traverseInOrder(Node08 node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.println(""+node.data);
            traverseInOrder(node.right);
        }
    }

    Node08 getSuccessor(Node08 del){
        Node08 successor = del.right;
        Node08 successorParent = del;
        while(successor.left!=null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor!=del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        Node08 parent = root;
        Node08 current = root;
        boolean isLeftChild = false;
        while(current!=null){
            if(current.data==data){
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if(current==null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            if(current.left==null&&current.right==null){
                if(current==root){
                    root=null;
                }else{
                    if(isLeftChild){
                        parent.left=null;
                    }else{
                        parent.right=null;
                    }
                }
            }else if(current.left==null){
                if(current==root){
                    root=current.right;
                }else{
                    if(isLeftChild){
                        parent.left=current.right;
                    }else{
                        parent.right=current.right;
                    }
                }
            }else if(current.right==null){
                if(current==root){
                    root=current.left;
                }else{
                    if(isLeftChild){
                        parent.left=current.left;
                    }else{
                        parent.right=current.left;
                    }
                }
            }else{
                Node08 successor = getSuccessor(current);
                if(current==root){
                    root=successor;
                }else{
                    if(isLeftChild){
                        parent.left=successor;
                    }else{
                        parent.right=successor;
                    }
                    successor.left=current.left;
                }
            }
        }
    }
}
