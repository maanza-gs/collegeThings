class TreeNode:
    def __init__(self, data):
        self.data=data
        self.right=None
        self.left=None
    
    def insert(self, data):
      if self.data:
         if data < self.data:
            if self.left is None:
               self.left = TreeNode(data)
            else:
               self.left.insert(data)
         elif data > self.data:
            if self.right is None:
               self.right = TreeNode(data)
            else:
                  self.right.insert(data)
      else:
         self.data = data
         
         
class BinarySearchTree:
    def __init__(self,r,l):
        self.root = r
        self.limit = l
    
    def is_empty(self):
        if self.root == None:
            return True
        else:
            return False