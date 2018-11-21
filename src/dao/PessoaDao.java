package dao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pessoa;

/**
 *
 * @author Monique
 */
public class PessoaDao {

    ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

    public void cadastrar(Pessoa pessoa) {

        //Adcionanco a lista o objeto pessoa
        lista.add(pessoa);
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");

    }

    public List<Pessoa> listar() {
        return lista;
    }
    
    public List<Pessoa> busca(String dadosPesquisa) {
        ArrayList<Pessoa> pRegistro = new ArrayList<Pessoa>();
        
         for (int i = 0; i < lista.size(); i++) {;
            Pessoa p = lista.get(i);
            if ((dadosPesquisa.equals(p.getNome())) || (dadosPesquisa.equals(p.getCpf()))) {
                pRegistro.add(p);
            }

        }
         
        if (pRegistro == null){
            JOptionPane.showMessageDialog(null, "Nenhum registro localizado!");
        }
        return pRegistro;
    }

    public void excluir(Pessoa pSelecioanda) {

        for (int i = 0; i < lista.size(); i++) {;
            Pessoa p = lista.get(i);

            if ((pSelecioanda.getNome().equals(p.getNome())) && (pSelecioanda.getRg() == p.getRg()) && (pSelecioanda.getCpf().equals(p.getCpf()))) {
                lista.remove(i);
                break;
            }

        }
    }

    public void aterar(Pessoa pDadosAntigos, Pessoa pDadosNovos) {

        for (int i = 0; i < lista.size(); i++) {
            Pessoa p = lista.get(i);

            if ((pDadosAntigos.getNome().equals(p.getNome())) && (pDadosAntigos.getRg() == p.getRg()) && (pDadosAntigos.getCpf().equals(p.getCpf()))) {
                lista.get(i).setNome(pDadosNovos.getNome());
                lista.get(i).setRg(pDadosNovos.getRg());
                lista.get(i).setCpf(pDadosNovos.getCpf());
                break;
            }
        }

    }

    public void listarConsole() {

        //listando objetos da lista pessoa
        for (Pessoa p : lista) {

            System.out.printf(
                    "Nome: " + p.getNome() + "\n"
                    + "RG: " + p.getRg() + "\n"
                    + "CPF: " + p.getCpf() + "\n\n");
        }

    }

}
