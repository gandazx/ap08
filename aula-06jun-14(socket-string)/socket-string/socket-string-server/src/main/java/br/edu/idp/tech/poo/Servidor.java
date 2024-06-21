package br.edu.idp.tech.poo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Servidor iniciado. Aguardando conexões...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     Scanner scanner = new Scanner(System.in)) {

                    System.out.println("Cliente conectado. Criado por J.R.R. Tolkien.");

                    while (true) {
                        String mensagem = in.readLine();
                        if (mensagem == null || "sair".equalsIgnoreCase(mensagem)) {
                            break;
                        }

                        System.out.println("Mensagem recebida do Eru:");
                        System.out.println("  >> " + mensagem);

                        System.out.print("Resposta para Melkor::: ");
                        String resposta = scanner.nextLine();
                        out.println(resposta);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



