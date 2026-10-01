# Binary Tree Minimum Depth

## Problem Statement

Given the root of a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node to the nearest leaf node.

A leaf node has no left or right child.

## Example

        1
       / \
      2   3
           \
            4

Shortest path:

1 → 2

Output:

Minimum Depth: 2

## Approach

Use recursion.

For every node:

1. If the node is `null`, return `0`.
2. If the node is a leaf, return `1`.
3. If only the left subtree exists, calculate the depth through the left subtree.
4. If only the right subtree exists, calculate the depth through the right subtree.
5. If both subtrees exist, take the smaller depth and add `1` for the current node.

The single-child cases are important because the minimum depth must end at a leaf.

## Complexity

- Time: O(n)
- Space: O(h)

Where:
- `n` = number of nodes
- `h` = height of the tree

## Concepts Practiced

- Binary Trees
- Minimum Depth
- Recursion
- DFS
- Leaf Nodes