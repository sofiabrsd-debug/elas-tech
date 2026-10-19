package petshop;

public class Pet2 {

    public String nome;
    public String especie;
    public double peso;
    public String porte;

    public String definirPorte() {

        if (peso<10) {
             return "Pequeno";
         } else if (peso>=10 && peso<=25) {
            return "Médio";
         } else {
             return "Grande";
        }

    }
}
