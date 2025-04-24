import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //String.format
        //printf

        //EXEMPLO STRING

//        String disciplina = "Engenharia de Software             ";
//        String professor = "Fulano";
//
//        String texto = String.format("Disciplina: %s - %s", disciplina.trim(), professor.replace("Fulano", "Cicrano"));
//        System.out.println(texto);
//
//        System.out.printf("Disciplina: %s - %s", disciplina.trim(), professor);

        //REGEX FORMATAR EMAIL

//        String email = "Meu e-mail é claramartins@gmail.com.br";
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
//        Matcher matcher = pattern.matcher(email);
//
//        if (matcher.find()) {
//            System.out.println(matcher.group());
//        }
//
//


        //EXERCICIO STRING RETIRAR EXTENSAO DE ARQUIVO

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite o nome do arquivo: ");
//        String nome = scanner.nextLine();
//
//        System.out.printf("Nome do arquivo: %s ", nome.replace(".pdf", "") );
//
//        //Exercicio String
//
//        System.out.println("Digite um texto: ");
//        String novoTexto = scanner.nextLine();
//
//        if (novoTexto.contains("gato")) {
//            System.out.println("gato");
//        }

        //EXERCICIO REGEX FORMATAR VALOR

//
//
//        String valor = "19,9876";
//        Pattern patternValor = Pattern.compile("(\\d+,\\d{2})\\d*");
//        Matcher matcherValor = patternValor.matcher(valor);
//
//        if (matcherValor.find()) {
//            System.out.println(matcherValor.group(1));
//        }
//
//    }

//        System.out.println(formatarTelefone("55999956341"));

        //METODO REGEX FORMATAR NUMERO TELEFONE

//    public static String formatarTelefone(String telefone) {
//
//        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matchers = pattern.matcher(telefone);
//
//        if (matchers.matches()){
//            return String.format("(%s) %s-%s", matchers.group(1), matchers.group(2), matchers.group(3));
//        }
//
//        return "Número de telefone inválido";
//
//    }
//
        //EXERCICIO REGEX VERIFICAR CÓDIGO

//        System.out.println("Digite o código de referência: ");
//        Scanner sc = new Scanner(System.in);
//        String codigoRef = sc.nextLine();
//
//        System.out.printf("Código de referência: %s", verificarCodigoRef(codigoRef));
//
//    }
//
//    public static String verificarCodigoRef(String codigoRef) {
//        String regex = ("^[A-Z]{3}-\\d{4}$");
//        Pattern pattern = Pattern.compile(regex);
////        Matcher matcher = pattern.matcher(codigoRef);
//
//        if (codigoRef.matches(regex)) {
//            return codigoRef;
//        }
//
//        return "Código inválido";
//    }

        //EXERCICIO REGEX FORMATAR CPF

        System.out.println("Digite o CPF: ");
        Scanner sc = new Scanner(System.in);
        String cpf = sc.nextLine();

        System.out.printf("O CPF é: %s", verificarCpf(cpf));

    }

        public static String verificarCpf(String cpf) {

            String regexFormat = "(\\d{3}).(\\d{3}).(\\d{3}-(\\d{2}))";
            String regex = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})";

            Pattern patternFormat = Pattern.compile(regexFormat);
            Pattern pattern = Pattern.compile(regex);

            Matcher matcherFormat = patternFormat.matcher(cpf);
            Matcher matcher = pattern.matcher(cpf);

            if (matcherFormat.matches()) {
                System.out.printf(cpf);
            } else if (matcher.matches()) {
                    return String.format("%s.%s.%s-%s", matcher.group(1), matcher.group(2),
                            matcher.group(3), matcher.group(4));
            }
            return cpf +  " está no formato inválido";
        }


    }



