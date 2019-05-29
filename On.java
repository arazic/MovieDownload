public class On implements State {

    InternetState currentInternetState;


    public On(){
        currentInternetState= new NoInternet();
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
