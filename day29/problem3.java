public  class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> pre = new HashMap<>();
        for (int i = 0; i < numCourses; i++) pre.put(i, new ArrayList<>());
        for (int[] edge : prerequisites) {
            int course = edge[0];
            int prerequisite = edge[1];
            pre.get(course).add(prerequisite);
        }

        Set<Integer> taken = new HashSet<>();
        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course, pre, taken)) return false;
        }
        return true;
    }

    private boolean dfs(int course, Map<Integer, List<Integer>> pre, Set<Integer> taken) {
        if (pre.get(course).isEmpty()) return true;
        if (taken.contains(course)) return false;
        taken.add(course);
        for (int prerequisite : pre.get(course)) {
            if (!dfs(prerequisite, pre, taken)) return false;
        }
        taken.remove(course);
        pre.get(course).clear(); 
        return true;
    }
}

