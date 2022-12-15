import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro {
    //instancia os objetos
    JLabel lblNome = new JLabel("Nome:");
    JLabel lblCpf = new JLabel("CPF:");
    JLabel lblEmail = new JLabel("E-mail:");
    JLabel lblSexo = new JLabel("Sexo:");
    JLabel lblDtNasc = new JLabel("Data nas.:");
    JLabel lblTelefone = new JLabel("Telefone:");
    JLabel lblBloco = new JLabel("Bloco:");
    JLabel lblAndar = new JLabel("Andar:");
    JLabel lblApartamento = new JLabel("Apto:");
    JLabel lblVaga = new JLabel("Vaga:");
    JLabel lblSecao = new JLabel("Seção:");
    
    JTextField tfNome = new JTextField();
    JTextField tfCpf = new JTextField();
    JTextField tfEmail = new JTextField();
    JTextField tfTelefone = new JTextField();
    JTextField tfDataNascimento = new JTextField();

    JButton btDependentes = new JButton("Dependentes");
    JButton btCadastrar = new JButton("Cadastrar");
    JButton btCancelar = new JButton("Cancelar");
    JButton therock = new JButton();

    JMenuBar barraMenu = new JMenuBar();
    JMenu menuEditar = new JMenu("Editar");
    JMenu menuVisualizar = new JMenu("Vizualizar");
    JMenu menuCadastrar = new JMenu("Cadastrar");
    JMenu menuNovo = new JMenu("Novo");
    JMenuItem itemMorador = new JMenuItem("Morador");
    JMenuItem itemFuncionario = new JMenuItem("Funcionário");

    JRadioButton rbMasculino = new JRadioButton("Masculino");
    JRadioButton rbFeminino = new JRadioButton("Feminino");
    JRadioButton rbNaoDeclarar = new JRadioButton("Prefiro não declarar");
    ButtonGroup btgSexo = new ButtonGroup();
    
    String[] apartamento = {"1","2","3","4","5","6","7","8"};
    String[] andar = {"1","2","3","4","5","6","7","8","9"};
    String[] vaga = {"1","2","3","4","5","6","7","8","9","10","11","12"};
    String[] seçao = {"A","B","C","D","E","F","G","H"};
    String[] bloco = {"1","2","3","4","5"};
    
    JComboBox listaApartamento = new JComboBox<>(apartamento);
    JComboBox listaAndar = new JComboBox<>(andar);
    JComboBox listaBloco = new JComboBox<>(bloco);
    JComboBox listaVaga = new JComboBox<>(vaga);
    JComboBox listaSeçao = new JComboBox<>(seçao);

    // Instancia a Janela
     JFrame janela = new JFrame("Cadastro");

    public TelaCadastro(){
        janela.setLayout(null);
        janela.setBounds(400,100,800,400);
        janela.setResizable(false);
        janela.setVisible(true);

        //Adiciona radio button no grupo
        btgSexo.add(rbMasculino);
        btgSexo.add(rbFeminino);
        btgSexo.add(rbNaoDeclarar);

        //adiciona os elementos no menu
        barraMenu.add(menuCadastrar);
        menuCadastrar.add(menuNovo);
        menuNovo.add(itemMorador);
        menuNovo.add(itemFuncionario);
        barraMenu.add(menuEditar);
        barraMenu.add(menuVisualizar);

        janela.setJMenuBar(barraMenu);

        //adiciona os componentes na tela
        janela.add(lblNome);
        janela.add(lblEmail);
        janela.add(lblCpf);
        janela.add(lblSexo);
        janela.add(lblDtNasc);
        janela.add(lblTelefone);
        janela.add(lblBloco);
        janela.add(lblAndar);
        janela.add(lblApartamento);
        janela.add(lblVaga);
        janela.add(lblSecao);
        janela.add(tfNome);
        janela.add(tfCpf);
        janela.add(tfEmail);
        janela.add(tfTelefone);
        janela.add(tfDataNascimento);
        janela.add(btDependentes);
        janela.add(btCadastrar);
        janela.add(btCancelar);
        janela.add(barraMenu);
        janela.add(rbMasculino);
        janela.add(rbFeminino);
        janela.add(rbNaoDeclarar);
        janela.add(listaApartamento); 
        janela.add(listaAndar);
        janela.add(listaBloco);
        janela.add(listaSeçao);
        janela.add(listaVaga);

        janela.add(therock);
        therock.setVisible(false);


        //localiza componentes na tela
        int x = -15;
        lblNome.setBounds(50, 70+x, 50, 20);
        tfNome.setBounds(100, 72+x, 180, 19);
        lblCpf.setBounds(50,120+x,50,20);
        tfCpf.setBounds(100, 122+x, 85,19);
        lblEmail.setBounds(50,170+x,50,20);
        tfEmail.setBounds(100, 172+x, 180,19);

        lblSexo.setBounds(350,70+x, 50, 20);
        rbMasculino.setBounds(420,72+x,90,20);
        rbFeminino.setBounds(515,72+x,90,20);
        rbNaoDeclarar.setBounds(605,72+x,150,20);
        //rbNaoDeclarar.setVisible(false);

        lblDtNasc.setBounds(350,120+x,100,20);
        tfDataNascimento.setBounds(430,122+x,65,20);
        lblTelefone.setBounds(350,170+x,60,20);
        tfTelefone.setBounds(430,172+x,95,20);
        
        lblApartamento.setBounds(50,230+x,40,30);
        listaApartamento.setBounds(85,230+x,40,30);
        lblAndar.setBounds(140,230+x,40,30);
        listaAndar.setBounds(185,230+x,40,30);
        lblBloco.setBounds(245,230+x,40,30);
        listaBloco.setBounds(290,230+x,40,30);
        lblVaga.setBounds(425,230+x,40,30);
        listaVaga.setBounds(465,230+x,40,30);
        lblSecao.setBounds(525,230+x,40,30);
        listaSeçao.setBounds(570,230+x,40,30);

        btCadastrar.setBounds(630,285,115,30);
        therock.setBounds(400,150,200,200);
        btDependentes.setBounds(500,285,115,30);
        btCancelar.setBounds(50,285,115,30);
        therock.setIcon(new ImageIcon("images.jpg"));

        // instancia a classe para eventos
        TrataEventoBto eventoBto = new TrataEventoBto(); 
        btCadastrar.addActionListener(eventoBto);
        btDependentes.addActionListener(eventoBto);
        btCancelar.addActionListener(eventoBto);
        itemFuncionario.addActionListener(eventoBto);

    }
    //classe para eventos
    public class TrataEventoBto implements ActionListener{
    
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == btCadastrar){
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
            }
            if (e.getSource() == btDependentes){
                TelaDependetes Td1 = new TelaDependetes();
            }
            if (e.getSource() == btCancelar){
                System.exit(0);
                
            }
            if (e.getSource() == itemFuncionario){
                TelaFuncionario tf1 = new TelaFuncionario();
            }
        }
    }
    

}
