class Jogos{

    private string nome;
    private string status = "Disponivel";
    private string data;
    private int id;
    private int idade;
    private double preco;
    private double desconto;

    public string Nome
    {

        get
        {
            return this.nome;
        }
        set
        {
            this.nome = value;
        }

    }

    public string Status
    {
        get
        {
            return this.status;
        }
        set
        {
            this.status;
        }
    }

    public string Data
    {
        get
        {
            return this.data;
        }

        set
        {
            this.data = value;
        }
    }

    public int id
    {
        get
        {
            return this.id;
        }
        set
        {
            this.id = value;
        }
    }

    public int idade
    {
        get
        {
            return this.idade;
        }
        set
        {
            this.idade = value;
        }
    }

    public double preco
    {
        get
        {
            return this.preco;
        }
        set
        {
            this.preco = value;
        }
    }

    public double desconto
    {
        get
        {
            return this.desconto;
        }
        set
        {
            this.desconto = value;
        }
    }

}