package net.unesc.view;

import javax.swing.SpinnerNumberModel;
import net.unesc.model.Grafo;

public class ColetaDados extends javax.swing.JFrame {

    public ColetaDados() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgtipoGrafo = new javax.swing.ButtonGroup();
        painelFundo = new javax.swing.JPanel();
        painelTopo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btRadioNaoDirecionado = new javax.swing.JRadioButton();
        btRadioDirecionado = new javax.swing.JRadioButton();
        labelTipoGrafo = new javax.swing.JLabel();
        labelVertices = new javax.swing.JLabel();
        labelArcos = new javax.swing.JLabel();
        labelLigacoes = new javax.swing.JLabel();
        txLigacoes = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        txArcos = new javax.swing.JTextField();
        txVertices = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 294));
        setResizable(false);

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));
        painelFundo.setMaximumSize(new java.awt.Dimension(400, 294));
        painelFundo.setMinimumSize(new java.awt.Dimension(400, 294));

        painelTopo.setBackground(new java.awt.Color(102, 0, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GRAFO");

        javax.swing.GroupLayout painelTopoLayout = new javax.swing.GroupLayout(painelTopo);
        painelTopo.setLayout(painelTopoLayout);
        painelTopoLayout.setHorizontalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTopoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTopoLayout.setVerticalGroup(
            painelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTopoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgtipoGrafo.add(btRadioNaoDirecionado);
        btRadioNaoDirecionado.setText("Não-direcionado");
        btRadioNaoDirecionado.setContentAreaFilled(false);

        bgtipoGrafo.add(btRadioDirecionado);
        btRadioDirecionado.setText("Direcionado");
        btRadioDirecionado.setContentAreaFilled(false);

        labelTipoGrafo.setText("Tipo do Grafo:");

        labelVertices.setText("Vértices:");

        labelArcos.setText("Arcos:");

        labelLigacoes.setText("Ligações:");

        btAdicionar.setText("Adicionar");
        btAdicionar.setFocusable(false);
        btAdicionar.setOpaque(false);
        btAdicionar.setRolloverEnabled(false);
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.setFocusable(false);
        btLimpar.setOpaque(false);
        btLimpar.setRolloverEnabled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(labelTipoGrafo)
                                .addGap(18, 18, 18)
                                .addComponent(btRadioDirecionado)
                                .addGap(18, 18, 18)
                                .addComponent(btRadioNaoDirecionado))
                            .addGroup(painelFundoLayout.createSequentialGroup()
                                .addComponent(btAdicionar)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpar)))
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelArcos)
                            .addComponent(labelLigacoes)
                            .addComponent(labelVertices))
                        .addGap(15, 15, 15)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txLigacoes)
                            .addComponent(txArcos)
                            .addComponent(txVertices))))
                .addContainerGap())
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addComponent(painelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoGrafo)
                    .addComponent(btRadioDirecionado)
                    .addComponent(btRadioNaoDirecionado))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVertices)
                    .addComponent(txVertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelArcos)
                    .addComponent(txArcos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLigacoes)
                    .addComponent(txLigacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdicionar)
                    .addComponent(btLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed

        Grafo grafo = new Grafo();

        grafo.setVertices(1);
        grafo.setArcos(1);

        int matrizAdjacencia[][] = new int[grafo.getVertices()][grafo.getVertices()];
        grafo.setMatrizAdjacencia(matrizAdjacencia);

        int matrizIncidencia[][] = new int[grafo.getVertices()][grafo.getArcos()];
        grafo.setMatrizIncidencia(matrizIncidencia);
    }//GEN-LAST:event_btAdicionarActionPerformed

    public void limparCampos() {
        bgtipoGrafo.clearSelection();
        txVertices.setText("");
        txArcos.setText("");
        txLigacoes.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgtipoGrafo;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JRadioButton btRadioDirecionado;
    private javax.swing.JRadioButton btRadioNaoDirecionado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelArcos;
    private javax.swing.JLabel labelLigacoes;
    private javax.swing.JLabel labelTipoGrafo;
    private javax.swing.JLabel labelVertices;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelTopo;
    private javax.swing.JTextField txArcos;
    private javax.swing.JTextField txLigacoes;
    private javax.swing.JTextField txVertices;
    // End of variables declaration//GEN-END:variables
}
