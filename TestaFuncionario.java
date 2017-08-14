class TestaFuncionario {
    public static void main(String[] args) {
        // Funcionario f1 = new Funcionario();
        // f1.nome = "San";
        // f1.departamento = "Biblioteca";
        
        // Funcionario f2 = new Funcionario();
        // f2.nome = "San";
        // f2.departamento = "Biblioteca";

        // if(f1 == f2){
        //     System.out.println("São iguais!!");
        // }else {
        //     System.out.println("São diferentes!!");
        // }

        // Funcionario f3 = new Funcionario();

        // f3 = f2;
        
        // System.out.println("");

        // if(f2 == f3){
        //     System.out.println("São iguais!!");
        // }else {
        //     System.out.println("São diferentes!!");
        // }

        // System.out.println("");
        
        Empresa e = new Empresa();
        Funcionario f = new Funcionario("White walks", 100);
        f.setDepartamento("King of night");
        f.setRg("0.0.0.0");
        Data dt = new Data(31, 12, 2017);
        f.setDataEntrada(dt);
        e.adicionar(f);
        e.mostraEmpregados();

    }
}
