public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigKilos = bigCount * 5;

        if (bigKilos + smallCount < goal) {
            return false;
        }

        if (goal % 5 > smallCount) {
            return false;
        }

        return true;
    }

}
