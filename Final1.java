import java.lang.*;

class Demo
{
    public int i;                //non-constant or non final characteristics
    public final int j = 20;    //constant characteristics (1st way: immediate initialisation)
    public final int k;         //constant char (2nd way: initalise in constructor)

    public Demo()
    {
        i=10;
        k=30;
    }

    public Demo(int a, int b)    //parameterised constructor
    {
        this.i=a;         //using 'this' is optional
        this.k=b;         //using 'this' is optional
    }

    public void fun()
    {
        i++;   
        //j++;     not allowed to modify constant characteristics
        //k++;     not allowed to modify constant characteristics
    }
}

class Final1
{
    public static void main (String c[])
    {
        Demo obj1 = new Demo();
        obj1.fun();
        System.out.println(obj1.i);    //11
        System.out.println(obj1.j);    //20
        System.out.println(obj1.k);    //30

        Demo obj2= new Demo(40,50);
        obj2.fun();
        System.out.println(obj2.i);     //41
        System.out.println(obj2.j);     //20
        System.out.println(obj2.k);     //50

    }
}

//k can have 2 values but constant means it cannot be modified
//Since k is not immediately initialised, it is initialised in constructor therfore jevdha fun che objects create karu tevde vela k create hotil but k ekda initialise zale ke modify nahi karu shakat because its final. 