package screens;

import com.formdev.flatlaf.FlatLightLaf;
import constants.Role;
import java.net.URL;
import java.sql.Connection;
import javax.swing.ImageIcon;
import repository.DBConnection;

public class MainScreen extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    int deviceWidth = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    int deviceHeight = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

    private final Connection conn = new DBConnection().connect();
    URL iconURL = getClass().getResource("/assets/college_mang_icon.png");
    ImageIcon icon = new ImageIcon(iconURL);

    private void customizeComponents() {
        setLocationRelativeTo(this);
    }

    public MainScreen() {
        initComponents();
        customizeComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        AppNameLabel = new javax.swing.JLabel();
        BannerLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        ApplyButton = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("constants/strings"); // NOI18N
        setTitle(bundle.getString("APP_NAME")); // NOI18N
        setIconImage(icon.getImage());
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        AppNameLabel.setFont(AppNameLabel.getFont().deriveFont((AppNameLabel.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, AppNameLabel.getFont().getSize()+40));
        AppNameLabel.setForeground(new java.awt.Color(51, 0, 153));
        AppNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AppNameLabel.setText(bundle.getString("APP_NAME")); // NOI18N

        BannerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BannerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/college_banner.png"))); // NOI18N
        BannerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LoginButton.setFont(LoginButton.getFont().deriveFont(LoginButton.getFont().getStyle() | java.awt.Font.BOLD, LoginButton.getFont().getSize()+5));
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btn300x60.png"))); // NOI18N
        LoginButton.setText("LOGIN HERE");
        LoginButton.setToolTipText("");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginButtonMousePressed(evt);
            }
        });

        ApplyButton.setFont(ApplyButton.getFont().deriveFont(ApplyButton.getFont().getStyle() | java.awt.Font.BOLD, ApplyButton.getFont().getSize()+5));
        ApplyButton.setForeground(new java.awt.Color(255, 255, 255));
        ApplyButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApplyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/btn300x60.png"))); // NOI18N
        ApplyButton.setText(" APPLY NOW");
        ApplyButton.setToolTipText("");
        ApplyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ApplyButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ApplyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ApplyButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BannerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(240, 240, 240))))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(AppNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(AppNameLabel)
                .addGap(31, 31, 31)
                .addComponent(BannerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMousePressed
        this.dispose();
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
    }//GEN-LAST:event_LoginButtonMousePressed

    private void ApplyButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplyButtonMousePressed
        StudentApplicationForm applicationForm = new StudentApplicationForm(Role.ADMIN);
        applicationForm.setVisible(true);
    }//GEN-LAST:event_ApplyButtonMousePressed

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MainScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppNameLabel;
    private javax.swing.JLabel ApplyButton;
    private javax.swing.JLabel BannerLabel;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
