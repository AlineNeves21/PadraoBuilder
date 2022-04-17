import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioBuilderTest {

    @Test
    void deveRetornarExcecaoParaFuncionarioSemNome() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setMatricula(1)
                    .setCargo("Teste")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

        @Test
        void deveRetornarExcecaoParaFuncionarioSemMatricula () {
            try {
                FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
                Funcionario funcionario = funcionarioBuilder
                        .setNomeFuncionario("Aline teste")
                        .setCargo("Teste")
                        .build();
                fail();
            } catch (IllegalArgumentException e) {
                assertEquals("Matrícula inválida", e.getMessage());
            }
        }

    @Test
    void deveRetornarExcecaoParaFuncionarioSemCargo () {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNomeFuncionario("Aline teste")
                    .setMatricula(1)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cargo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioComNomeInvalido() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNomeFuncionario("Aline @")
                    .setMatricula(1)
                    .setCargo("Teste")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioComNomeErrado() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNomeFuncionario("@")
                    .setMatricula(1)
                    .setCargo("Teste")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioComCargoInvalido() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNomeFuncionario("Aline @")
                    .setMatricula(1)
                    .setCargo("Teste *")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFuncionarioComCargoErrado() {
        try {
            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNomeFuncionario("Aline @")
                    .setMatricula(1)
                    .setCargo("*")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarFuncionarioValido () {

            FuncionarioBuilder funcionarioBuilder = new FuncionarioBuilder();
            Funcionario funcionario = funcionarioBuilder
                    .setNomeFuncionario("Aline teste")
                    .setMatricula(1)
                    .setCargo("Teste")
                    .build();

            assertNotNull(funcionario);
    }
}


