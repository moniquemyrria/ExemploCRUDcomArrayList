package view;

import dao.PessoaDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Pessoa;

/**
 *
 * @author Monique
 */
public class ViewCadastro extends javax.swing.JFrame {

    public ViewCadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtNome.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListagem = new javax.swing.JTable();
        btListarTodos = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("RG:");

        txtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgActionPerformed(evt);
            }
        });
        txtRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRgKeyPressed(evt);
            }
        });

        jLabel3.setText("CPF:");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtRg)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Cadastro de Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(22, 22, 22))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa de Registros"));

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });

        jLabel5.setText("Informe os dados para pesquisar ... (Somente Nome ou CPF)");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Listagem de Registros"));

        tbListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "RG", "CPF"
            }
        ));
        tbListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbListagem);

        btListarTodos.setText("Listar Todos");
        btListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //instnciando dao pessoa
    PessoaDao pessoaDao = new PessoaDao();

    public void cadastrar() {

        if (verificaCamposPreenchigos()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos para cadastrar o registro.");
        } else {
            //instanciando model pessoa
            Pessoa pessoa = new Pessoa();

            //recebendo dados da tela e memorizando os dados em Model Pessoa
            pessoa.setNome(txtNome.getText().toUpperCase());
            pessoa.setRg(Integer.parseInt(txtRg.getText()));
            pessoa.setCpf(txtCpf.getText());

            //Passando para o Dao o objeto dos dados da Pessoa
            pessoaDao.cadastrar(pessoa);

            //Limpando campos apos cadastro
            limparCampos();
            listar(1);
            txtNome.requestFocus();
        }

    }

    public void listar(int tipoListagem) {

        //listanado os objetos da lista em Dao 
        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
        
        if (tipoListagem == 1){ //1 - Todos os registros da lista 
            listaPessoa = pessoaDao.listar();
        }
        
        if (tipoListagem == 2){ //2 - Localizar apenas um registro da lista
            listaPessoa = pessoaDao.busca(txtPesquisa.getText().toUpperCase());
        }
        
        DefaultTableModel linha = (DefaultTableModel) tbListagem.getModel();
        limparListagem(tbListagem);
        try {
            for (Pessoa pessoa : listaPessoa) {
                linha.addRow(new Object[]{
                    pessoa.getNome(),
                    pessoa.getRg(),
                    pessoa.getCpf(),});
            }
        } catch (Exception e) {
            e.getMessage();
            System.out.println("Nao foi possivel carregar a Listagem no grid");
        }

        if (listaPessoa.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum registro localizado.");
        }

    }

    private void excluir() {

        //verificando se ha um registro selecionado
        int linha = tbListagem.getSelectedRow();
        if (linha != -1) { // Testa se a linha está selecionada
            //instanciando model pessoa
            Pessoa pessoa = new Pessoa();

            //recebendo dados da tela e memorizando os dados em Model Pessoa
            pessoa.setNome(txtNome.getText().toUpperCase());
            pessoa.setRg(Integer.parseInt(txtRg.getText()));
            pessoa.setCpf(txtCpf.getText());

            pessoaDao.excluir(pessoa);
            listar(1);
            limparCampos();
            txtNome.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um registro para Excluír.");

        }

    }

    public void alterar() {

        //verificando se ha um registro selecionado
        int linha = tbListagem.getSelectedRow();
        if (linha != -1) { // Testa se a linha está selecionada

            //Dados antigos para identificar o registro que sera alterado
            Pessoa pDadosAntigos = new Pessoa();
            pDadosAntigos.setNome(tbListagem.getValueAt(tbListagem.getSelectedRow(), 0).toString());
            pDadosAntigos.setRg(Integer.parseInt(tbListagem.getValueAt(tbListagem.getSelectedRow(), 1).toString()));
            pDadosAntigos.setCpf(tbListagem.getValueAt(tbListagem.getSelectedRow(), 2).toString());

            if (verificaCamposPreenchigos()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos para cadastrar o registro.");
            } else {
                //instanciando model pessoa para receber dados novos
                Pessoa pDadosNovos = new Pessoa();

                //recebendo dados da tela e memorizando os dados em Model Pessoa
                pDadosNovos.setNome(txtNome.getText().toUpperCase());
                pDadosNovos.setRg(Integer.parseInt(txtRg.getText()));
                pDadosNovos.setCpf(txtCpf.getText());

                //Passando para o Dao o objeto dos dados da Pessoa
                pessoaDao.aterar(pDadosAntigos, pDadosNovos);

                //Limpando campos apos cadastro
                limparCampos();
                listar(1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um registro para Aletrar.");
        }

    }
    
    private void buscar(){
        
        if (txtPesquisa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Informe os dados para realizar a busca.");
            txtPesquisa.requestFocus();
        }else{
            listar(2);
            
        }
        
    }

    private boolean verificaCamposPreenchigos() {
        if (txtNome.getText().equals("") || txtRg.getText().equals("") || txtCpf.getText().equals("")) {
            txtNome.requestFocus();
            return true;
        } else {
            return false;
        }
    }

    private void carregaRegistroSelecionado() {
        if (tbListagem.getRowSelectionAllowed()) {
            try {
                txtNome.setText(tbListagem.getValueAt(tbListagem.getSelectedRow(), 0).toString());
                txtRg.setText(tbListagem.getValueAt(tbListagem.getSelectedRow(), 1).toString());
                txtCpf.setText(tbListagem.getValueAt(tbListagem.getSelectedRow(), 2).toString());
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public void limparListagem(JTable tbGridListagem) {
        DefaultTableModel linha = (DefaultTableModel) tbGridListagem.getModel();
        while (linha.getRowCount() > 0) {
            linha.removeRow(0);
        }
    }

    public void limparCampos() {

        txtNome.setText("");
        txtRg.setText("");
        txtCpf.setText("");
    }

    public void validaNumero(JTextField campoRg) {
        long valor;
        if (campoRg.getText().length() != 0) {
            try {
                valor = Long.parseLong(campoRg.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Esse Campo só aceita números");
                txtRg.setText("");
                campoRg.grabFocus();
            }
        }
    }


    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        excluir();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tbListagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListagemMouseClicked
        carregaRegistroSelecionado();
    }//GEN-LAST:event_tbListagemMouseClicked

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void txtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgActionPerformed
        
    }//GEN-LAST:event_txtRgActionPerformed

    private void txtRgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRgKeyPressed
        validaNumero(txtRg);
    }//GEN-LAST:event_txtRgKeyPressed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTodosActionPerformed
        listar(1);
    }//GEN-LAST:event_btListarTodosActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_btBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btListarTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbListagem;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtRg;
    // End of variables declaration//GEN-END:variables
}
