public class BinarySearchTree<T extends Comparable<T>> {
    private NodeType<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(T key) {
        root = insert(root, key);
    }

    private NodeType<T> insert(NodeType<T> node, T key) {
        if (node == null) {
            return new NodeType<T>(key);
        }

        int cmp = key.compareTo(node.info);

        if (cmp < 0) {
            node.left = insert(node.left, key);
        } else if (cmp > 0) {
            node.right = insert(node.right, key);
        } else {
            System.out.println("The item already exists in the tree.");
        }

        return node;
    }

    public void delete(T key) {
        if (!search(key)) {
            System.out.println("The number is not present in the tree");
        } else {
            root = delete(root, key);
            this.inOrder();
        }
    }

    private NodeType<T> delete(NodeType<T> node, T key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.info);

        if (cmp < 0) {
            node.left = delete(node.left, key);
        } else if (cmp > 0) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                NodeType<T> successor = findMin(node.right);
                node.info = successor.info;
                node.right = delete(node.right, successor.info);
            }
        }

        return node;
    }

    private NodeType<T> findMin(NodeType<T> node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public boolean search(T item) {
        return search(root, item);
    }

    private boolean search(NodeType<T> node, T item) {
        if (node == null) {
            return false;
        }

        int cmp = item.compareTo(node.info);

        if (cmp == 0) {
            return true;
        } else if (cmp < 0) {
            return search(node.left, item);
        } else {
            return search(node.right, item);
        }
    }

    public void inOrder() {
        System.out.print("In-order: ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(NodeType<T> node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.info + " ");
            inOrder(node.right);
        }
    }

    public void getSingleParent() {
        System.out.print("Single Parents: ");
        boolean[] found = {false};
        getSingleParent(root, found);

        if (!found[0]) {
            System.out.println();
            System.out.println("None");
        } else {
            System.out.println();
        }
    }

    private void getSingleParent(NodeType<T> node, boolean[] found) {
        if (node != null) {
            if ((node.left == null && node.right != null) ||
                (node.left != null && node.right == null)) {
                System.out.print(node.info + " ");
                found[0] = true;
            }

            getSingleParent(node.left, found);
            getSingleParent(node.right, found);
        }
    }

    public void getNumLeafNodes() {
        int count = countLeafNodes(root);
        System.out.println("The number of leaf nodes are " + count);
    }

    private int countLeafNodes(NodeType<T> node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }

        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    public void getCousins(T item) {
        NodeType<T> target = findNode(root, item);

        System.out.print(item + " cousins: ");

        if (target == null || root == null || root == target) {
            System.out.println();
            return;
        }

        int level = getLevel(root, target, 1);
        printCousins(root, target, level);
        System.out.println();
    }

    private NodeType<T> findNode(NodeType<T> node, T item) {
        if (node == null) {
            return null;
        }

        int cmp = item.compareTo(node.info);

        if (cmp == 0) {
            return node;
        } else if (cmp < 0) {
            return findNode(node.left, item);
        } else {
            return findNode(node.right, item);
        }
    }

    private int getLevel(NodeType<T> node, NodeType<T> target, int level) {
        if (node == null) {
            return 0;
        }

        if (node == target) {
            return level;
        }

        int leftLevel = getLevel(node.left, target, level + 1);
        if (leftLevel != 0) {
            return leftLevel;
        }

        return getLevel(node.right, target, level + 1);
    }

    private void printCousins(NodeType<T> node, NodeType<T> target, int level) {
        if (node == null || level < 2) {
            return;
        }

        if (level == 2) {
            if (node.left == target || node.right == target) {
                return;
            }

            if (node.left != null) {
                System.out.print(node.left.info + " ");
            }
            if (node.right != null) {
                System.out.print(node.right.info + " ");
            }
        } else {
            printCousins(node.left, target, level - 1);
            printCousins(node.right, target, level - 1);
        }
    }
}
