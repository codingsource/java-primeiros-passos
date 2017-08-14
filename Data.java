class Data {

    public int dia;
    public int mes;
    public int ano;
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        if (! isValidaData(dia, mes, ano)) {
            System.out.println("A data " + this.getFormatData() + " não existe!");
        }
    }
    
    public boolean isValidaData(int dia, int mes, int ano){
        if(dia <= 0 || mes <= 0) {
            return false;
        }
        
        int ultimoDiaDoMes = 31;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            ultimoDiaDoMes = 30;
        } else if(mes == 2) {
            ultimoDiaDoMes = 28;
            if ((ano % 400 == 0) || ((ano % 4 ==0) && (ano % 100 != 0))) {
                ultimoDiaDoMes = 29;
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }
        
        return true;
    }

    public String getFormatData() {

        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
}