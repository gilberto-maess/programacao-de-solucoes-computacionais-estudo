package com.anima;

public class App {
    public static void main(String[] args) {
        String[] emails = new String[] {
                "teste@localhost",
                "   @localhost",
                "teste@     ",
                "teste",
                "@localhost",
                "teste@",
                "   @    ",
                "@"
        };

        for (String email : emails) {
            System.out.println(
                    String.format(
                            "O email %s é %s.",
                            email,
                            validarEmail(email)));
        }
    }

    private static boolean validarEmail(String email) {
        if (isNullOrEmpty(email)) {
            return false;
        }

        String[] vetorEmail = email.split("@");

        return vetorEmail.length == 2
                && !isNullOrEmpty(vetorEmail[0])
                && !isNullOrEmpty(vetorEmail[1]);
    }

    private static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
