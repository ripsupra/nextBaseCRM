package com.nextBaseCRM.tests;

public class LogInCheck extends LogInMethod {
    public static void main(String[] args) {
        LogInCheck check = new LogInCheck();

        check.logIn("helpdesk47@cybertekschool.com", "UserUser");
        check.logIn("helpdesk48@cybertekschool.com", "UserUser");
        check.logIn("marketing47@cybertekschool.com", "UserUser");
        check.logIn("marketing48@cybertekschool.com", "UserUser");
        check.logIn("hr47@cybertekschool.com", "UserUser");
        check.logIn("hr48@cybertekschool.com", "UserUser");
    }
}
