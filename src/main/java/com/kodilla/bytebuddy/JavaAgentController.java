package com.kodilla.bytebuddy;

public class JavaAgentController {

    public boolean isUserDoingSomething() {
        User user = new User();
        user.doSomething();
        return true;
    }
}
