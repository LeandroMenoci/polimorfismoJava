public class TesteGerente {
  public static void main(String[] args) {
    Gerente g1 = new Gerente();
    g1.setNome("Leanddro");
    g1.setCpf("222222222-22");
    g1.setSalario(5000.00);

    System.out.println(g1.getNome());
    System.out.println(g1.getCpf());
    System.out.println(g1.getSalario());

    g1.setSenha(222);
    boolean autenticou = g1.autentica(222);
    System.out.println(autenticou);
  }
}
