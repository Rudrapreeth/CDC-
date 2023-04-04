class Node:
    def __init__(self,value):
        self.data=value
        self.left=None
        self.right=None

class Tree:
    def add_ele(self,root,value):
        new_node=Node(value)
        if value<root.data:
            if root.left==None:
                root.left=new_node
            else:
                self.add_ele(root.left,value)
        else:
            if root.right==None:
                root.right=new_node
            else:
                self.add_ele(root.right,value)

def inorder(self,root):
    if root.left!=None:
        print(root.data)

    if root.right!=None:
        self.inorder(root.right)

def preorder(self,root):
    if root.left!=None:
        self.preorder(root.left)
    if root.right!=None:
        self.preorder(root.right)

def postorder(self,root):
    if root.left!=None:
        self.postorder(left.right)
        if root.right!=None:
            self.postorder(left.root)

ob=Tree()
root=Node(10)
ob.add_ele(root,5)
ob.add_ele(root,15)
ob.add_ele(root,2)
ob.add_ele(root,6)
ob.add_ele(root,12)
ob.add_ele(root,17)
ob.inorder(root)
print()
ob.preorder(root)
print()
ob.postorder(root)
print()
            
    
    
    
    
        
            
        
        
