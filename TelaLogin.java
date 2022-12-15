import javax.swing.*;

public class TelaLogin {
    //instância de objetos
    JLabel lblNome = new JLabel("Nome:");
    JLabel lblSenha = new JLabel ("Senha:");
    JLabel lblEsqueceu = new JLabel("Esqueceu a senha?");

    JTextField tfNome = new JTextField();
    JPasswordField pswfSenha = new JPasswordField();

    JButton btLogin = new JButton("Login");

    String [] usuario = {"Morador", "Gerente", "Funcionário"};
    JComboBox listaUsuario = new JComboBox<>(usuario);
   
    // instanciar a janela
    JFrame janela  = new JFrame("Login");

    TelaLogin() {
        janela.setLayout(null);

        janela.setBounds(800,300,500,300);
		
        // localização elementos
        lblNome.setBounds(100, 70, 50, 20);
        tfNome.setBounds(150, 72, 180, 19);
        listaUsuario.setBounds(350, 72, 80, 19);
        lblSenha.setBounds(100, 100, 50, 20);
        pswfSenha.setBounds(150, 103, 180, 19);
        lblEsqueceu.setBounds(100, 130, 200, 20);
        btLogin.setBounds(190, 170, 100, 20);

        //adiciona componentes na tela
        janela.add(lblNome);
        janela.add(tfNome);
        janela.add(lblSenha);
        janela.add(pswfSenha);
        janela.add(lblEsqueceu);
        janela.add(listaUsuario);
        janela.add(btLogin);

        // define janela e mostra
        janela.setResizable(false);
        janela.setVisible(true);
    }
}
