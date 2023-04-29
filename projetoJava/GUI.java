

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame {
	
	private JButton cadJogo;
	private JButton consulJogo;
	private JButton venderJogo;
	private JButton consulVendas;
	private ArrayList<Jogos> jogos;
	
	public GUI() {
		
		this.setTitle("Teste");
		setBounds(0, 0, 700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		cadJogo = new JButton();
		cadJogo.setText("Cadastrar Jogo");
		cadJogo.setBounds(10, 10, 150, 50);
		this.add(cadJogo);
		
		consulJogo = new JButton();
		consulJogo.setText("Consulta de jogos cadastrados");
		consulJogo.setBounds(170, 10, 150, 50);
		this.add(consulJogo);
		
		venderJogo = new JButton();
		venderJogo.setText("Vender jogo");
		venderJogo.setBounds(330, 10, 150, 50);
		this.add(venderJogo);
		
		consulVendas = new JButton();
		consulVendas.setText("Consulta de vendas de jogos");
		consulVendas.setBounds(500, 10, 150, 50);
		this.add(consulVendas);
		
		jogos = new ArrayList<>();
		
		cadJogo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Jogos jogo = new Jogos();
				jogo.setId(jogos.size() + 1);
				jogo.setNomeJogo(JOptionPane.showInputDialog("Nome do jogo"));
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Faixa etaria do jogo"));
				jogo.setFaixaEtaria(idade);
				jogos.add(jogo);
			}
		});
		
		consulJogo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				for(Jogos jogo: jogos) {
					
					int id = jogo.getId();
					int idade = jogo.getFaixaEtaria();
					String nome = jogo.getNomeJogo();
					String status = jogo.getStatus();
					
					JOptionPane.showMessageDialog(null, "id: \n" + id + "\n" + "Nome: \n" + nome + "\n" + "Status: \n" +
					status + "\n" + "Faixa etaria: \n" + idade + "\n", "Jogos", JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
		});
		
		venderJogo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int id = Integer.parseInt(JOptionPane.showInputDialog("Id do jogo"));
				
				for(int i = 0; i < jogos.size() ; i++) {
					
					int testaId = jogos.get(i).getId();
					
					if(id == testaId) {
						
						Jogos indice = jogos.get(i);
						
						indice.setStatus("Vendido");
						indice.setData(JOptionPane.showInputDialog("Data da venda"));
						indice.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Preco do jogo")));
						indice.setDesconto(Double.parseDouble(JOptionPane.showInputDialog("Desconto")));
						JOptionPane.showMessageDialog(null, "Jogo foi vendido", "Resultado", JOptionPane.INFORMATION_MESSAGE);;
						
					}
					
				}
				
			}
		});
		
		consulVendas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				for(int i = 0; i < jogos.size(); i++) {
					
					double preco = jogos.get(i).getPreco();
					String status = jogos.get(i).getStatus();
					
					if(preco > 0 && status.equalsIgnoreCase("Vendido")) {
						
						int id = jogos.get(i).getId();
						int idade = jogos.get(i).getFaixaEtaria();
						double desconto = jogos.get(i).getDesconto();
						String nome = jogos.get(i).getNomeJogo();
						String data = jogos.get(i).getData();
						double valorTotal = preco - desconto;
						
						JOptionPane.showMessageDialog(null, "id: \n" + id + "\n" + "Nome: \n" + nome + "\n" + "Status: \n" 
						+ status + "\n" + "Data: \n" + data + "\n" + "Idade: \n" + idade + "\n" + "Preco: \n" + preco + "\n" +
						"Desconto: \n" + desconto + "\n" + "Valor total do jogo: \n" + valorTotal + "\n");
						
					}
					
				}
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI gui = new GUI();
		gui.setVisible(true);
	}

}
