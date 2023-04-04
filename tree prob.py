# Node class definition
class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

# Recursive function to calculate height of the tree
def height(node):
    if node is None:
        return 0
    else:
        left_height = height(node.left)
        right_height = height(node.right)
        
        # Return the maximum height of the left or right subtree
        return max(left_height, right_height) + 1

# Example usage
# Create a sample binary tree
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

# Find the height of the tree
tree_height = height(root)

# Print the height of the tree
print( tree_height)
