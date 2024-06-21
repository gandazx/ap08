package br.edu.idp.tech.poo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Programa de chat prolixo iniciado. Criado por J.R.R. Tolkien.");

            while (true) {
                System.out.print("Eru::: ");
                String mensagem = scanner.nextLine();

                if ("sair".equalsIgnoreCase(mensagem)) {
                    break;
                }

                out.println(mensagem);
                String resposta = in.readLine();
                System.out.println("A sua mensagem foi enviada para Melkor e ele respondeu:");
                System.out.println(">> " + resposta);
                System.out.println("(a mensagem original foi \"" + mensagem + "\")");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


