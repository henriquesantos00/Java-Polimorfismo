public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario meiokilo1 = new Funcionario();
        meiokilo1.setCpf("318.093.555-98");
        meiokilo1.setNome(João Grande);
        meiokilo1.setSalario(200);

        System.out.println(meiokilo1.getNome());
        