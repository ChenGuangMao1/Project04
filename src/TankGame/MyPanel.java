package TankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener {
    Hero hero = null;
    int Encased = 3;
    Vector<EnemyTank> enemyTanks = new Vector<EnemyTank>();

    public MyPanel() {
        hero = new Hero(100, 100);
        // 初始化敌方坦克
        for (int i = 0; i < Encased; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            enemyTank.setDirect(2);
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        // 调用父类的paint方法
        super.paint(g);
        // 绘制一个矩形，填充颜色
        g.fillRect(0, 0, 1000, 750);
        // 绘制坦克
        drawTank(hero.getX(), hero.getY(), hero.getDirect(), 1, g);
        for (int i = 0; i < enemyTanks.size(); i++) {
            drawTank(enemyTanks.get(i).getX(), enemyTanks.get(i).getY(), enemyTanks.get(i).getDirect(), 0, g);
        }
    }

    public void drawTank(int x, int y, int direct, int type, Graphics g) {
        // 根据type参数设置坦克的颜色
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;

        }
        // 根据direct参数绘制坦克的方向
        switch (direct) {
            case 0:
                // 绘制向上的坦克
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 3:
                // 绘制向右的坦克
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2:
                // 绘制向下的坦克
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 1:
                // 绘制向左的坦克
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
        }
    }

    @Override
    // 重写keyTyped方法，当用户在文本框中输入字符时调用
    public void keyTyped(KeyEvent e) {

    }

    @Override
    // 重写父类方法，当按键被按下时调用
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            // 当按下W键时，将hero的方向设置为向上
            hero.setDirect(0);
            hero.moveUp();
        }
        else if (e.getKeyCode() == KeyEvent.VK_D) {
            // 当按下D键时，将hero的方向设置为向右
            hero.setDirect(3);
            hero.moveRight();
        }
        else if (e.getKeyCode() == KeyEvent.VK_S) {
            // 当按下S键时，将hero的方向设置为向下
            hero.setDirect(2);
            hero.moveDown();
        }
        else if (e.getKeyCode() == KeyEvent.VK_A) {
            // 当按下A键时，将hero的方向设置为向左
            hero.setDirect(1);
            hero.moveLeft();
        }
        this.repaint();
    }

    @Override
    // 重写父类方法，当按键被释放时调用
    public void keyReleased(KeyEvent e) {

    }
}
