package badiangfinalproject;

public class loadingPage extends javax.swing.JFrame {

    public loadingPage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loadtext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("<logo>");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gifs/load-1--unscreen.gif"))); // NOI18N

        loadtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(loadtext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadtext, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        loadingPage lp = new loadingPage();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                lp.setVisible(true);
            }
        });
        LogInPage logInPage = new LogInPage();
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(100);
                lp.loadtext.setText(String.valueOf(i) + "%");
                if (i == 100) {
                    lp.dispose();
                }
            } catch (InterruptedException ex) {
            }
        }
        logInPage.setVisible(true);
        lp.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loadtext;
    // End of variables declaration//GEN-END:variables
}

/*
1.) resize the frame into 600x350
2.) insert a jProgressBar
3.) insert a jLabel above the progress bar
4.) inside of the main method below line 57 instanciate the class "loadingPage" and "LogInPage" ex. example name = new example();
5.) in line 61 replace new loadingPage() into the name of the object ex. name.setVisible(true);
6.) make a for-loop below line 63 make the condition into i <=100
7.) inside the for loop make a try-catch statement
8.) inside the try catch statement put a thread.sleep(1000) which controls the time of execution, 1000 refers to the time but in miliseconds
9.) set the value of the jLabel and jProgressBar into the value of our i in the for loop
10.) make a if-else statement with a condition:
        10.1) if i == 100 then this page will dispose name.setVisible(false);
11.) outside of the for-loop display the frame of LogInPage ex. name.setVisible(true);
*/
