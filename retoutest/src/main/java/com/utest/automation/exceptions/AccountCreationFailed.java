package com.utest.automation.exceptions;

@SuppressWarnings("Failure")
public class AccountCreationFailed extends AssertionError {

        public AccountCreationFailed() {

            super("The account creation process failed");
        }
}
