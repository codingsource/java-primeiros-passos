class Empresa {
    
    Funcionario[] empregados;
    private String nome;
    private String cnpj;
    private int posicao = 0;
    private static int totalDeContas = 0;


    public Empresa(){}

    public Empresa(int qntFuncionario) {
        this.empregados = new Funcionario[qntFuncionario];
    } 

    public void setNome(String nome) {
        this.nome = nome;
    }

   public String getNome() {
       return this.nome;
   }

   public void setCnpj(String cnpj) {
       this.cnpj = cnpj;
   }

   public Funcionario getFuncionario(int posicao) {
       return this.empregados[posicao];
   }

    public boolean contem(Funcionario f) {
        for (int i = 0; i <= this.posicao; i++) {
            if (f == this.empregados[i]) {
                return true;
            }
        }
        return false;
    }

    public void adicionar(Funcionario f) {
        this.empregados[this.posicao] = f;
        this.posicao++;
    }

    public void mostraEmpregados() {
        int posicao = 0;
        for (Funcionario empregado: this.empregados) {
            if (empregado == null) continue;
            System.out.println("Funcionário na posição: " + posicao);
            empregado.mostra();
            posicao++;
        }
    }
}