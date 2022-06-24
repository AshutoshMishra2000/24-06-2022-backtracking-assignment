public class towerOfHanoi {

    public static void Hanoi(int disks, char from, char to, char aux) {
        if (disks == 0) {
            return;
        }

        Hanoi(disks-1,from,aux,to);
        System.out.println("disk "+disks+" moved from "+from+" to "+to);
        Hanoi(disks-1, aux,to,from);
    }

    public static void main(String[] args) {
Hanoi(3,'A','B','C');
    }
}
