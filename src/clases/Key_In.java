package clases;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_In implements KeyListener {

    @Override
    public void keyReleased(KeyEvent ke) {

        Interface messenger = new Interface();

        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

            System.out.println("nice");
            messenger.B_OR_D();

        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

}
