import stanford.karel.SuperKarel;

public class KarelDefendsDemocracy extends SuperKarel {

/**
	 * 
	 */
public void run() {
	while (frontIsClear()) {
		move();
		checkMiddleBeeper();
		cleanExtraBeepers();
		move();
	}
}
private void checkMiddleBeeper() {
	if (beepersPresent()) {
		move();
		move();
	}
}
private void cleanExtraBeepers() {
	if (noBeepersPresent()) {
		cleanBeepersSouth();
		cleanBeepersNorth();
	}
}
/* Karel moves down*/
private void cleanBeepersSouth() {
	turnRight();
	move();
	while (beepersPresent()) {
		pickBeeper(); 
	}
	turnAround();
	move();
}
/** Karel moves up, */
private void cleanBeepersNorth() {
	move();
	if (frontIsClear()) {
		move();
	}
	while (beepersPresent()) {
		pickBeeper();
	}
	turnAround();
	move();
	turnLeft();
	}
}