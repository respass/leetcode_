package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class FlattenNestedListIterator {
//    /**
//     * // This is the interface that allows for creating nested lists.
//     * // You should not implement it, or speculate about its implementation
//     * public interface NestedInteger {
//     *
//     *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
//     *     public boolean isInteger();
//     *
//     *     // @return the single integer that this NestedInteger holds, if it holds a single integer
//     *     // Return null if this NestedInteger holds a nested list
//     *     public Integer getInteger();
//     *
//     *     // @return the nested list that this NestedInteger holds, if it holds a nested list
//     *     // Return null if this NestedInteger holds a single integer
//     *     public List<NestedInteger> getList();
//     * }
//     */
//    public class NestedIterator implements Iterator<Integer> {
//
//        List<Integer> list = new ArrayList<>();
//        int cur = 0;
//        public NestedIterator(List<NestedInteger> nestedList) {
//            for(NestedInteger m : nestedList) {
//                help(m);
//            }
//
//        }
//
//
//
//        void help(NestedInteger n) {
//            if(n == null)
//                return;
//            if(n.isInteger()) {
//                list.add(n.getInteger());
//                return;
//            }
//            for(NestedInteger m : n.getList()) {
//                help(m);
//            }
//        }
//
//        @Override
//        public Integer next() {
//            if(hasNext()) {
//                return list.get(cur++);
//            }
//            return null;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return list.size() > cur;
//        }
//    }
//
///**
// * Your NestedIterator object will be instantiated and called as such:
// * NestedIterator i = new NestedIterator(nestedList);
// * while (i.hasNext()) v[f()] = i.next();
// */
}
