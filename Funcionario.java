public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario meiokilol = new Funcionario();
        
        meiokilol.setCpf("318.093.555-98");
        meiokilol.setNome("João Grando");
        meiokilol.setSalario(200);

        System.out.println(meiokilol.getNome());
    }
}