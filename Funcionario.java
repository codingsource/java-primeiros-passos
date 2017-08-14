class Funcionario {

    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDataEntrada() {
        return this.dataEntrada.getFormatData();
    }

    public void setDataEntrada(Data data) {
        this.dataEntrada = data;
    }
    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void recebeAumento(double aumento) {
         this.setSalario(getSalario() + aumento);
    }

    public double calculaGanhoAnual() {
        return this.getSalario() * 12;
    }

    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário R$: " + this.salario);
        System.out.println("Data entrada: " + this.dataEntrada.getFormatData());
        System.out.println("Rg: " + this.rg);
        System.out.println("Salário anual R$: " + this.calculaGanhoAnual() + "\n");
    }
}