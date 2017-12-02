package io.vavr.a2;

import io.vavr.control.Try;



/**
 *
 * @author armdev
 */
public class Resource {

    private final BackendA backendA = new BackendA();
    private final BackendB backendB = new BackendB();

    public void loadBackend() {

    }

    public String connectToBackendA() throws Exception {
        return backendA.loadService();
    }

    public String connectToBackendB() {
        return backendB.loadService();
    }

    public Try<String> someStandaloneConnection() {
        return Try.of(() -> connectToBackendA());
    }

    public Try<String> connectToMainBackend() {
        return Try.of(() -> connectToBackendA()).recover((throwable) -> connectToBackendB());
    }

    public static void main(String args[]) {
        Resource resource = new Resource();
        
        Try<String> connect = resource.connectToMainBackend();
        if (connect.isSuccess()) {
            System.out.println("Connection is success: " + connect.get());
            Try.success(connect);
        }
        
        if (connect.isFailure()) {
            System.out.println("Connection is fail:  " + connect.get());
            Try.success(connect);
        }
    }

}
