package TankGame;

import javax.swing.*;

public class HspTankGame01 extends JFrame {
    MyPanel mp = null;
// 构造方法
    public HspTankGame01() {
        // 创建MyPanel对象
        mp = new MyPanel();
        // 将MyPanel对象添加到JFrame中
        this.add(mp);
        // 设置JFrame的大小
        this.setSize(1000, 750);
        // 将MyPanel对象添加到键盘监听器中
        this.addKeyListener(mp);
        // 设置JFrame的默认关闭操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置JFrame可见
        this.setVisible(true);

    }
    public static void main(String[] args) {
        HspTankGame01 hspTankGame01 = new HspTankGame01();
    }
}
