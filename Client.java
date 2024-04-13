public class Client {
    private String name;
    private String surname;
    private String accountNumber;
    private Bank bank;

    public Client(String name, String surname, String accountNumber){
        this.name = name;
        this.surname = surname;
        this.accountNumber = accountNumber;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBank(Bank bank){
        this.bank = bank;
    }

    public String toString(){
        return "Client " + name + " " + surname + " " + accountNumber;
    }
}
