import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFuncionario {
    //declara os objetos
    JLabel lblNome = new JLabel("Nome:");
    JLabel lblCargo = new JLabel("Cargo:");
    
    JTextField tfNome = new JTextField();
    JTextField tfCpfCnpj = new JTextField();

    JRadioButton rbGerente = new JRadioButton("Gerente");
    JRadioButton rbFuncionario = new JRadioButton("Funcionário");
    ButtonGroup btgCargos = new ButtonGroup();

    String[] cpfcnpj = {"CPF","CNPJ"};

    JComboBox cbCpfCnpj = new JComboBox<>(cpfcnpj);

    JMenuBar menu = new JMenuBar();
    JMenu menuEditar = new JMenu("Editar");
    JMenu menuCadastrar = new JMenu("Cadastrar");
    JMenu menuVisualizar = new JMenu("Visualizar");
    JMenu menuNovo = new JMenu("Novo");
    JMenuItem itemMorador = new JMenuItem("Morador");
    JMenuItem itemFuncionario = new JMenuItem("Funcionário");

    JButton btCadastrar = new JButton("Cadastrar");
    JButton btCancelar = new JButton("Cancelar");

    JFrame janela = new JFrame("Cadastro Funcionário");

    public TelaFuncionario(){
        //adiciona janela
        janela.setLayout(null);
        janela.setBounds(800,300,400,300);
        janela.setResizable(false);
        janela.setVisible(true);

        //adicionar radio button no grupo
        btgCargos.add(rbFuncionario);
        btgCargos.add(rbGerente);


        //adiciona elementos no menu
        menu.add(menuCadastrar);
        menu.add(menuEditar);
        menu.add(menuVisualizar);
        menuCadastrar.add(menuNovo);
        menuNovo.add(itemMorador);
        menuNovo.add(itemFuncionario);

        janela.setJMenuBar(menu);

        //adiciona componentes na tela
        janela.add(lblNome);
        janela.add(tfNome);
        janela.add(tfCpfCnpj);
        janela.add(rbGerente);
        janela.add(rbFuncionario);
        janela.add(btCadastrar);
        janela.add(btCancelar);
        janela.add(lblCargo);
        janela.add(cbCpfCnpj);

        //localiza elementos na tela
        int x = 15;
        lblNome.setBounds(50,50-x,50,20);
        tfNome.setBounds(100,52-x,180,19);

        cbCpfCnpj.setBounds(50,100-x,65,20);
        tfCpfCnpj.setBounds(130,100-x,85,19);
        
        lblCargo.setBounds(50,150-x,50,20);
        rbFuncionario.setBounds(100,152-x,100,20);
        rbGerente.setBounds(200,152-x,100,20);

        btCadastrar.setBounds(240,185,115,30);
        btCancelar.setBounds(30,185,115,30);

        //instancia classe para eventos
        TrataEventoBto eventoBto = new TrataEventoBto(); 
        btCadastrar.addActionListener(eventoBto);
        btCancelar.addActionListener(eventoBto);
    }

    public class TrataEventoBto implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == btCadastrar){
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
            }
            if (e.getSource() == btCancelar){
                System.exit(0);
            }
        }
    }
}
