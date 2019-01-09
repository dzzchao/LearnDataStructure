public class Array {

    private int[] data;

    /**
     * 数据的真实长度
     */
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 增
     */
    public void addLast(int e) {
        add(size, e);
    }

    public void addFirst(int e) {
        add(0, e);
    }

    /**
     * @param index 下标
     * @param e     value
     */
    public void add(int index, int e) {
        if (size == data.length)
            throw new IllegalArgumentException("add failed. Array is full.");
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed. Require index >= 0 && index <= size.");
        }
        //size = 3,数据就是 012 插入1
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = e;
        size++;
    }

    /**
     * 查
     *
     * @return value
     */
    public int get(int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("get failed. index is illegal.");
        }
        return data[index];
    }

    /**
     * 改
     * @param index index
     * @param e value
     */
    public void set(int index,int e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("set failed. index is illegal.");
        }
        data[index] = e;
    }

    /**
     * 只能取到第一个
     * @param e value
     * @return
     */
    public boolean contains(int e) {
        for(int i = 0;i < size;i++) {
            if(data[i] == e) {
                return true;
            }
        }
        return false;
    }

    /**
     * 找下标
     * @param e
     * @return -1说明无此值
     */
    public int find(int e) {
        for(int i = 0;i < size;i++) {
            if(data[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删
     * @return
     */
    public void delete(int index){
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("delete failed. index is illegal.");
        }
        data[index] = data[index + 1];
        size --;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

