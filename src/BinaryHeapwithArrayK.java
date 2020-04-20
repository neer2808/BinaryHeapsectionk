public class BinaryHeapwithArrayK {
  int arr[];
  int sizeofheap;

  public BinaryHeapwithArrayK(int size)
  {
    arr = new int[size +1];
    sizeofheap = 0;
  }
  public  void insert(int value)
  {
    arr[sizeofheap+1]= value;
    sizeofheap++;
    heapify(sizeofheap);
  }
  public void heapify(int index) {
    int parent = index / 2;
    if(index<=1)
    {
      return;
    }
    if(arr[index]<arr[parent])
    {
      int temp = arr[index];
      arr[index]= arr[parent];
      arr[parent]= temp;
    }
    heapify(parent);
  }
  public void display()
  {
    for(int i =1;i<=sizeofheap;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
