package Tugas;

public class Plant {

    public void doDestroyable(Destroyable d) {
        if (d instanceof WalkingZombie) {
            WalkingZombie wz = (WalkingZombie) d;
            wz.destroyable();
        } else if (d instanceof JumpingZombie) {
            JumpingZombie jz = (JumpingZombie) d;
            jz.destroyable();
        } else if (d instanceof Barrier) {
            Barrier b = (Barrier) d;
            b.destroyable();
        }
    }
}