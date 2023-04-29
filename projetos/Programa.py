from Jogos import Jogos

listaJogos = []

iniciar = input("Iniciar: [Y/N]?")

while(iniciar == "Y" or iniciar == "y"):

    print("Bem vindo! escolha umas das opcoes: \n" +
          "1 - Cadastrar jogo\n" + 
          "2 - Consulta de jogos cadastrados\n" +
          "3 - Vender Jogo\n"
          "4 - Relatorio financeiro\n"
          "0 - sair do programa\n")
    
    opcao = int(input("Escolher opcao: \n"))

    match opcao:

        case 1:

            nome = input("Nome: ")
            ident = len(listaJogos) + 1
            idade = int(input("Faixa etaria: "))
            jogo = Jogos()
            jogo.setNome(nome)
            jogo.setIdent(ident)
            jogo.setIdade(idade)
            listaJogos.append(jogo)
            print("Produto cadastrado")
        
        case 2:

            for jogos in listaJogos:

                testaStatus = jogos.getStatus()

                if(testaStatus == "Disponivel"):

                    nome = jogos.getNome()
                    ident = jogos.getIdent()
                    idade = jogos.getIdade()
                    status = jogos.getStatus()

                    print(f"Nome: {nome}" +"\n" +
                        f"Id: {ident}" + "\n" + 
                        f"Idade: {idade}" +"\n" +
                        f"Status: {status}" + "\n")
        
        case 3:

            ident = int(input("Id do jogo: \n"))

            for i in range(len(listaJogos)):

                testaId = listaJogos[i].getIdent()

                if(ident == testaId):

                    indice = listaJogos[i]

                    indice.setStatus("Vendido")
                    indice.setData(input("Data: \n"))
                    indice.setPreco(input("Preco: \n"))
                    indice.setDesconto(input("Desconto: "))
                    print("Jogo foi vendido")

        case 4:

            for i in range(len(listaJogos)):

                indice = listaJogos[i]
                preco = indice.getPreco()
                status = indice.getStatus()

                if(status == "Vendido"):

                    ident = indice.getIdent()
                    idade = indice.getIdade()
                    preco = indice.getPreco()
                    desconto = indice.getDesconto()
                    precoTotal = float(preco) - float(desconto)
                    nome = indice.getNome()
                    data = indice.getData()

                    print(f"Nome: {nome}" + "\n" + 
                          f"Id: {ident}" + "\n" + 
                          f"Faixa etaria: {idade}" + "\n" +
                          f"Data da venda: {data}" + "\n" + 
                          f"Status: {status}" + "\n" +
                          f"Preco: {preco}" + "\n" +
                          f"Desconto: {desconto}" + "\n" +
                          f"preco total: {precoTotal}" + "\n")

        case 0:

            break
        
            