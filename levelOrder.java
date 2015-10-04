public void levelOrder(TreeNode root, Deque<TreeNode> q)

{

    if(root==null) return;

    q.offer(root);

    TreeNode curr;

    while(!q.isEmpty())

    {

        curr = q.poll();

        System.out.print(curr.key+" ");

        if(curr.left!=null)

            q.offer(curr.left);

        if(curr.right!=null)

            q.offer(curr.right);

    }

}