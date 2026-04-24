package EXCEPTION_HANDLING.RTOS;
class Banking {

    static void withdraw(int bal, int amt) throws Exception {

        if(amt > bal) {
            throw new Exception("Low balance");
        }

        System.out.println("Success");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 9000);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
