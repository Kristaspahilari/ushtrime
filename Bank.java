import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Client> clients;

    public Bank(String name){
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Client> getClients(){
        return clients;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setClients(ArrayList<Client> clients){
        this.clients = clients;
    }
    public void addClient(Client client){
        clients.add(client);
    }
    public boolean equals(Bank bank){
        if (this.name == bank.name){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        return "Bank: " + name;
    }

    public String printClients(){
        StringBuilder sb = new StringBuilder();
        for(Client client: clients){
            sb.append(client.toString()).append("\n");
        }
        return sb.toString();
    }
}