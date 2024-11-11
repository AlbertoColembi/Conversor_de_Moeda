package ao.myinterprise.module;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private int valor;

    public Conversor(){

    }
    public Conversor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    String endereco = "https://v6.exchangerate-api.com/v6/bbe7a7a294217d05306051de";
    public void ConvertDollarToKwz() throws IOException, InterruptedException {
        String roote = endereco + "/pair/USD/AOA/"+ this.valor;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(roote))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        String json = response.body();
        Current meuTitulo = gson.fromJson(json, Current.class);
        System.out.println("Tendo em conta o câmbio entre as moedas que é "+meuTitulo.conversion_rate() + ", então o resultado da conversão de " + this.valor + " é " + meuTitulo.conversion_result());
    }
    public void convertKwzToDollar() throws IOException, InterruptedException {
        String roote = endereco + "/pair/AOA/USD/"+ this.valor;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(roote))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        String json = response.body();
        Current meuTitulo = gson.fromJson(json, Current.class);
        System.out.println("Tendo em conta o câmbio entre as moedas que é "+meuTitulo.conversion_rate() + ", então o resultado da conversão de " + this.valor + " é " + meuTitulo.conversion_result());
    }
    public void convertWonTOEuro() throws IOException, InterruptedException {
        String roote = endereco + "/pair/KRW/EUR/"+ this.valor;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(roote))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        String json = response.body();
        Current meuTitulo = gson.fromJson(json, Current.class);
        System.out.println("Tendo em conta o câmbio entre as moedas que é "+meuTitulo.conversion_rate() + ", então o resultado da conversão de " + this.valor + " é " + meuTitulo.conversion_result());
    }
    public void convertEuroToWon() throws IOException, InterruptedException {
        String roote = endereco + "/pair/EUR/KRW/"+ this.valor;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(roote))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        String json = response.body();
        Current meuTitulo = gson.fromJson(json, Current.class);
        System.out.println("Tendo em conta o câmbio entre as moedas que é "+meuTitulo.conversion_rate() + ", então o resultado da conversão de " + this.valor + " é " + meuTitulo.conversion_result());
    }
    public void convertRealToPeso() throws IOException, InterruptedException {
        String roote = endereco + "/pair/BRL/CLP/"+ this.valor;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(roote))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        String json = response.body();
        Current meuTitulo = gson.fromJson(json, Current.class);
        System.out.println("Tendo em conta o câmbio entre as moedas que é "+meuTitulo.conversion_rate() + ", então o resultado da conversão de " + this.valor + " é " + meuTitulo.conversion_result());
    }
    public void convertPesoToReal() throws IOException, InterruptedException {
        String roote = endereco + "/pair/CLP/BRL/"+ this.valor;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(roote))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        String json = response.body();
        Current meuTitulo = gson.fromJson(json, Current.class);
        System.out.println("Tendo em conta o câmbio entre as moedas que é "+meuTitulo.conversion_rate() + ", então o resultado da conversão de " + this.valor + " é " + meuTitulo.conversion_result());
    }
}
