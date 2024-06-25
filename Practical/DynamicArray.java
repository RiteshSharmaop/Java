

public class DynamicArray {   
    private int array[];   
    private int count;   
    private int sizeofarray;   

public DynamicArray(){   
    array = new int[1];   
    count = 0;   
    sizeofarray = 1;   
    } 
public void addElement(int a){  
    if (count == sizeofarray){   
        growSize();   
    }   
    array[count] = a;   
    count++;   
    }   
public void growSize()   
    {      
    int temp[] = null;   
    if (count == sizeofarray){   
        temp = new int[sizeofarray * 2];   
    {   
    for (int i = 0; i < sizeofarray; i++){   
        temp[i] = array[i];   
    }   
    }   
    }   
    array = temp;   
    sizeofarray= sizeofarray * 2;   
    }    
public void addElementAt(int index, int a){     
    if (count == sizeofarray){   
        growSize();   
    }   
    for (int i = count - 1; i >= index; i--){    
        array[i + 1] = array[i];   
    }   
    array[index] = a;   
    count++;   
    }   
public static void main(String[] args){   
    DynamicArray dynamicArr = new DynamicArray();   
    dynamicArr.addElement(12);   
    dynamicArr.addElement(22);   
    dynamicArr.addElement(35);   
    dynamicArr.addElement(47);   
    dynamicArr.addElement(85);   
    System.out.println("Elements of the array:");   
    for (int i = 0; i < dynamicArr.sizeofarray; i++){   
        System.out.print(dynamicArr.array[i] + " ");   
    }   
    System.out.println();  
    System.out.println("Size of the array: " + dynamicArr.sizeofarray);   
    System.out.println("No. of elements in the array: " + dynamicArr.count);  
    dynamicArr.addElementAt(5, 99);
    System.out.println("\nElements of the array after adding an element at index 5:");  
    for (int i = 0; i < dynamicArr.sizeofarray; i++){   
        System.out.print(dynamicArr.array[i] + " ");   
    }   
    System.out.println();   
    System.out.println("Size of the array: " + dynamicArr.sizeofarray);   
    System.out.println("No. of elements in the array: " + dynamicArr.count);   
    }  
}  


