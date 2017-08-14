class TestaEmpresa {
    public static void main(String[] args) {

        Empresa e = new Empresa(1);

        for (int i = 0; i < 1; i++) {

            Funcionario f = new Funcionario("White walks", 100);
            f.setDepartamento("King of night");
            f.setRg("0.0.0.0");
            Data dt = new Data(31, 12, 2017);
            f.setDataEntrada(dt);
            e.adicionar(f);
        }

        e.mostraEmpregados();

        // Funcionario f1 = e.getFuncionario(1);
        // f1.mostra();
    }

}