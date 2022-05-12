public class Client {
    public static void main(String args[]){
        Middleware middleware = new RegistrationCheck();
        middleware.linkWith(new PasswordCheck()).linkWith(new StatusCheck());
        middleware.check();
    }
}