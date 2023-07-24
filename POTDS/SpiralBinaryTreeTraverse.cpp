
#include <bits/stdc++.h>
using namespace std;


struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
    
    Node(int x){
        data = x;
        left = right = NULL;
    }
};



vector<int> findSpiral(Node *root)
{
    //Your code here
    queue<Node*>q;
    q.push(root);
    vector<int>ans;
    int prev;
    int lvl=0;
    while(!q.empty())
    {
        int size=q.size();
        prev=ans.size();
        for(int i=0;i<size;i++)
        {
            Node* temp=q.front();
            q.pop();
            ans.push_back(temp->data);
            if(temp->left)
            q.push(temp->left);
            if(temp->right)
            q.push(temp->right);
        }
        if(lvl%2==0)
        {
            reverse(ans.begin()+prev,ans.end());
        }
        lvl++;
    }
    return ans;
}