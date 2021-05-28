/* 编写程序，使用一维数组，模拟栈数据结构。
	要求：
		1、这个栈可以存储java中的任何引用类型的数据。
		2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
		3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
		4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
		5、假设栈的默认初始化容量是10.（请注意无参数构造方法的编写方式。） */
public class MyStack {
    private Object[] arr;
    private int index;

    // Constructor
    public MyStack() {
        this.arr = new Object[10];
        this.index = -1;
    }

    public void push(Object obj) {
        if (index >= arr.length-1) {
            System.out.println("栈已满，压栈失败！");
            return;

        }
        index++;
        arr[index] = obj;
        System.out.println("元素" + arr[index] + "压栈成功");
    }

    public void pop() {
        if (index < 0) {
            System.out.println("栈已空，弹栈失败！");
            return;
        }
        System.out.println("元素" + arr[index] + "弹栈成功");
        index--;
    }

    // setter and getter
    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public Object[] getArr() {
        return arr;
    }
}
