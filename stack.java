import java.util.Scanner;
class St_op {

    int top=-1;
    int stack[]=new int[5];
    void push(int item){
        if (top==stack.length-1){
            System.out.println("Overflow");
        }
        else{
            top++;
            stack[top]=item;
        }
        return;
    }
    void pop(){
        int temp;
        if(top==-1){
            System.out.println("underflow");
        }
        else{
            temp=stack[top];
            top--;
            System.out.println(temp);
        }
        return ;
    }
    void traversal(){
        int i;
        if (top==-1) {
            System.out.println("empty");
        }
        else{
            for(i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
}
public class stack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        St_op op=new St_op();
        int value,ch;
        int ans;
        do{
            System.out.println("Main Menu");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.traversal");

            System.out.println("4.exit");

            System.out.println("enter choice");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    do{
                        System.out.println("entered the element to be pushed");
                        value=sc.nextInt();
                        op.push(value);
                        System.out.println("do you want to continue push .... 1/0");
                        ans=sc.nextInt();
                    }while (ans==1);
                    // op.display();
                    break;
                case 2:
                    do{
                        op.pop();
                        System.out.println("do you want to continue pop .... 1/0");
                        ans=sc.nextInt();
                    }while (ans==1);
                    // op.display();
                    break;
                case 3:

                    op.traversal();
                    break;
                case 4:
                    System.out.println("end");
                    break;
                default:
                    System.out.println("invalid input");
                    break;
                }

        }while(ch!=4);

    }
}

