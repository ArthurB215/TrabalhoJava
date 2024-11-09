package telas;

/**
 *
 * @author abmc0
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaRemover extends javax.swing.JFrame {
    
  private JTextField nomeProdutoField;  
  private JButton removerButton;

    /**
     * Creates new form TelaRemover
     */
    public TelaRemover() {
    initComponents(); // Método gerado automaticamente pelo NetBeans
    configurarComponentes(); // Seu método adicional
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        



private void configurarComponentes() {
        // Configurações básicas da janela
        setTitle("Remover Produto");
        setSize(400, 200);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
         // Configura o layout para BorderLayout para facilitar a adição dos componentes
        setLayout(new java.awt.BorderLayout());

        // Inicialize o campo de texto e o botão
        nomeProdutoField = new JTextField(20);
        removerButton = new JButton("Remover Produto");

        // Ação para o botão de remover
        removerButton.addActionListener(e -> {
            String nomeProduto = nomeProdutoField.getText();
            if (nomeProduto.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, insira o nome do produto.");
            } else {
                JOptionPane.showMessageDialog(null, "Produto " + nomeProduto + " removido com sucesso.");
                nomeProdutoField.setText(""); // Limpa o campo de texto
            }
        });

        // Adiciona os componentes à janela
        add(nomeProdutoField, java.awt.BorderLayout.NORTH);
        add(removerButton, java.awt.BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new TelaRemover().setVisible(true));
    }
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
