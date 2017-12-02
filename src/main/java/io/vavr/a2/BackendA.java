package io.vavr.a2;

/**
 *
 * @author armdev
 */
public class BackendA {

    public BackendA() {
    }

    public String loadService() throws Exception {       
        return this.failure();
    }

    public String failure() throws Exception {
        throw new Exception("BackendA: BackendA: Sys Admin Closed down me!! I am unable provide any service");
    }

    private String success() {
        return "BackendA: I am ready!!!!";
    }
}
