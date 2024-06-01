import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Create {
    public static void cadastrar(String nome, String idade, String cpf, String cep, String beneficio) {
        boolean jaCadastrado = false;
        String arquivo = "dados.txt";

        try (BufferedReader leitor = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(", ");
                if (campos.length == 4 && campos[2].equals(cpf)) {
                    jaCadastrado = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!jaCadastrado) {
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo, true), StandardCharsets.UTF_8))) {
                writer.write(nome + ", " + idade + ", " + cpf + ", " + cep + ", " + beneficio);
                writer.newLine();
                System.out.println("Dados cadastrados!");
            } catch (IOException e) {
                e.printStackTrace(); 
            }
        } else {
            System.out.println("CPF já está cadastrado.");
        }
    }
}
