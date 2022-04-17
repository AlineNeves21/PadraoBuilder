import java.util.Date;

public class FuncionarioBuilder {
    private Funcionario funcionario;

    public FuncionarioBuilder() {
        funcionario = new Funcionario();
    }
    public Funcionario build (){
        if (funcionario.getNomeFuncionario().equals("") || funcionario.getNomeFuncionario().contains("@")){
            throw new IllegalArgumentException("Nome inválido");
        }
        if (funcionario.getMatricula() == 0){
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (funcionario.getCargo().equals("") || funcionario.getCargo().contains("*")){
            throw new IllegalArgumentException("Cargo inválido");
        }
        return funcionario;
    }

    public FuncionarioBuilder setNomeFuncionario(String nomeFuncionario) {
        funcionario.setNomeFuncionario(nomeFuncionario);
        return this;
    }

    public FuncionarioBuilder setCpf(String cpf) {
        funcionario.setCpf(cpf);
        return this;
    }

    public FuncionarioBuilder setRG(String RG) {
        funcionario.setCargo(RG);
        return this;
    }

    public FuncionarioBuilder setCargo(String cargo) {
        funcionario.setCargo(cargo);
        return this;
    }

    public FuncionarioBuilder setDataNascimento(Date dataNascimento) {
        funcionario.setDataNascimento(dataNascimento);
        return this;
    }

    public FuncionarioBuilder setSexo(String sexo) {
        funcionario.setSexo(sexo);
        return this;
    }

    public FuncionarioBuilder setEmail(String email) {
        funcionario.setEmail(email);
        return this;
    }

    public FuncionarioBuilder setTelefone(String telefone) {
        funcionario.setTelefone(telefone);
        return this;
    }

    public FuncionarioBuilder setCep(String cep) {
        funcionario.setCep(cep);
        return this;
    }

    public FuncionarioBuilder setLogradouro(String logradouro) {
        funcionario.setLogradouro(logradouro);
        return this;
    }

    public FuncionarioBuilder setNumero(String numero) {
        funcionario.setNumero(numero);
        return this;
    }

    public FuncionarioBuilder setComplemento(String complemento) {
        funcionario.setComplemento(complemento);
        return this;
    }

    public FuncionarioBuilder setBairro(String bairro) {
        funcionario.setBairro(bairro);
        return this;
    }

    public FuncionarioBuilder setCidade(String cidade) {
        funcionario.setCidade(cidade);
        return this;
    }

    public FuncionarioBuilder setUf(String uf) {
        funcionario.setUf(uf);
        return this;
    }

    public FuncionarioBuilder setMatricula(Integer matricula) {
        funcionario.setMatricula(matricula);
        return this;
    }
}
