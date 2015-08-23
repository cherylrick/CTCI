#Trees

1.  Tree is a hierarchical(non-linear) data structure
2.  A tree data structure can be defined recursively as a collection of nodes starting at a root node.
3.  Trees are made up of sub trees.
4.  Each node is a data structure consisting of a value, together with a list of references to children nodes with the constraints that no reference is duplicated
5.  No tree node points to the root node
6.  The tree with no nodes is called the null or empty tree
7.  A tree that is not empty consists of a root node and potentially many levels of additional nodes that form a hierarchy.
8.  It is not a tree when:
        1.There are cycles in the structure
        2.There are disconnected components in the structure
9.  Real Life Examples of Tree Structure
    1. File System in a Computer
    2. Social Networks
    3. PDF files
    4. Computer Chess game
    5. XML Parser
10. Terminologies in Tree
    1. **Root** – The top node in a tree.
    2. **Parent** – The converse notion of child.
    3. **Siblings** – Nodes with the same parent.
    4. **Descendant** – a node reachable by repeated proceeding from parent to child.
    5. **Ancestor** – a node reachable by repeated proceeding from child to parent.
    6. **Leaf** – a node with no children.
    7. **Internal node** – a node with at least one child.
    8. **External node** – a node with no children.
    9. **Degree** – number of sub trees of a node.
    10. **Edge** – connection between one node to another.
    11. **Path** – a sequence of nodes and edges connecting a node with a descendant.
    12. **Level** – The level of a node is defined by 1 + the number of connections between the node and the root.
    14. **Height of tree** –The height of a tree is the number of edges on the longest downward path between the root and a leaf.
    15. **Height of node** –The height of a node is the number of edges on the longest downward path between that node and a leaf.
    16. **Depth** –The depth of a node is the number of edges from the node to the tree's root node.
    17. **Forest** – A forest is a set of n ≥ 0 disjoint trees.
11. Types of Trees
    1. N-Ary Tree
    2. Binary Tree
    3. Binary Search Tree
    4. AVL Tree
    5. Red Black Tree