public interface STACKADT<T> {
    //đưa phần tử vào vào đỉnh
    public void push(T element);

    // lấy phần tử ra rồi xóa 
    public T pop();

    // lấy phần tử ra nhưng ko xóa
    public T peek();

    //kiểm tra danh sách có rỗng ko
    public boolean isEmpty();

    //lấy số lượng phần tử ra
    public int size();

    //lấy nội dung của phần tử 
    public String  toString();
}
