class Jogos:

    nome = None
    status = "Disponivel"
    data = None
    ident = None
    idade = None
    preco = None
    desconto = None

    def __init__(self):

        self.nome
        self.status
        self.data
        self.ident
        self.idade
        self.preco
        self.desconto
    

    def getNome(self):

        return self.nome
    
    def getStatus(self):

        return self.status
    
    def getData(self):

        return self.data
    
    def getIdent(self):

        return self.ident
    
    def getIdade(self):

        return self.idade
    
    def getPreco(self):

        return self.preco
    
    def getDesconto(self):

        return self.desconto
    
    def setNome(self, nome):

        self.nome = nome

    def setStatus(self, status):

        self.status = status

    def setData(self, data):

        self.data = data
    
    def setIdent(self, ident):

        self.ident = ident
    
    def setIdade(self, idade):

        self.idade = idade

    def setPreco(self, preco):

        self.preco = preco
    
    def setDesconto(self, desconto):

        self.desconto = desconto
