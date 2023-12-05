package homework_2.serwerRun;

public class Server implements ServerListener{

    boolean isServerWorking;
    private final Listener listener;

    public Server(Listener listener){
        this.listener = listener;
        this.isServerWorking = false;
    }

    public void start(){
        if (!isServerWorking){
            isServerWorking = true;
            listener.messageRes("Статус: " + isServerWorking);
        }else {
            listener.messageRes("Сервер запущен");
        }

    }

    public void stop(){
        if (isServerWorking){
            isServerWorking = false;
            listener.messageRes("Статус: " + isServerWorking);
        } else {
            listener.messageRes("Сервер выключен.");
        }


    }

    @Override
    public void serverListener(boolean status) {
        if(status){
            start();
        }else {
            stop();
        }

    }
}
