
class Max {
    public static void main(String arg[]) {
        if (arg.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }
        int a = Integer.parseInt(arg[0]);
        int b = Integer.parseInt(arg[1]);
        int c = (a + b + Math.abs(a - b)) / 2;
        System.out.println("The Max. of two numbers is " + c);
    }
}
