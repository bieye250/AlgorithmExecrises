# Note some acquisitons casually
[toc]
## Java sort()与稳定排序--2022/07/18-17:39
稳定排序：不改变相同元素的相对位置。
稳定的排序：插入排序，归并排序
sort()基于数据量选择排序方式。
- 小于60插入排序 
- 大于60根据数据类型判断
    - 基本类型：快速排序
    - Object类：归并排序（考虑稳定性）
另sort()对无序集合排序不稳定，如HashMap，应使用LinkedHashMap

## ArrayList与Arrays$ArrayList--2022/07/19-08:30
当Arrays.asList()返回的ArrayList为Arrays内部实现类，该类实现AbstractList时未重写add()方法，导致对象的size()固定
```java
@SafeVarargs
@SuppressWarnings("varargs")
public static <T> List<T> asList(T... a) {
        return new ArrayList<>(a);
}

private static class ArrayList<E> extends AbstractList<E>{
        public int size() {}

        public Object[] toArray() {}

        public <T> T[] toArray(T[] a) {}

        public E get(int index) {}

        public E set(int index, E element) {}

        public int indexOf(Object o) {}

        public boolean contains(Object o) {}
}
```
而AbstractList<E>内部add()方法则抛出异常
```java
public boolean add(E e) {
        add(size(), e);
        return true;
}

public void add(int index, E element) {
        throw new UnsupportedOperationException();
}
```
这使得Arrays.asList()不能添加元素，只能修改元素。