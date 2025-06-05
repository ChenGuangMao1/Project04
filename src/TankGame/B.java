package TankGame;

public class B {

    public void make(){
        // 创建一个C对象，并将当前对象作为参数传递给C的构造函数
        new C(this);
    }
}
