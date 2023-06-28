#include <bits/stdc++.h>
using namespace std;

struct Node
{
    int data;
    Node *left;
    Node *right;
};
class maxDepthTree
{
public:
    /*You are required to complete this method*/
    int maxDepth(Node *root)
    {
        if (root == NULL)
            return 0;
        return depthCount(root, 1);
    }

    int depthCount(Node *head, int max)
    {
        if (head->right == NULL && head->left == NULL)
        {
            return max;
        }
        int left = max, right = max;
        if (head->left != NULL)
        {
            left = depthCount(head->left, max + 1);
        }
        if (head->right != NULL)
        {
            right = depthCount(head->right, max + 1);
        }
        return std::max(left, right);
    }
};