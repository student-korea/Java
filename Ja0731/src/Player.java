
abstract public class Player {
	int num;
	int Pos;
	
	abstract void play(int pos);
	abstract void stop(int pos);
	abstract void jump(int pos);
	abstract void goAndStop(int pos);
}
