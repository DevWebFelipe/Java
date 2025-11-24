# Formação Java - Rocketseat

Este repositório guarda exemplos, conteúdos e exercícios de fixação da formação em Java da Rocketseat. É organizado para permitir estudos práticos, compilação local e referência rápida dos exercícios feitos durante o curso.

**Descrição**: Repositório de apoio à formação em Java com códigos de exemplo, atividades e PDFs de referência.

**Estrutura**:
- `Atividades`: exercícios separados por enunciados (ex.: `Criar classe ContaCorrente.java`).
- `Meu-Programa`: projeto de exemplo com código-fonte em `src` (contém `Main.java`, `MinhaPrimeiraClasse.java` e exercícios de indentação).
- `PDFs`: materiais em PDF usados como referência.

**Pré-requisitos**:
- Java Development Kit (JDK) instalado (versão 8+ recomendada).
- Variável de ambiente `JAVA_HOME` opcional, mas útil.

**Como compilar e executar (PowerShell)**:

Exemplo rápido — compilar e executar o `Main.java` dentro de `Meu-Programa/src`:

```powershell
cd Meu-Programa\src
javac Main.java
java Main
```

Se houver múltiplos arquivos e quiser compilar todos de uma vez:

```powershell
cd Meu-Programa\src
javac *.java
java Main
```

Para projetos simples sem pacotes, os comandos acima funcionam diretamente. Se os arquivos estiverem em pacotes, compile a partir da raiz do projeto e use a opção `-d` para gerar classes em uma pasta `bin`:

```powershell
cd Meu-Programa
javac -d bin src\*.java
java -cp bin Main
```

**Boas práticas**:
- Mantenha uma pasta por exercício ou por tópico quando o número de arquivos crescer.
- Adicione comentários claros nos exercícios explicando o objetivo e as entradas esperadas.
- Use nomes de pacotes se o código for reutilizável ou se houver muitos arquivos.

**Contribuições**:
- Adicione novos exemplos ou correções enviando pull requests.
- Inclua uma descrição curta do exercício e instruções para execução.

**Licença**: Sinta-se livre para usar estes exemplos para estudo pessoal e treinamento. Se desejar uma licença específica, adicione um arquivo `LICENSE`.

---
