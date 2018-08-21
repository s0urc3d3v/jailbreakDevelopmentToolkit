public class placeholderImplementationOfGenericErrorInterfaceForDebugging implements genericErrorInterface {
    @Override
    public void setErrorData(String log) {
        System.out.println(log);
    }

    @Override
    public void displayErrorMsgToUser(String msg) {
        System.out.println(msg);
    }
}
