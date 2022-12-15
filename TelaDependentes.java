import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDependetes {
    //instancia os objetos
    JLabel lblQuantidade = new JLabel("Quantidade de dependentes:");
    JLabel lblNome = new JLabel("Nome:");
    JLabel lblCpf = new JLabel("CPF:");
    JLabel lblIdade = new JLabel("Idade:");

    JTextField tfNome = new JTextField();
    JTextField tfCpf = new JTextField();
    JTextField tfIdade = new JTextField();
     

    String[] quantidade = {"1","2","3","4","5","6","7","8","9"};
    String[] idade = {"0","1","2","3","4","5","6","7","8","9","10","11","12","14","15","16","17"};

    JComboBox cbQuantidade = new JComboBox<>(quantidade);
    JComboBox cbIdade = new JComboBox<>(idade);


    JButton btCadastrar = new JButton("Cadastrar");
    JButton btCancelar = new JButton("Cancelar");

    JFrame janela = new JFrame();

    public TelaDependetes(){
        janela.setLayout(null);
        janela.setResizable(true);
        janela.setVisible(true);

        janela.setBounds(800,300,300,400);

        //localiza elementos
        lblQuantidade.setBounds(60, 30, 180, 30);
        cbQuantidade.setBounds(120,70,40,30);
        
        lblNome.setBounds(20,120,50,40);
        tfNome.setBounds(70,132,180,19);
        lblCpf.setBounds(20,160,50,40);
        tfCpf.setBounds(70,172,85,19);
        lblIdade.setBounds(20,200,50,40);
        cbIdade.setBounds(70,205, 40, 30);

        btCadastrar.setBounds(160,285,100,30);
        btCancelar.setBounds(20,285,100,30);

        //adiciona elementos
        janela.add(lblQuantidade);
        janela.add(cbQuantidade);
        janela.add(lblNome);
        janela.add(tfNome);
        janela.add(lblCpf);
        janela.add(tfCpf);
        janela.add(btCadastrar);
        janela.add(btCancelar);
        janela.add(lblIdade);
        janela.add(cbIdade);
        
        //trata eventos
        TrataEventoBto eventoBto = new TrataEventoBto();
        btCadastrar.addActionListener(eventoBto);
        btCancelar.addActionListener(eventoBto);
    }

    //instancia classe de eventos
    public class TrataEventoBto implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == btCadastrar){
                JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
            }
            if (e.getSource() == btCancelar){
                System.exit(0);
            }
        }
    }
}
