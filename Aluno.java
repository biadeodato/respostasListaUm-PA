package lista;

public class Aluno {
   private String nome;
   private String matricula;
   private String curso;
   
   public Aluno(String n, String m, String c) {
	   this.nome = n;
	   this.matricula = m;
	   this.curso = c;
   }
   public String getNome() {
	   return nome;
   }
   public String getMatricula() {
	   return matricula;
   }
   public String getCurso() {
	   return curso;
	 }
   public void setNome(String novoNome) {
	   this.nome = novoNome;
   }
   public void setMatricula(String novaMatricula) {
	   this.matricula = novaMatricula;
   }
   public void SetCurso(String novoCurso) {
	   this.curso = novoCurso;
   }
}
