/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HistoricoGUI.java
 *
 * Created on 12/12/2011, 02:58:03
 */
package mercado.UI;

import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mercado.DAO.ClienteDAO;
import mercado.DAO.VendaDAO;
import mercado.DAO.VendedorDAO;
import mercado.Modelo.Cliente;
import mercado.Modelo.Produto;
import mercado.Modelo.Venda;
import mercado.Modelo.Vendedor;

/**
 *
 * @author Pablo
 */
public class HistoricoGUI extends javax.swing.JFrame {

    /** Creates new form HistoricoGUI */
    public HistoricoGUI() {
        this.setLocationRelativeTo(null);
        
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTcodVenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableprodutos = new javax.swing.JTable();
        jPanelcliente = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTcpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTtelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTdatetimevenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTvlvenda = new javax.swing.JTextField();
        jBpesquisarVenda = new javax.swing.JButton();
        jPanelVendedor = new javax.swing.JPanel();
        jTnomevend = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTvendcpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Vendas - MERCADO");

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registros Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setText("Codigo Venda:");

        jTcodVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodVendaActionPerformed(evt);
            }
        });

        jTableprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Quantidade", "Preco Unidade", "Codigo"
            }
        ));
        jScrollPane1.setViewportView(jTableprodutos);

        jPanelcliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel4.setText("Nome:");

        jTNome.setEditable(false);

        jLabel5.setText("CPF:");

        jTcpf.setEditable(false);
        jTcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcpfActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefone:");

        jTtelefone.setEditable(false);

        javax.swing.GroupLayout jPanelclienteLayout = new javax.swing.GroupLayout(jPanelcliente);
        jPanelcliente.setLayout(jPanelclienteLayout);
        jPanelclienteLayout.setHorizontalGroup(
            jPanelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTtelefone)
                    .addComponent(jTcpf)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanelclienteLayout.setVerticalGroup(
            jPanelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setText("Data/Hora:");

        jTdatetimevenda.setEditable(false);

        jLabel3.setText("Valor Venda:");

        jTvlvenda.setEditable(false);
        jTvlvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTvlvendaActionPerformed(evt);
            }
        });

        jBpesquisarVenda.setText("PesquisarVenda");
        jBpesquisarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpesquisarVendaActionPerformed(evt);
            }
        });

        jPanelVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(153, 153, 153))); // NOI18N

        jTnomevend.setEditable(false);

        jLabel7.setText("Nome:");

        jTvendcpf.setEditable(false);

        jLabel8.setText("CPF:");

        javax.swing.GroupLayout jPanelVendedorLayout = new javax.swing.GroupLayout(jPanelVendedor);
        jPanelVendedor.setLayout(jPanelVendedorLayout);
        jPanelVendedorLayout.setHorizontalGroup(
            jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendedorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTvendcpf)
                    .addComponent(jTnomevend, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanelVendedorLayout.setVerticalGroup(
            jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVendedorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTnomevend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTvendcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTdatetimevenda)
                            .addComponent(jTcodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTvlvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBpesquisarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcodVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBpesquisarVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdatetimevenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTvlvenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanelcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(923, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTcodVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcodVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcodVendaActionPerformed

    private void jTvlvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTvlvendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTvlvendaActionPerformed

    private void jBpesquisarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarVendaActionPerformed
              Venda venda = new Venda() ;
              VendaDAO vendaDao = new VendaDAO();
              int error =0;
            
                
              try {
                    int codigov = Integer.parseInt(jTcodVenda.getText());
                    venda = vendaDao.pesquisaVenda(codigov);
              }catch(NullPointerException e){
                        error=1;
              } catch (Exception ex) {
                         
                   error=1;
                        
             
              }
             
                 
              if(error==1){
                    JOptionPane.showMessageDialog(this, "Venda Não Encontrada","Mensagem Sistema", JOptionPane.ERROR_MESSAGE);
           
                
                 
              }else{
                   DefaultTableModel modelo = new DefaultTableModel();
                  
                 modelo.addColumn("Nome");  
                 modelo.addColumn("Quantidade");
                 modelo.addColumn("Preco Unidade");
                 modelo.addColumn("Codigo");
                 
                 for(Produto e: venda.getProdutos() ){
                 modelo.addRow(
                         new Object[]{e.getNome(),e.getQtparc(),e.getValorVenda(),e.getCodigoBarra()}
                         );
                 }
                 jTableprodutos.setModel(modelo);
                 jTdatetimevenda.setText(venda.getDateHisto());
                 jTvlvenda.setText("R$"+String.valueOf(venda.getValorTotal()));
                 
                 
                 
                 Cliente cli = new Cliente();
                 ClienteDAO cliedao = new ClienteDAO();
                 cli =  cliedao.PesquisaCli(venda.getCpfcli());
                 
                 jTNome.setText(cli.getNome());
                 jTcpf.setText(cli.getCpf());
                 jTtelefone.setText(cli.getTel());
                 
                 
                 Vendedor vend = new Vendedor();
                 VendedorDAO vendeDAO = new VendedorDAO();
                 vend = vendeDAO.pesquisarVendedor(venda.getCpfve(),venda.getRgve());
                 jTnomevend.setText(vend.getNome());
                 jTvendcpf.setText(vend.getCpf());
              }
    }//GEN-LAST:event_jBpesquisarVendaActionPerformed

    private void jTcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcpfActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBpesquisarVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelVendedor;
    private javax.swing.JPanel jPanelcliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable jTableprodutos;
    private javax.swing.JTextField jTcodVenda;
    private javax.swing.JTextField jTcpf;
    private javax.swing.JTextField jTdatetimevenda;
    private javax.swing.JTextField jTnomevend;
    private javax.swing.JTextField jTtelefone;
    private javax.swing.JTextField jTvendcpf;
    private javax.swing.JTextField jTvlvenda;
    // End of variables declaration//GEN-END:variables
}