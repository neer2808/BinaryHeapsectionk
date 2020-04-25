public class BinaryHeapwithArrayK {
  int arr[];
  int sizeofheap;
  public BinaryHeapwithArrayK(int size)
  {
    arr = new int[size +1];
    sizeofheap = 0;
  }
  public int extract()
  {
    if(sizeofheap ==0)
    {
      System.out.println("Heap is empty ");
      return -1;
    }
    else
    {
      int result = arr[1];
      arr[1] = arr[sizeofheap];
      sizeofheap--;
      heapifyextract(1);
      return result;

    }
  }

  public void heapifyextract(int index)
  {
    int left = index *2;
    int right = (index*2) +1;
    int smallest = 0;
    if(sizeofheap<left)
    {
      return;
    }
    else if (sizeofheap==left)
    {
       if(arr[index]>arr[left])
       {
         int temp = arr[index];
         arr[index]= arr[left];
         arr[left]= temp;
       }
       return ;
    }
    else
    {
      if(arr[left]<arr[right])

        smallest= left;
      else
        smallest= right;
      if(arr[index]> arr[smallest])
      {
        int temp = arr[index];
        arr[index]= arr[smallest];
        arr[smallest]= temp;
      }
    }
    heapifyextract(smallest);

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
  public int sizeofarray()
  {
    return arr.length;
  }
  public int getSizeofheap()
  {
    return sizeofheap;
  }
  public boolean isheapemmpty()
  {
    if(sizeofheap <= 0 )
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public void deleteheap()
  {
    arr = null;
    System.out.println("heap destroy");
  }
  public void peek() {
    if(isheapemmpty() == true) {
      System.out.println("empty");
    }
    else
      System.out.println(arr[1]);
  }
  // represents level order traversal
  public void display()
  {
    for(int i =1;i<=sizeofheap;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
