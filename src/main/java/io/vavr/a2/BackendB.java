package io.vavr.a2;

/**
 *
 * @author armdev
 */
public class BackendB {

    public BackendB() {
    }

    public String loadService() {
        System.out.println("BackendB: If I called it means BackendA enable to send any message!");
        return this.success();
    }

    private String failure() throws Exception {
        throw new Exception("BackendB : I am unable provide any service");
    }

    private String success() {
        return "BackendB: So I am ready work untill BackendA will recovered!!!";
    }
}
