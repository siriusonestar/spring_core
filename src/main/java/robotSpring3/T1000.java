package robotSpring3;

import robot.interfaces.Hand;
import robot.interfaces.Head;
import robot.interfaces.Leg;
import robot.interfaces.Robot;

public class T1000 implements Robot {
    private Head head;
    private Hand hand;
    private Leg leg;

    public T1000(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public T1000() {
    }

    public void action() {
       head.voice();
       hand.handUp();
       leg.go();
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
