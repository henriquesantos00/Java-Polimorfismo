public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario meiokiloi = new Funcionario();

        meiokiloi.setCpf("318.893.555-90");
        meiokiloi.setNome("João Grande");
        meiokiloi.setSalario(200.0);

       
        Gerente Marosco = new Gerente();
        Marosco.setCpf("263.959.123");
        Marosco.setNome("Jadir");
        Marosco.setSalario(501.0);
        Marosco.setTipo(1);
        Marosco.setSenha(14378); 

        System.out.println("Nome: " + meiokiloi.getNome());
        System.out.println("O cpf é: " + meiokiloi.getCpf());
        System.out.println("O salário é: " + meiokiloi.getSalario());
        System.out.println("A Bonificação é: " + meiokiloi.getBonificacao());
    }
}
