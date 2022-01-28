package root;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Integer.*;

/// chahir chalouati///
public class Hospital extends javax.swing.JFrame {

    private final Component component;
    private final FileServiceImpl filesPatient = new FileServiceImpl();
    private final Calendar calendar = new GregorianCalendar();
    private DefaultListModel listModel;
    private Vector<Object> objectVector;
    private String job = "hey";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Doctor;
    private javax.swing.JFrame Employee;
//un metodo per settare i combobox su su la selezione desiderata
    private javax.swing.JFrame Nurse;
    private javax.swing.JFrame Pharmacist;
    private javax.swing.JFrame Reception;
    private javax.swing.JButton btnSEEAnalysis;
    private javax.swing.JButton btnSaveImage;
    private javax.swing.JButton btnSearchEmployee;
    private javax.swing.JButton btnSearchPatient;
    private javax.swing.JButton btnSendtoDoctor;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JButton btnUpdatePatient;
    private javax.swing.JButton btnXRay;
    private javax.swing.JButton btnXrayNurse;
    private javax.swing.JComboBox<String> cbxDeparmentDoctor;
    private javax.swing.JComboBox<String> cbxDeparmentEmployee;
    private javax.swing.JComboBox<String> cbxDeparmentNurse;
    private javax.swing.JComboBox<String> cbxDeparmentPatient;
    private javax.swing.JComboBox<String> cbxDepartmentMAil;
    private javax.swing.JComboBox<String> cbxGiornoPaziente;
    private javax.swing.JComboBox<String> cbxJobEmployee;
    private javax.swing.JComboBox<String> cbxJobMail;
    private javax.swing.JComboBox<String> cbxMedecineDoctor;
    private javax.swing.JComboBox<String> cbxMesePaziente;
    private javax.swing.JComboBox<String> cbxNameDoctor;
    private javax.swing.JComboBox<String> cbxSexDoctor;
    private javax.swing.JComboBox<String> cbxSexEmployee;
    private javax.swing.JComboBox<String> cbxSexNurse;
    private javax.swing.JComboBox<String> cbxSexPatient;
    private javax.swing.JComboBox<String> cbxTypeBloodDoctor;
    private javax.swing.JComboBox<String> cbxTypeSearchDoctor;
    private javax.swing.JComboBox<String> cbxTypeSearchEmployee;
    private javax.swing.JComboBox<String> cbxTypeSearchNurse;
    private javax.swing.JComboBox<String> cbxTypeSearchPatient;
    private javax.swing.JComboBox<String> cbxTypeSearchPatient1;
    private com.toedter.calendar.JDateChooser dateExit;
    private com.toedter.calendar.JDateChooser dateNascita;
    private com.toedter.calendar.JDateChooser dateNascitaNurse;
    private com.toedter.calendar.JDateChooser dateOprationDoctor;
    private javax.swing.JFrame frameAnalysis;
    private javax.swing.JFrame frameEmail;
    private javax.swing.JFrame frameImage;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAnnoPaziente;
    private javax.swing.JLabel lblBackAppointment;
    private javax.swing.JLabel lblBackAppointment1;
    private javax.swing.JLabel lblBackAppointment2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDDoctor;
    private javax.swing.JLabel lblIDNurse;
    private javax.swing.JLabel lblIDPatient;
    private javax.swing.JLabel lblIDPatient1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JList<String> listMedecine;
    private javax.swing.JList<String> listMedecinePharmacist;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel paneLogin;
    private javax.swing.JTable tabDoctor;
    private javax.swing.JTable tabEmpolyee;
    private javax.swing.JTable tabMedecinePharmacy;
    private javax.swing.JTable tabNurse;
    private javax.swing.JTable tabNurseBloodTest;
    private javax.swing.JTable tabPatient;
    private javax.swing.JTable ttabPatientPharmacist;
    private javax.swing.JTextArea txtAPayReceipt;
    private javax.swing.JTextArea txtASituation;
    private javax.swing.JTextArea txtAanalysis;
    private javax.swing.JTextField txtAddressDoctor;
    private javax.swing.JTextField txtAddressEmployee;
    private javax.swing.JTextField txtAddressNurse;
    private javax.swing.JTextField txtAddressPatient;
    private javax.swing.JTextField txtAgeDoctor;
    private javax.swing.JTextField txtAgeNurse;
    private javax.swing.JTextField txtAgePatient;
    private javax.swing.JTextField txtAgePatient1;
    private javax.swing.JTextField txtAppointment;
    private javax.swing.JTextField txtBirthDateDoctor;
    private javax.swing.JTextField txtBirthPharmacist;
    private javax.swing.JTextField txtCIDDoctor;
    private javax.swing.JTextField txtCIDNurse;
    private javax.swing.JTextField txtCIDPH;
    private javax.swing.JTextField txtCIDPatient;
    private javax.swing.JTextField txtDepartmentPH;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtEmailEmployee;
    private javax.swing.JTextField txtEmailMail;
    private javax.swing.JTextField txtFiscaleCodeDoctor;
    private javax.swing.JTextField txtFiscaleCodeNurse;
    private javax.swing.JTextField txtFiscaleCodePH;
    private javax.swing.JTextField txtFiscaleCodePatient;
    private javax.swing.JTextField txtHeightDoctor;
    private javax.swing.JTextField txtHeightNurse;
    private javax.swing.JTextField txtHeightPatient;
    private javax.swing.JTextField txtMedecine;
    private javax.swing.JTextField txtMinutiPaziente;
    private javax.swing.JTextField txtMobileDoctor;
    private javax.swing.JTextField txtMobileEmloyee;
    private javax.swing.JTextField txtMobileMail;
    private javax.swing.JTextField txtMobileNurse;
    private javax.swing.JTextField txtMobilePatient;
    private javax.swing.JTextField txtNameDoctor;
    private javax.swing.JTextField txtNameDotorPH;
    private javax.swing.JTextField txtNameEmployee;
    private javax.swing.JTextField txtNameMail;
    private javax.swing.JTextField txtNameNurse;
    private javax.swing.JTextField txtNamePatient;
    private javax.swing.JTextField txtNamePatient1;
    private javax.swing.JTextField txtNamePatientPay;
    private javax.swing.JTextField txtOperationhours;
    private javax.swing.JTextField txtOperationmin;
    private javax.swing.JTextField txtOraPaziente;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPasswordEmployee;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearchDoctor;
    private javax.swing.JTextField txtSearchEmployee;
    private javax.swing.JTextField txtSearchNurse;
    private javax.swing.JTextField txtSearchPatient;
    private javax.swing.JTextField txtSearchPatient1;
    private javax.swing.JTextField txtSerachPH;
    private javax.swing.JTextField txtSexPH;
    private javax.swing.JTextField txtTotal2;
    private javax.swing.JTextField txtTotalMedecine;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUserlEmployee;
    private javax.swing.JTextField txtWeightDoctor;
    private javax.swing.JTextField txtWeightNurse;
    private javax.swing.JTextField txtWeightPatient;
    private javax.swing.JTextArea txtaTherapy;
    private javax.swing.JTextField txttotalePH;
    public Hospital() {

        initComponents();
        this.setLocationRelativeTo(null);

        this.setSize(1000, 620);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        paneLogin.setBackground(new Color(0, 102, 255, 200));
        txtUser.setBackground(paneLogin.getBackground());
        txtPassword.setBackground(paneLogin.getBackground());
        component = new Component("db/Hospital.db");
        lblAnnoPaziente.setText(String.valueOf(calendar.get(Calendar.YEAR)));
        String query = "select txtFile from nurseFile where ID =1";
        component.result(query);
        p1.setSize(txtUser.getWidth(), 4);
        p2.setSize(txtUser.getWidth(), 4);
        jPanel2.setBackground(paneLogin.getBackground());
        jPanel7.setBackground(paneLogin.getBackground());
        jPanel14.setBackground(paneLogin.getBackground());
        jPanel23.setBackground(paneLogin.getBackground());
        jPanel30.setBackground(paneLogin.getBackground());
        frameAnalysis.setLocationRelativeTo(null);
        frameEmail.setLocationRelativeTo(null);
        frameImage.setLocationRelativeTo(null);
        try {
            String testo = component.resultSet().getString(1);
            filesPatient.write("NurseFile", testo);
            filesPatient.save(tabNurseBloodTest, "NurseFile", ":");
        } catch (SQLException ex) {
            Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblImage.setSize(960, 490);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Employee = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNameEmployee = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMobileEmloyee = new javax.swing.JTextField();
        txtEmailEmployee = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUserlEmployee = new javax.swing.JTextField();
        txtAddressEmployee = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbxDeparmentEmployee = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbxJobEmployee = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtPasswordEmployee = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxSexEmployee = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabEmpolyee = new javax.swing.JTable();
        javax.swing.JButton btnAddEmployee = new javax.swing.JButton();
        btnUpdateEmployee = new javax.swing.JButton();
        javax.swing.JButton btnDeleteEmployee = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        JButton btnResetEmployee = new JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbxTypeSearchEmployee = new javax.swing.JComboBox<>();
        txtSearchEmployee = new javax.swing.JTextField();
        btnSearchEmployee = new javax.swing.JButton();
        Reception = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblBackAppointment = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabPatient = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtHeightPatient = new javax.swing.JTextField();
        cbxNameDoctor = new javax.swing.JComboBox<>();
        lblIDPatient = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cbxDeparmentPatient = new javax.swing.JComboBox<>();
        txtAddressPatient = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        dateNascita = new com.toedter.calendar.JDateChooser();
        txtCIDPatient = new javax.swing.JTextField();
        txtMobilePatient = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtWeightPatient = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtAgePatient = new javax.swing.JTextField();
        cbxSexPatient = new javax.swing.JComboBox<>();
        txtFiscaleCodePatient = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtNamePatient = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        cbxGiornoPaziente = new javax.swing.JComboBox<>();
        cbxMesePaziente = new javax.swing.JComboBox<>();
        lblAnnoPaziente = new javax.swing.JLabel();
        txtOraPaziente = new javax.swing.JTextField();
        txtMinutiPaziente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        javax.swing.JButton btnAddPatient = new javax.swing.JButton();
        btnUpdatePatient = new javax.swing.JButton();
        JButton btnDeletePatient = new JButton();
        JButton btnResetPatient = new JButton();
        btnSearchPatient = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cbxTypeSearchPatient = new javax.swing.JComboBox<>();
        txtSearchPatient = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtAPayReceipt = new javax.swing.JTextArea();
        jLabel109 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        JButton btnPayReceipt = new JButton();
        dateExit = new com.toedter.calendar.JDateChooser();
        txtTotalMedecine = new javax.swing.JTextField();
        JButton btnPatentStay = new JButton();
        txtNamePatientPay = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        txtTotal2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        JButton btnPrint = new JButton();
        Doctor = new javax.swing.JFrame();
        jPanel14 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        lblBackAppointment1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabDoctor = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        txtHeightDoctor = new javax.swing.JTextField();
        lblIDDoctor = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        cbxDeparmentDoctor = new javax.swing.JComboBox<>();
        txtAddressDoctor = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtCIDDoctor = new javax.swing.JTextField();
        txtMobileDoctor = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtWeightDoctor = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtAgeDoctor = new javax.swing.JTextField();
        cbxSexDoctor = new javax.swing.JComboBox<>();
        txtFiscaleCodeDoctor = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtNameDoctor = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtBirthDateDoctor = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txtAppointment = new javax.swing.JTextField();
        JButton btnUpdateDoctor = new JButton();
        javax.swing.JButton btnDeleteDoctor = new javax.swing.JButton();
        JButton btnResetDoctor = new JButton();
        JButton btnSearchDoctor = new JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        cbxTypeSearchDoctor = new javax.swing.JComboBox<>();
        txtSearchDoctor = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtASituation = new javax.swing.JTextArea();
        jPanel18 = new javax.swing.JPanel();
        JButton btnOperationDoctor = new JButton();
        dateOprationDoctor = new com.toedter.calendar.JDateChooser();
        jLabel50 = new javax.swing.JLabel();
        cbxTypeBloodDoctor = new javax.swing.JComboBox<>();
        txtOperationhours = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtOperationmin = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtaTherapy = new javax.swing.JTextArea();
        JButton btnSaveCure = new JButton();
        jPanel28 = new javax.swing.JPanel();
        JButton btnSaveMedecine = new JButton();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        listMedecine = new javax.swing.JList<>();
        cbxMedecineDoctor = new javax.swing.JComboBox<>();
        JButton btnRemoveMedicine = new JButton();
        jPanel29 = new javax.swing.JPanel();
        btnSEEAnalysis = new javax.swing.JButton();
        btnXRay = new javax.swing.JButton();
        JButton btnSaveSituation = new JButton();
        Nurse = new javax.swing.JFrame();
        jPanel21 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel24 = new javax.swing.JPanel();
        txtCIDNurse = new javax.swing.JTextField();
        txtMobileNurse = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        txtWeightNurse = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        txtAgeNurse = new javax.swing.JTextField();
        cbxSexNurse = new javax.swing.JComboBox<>();
        txtFiscaleCodeNurse = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtHeightNurse = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtNameNurse = new javax.swing.JTextField();
        lblIDNurse = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        cbxDeparmentNurse = new javax.swing.JComboBox<>();
        txtAddressNurse = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        dateNascitaNurse = new com.toedter.calendar.JDateChooser();
        jPanel22 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        cbxTypeSearchNurse = new javax.swing.JComboBox<>();
        txtSearchNurse = new javax.swing.JTextField();
        JButton btnResetNurse = new JButton();
        JButton btnSearchNurse = new JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabNurseBloodTest = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        btnSendtoDoctor = new javax.swing.JButton();
        btnXrayNurse = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabNurse = new javax.swing.JTable();
        frameImage = new javax.swing.JFrame();
        jPanel26 = new javax.swing.JPanel();
        btnSaveImage = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        javax.swing.JButton btnClose = new javax.swing.JButton();
        frameAnalysis = new javax.swing.JFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAanalysis = new javax.swing.JTextArea();
        javax.swing.JButton btnCloseAnalysis = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        Pharmacist = new javax.swing.JFrame();
        jPanel30 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        lblBackAppointment2 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        ttabPatientPharmacist = new javax.swing.JTable();
        jPanel31 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        lblIDPatient1 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtCIDPH = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        txtAgePatient1 = new javax.swing.JTextField();
        txtFiscaleCodePH = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txtNamePatient1 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txttotalePH = new javax.swing.JTextField();
        txtBirthPharmacist = new javax.swing.JTextField();
        txtSexPH = new javax.swing.JTextField();
        txtDepartmentPH = new javax.swing.JTextField();
        txtNameDotorPH = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        JButton btnResetPatient1 = new JButton();
        jPanel34 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        txtMedecine = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        tabMedecinePharmacy = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        txtSerachPH = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        cbxTypeSearchPatient1 = new javax.swing.JComboBox<>();
        txtSearchPatient1 = new javax.swing.JTextField();
        JButton btnSearchPatient1 = new JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        listMedecinePharmacist = new javax.swing.JList<>();
        frameEmail = new javax.swing.JFrame();
        jPanel38 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        txtNameMail = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        txtEmailMail = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        txtMobileMail = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        cbxJobMail = new javax.swing.JComboBox<>();
        cbxDepartmentMAil = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        paneLogin = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel91 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        JButton btnLogin = new JButton();
        p1 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(482, 58));
        jPanel2.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/pharmacist (1).png"))); // NOI18N
        jLabel1.setText("Employee");

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/Image/back (1).png"))); // NOI18N
        jLabel2.setText("Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel4.setText("ID");

        lblID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel5.setText("Name");

        txtNameEmployee.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel7.setText("Mobile");

        txtMobileEmloyee.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        txtEmailEmployee.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel9.setText("User");

        txtUserlEmployee.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        txtAddressEmployee.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel11.setText("Department");

        cbxDeparmentEmployee.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cbxDeparmentEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cardiology Department", "Central Supplies Department", "Cleaning and Waste", "Emergency Department", "Eye Department", "Finance Department", "Household Services Department", "Laboratory Services", "Library", "Medical Services", "HSE National Cancer Control Programme (NCCP)", "Nutrition and Dietetics", "Occupational Therapy Department", "Oncology Social Work Services", "Outpatients Department", "Orthopaedic Services", "Orthopatic Department", "Patients Services", "Pharmacy Department", "Physiotherapy Department", "Point of Care Testing (POCT)", "Radiology Department", "Speech and Language Therapy Department", "Surgical Services", "Technical Services Department"}));

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel12.setText("Job");

        cbxJobEmployee.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cbxJobEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Admin", "Doctor", "Nurse", "Pharmacist", "Receptionist"}));
        cbxJobEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxJobEmployeeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel14.setText("Password");

        txtPasswordEmployee.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel13.setText("Sex");

        cbxSexEmployee.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cbxSexEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Male", "Female"}));
        cbxSexEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cbxDeparmentEmployee, 0, 256, Short.MAX_VALUE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtMobileEmloyee))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtEmailEmployee))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtUserlEmployee))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cbxJobEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtPasswordEmployee))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addGap(4, 4, 4)
                                                                        .addComponent(txtNameEmployee))))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cbxSexEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAddressEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, txtAddressEmployee, txtEmailEmployee, txtMobileEmloyee, txtNameEmployee, txtPasswordEmployee, txtUserlEmployee);

        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNameEmployee)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMobileEmloyee)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtEmailEmployee)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUserlEmployee)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPasswordEmployee)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAddressEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxDeparmentEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxJobEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxSexEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, txtAddressEmployee, txtEmailEmployee, txtMobileEmloyee, txtNameEmployee, txtPasswordEmployee, txtUserlEmployee);

        tabEmpolyee.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        tabEmpolyee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabEmpolyeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabEmpolyee);

        btnAddEmployee.setBackground(new java.awt.Color(0, 102, 102));
        btnAddEmployee.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnAddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployee.setMnemonic('[');
        btnAddEmployee.setText("ADD New");
        btnAddEmployee.setToolTipText("");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });

        btnUpdateEmployee.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdateEmployee.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnUpdateEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateEmployee.setMnemonic('[');
        btnUpdateEmployee.setText("Update");
        btnUpdateEmployee.setToolTipText("");
        btnUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmployeeActionPerformed(evt);
            }
        });

        btnDeleteEmployee.setBackground(new java.awt.Color(0, 102, 102));
        btnDeleteEmployee.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnDeleteEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEmployee.setMnemonic('[');
        btnDeleteEmployee.setText("Delete");
        btnDeleteEmployee.setToolTipText("");
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        btnResetEmployee.setBackground(new java.awt.Color(0, 102, 102));
        btnResetEmployee.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnResetEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnResetEmployee.setMnemonic('[');
        btnResetEmployee.setText("Reset");
        btnResetEmployee.setToolTipText("");
        btnResetEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetEmployeeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 11)); // NOI18N
        jLabel3.setText("Choose type of search from here..");

        cbxTypeSearchEmployee.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N

        txtSearchEmployee.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        txtSearchEmployee.setForeground(new java.awt.Color(102, 102, 102));
        txtSearchEmployee.setText("Type your text here ...");
        txtSearchEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchEmployeeMouseClicked(evt);
            }
        });
        txtSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSearchEmployee)
                                        .addComponent(cbxTypeSearchEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTypeSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSearchEmployee.setBackground(new java.awt.Color(0, 102, 102));
        btnSearchEmployee.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnSearchEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchEmployee.setMnemonic('[');
        btnSearchEmployee.setText("Search");
        btnSearchEmployee.setToolTipText("");
        btnSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE))
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnUpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnResetEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdateEmployee)
                                        .addComponent(btnDeleteEmployee)
                                        .addComponent(btnResetEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(btnSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, btnAddEmployee, btnDeleteEmployee, btnUpdateEmployee);

        javax.swing.GroupLayout EmpolyeeLayout = new javax.swing.GroupLayout(Employee.getContentPane());
        Employee.getContentPane().setLayout(EmpolyeeLayout);
        EmpolyeeLayout.setHorizontalGroup(
                EmpolyeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EmpolyeeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        EmpolyeeLayout.setVerticalGroup(
                EmpolyeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(EmpolyeeLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(0, 204, 204));
        jPanel7.setPreferredSize(new java.awt.Dimension(482, 58));
        jPanel7.setRequestFocusEnabled(false);

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/nurse.png"))); // NOI18N
        jLabel10.setText("Reception");

        lblBackAppointment.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        lblBackAppointment.setForeground(new java.awt.Color(255, 255, 255));
        lblBackAppointment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBackAppointment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/Image/back (1).png"))); // NOI18N
        lblBackAppointment.setText("Home");
        lblBackAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackAppointmentMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBackAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblBackAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        tabPatient.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabPatient.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        tabPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPatientMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabPatient);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        txtHeightPatient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        cbxNameDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cbxNameDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNameDoctorActionPerformed(evt);
            }
        });

        lblIDPatient.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel23.setText("Fiscal Code");

        jLabel24.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel24.setText("Weight");

        cbxDeparmentPatient.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cbxDeparmentPatient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cardiology Department", "Central Supplies Department", "Cleaning and Waste", "Emergency Department", "Eye Department", "Finance Department", "Household Services Department", "Laboratory Services", "Library", "Medical Services", "HSE National Cancer Control Programme (NCCP)", "Nutrition and Dietetics", "Occupational Therapy Department", "Oncology Social Work Services", "Outpatients Department", "Orthopaedic Services", "Orthopatic Department", "Patients Services", "Pharmacy Department", "Physiotherapy Department", "Point of Care Testing (POCT)", "Radiology Department", "Speech and Language Therapy Department", "Surgical Services", "Technical Services Department"}));
        cbxDeparmentPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDeparmentPatientActionPerformed(evt);
            }
        });

        txtAddressPatient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel19.setText("Mobile");

        jLabel20.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel20.setText("Age");

        jLabel25.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel25.setText("Sex");

        jLabel22.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel22.setText("Department");

        dateNascita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        txtCIDPatient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtMobilePatient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel17.setText("Name");

        txtWeightPatient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtWeightPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightPatientActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel27.setText("CID");

        txtAgePatient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        cbxSexPatient.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cbxSexPatient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Male", "Female"}));
        cbxSexPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexPatientActionPerformed(evt);
            }
        });

        txtFiscaleCodePatient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel29.setText("Name Doctor");

        jLabel16.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("ID :");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Birth-Date");

        txtNamePatient.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNamePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamePatientActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel18.setText("Address");

        jLabel21.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel21.setText("Height");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cbxNameDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(74, 74, 74))
                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(328, 328, 328)))
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtMobilePatient))
                                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtAgePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(lblIDPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                                                        .addGap(4, 4, 4)
                                                                                        .addComponent(txtNamePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(cbxSexPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(dateNascita, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(cbxDeparmentPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(60, 60, 60)))
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtHeightPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtAddressPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtWeightPatient))
                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(86, 86, 86)
                                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtFiscaleCodePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtCIDPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblIDPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtHeightPatient))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtWeightPatient)
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtAddressPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNamePatient)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtMobilePatient)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtAgePatient)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dateNascita, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbxSexPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbxDeparmentPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbxNameDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtFiscaleCodePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtCIDPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scegliere Appuntamento :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cbxGiornoPaziente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxGiornoPaziente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"0", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        cbxGiornoPaziente.setBorder(null);
        cbxGiornoPaziente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGiornoPazienteActionPerformed(evt);
            }
        });

        cbxMesePaziente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxMesePaziente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"0", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        cbxMesePaziente.setBorder(null);

        lblAnnoPaziente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAnnoPaziente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtOraPaziente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtOraPaziente.setBorder(null);

        txtMinutiPaziente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtMinutiPaziente.setBorder(null);
        txtMinutiPaziente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinutiPazienteActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Hours");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Minute");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Day");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Month");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Year");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtOraPaziente)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMinutiPaziente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbxGiornoPaziente, 0, 64, Short.MAX_VALUE)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbxMesePaziente, 0, 69, Short.MAX_VALUE)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAnnoPaziente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtOraPaziente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbxGiornoPaziente)
                                                .addComponent(cbxMesePaziente, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                                .addComponent(txtMinutiPaziente))
                                        .addComponent(lblAnnoPaziente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddPatient.setBackground(new java.awt.Color(0, 102, 102));
        btnAddPatient.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPatient.setMnemonic('[');
        btnAddPatient.setText("ADD New");
        btnAddPatient.setToolTipText("");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        btnUpdatePatient.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdatePatient.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnUpdatePatient.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdatePatient.setMnemonic('[');
        btnUpdatePatient.setText("Update");
        btnUpdatePatient.setToolTipText("");
        btnUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatientActionPerformed(evt);
            }
        });

        btnDeletePatient.setBackground(new java.awt.Color(0, 102, 102));
        btnDeletePatient.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnDeletePatient.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletePatient.setMnemonic('[');
        btnDeletePatient.setText("Delete");
        btnDeletePatient.setToolTipText("");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });

        btnResetPatient.setBackground(new java.awt.Color(0, 102, 102));
        btnResetPatient.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnResetPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnResetPatient.setMnemonic('[');
        btnResetPatient.setText("Reset");
        btnResetPatient.setToolTipText("");
        btnResetPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPatientActionPerformed(evt);
            }
        });

        btnSearchPatient.setBackground(new java.awt.Color(0, 102, 102));
        btnSearchPatient.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnSearchPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchPatient.setMnemonic('[');
        btnSearchPatient.setText("Search");
        btnSearchPatient.setToolTipText("");
        btnSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPatientActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Cambria Math", 1, 11)); // NOI18N
        jLabel26.setText("Choose type of search from here..");

        cbxTypeSearchPatient.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N

        txtSearchPatient.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        txtSearchPatient.setForeground(new java.awt.Color(102, 102, 102));
        txtSearchPatient.setText("Type your text here ...");
        txtSearchPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchPatientMouseClicked(evt);
            }
        });
        txtSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSearchPatient)
                                        .addComponent(cbxTypeSearchPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel10Layout.createSequentialGroup()
                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTypeSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnAddPatient, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                        .addComponent(btnDeletePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                        .addComponent(btnUpdatePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                        .addComponent(btnResetPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 110, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(btnAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnUpdatePatient)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDeletePatient)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnResetPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38))))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, btnAddPatient, btnDeletePatient, btnResetPatient, btnUpdatePatient);

        jTabbedPane1.addTab("Appoinment", jPanel8);

        txtAPayReceipt.setColumns(20);
        txtAPayReceipt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAPayReceipt.setRows(5);
        txtAPayReceipt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane13.setViewportView(txtAPayReceipt);

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel109.setText("Data Patient");

        jPanel37.setBackground(new java.awt.Color(204, 204, 204));

        btnPayReceipt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPayReceipt.setText("pay and generate the receipt");
        btnPayReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayReceiptActionPerformed(evt);
            }
        });

        dateExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtTotalMedecine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnPatentStay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPatentStay.setText("Data Patient stay");
        btnPatentStay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatentStayActionPerformed(evt);
            }
        });

        txtNamePatientPay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel107.setText("Patient");

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel108.setText("Price Medecine :");

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel106.setText("ADD Date Exit");

        txtTotal2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel110.setText("Total to pay :");

        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrint.setText("Print Receipt");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
                jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel37Layout.createSequentialGroup()
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel37Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel37Layout.createSequentialGroup()
                                                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(13, 13, 13)
                                                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtTotalMedecine)
                                                                        .addComponent(txtTotal2)
                                                                        .addComponent(btnPatentStay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel37Layout.createSequentialGroup()
                                                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(dateExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(txtNamePatientPay)))))
                                        .addGroup(jPanel37Layout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel37Layout.createSequentialGroup()
                                                                .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(btnPayReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
                jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel37Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNamePatientPay)
                                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dateExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTotalMedecine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addComponent(btnPatentStay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPayReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                        .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 469, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
        );

        jTabbedPane1.addTab("Payment", jPanel13);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
                                        .addComponent(jTabbedPane1))
                                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ReceptionLayout = new javax.swing.GroupLayout(Reception.getContentPane());
        Reception.getContentPane().setLayout(ReceptionLayout);
        ReceptionLayout.setHorizontalGroup(
                ReceptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReceptionLayout.setVerticalGroup(
                ReceptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReceptionLayout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(0, 204, 204));
        jPanel14.setPreferredSize(new java.awt.Dimension(482, 58));
        jPanel14.setRequestFocusEnabled(false);

        jLabel34.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/doctor (1).png"))); // NOI18N
        jLabel34.setText("Doctor");

        lblBackAppointment1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        lblBackAppointment1.setForeground(new java.awt.Color(255, 255, 255));
        lblBackAppointment1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBackAppointment1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/Image/back (1).png"))); // NOI18N
        lblBackAppointment1.setText("Home");
        lblBackAppointment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackAppointment1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBackAppointment1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblBackAppointment1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        tabDoctor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabDoctor.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        tabDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDoctorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabDoctor);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));

        txtHeightDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        lblIDDoctor.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel35.setText("Fiscal Code");

        jLabel36.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel36.setText("Weight");

        cbxDeparmentDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cbxDeparmentDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cardiology Department", "Central Supplies Department", "Cleaning and Waste", "Emergency Department", "Eye Department", "Finance Department", "Household Services Department", "Laboratory Services", "Library", "Medical Services", "HSE National Cancer Control Programme (NCCP)", "Nutrition and Dietetics", "Occupational Therapy Department", "Oncology Social Work Services", "Outpatients Department", "Orthopaedic Services", "Orthopatic Department", "Patients Services", "Pharmacy Department", "Physiotherapy Department", "Point of Care Testing (POCT)", "Radiology Department", "Speech and Language Therapy Department", "Surgical Services", "Technical Services Department"}));
        cbxDeparmentDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDeparmentDoctorActionPerformed(evt);
            }
        });

        txtAddressDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel37.setText("Mobile");

        jLabel38.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel38.setText("Age");

        jLabel39.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel39.setText("Sex");

        jLabel40.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel40.setText("Department");

        txtCIDDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        txtMobileDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel41.setText("Name");

        txtWeightDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        txtWeightDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightDoctorActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel42.setText("CID");

        txtAgeDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        cbxSexDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cbxSexDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Male", "Female"}));
        cbxSexDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexDoctorActionPerformed(evt);
            }
        });

        txtFiscaleCodeDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        txtFiscaleCodeDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiscaleCodeDoctorActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("ID :");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("Birth-Date");

        txtNameDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel46.setText("Address");

        jLabel47.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel47.setText("Height");

        txtBirthDateDoctor.setText(" ");

        jLabel43.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel43.setText("Doctor :");

        txtDoctor.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N

        jLabel49.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel49.setText("Appointment :");

        txtAppointment.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        txtAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel17Layout.createSequentialGroup()
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtMobileDoctor))
                                                .addGroup(jPanel17Layout.createSequentialGroup()
                                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtAgeDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel17Layout.createSequentialGroup()
                                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel17Layout.createSequentialGroup()
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(lblIDDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGroup(jPanel17Layout.createSequentialGroup()
                                                                        .addGap(4, 4, 4)
                                                                        .addComponent(txtNameDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cbxSexDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel17Layout.createSequentialGroup()
                                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtBirthDateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(68, 68, 68))
                                                .addComponent(cbxDeparmentDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtHeightDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtWeightDoctor))
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAddressDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtDoctor)
                                                        .addComponent(txtAppointment)
                                                        .addComponent(txtFiscaleCodeDoctor)
                                                        .addComponent(txtCIDDoctor, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblIDDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtHeightDoctor))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtWeightDoctor)
                                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtAddressDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtNameDoctor)
                                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtMobileDoctor)
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtAgeDoctor)
                                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtBirthDateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbxSexDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbxDeparmentDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel17Layout.createSequentialGroup()
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtFiscaleCodeDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtCIDDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(19, 19, 19))
        );

        btnUpdateDoctor.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdateDoctor.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnUpdateDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateDoctor.setMnemonic('[');
        btnUpdateDoctor.setText("Update");
        btnUpdateDoctor.setToolTipText("");
        btnUpdateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDoctorActionPerformed(evt);
            }
        });

        btnDeleteDoctor.setBackground(new java.awt.Color(0, 102, 102));
        btnDeleteDoctor.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnDeleteDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteDoctor.setMnemonic('[');
        btnDeleteDoctor.setText("Delete");
        btnDeleteDoctor.setToolTipText("");
        btnDeleteDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDoctorActionPerformed(evt);
            }
        });

        btnResetDoctor.setBackground(new java.awt.Color(0, 102, 102));
        btnResetDoctor.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnResetDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnResetDoctor.setMnemonic('[');
        btnResetDoctor.setText("Reset");
        btnResetDoctor.setToolTipText("");
        btnResetDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDoctorActionPerformed(evt);
            }
        });

        btnSearchDoctor.setBackground(new java.awt.Color(0, 102, 102));
        btnSearchDoctor.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnSearchDoctor.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchDoctor.setMnemonic('[');
        btnSearchDoctor.setText("Search");
        btnSearchDoctor.setToolTipText("");
        btnSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDoctorActionPerformed(evt);
            }
        });

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));

        jLabel53.setFont(new java.awt.Font("Cambria Math", 1, 11)); // NOI18N
        jLabel53.setText("Choose type of search from here..");

        cbxTypeSearchDoctor.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N

        txtSearchDoctor.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        txtSearchDoctor.setForeground(new java.awt.Color(102, 102, 102));
        txtSearchDoctor.setText("Type your text here ...");
        txtSearchDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchDoctorMouseClicked(evt);
            }
        });
        txtSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSearchDoctor)
                                        .addComponent(cbxTypeSearchDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel19Layout.createSequentialGroup()
                                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 39, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
                jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxTypeSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnDeleteDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                        .addComponent(btnUpdateDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                        .addComponent(btnResetDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnSearchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 439, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel16Layout.createSequentialGroup()
                                                .addComponent(btnUpdateDoctor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDeleteDoctor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnResetDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSearchDoctor)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Appoinment", jPanel16);

        txtASituation.setColumns(20);
        txtASituation.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtASituation.setRows(5);
        txtASituation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Situation Of Patient :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jScrollPane4.setViewportView(txtASituation);

        jPanel18.setBackground(new java.awt.Color(153, 153, 153));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operations :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel18.setForeground(new java.awt.Color(153, 153, 153));

        btnOperationDoctor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOperationDoctor.setText(" Add Operation");
        btnOperationDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOprationDoctorActionPerformed(evt);
            }
        });

        dateOprationDoctor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Type of blood needed for Opration ");

        cbxTypeBloodDoctor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxTypeBloodDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"A-", "A+", "B-", "B+", "AB-", "AB+", "O-", "O+"}));

        txtOperationhours.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtOperationhours.setForeground(new java.awt.Color(102, 102, 102));
        txtOperationhours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOperationhoursMouseClicked(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("choose date of Operation :");

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("hours :");

        txtOperationmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtOperationmin.setForeground(new java.awt.Color(102, 102, 102));
        txtOperationmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOperationminMouseClicked(evt);
            }
        });

        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("minute");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(dateOprationDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cbxTypeBloodDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnOperationDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                                        .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtOperationhours, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtOperationmin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateOprationDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtOperationhours)
                                                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtOperationmin)
                                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTypeBloodDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOperationDoctor)
                                .addContainerGap())
        );

        jPanel27.setBackground(new java.awt.Color(153, 153, 153));

        txtaTherapy.setColumns(20);
        txtaTherapy.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtaTherapy.setRows(5);
        txtaTherapy.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Therapy :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jScrollPane5.setViewportView(txtaTherapy);

        btnSaveCure.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSaveCure.setText("Save & Create Cure");
        btnSaveCure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                                                .addComponent(btnSaveCure, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(16, 16, 16))
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(btnSaveCure)
                                .addContainerGap())
        );

        jPanel28.setBackground(new java.awt.Color(153, 153, 153));

        btnSaveMedecine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSaveMedecine.setText("Save Medecine");
        btnSaveMedecine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveMedecineActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("Medecine");

        listMedecine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane9.setViewportView(listMedecine);

        cbxMedecineDoctor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxMedecineDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMedecineDoctorActionPerformed(evt);
            }
        });

        btnRemoveMedicine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoveMedicine.setText("Remove  Medecine");
        btnRemoveMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveMedecineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
                jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel28Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel28Layout.createSequentialGroup()
                                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel28Layout.createSequentialGroup()
                                                                .addComponent(btnRemoveMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnSaveMedecine, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cbxMedecineDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 45, Short.MAX_VALUE))
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
                jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel28Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(cbxMedecineDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRemoveMedicine)
                                        .addComponent(btnSaveMedecine))
                                .addContainerGap())
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        btnSEEAnalysis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSEEAnalysis.setText("See Analysis");
        btnSEEAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSEEAnalysisActionPerformed(evt);
            }
        });

        btnXRay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXRay.setText("XRay");
        btnXRay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXRayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
                jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel29Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnXRay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSEEAnalysis, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
                jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel29Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSEEAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXRay)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29Layout.linkSize(javax.swing.SwingConstants.VERTICAL, btnSEEAnalysis, btnXRay);

        btnSaveSituation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSaveSituation.setText("Save Situation ");
        btnSaveSituation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSituationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSaveSituation, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                                                .addGap(4, 4, 4)
                                                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel20Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSaveSituation, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(48, 48, 48))
        );

        jTabbedPane2.addTab("Cure", jPanel20);

        javax.swing.GroupLayout DoctorLayout = new javax.swing.GroupLayout(Doctor.getContentPane());
        Doctor.getContentPane().setLayout(DoctorLayout);
        DoctorLayout.setHorizontalGroup(
                DoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DoctorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(DoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 1371, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 1371, Short.MAX_VALUE)
                                        .addComponent(jTabbedPane2))
                                .addContainerGap())
        );
        DoctorLayout.setVerticalGroup(
                DoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DoctorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(0, 204, 204));
        jPanel23.setPreferredSize(new java.awt.Dimension(482, 58));
        jPanel23.setRequestFocusEnabled(false);

        jLabel54.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/doctor.png"))); // NOI18N
        jLabel54.setText("Nurse");

        jLabel55.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/Image/back (1).png"))); // NOI18N
        jLabel55.setText("Home");
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
                jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 746, Short.MAX_VALUE)
                                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
                jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtCIDNurse.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtMobileNurse.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel66.setText("Name");

        txtWeightNurse.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtWeightNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightNurseActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel67.setText("CID");

        txtAgeNurse.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        cbxSexNurse.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cbxSexNurse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Male", "Female"}));
        cbxSexNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexNurseActionPerformed(evt);
            }
        });

        txtFiscaleCodeNurse.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel68.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel68.setText("Name Doctor");

        jLabel69.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel69.setText("ID :");

        txtHeightNurse.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtHeightNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightNurseActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setText("Birth-Date");

        txtNameNurse.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNameNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameNurseActionPerformed(evt);
            }
        });

        lblIDNurse.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel71.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel71.setText("Address");

        jLabel72.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel72.setText("Fiscal Code");

        jLabel73.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel73.setText("Height");

        jLabel74.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel74.setText("Weight");

        cbxDeparmentNurse.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        cbxDeparmentNurse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cardiology Department", "Central Supplies Department", "Cleaning and Waste", "Emergency Department", "Eye Department", "Finance Department", "Household Services Department", "Laboratory Services", "Library", "Medical Services", "HSE National Cancer Control Programme (NCCP)", "Nutrition and Dietetics", "Occupational Therapy Department", "Oncology Social Work Services", "Outpatients Department", "Orthopaedic Services", "Orthopatic Department", "Patients Services", "Pharmacy Department", "Physiotherapy Department", "Point of Care Testing (POCT)", "Radiology Department", "Speech and Language Therapy Department", "Surgical Services", "Technical Services Department"}));
        cbxDeparmentNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDeparmentNurseActionPerformed(evt);
            }
        });

        txtAddressNurse.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel75.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel75.setText("Mobile");

        jLabel76.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel76.setText("Age");

        jLabel77.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel77.setText("Sex");

        jLabel78.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel78.setText("Department");

        dateNascitaNurse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Cambria Math", 1, 11)); // NOI18N
        jLabel52.setText("Choose type of search from here..");

        cbxTypeSearchNurse.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N

        txtSearchNurse.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        txtSearchNurse.setForeground(new java.awt.Color(102, 102, 102));
        txtSearchNurse.setText("Type your text here ...");
        txtSearchNurse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchNurseMouseClicked(evt);
            }
        });
        txtSearchNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNurseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxTypeSearchNurse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel22Layout.createSequentialGroup()
                                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 31, Short.MAX_VALUE))
                                        .addComponent(txtSearchNurse))
                                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTypeSearchNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchNurse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnResetNurse.setBackground(new java.awt.Color(0, 102, 102));
        btnResetNurse.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnResetNurse.setForeground(new java.awt.Color(255, 255, 255));
        btnResetNurse.setMnemonic('[');
        btnResetNurse.setText("Reset");
        btnResetNurse.setToolTipText("");
        btnResetNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetNurseActionPerformed(evt);
            }
        });

        btnSearchNurse.setBackground(new java.awt.Color(0, 102, 102));
        btnSearchNurse.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnSearchNurse.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchNurse.setMnemonic('[');
        btnSearchNurse.setText("Search");
        btnSearchNurse.setToolTipText("");
        btnSearchNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNurseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel24Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxSexNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cbxDeparmentNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(dateNascitaNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField1))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMobileNurse))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtAgeNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblIDNurse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                                .addGap(4, 4, 4)
                                                                .addComponent(txtNameNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtHeightNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel24Layout.createSequentialGroup()
                                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtAddressNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel24Layout.createSequentialGroup()
                                                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtWeightNurse))
                                                .addGroup(jPanel24Layout.createSequentialGroup()
                                                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(86, 86, 86)
                                                        .addComponent(txtFiscaleCodeNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txtCIDNurse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnResetNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSearchNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(159, 159, 159))
        );
        jPanel24Layout.setVerticalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel24Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblIDNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(btnResetNurse)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSearchNurse)
                                                .addGap(32, 32, 32)
                                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(162, Short.MAX_VALUE))
                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtNameNurse)
                                                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtMobileNurse)
                                                                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtAgeNurse)
                                                                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(dateNascitaNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(cbxSexNurse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel24Layout.createSequentialGroup()
                                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtHeightNurse))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(txtWeightNurse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(txtAddressNurse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtFiscaleCodeNurse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtCIDNurse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cbxDeparmentNurse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane3.addTab("Patient Info", jPanel24);

        tabNurseBloodTest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabNurseBloodTest.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        jScrollPane7.setViewportView(tabNurseBloodTest);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Insert the results here  and then  press Send:");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("Blood Test : ");

        btnSendtoDoctor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendtoDoctor.setText("Send to Doctor");
        btnSendtoDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendtoDoctorActionPerformed(evt);
            }
        });

        btnXrayNurse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXrayNurse.setText("ADD XRay ");
        btnXrayNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXrayNurseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel25Layout.createSequentialGroup()
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnSendtoDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnXrayNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel25Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
                jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel56))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel25Layout.createSequentialGroup()
                                                .addComponent(btnSendtoDoctor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnXrayNurse)))
                                .addGap(54, 54, 54))
        );

        jTabbedPane3.addTab("Patient Analysis", jPanel25);

        tabNurse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabNurse.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        tabNurse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabNurseMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabNurse);

        javax.swing.GroupLayout NurseLayout = new javax.swing.GroupLayout(Nurse.getContentPane());
        Nurse.getContentPane().setLayout(NurseLayout);
        NurseLayout.setHorizontalGroup(
                NurseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(NurseLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(NurseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, 1222, Short.MAX_VALUE)
                                        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 1222, Short.MAX_VALUE)
                                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane6))
                                .addContainerGap())
        );
        NurseLayout.setVerticalGroup(
                NurseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(NurseLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        btnSaveImage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSaveImage.setText("Save");
        btnSaveImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveImageActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
                jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
                        .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(321, 321, 321)
                                .addComponent(btnSaveImage, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
                jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSaveImage)
                                        .addComponent(btnClose))
                                .addContainerGap())
        );

        javax.swing.GroupLayout frameImageLayout = new javax.swing.GroupLayout(frameImage.getContentPane());
        frameImage.getContentPane().setLayout(frameImageLayout);
        frameImageLayout.setHorizontalGroup(
                frameImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameImageLayout.setVerticalGroup(
                frameImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtAanalysis.setColumns(20);
        txtAanalysis.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtAanalysis.setRows(5);
        jScrollPane8.setViewportView(txtAanalysis);

        btnCloseAnalysis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCloseAnalysis.setText("Close");
        btnCloseAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseAnalysisActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setText("Result of BloodTest  :");

        javax.swing.GroupLayout frameAnalysisLayout = new javax.swing.GroupLayout(frameAnalysis.getContentPane());
        frameAnalysis.getContentPane().setLayout(frameAnalysisLayout);
        frameAnalysisLayout.setHorizontalGroup(
                frameAnalysisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(frameAnalysisLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(frameAnalysisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(frameAnalysisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnCloseAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(36, Short.MAX_VALUE))
        );
        frameAnalysisLayout.setVerticalGroup(
                frameAnalysisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(frameAnalysisLayout.createSequentialGroup()
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCloseAnalysis)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(0, 204, 204));
        jPanel30.setPreferredSize(new java.awt.Dimension(482, 58));
        jPanel30.setRequestFocusEnabled(false);

        jLabel61.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/pharmacist (2).png"))); // NOI18N
        jLabel61.setText("Pharmacist");

        lblBackAppointment2.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        lblBackAppointment2.setForeground(new java.awt.Color(255, 255, 255));
        lblBackAppointment2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBackAppointment2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/root/Image/back (1).png"))); // NOI18N
        lblBackAppointment2.setText("Home");
        lblBackAppointment2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackAppointment2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
                jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBackAppointment2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
                jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblBackAppointment2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        ttabPatientPharmacist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ttabPatientPharmacist.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        ttabPatientPharmacist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttabPatientPharmacistMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(ttabPatientPharmacist);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
                jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
                jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );

        jTabbedPane4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel32.setBackground(new java.awt.Color(153, 153, 153));

        jPanel33.setBackground(new java.awt.Color(204, 204, 204));

        lblIDPatient1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel62.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel62.setText("Fiscal Code");

        jLabel65.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel65.setText("Age");

        jLabel79.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel79.setText("Sex");

        jLabel80.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel80.setText("Department");

        txtCIDPH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel81.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel81.setText("Name");

        jLabel82.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel82.setText("CID");

        txtAgePatient1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtFiscaleCodePH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtFiscaleCodePH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiscaleCodePHActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel83.setText("Name Doctor");

        jLabel84.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel84.setText("ID :");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel85.setText("Birth-Date");

        txtNamePatient1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNamePatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamePatient1ActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jLabel87.setText("Total :");

        txttotalePH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtSexPH.setToolTipText("");

        txtDepartmentPH.setToolTipText("");

        txtNameDotorPH.setToolTipText("");

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton12.setText("Payed");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        btnResetPatient1.setBackground(new java.awt.Color(0, 102, 102));
        btnResetPatient1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnResetPatient1.setForeground(new java.awt.Color(255, 255, 255));
        btnResetPatient1.setMnemonic('[');
        btnResetPatient1.setText("Reset");
        btnResetPatient1.setToolTipText("");
        btnResetPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPatient1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
                jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel33Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel33Layout.createSequentialGroup()
                                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel33Layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtAgePatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtNamePatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 3, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lblIDPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel33Layout.createSequentialGroup()
                                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addComponent(txtBirthPharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel33Layout.createSequentialGroup()
                                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtNameDotorPH, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtSexPH, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtDepartmentPH, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel33Layout.createSequentialGroup()
                                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(jPanel33Layout.createSequentialGroup()
                                                                .addComponent(btnResetPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(txtCIDPH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                                        .addComponent(txtFiscaleCodePH, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txttotalePH, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
                jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel33Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblIDPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNamePatient1))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAgePatient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBirthPharmacist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSexPH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDepartmentPH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNameDotorPH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFiscaleCodePH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCIDPH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txttotalePH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnResetPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
                jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel32Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
        );
        jPanel32Layout.setVerticalGroup(
                jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel32Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Pharmacy", jPanel32);

        jPanel34.setBackground(new java.awt.Color(153, 153, 153));

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel89.setText("Medecine");

        txtMedecine.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel90.setText("Price");

        txtPrice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        tabMedecinePharmacy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabMedecinePharmacy.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        tabMedecinePharmacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMedecinePharmacyMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tabMedecinePharmacy);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setText("Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setText("Search :");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        txtSerachPH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSerachPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerachPHActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel63.setText("Insert  name Medecine here ....");

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
                jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel34Layout.createSequentialGroup()
                                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMedecine, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel34Layout.createSequentialGroup()
                                                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel34Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel34Layout.createSequentialGroup()
                                                .addComponent(jButton8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7))
                                        .addGroup(jPanel34Layout.createSequentialGroup()
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtSerachPH, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
                jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMedecine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton11)
                                        .addComponent(txtSerachPH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton8)
                                        .addComponent(jButton9)
                                        .addComponent(jButton10)
                                        .addComponent(jButton7))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
        );

        jTabbedPane4.addTab("New Medecine", jPanel34);

        jPanel35.setBackground(new java.awt.Color(153, 153, 153));

        jLabel93.setFont(new java.awt.Font("Cambria Math", 1, 11)); // NOI18N
        jLabel93.setText("Choose type of search from here..");

        cbxTypeSearchPatient1.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N

        txtSearchPatient1.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        txtSearchPatient1.setForeground(new java.awt.Color(102, 102, 102));
        txtSearchPatient1.setText("Type your text here ...");
        txtSearchPatient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchPatient1MouseClicked(evt);
            }
        });
        txtSearchPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPatient1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
                jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel35Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSearchPatient1)
                                        .addComponent(cbxTypeSearchPatient1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel35Layout.createSequentialGroup()
                                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
                jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTypeSearchPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSearchPatient1.setBackground(new java.awt.Color(0, 102, 102));
        btnSearchPatient1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        btnSearchPatient1.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchPatient1.setMnemonic('[');
        btnSearchPatient1.setText("Search");
        btnSearchPatient1.setToolTipText("");
        btnSearchPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPatient1ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel64.setText("Patient :");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel88.setText("Medecine :");

        listMedecinePharmacist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jScrollPane12.setViewportView(listMedecinePharmacist);

        javax.swing.GroupLayout PharmacistLayout = new javax.swing.GroupLayout(Pharmacist.getContentPane());
        Pharmacist.getContentPane().setLayout(PharmacistLayout);
        PharmacistLayout.setHorizontalGroup(
                PharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PharmacistLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PharmacistLayout.createSequentialGroup()
                                                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PharmacistLayout.createSequentialGroup()
                                                                .addGroup(PharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(PharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel88)
                                                                        .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)))
                                                        .addGroup(PharmacistLayout.createSequentialGroup()
                                                                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnSearchPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(33, 33, 33))
                                        .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, 1287, Short.MAX_VALUE)
                                        .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, 1287, Short.MAX_VALUE))
                                .addContainerGap())
        );
        PharmacistLayout.setVerticalGroup(
                PharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PharmacistLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTabbedPane4)
                                        .addGroup(PharmacistLayout.createSequentialGroup()
                                                .addGroup(PharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel88))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane12)
                                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addGroup(PharmacistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PharmacistLayout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(PharmacistLayout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(btnSearchPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(102, 102, 102)))
                                .addGap(28, 28, 28))
        );

        jPanel38.setBackground(new java.awt.Color(202, 62, 62));

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/gmail.png"))); // NOI18N

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Name");

        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Email");

        txtEmailMail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel113.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Job :");

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Department :");

        txtMobileMail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel115.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Mobile");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Send");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbxDepartmentMAil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cardiology Department", "Central Supplies Department", "Cleaning and Waste", "Emergency Department", "Eye Department", "Finance Department", "Household Services Department", "Laboratory Services", "Library", "Medical Services", "HSE National Cancer Control Programme (NCCP)", "Nutrition and Dietetics", "Occupational Therapy Department", "Oncology Social Work Services", "Outpatients Department", "Orthopaedic Services", "Orthopatic Department", "Patients Services", "Pharmacy Department", "Physiotherapy Department", "Point of Care Testing (POCT)", "Radiology Department", "Speech and Language Therapy Department", "Surgical Services", "Technical Services Department"}));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
                jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel38Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel38Layout.createSequentialGroup()
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel38Layout.createSequentialGroup()
                                                                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtNameMail, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel38Layout.createSequentialGroup()
                                                                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtEmailMail, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel38Layout.createSequentialGroup()
                                                                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtMobileMail, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel38Layout.createSequentialGroup()
                                                                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(cbxJobMail, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(cbxDepartmentMAil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                                        .addGroup(jPanel38Layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
                jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel38Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNameMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmailMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxJobMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxDepartmentMAil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMobileMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frameEmailLayout = new javax.swing.GroupLayout(frameEmail.getContentPane());
        frameEmail.getContentPane().setLayout(frameEmailLayout);
        frameEmailLayout.setHorizontalGroup(
                frameEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameEmailLayout.setVerticalGroup(
                frameEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        paneLogin.setBackground(new java.awt.Color(0, 102, 255));
        paneLogin.setLayout(null);

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/facebook.png"))); // NOI18N
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel92MouseClicked(evt);
            }
        });
        paneLogin.add(jLabel92);
        jLabel92.setBounds(54, 521, 73, 50);

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/whatsapp.png"))); // NOI18N
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel94MouseClicked(evt);
            }
        });
        paneLogin.add(jLabel94);
        jLabel94.setBounds(172, 521, 73, 50);

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/youtube.png"))); // NOI18N
        jLabel95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel95MouseClicked(evt);
            }
        });
        paneLogin.add(jLabel95);
        jLabel95.setBounds(280, 521, 73, 50);

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/twitter.png"))); // NOI18N
        jLabel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel96MouseClicked(evt);
            }
        });
        paneLogin.add(jLabel96);
        jLabel96.setBounds(400, 520, 73, 50);

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText(" Hospital Management");
        paneLogin.add(jLabel99);
        jLabel99.setBounds(40, 11, 430, 60);

        jLabel100.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("Chahir Chalouati");
        paneLogin.add(jLabel100);
        jLabel100.setBounds(180, 110, 143, 23);

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("SimSun", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("see user and Password here");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        paneLogin.add(jButton1);
        jButton1.setBounds(170, 330, 183, 15);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
                jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
                jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        paneLogin.add(jPanel36);
        jPanel36.setBounds(50, 80, 420, 4);

        jLabel86.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/Places-user-identity-icon.png"))); // NOI18N
        jLabel86.setText("USER");
        paneLogin.add(jLabel86);
        jLabel86.setBounds(10, 240, 130, 33);

        txtUser.setBackground(new java.awt.Color(0, 102, 255));
        txtUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(null);
        paneLogin.add(txtUser);
        txtUser.setBounds(150, 240, 263, 30);

        txtPassword.setBackground(new java.awt.Color(0, 102, 255));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        paneLogin.add(txtPassword);
        txtPassword.setBounds(150, 290, 263, 30);

        jLabel91.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/Apps-preferences-desktop-user-password-icon.png"))); // NOI18N
        jLabel91.setText("Password");
        paneLogin.add(jLabel91);
        jLabel91.setBounds(10, 290, 130, 32);

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/Gmail-icon.png"))); // NOI18N
        jLabel98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel98MouseClicked(evt);
            }
        });
        paneLogin.add(jLabel98);
        jLabel98.setBounds(360, 320, 57, 45);

        btnLogin.setBackground(new java.awt.Color(0, 102, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        paneLogin.add(btnLogin);
        btnLogin.setBounds(270, 370, 141, 40);

        p1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
                p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 260, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
                p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        paneLogin.add(p1);
        p1.setBounds(150, 270, 260, 4);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
                jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
                jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        paneLogin.add(jPanel39);
        jPanel39.setBounds(130, 90, 250, 4);

        p2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
                p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 260, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
                p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 4, Short.MAX_VALUE)
        );

        paneLogin.add(p2);
        p2.setBounds(150, 320, 260, 4);

        getContentPane().add(paneLogin);
        paneLogin.setBounds(490, 0, 510, 590);

        jLabel102.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 0, 204));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Doctor");
        getContentPane().add(jLabel102);
        jLabel102.setBounds(210, 170, 140, 40);

        jLabel103.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 204));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Time");
        getContentPane().add(jLabel103);
        jLabel103.setBounds(150, 60, 140, 50);

        jLabel104.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 204));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("is");
        getContentPane().add(jLabel104);
        jLabel104.setBounds(180, 100, 140, 30);

        jLabel105.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 204));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("the Best");
        getContentPane().add(jLabel105);
        jLabel105.setBounds(150, 130, 140, 40);

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospital/image/1339.jpg_wh1200.jpg"))); // NOI18N
        getContentPane().add(jLabel101);
        jLabel101.setBounds(-370, 0, 1540, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void combSettings(JComboBox combo, String str) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            if (str.equals(String.valueOf(combo.getItemAt(i)))) {
                combo.setSelectedIndex(i);
                break;
            }

        }
    }

    public void PrintReceipt(String receipt) {
        JTextPane textPane = new JTextPane();

        textPane.setText(receipt);

        try {
            textPane.print();
            JOptionPane.showMessageDialog(null, " done :)");
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    // FIX FRAME SIZE
    public void frameFix(JFrame frame) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // take  data from table test blood or others
    public String DataTable(JTable tab) {
        String str = "";
        for (int i = 0; i < tab.getColumnCount(); i++) {
            str += tab.getColumnName(i) + "\t";

        }

        str += "\n";
        for (int i = 0; i < tab.getRowCount(); i++) {//rows
            str += "\n";
            for (int j = 0; j < tab.getColumnCount(); j++) {//columns
                str += tab.getValueAt(i, j).toString() + "\t";
            }

        }
        return str;
    }

    public void closeFrame(JFrame frame) {
        frame.dispose();
        this.setVisible(true);
        txtUser.setText("");
        txtPassword.setText("");

    }

    public void Links(String Url) {
        try {
            Desktop.getDesktop().browse(new URL(Url).toURI());
        } catch (IOException | URISyntaxException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void Notifiche() {

    }

    private void btnSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeActionPerformed
        component.CercaInDB("Employee", txtSearchEmployee, tabEmpolyee, cbxTypeSearchEmployee, 0);

    }//GEN-LAST:event_btnSearchEmployeeActionPerformed

    private void btnResetEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetEmployeeActionPerformed

        // reset component
        cbxDeparmentEmployee.setSelectedIndex(0);
        cbxJobEmployee.setSelectedIndex(0);
        cbxSexEmployee.setSelectedIndex(0);
        cbxTypeSearchEmployee.setSelectedIndex(0);
        txtAddressEmployee.setText("");
        txtEmailEmployee.setText("");
        txtMobileEmloyee.setText("");
        txtNameEmployee.setText("");
        txtPasswordEmployee.setText("");
        txtSearchEmployee.setText("");
        txtUserlEmployee.setText("");
        lblID.setText("");
        txtSearchEmployee.setText("Type your text here ...");
        component.showdbTabella(tabEmpolyee, "Employee", 0);
    }//GEN-LAST:event_btnResetEmployeeActionPerformed

    private void txtSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEmployeeActionPerformed

    private void cbxJobEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxJobEmployeeActionPerformed

    }//GEN-LAST:event_cbxJobEmployeeActionPerformed

    private void cbxSexEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexEmployeeActionPerformed

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed

        //insert data to database  patient
        String query = "INSERT INTO Employee ( Name, Address, Mobile, EMail, SexEmployee, Job, Department, User, Password ) VALUES ('" + txtNameEmployee.getText() + "','" + txtAddressEmployee.getText() + "','" + txtMobileEmloyee.getText() + "','" + txtEmailEmployee.getText() + "','" + cbxSexEmployee.getSelectedItem() + "','" + cbxJobEmployee.getSelectedItem() + "','" + cbxDeparmentEmployee.getSelectedItem() + "','" + txtUserlEmployee.getText() + "','" + txtPasswordEmployee.getText() + "' )";
        component.save(tabEmpolyee, query);
        component.showdbTabella(tabEmpolyee, "Employee", 0);
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, ""
                + "per l'acceso alla frame Admin USER=admin , Password = admin" + "\n"
                + "per l'acceso alla frame Appointment USER=receptionist , Password = receptionist " + "\n"
                + "per l'acceso alla frame Nurse USER=nurse , Password = nurse " + "\n"
                + "per l'acceso alla frame Doctor USER=doctor , Password = doctor " + "\n"
                + "per l'acceso alla frame Pharmacist USER=pharmacist , Password = pharmacist " + "\n"
                + "per modificare un valore nelle tabelle :: la nuova valore va inserita direttamente nella tabella poi premi pulsante update " + "\n"
                + "");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSearchEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchEmployeeMouseClicked
        txtSearchEmployee.setText("");
    }//GEN-LAST:event_txtSearchEmployeeMouseClicked

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        component.delete(tabEmpolyee, "Employee");
        component.showdbTabella(tabEmpolyee, "Employee", 0);
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void btnUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeActionPerformed
        component.update(tabEmpolyee, "Employee");
        component.showdbTabella(tabEmpolyee, "Employee", 0);
    }//GEN-LAST:event_btnUpdateEmployeeActionPerformed

    private void cbxSexPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexPatientActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // adding new patient data
        try {
            Date date = new Date();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String appuntamento = txtOraPaziente.getText() + ":" + txtMinutiPaziente.getText() + "-" + cbxGiornoPaziente.getSelectedItem() + "-" + cbxMesePaziente.getSelectedItem() + "-" + lblAnnoPaziente.getText();
            cbxSexPatient.getSelectedItem();
            cbxDeparmentPatient.getSelectedItem();

            cbxNameDoctor.getSelectedItem();
            String query = "INSERT INTO Patient ( Name ,Mobile , Age, DataNascita, Height , Weight , Address , FiscaleCode , CID, Appointment, Sex,  Department, NameDoctor) VALUES ("
                    + "'" + txtNamePatient.getText()
                    + "','" + txtMobilePatient.getText()
                    + "', '" + txtAgePatient.getText()
                    + "', '" + df.format(dateNascita.getDate())
                    + "', '" + txtHeightPatient.getText()
                    + "', '" + txtWeightPatient.getText()
                    + "', '" + txtAddressPatient.getText()
                    + "', '" + txtFiscaleCodePatient.getText()
                    + "', '" + txtCIDPatient.getText()
                    + "', '" + appuntamento
                    + "', '" + cbxSexPatient.getSelectedItem()
                    + "', '" + cbxDeparmentPatient.getSelectedItem()
                    + "', '" + cbxNameDoctor.getSelectedItem()
                    + "')";

            component.save(tabPatient, query);
            component.showdbTabella(tabPatient, "Patient", 11);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "you Forgot some input");

        }
//        txtNamePatient.getText();
//        txtMobilePatient.getText();
//        txtAgePatient.getText();
//        txtHeightPatient.getText();
//        txtWeightPatient.getText();
//        txtAddressPatient.getText();
//        txtFiscaleCodePatient.getText();
//        txtCIDPatient.getText();


    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void btnUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatientActionPerformed
        component.update(tabPatient, "Patient");
        component.showdbTabella(tabPatient, "Patient", 11);
    }//GEN-LAST:event_btnUpdatePatientActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        component.delete(tabPatient, "Patient");
        component.showdbTabella(tabPatient, "Patient", 11);
    }//GEN-LAST:event_btnDeletePatientActionPerformed

    private void btnResetPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPatientActionPerformed
        component.showdbTabella(tabPatient, "Patient", 11);
        txtNamePatient.setText("");
        txtMobilePatient.setText("");
        txtAgePatient.setText("");
        txtHeightPatient.setText("");
        txtWeightPatient.setText("");
        txtAddressPatient.setText("");
        txtFiscaleCodePatient.setText("");
        txtCIDPatient.setText("");
        lblIDPatient.setText("");
        txtOraPaziente.setText("");
        txtMinutiPaziente.setText("");
        cbxGiornoPaziente.setSelectedItem(0);
        cbxMesePaziente.setSelectedItem(0);
        dateNascita.setDate(null);
        cbxSexPatient.setSelectedItem(0);
        cbxDeparmentPatient.setSelectedItem(0);
        cbxNameDoctor.setSelectedItem(0);
    }//GEN-LAST:event_btnResetPatientActionPerformed

    private void txtSearchPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchPatientMouseClicked
        txtSearchPatient.setText("");
    }//GEN-LAST:event_txtSearchPatientMouseClicked

    private void txtSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPatientActionPerformed

    private void btnSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPatientActionPerformed
        component.CercaInDB("Patient", txtSearchPatient, tabPatient, cbxTypeSearchPatient, 11);
    }//GEN-LAST:event_btnSearchPatientActionPerformed

    private void cbxDeparmentPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDeparmentPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDeparmentPatientActionPerformed

    private void cbxNameDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNameDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNameDoctorActionPerformed

    private void tabPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPatientMouseClicked
        int y = tabPatient.getSelectedRow();
        int x = valueOf(String.valueOf(tabPatient.getValueAt(y, 0)));

        component.result("SELECT Name,Mobile,Age,Height,Weight,Address ,FiscaleCode,CID,Appointment,Sex,Department,NameDoctor,DataNascita  FROM Patient WHERE ID =" + x + "  ");
        try {
            while (component.resultSet().next()) {
                lblIDPatient.setText(String.valueOf(tabPatient.getValueAt(y, 0)));
                txtNamePatient.setText(component.resultSet().getString(1));
                txtMobilePatient.setText(component.resultSet().getString(2));
                txtAgePatient.setText(component.resultSet().getString(3));
                txtHeightPatient.setText(component.resultSet().getString(4));
                txtWeightPatient.setText(component.resultSet().getString(5));
                txtAddressPatient.setText(component.resultSet().getString(6));
                txtFiscaleCodePatient.setText(component.resultSet().getString(7));
                txtCIDPatient.setText(component.resultSet().getString(8));
                String[] arr = component.resultSet().getString(9).split("-");
                String[] arr1 = arr[0].split(":");
                txtOraPaziente.setText(arr1[0]);
                txtMinutiPaziente.setText(arr1[1]);
                combSettings(cbxGiornoPaziente, arr[1]);
                combSettings(cbxMesePaziente, arr[2]);
                lblAnnoPaziente.setText(arr[3]);
                combSettings(cbxSexPatient, component.resultSet().getString(10));
                combSettings(cbxDeparmentPatient, component.resultSet().getString(11));
                combSettings(cbxNameDoctor, component.resultSet().getString(12));
                try {
                    Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(component.resultSet().getString(13));
                    dateNascita.setDate(date2);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }//GEN-LAST:event_tabPatientMouseClicked

    private void cbxGiornoPazienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGiornoPazienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxGiornoPazienteActionPerformed

    private void txtMinutiPazienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinutiPazienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinutiPazienteActionPerformed

    private void txtWeightPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightPatientActionPerformed

    private void tabDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDoctorMouseClicked
        int y = tabDoctor.getSelectedRow();

        if (y == -1) {
            JOptionPane.showMessageDialog(Reception, "select patient from table first ");
        } else {
            int x = valueOf(String.valueOf(tabDoctor.getValueAt(y, 0)));
            component.result("SELECT ID, Name, Address, Mobile, Age, DataNascita, Height, Weight, Sex, FiscaleCode, CID, Appointment, NameDoctor, Department FROM Patient WHERE ID = " + x + "");

            try {
                lblIDDoctor.setText(component.resultSet().getString(1));
                txtNameDoctor.setText(component.resultSet().getString(2));
                txtMobileDoctor.setText(component.resultSet().getString(4));
                txtAgeDoctor.setText(component.resultSet().getString(5));
                txtBirthDateDoctor.setText(component.resultSet().getString(6));
                txtHeightDoctor.setText(component.resultSet().getString(7));
                txtWeightDoctor.setText(component.resultSet().getString(8));
                txtAddressDoctor.setText(component.resultSet().getString(3));
                txtFiscaleCodeDoctor.setText(component.resultSet().getString(10));
                txtCIDDoctor.setText(component.resultSet().getString(11));
                txtDoctor.setText(component.resultSet().getString(13));
                txtAppointment.setText(component.resultSet().getString(12));
                combSettings(cbxSexDoctor, component.resultSet().getString(9));
                combSettings(cbxDeparmentDoctor, component.resultSet().getString(14));
            } catch (SQLException e) {
            }
        }


    }//GEN-LAST:event_tabDoctorMouseClicked

    private void cbxDeparmentDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDeparmentDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDeparmentDoctorActionPerformed

    private void txtWeightDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightDoctorActionPerformed

    private void cbxSexDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexDoctorActionPerformed

    private void btnUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDoctorActionPerformed
        component.update(tabDoctor, "Patient");
        component.showdbTabella(tabDoctor, "Patient", 11);

    }//GEN-LAST:event_btnUpdateDoctorActionPerformed

    private void btnDeleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDoctorActionPerformed
        component.delete(tabDoctor, "Patient");
        component.showdbTabella(tabDoctor, "Patient", 11);
    }//GEN-LAST:event_btnDeleteDoctorActionPerformed

    private void btnResetDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDoctorActionPerformed
        component.showdbTabella(tabDoctor, "Patient", 11);
        lblIDDoctor.setText("");
        txtNameDoctor.setText("");
        txtMobileDoctor.setText("");
        txtAgeDoctor.setText("");
        txtBirthDateDoctor.setText("");
        txtHeightDoctor.setText("");
        txtWeightDoctor.setText("");
        txtAddressDoctor.setText("");
        txtFiscaleCodeDoctor.setText("");
        txtCIDDoctor.setText("");
        txtDoctor.setText("");
        txtAppointment.setText("");
        cbxSexDoctor.setSelectedIndex(0);
        cbxDeparmentDoctor.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetDoctorActionPerformed

    private void btnSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDoctorActionPerformed
        component.CercaInDB("Patient", txtSearchDoctor, tabDoctor, cbxTypeSearchDoctor, 11);
    }//GEN-LAST:event_btnSearchDoctorActionPerformed

    private void txtSearchDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchDoctorMouseClicked
        txtSearchDoctor.setText("");
    }//GEN-LAST:event_txtSearchDoctorMouseClicked

    private void txtSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDoctorActionPerformed

    }//GEN-LAST:event_txtSearchDoctorActionPerformed

    private void tabEmpolyeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabEmpolyeeMouseClicked
        int y = tabEmpolyee.getSelectedRow();
        int x = valueOf(String.valueOf(tabEmpolyee.getValueAt(y, 0)));

        String query = "SELECT  Name, Address, Mobile, EMail, SexEmployee, Job, Department, User, Password FROM Employee WHERE ID =" + x + "";
        component.result(query);
        try {
            while (component.resultSet().next()) {
                lblID.setText(String.valueOf(tabEmpolyee.getValueAt(y, 0)));
                txtNameEmployee.setText(component.resultSet().getString(1));
                txtMobileEmloyee.setText(component.resultSet().getString(3));
                txtEmailEmployee.setText(component.resultSet().getString(4));
                txtUserlEmployee.setText(component.resultSet().getString(8));
                txtPasswordEmployee.setText(component.resultSet().getString(9));
                txtAddressEmployee.setText(component.resultSet().getString(2));
//                cbxDeparmentEmployee.setSelectedIndex(WIDTH);
//                cbxJobEmployee.setSelectedIndex(WIDTH);
//                cbxSexEmployee.setSelectedIndex(WIDTH);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_tabEmpolyeeMouseClicked

    private void txtAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppointmentActionPerformed

    private void txtFiscaleCodeDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiscaleCodeDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiscaleCodeDoctorActionPerformed

    private void txtNamePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamePatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamePatientActionPerformed

    private void txtOperationhoursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOperationhoursMouseClicked
        txtOperationhours.setText("");
    }//GEN-LAST:event_txtOperationhoursMouseClicked

    private void btnResetNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetNurseActionPerformed
        lblIDNurse.setText("");
        txtNameNurse.setText("");
        txtMobileNurse.setText("");
        txtAgeNurse.setText("");
        txtHeightNurse.setText("");
        txtWeightNurse.setText("");
        txtAddressNurse.setText("");
        txtFiscaleCodeNurse.setText("");
        txtCIDNurse.setText("");
        cbxSexNurse.setSelectedIndex(0);
        cbxDeparmentNurse.setSelectedIndex(0);
        jTextField1.setText("");
        dateNascitaNurse.setDate(null);
        component.showdbTabella(tabNurse, "Patient", 11);
        cbxTypeSearchNurse.setSelectedIndex(0);
        txtSearchNurse.setText("Type your text here ...");
    }//GEN-LAST:event_btnResetNurseActionPerformed

    private void txtSearchNurseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchNurseMouseClicked
        txtSearchNurse.setText("");
    }//GEN-LAST:event_txtSearchNurseMouseClicked

    private void txtSearchNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNurseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchNurseActionPerformed

    private void tabNurseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabNurseMouseClicked
        int y = tabNurse.getSelectedRow();
        int x = valueOf(String.valueOf(tabNurse.getValueAt(y, 0)));

        component.result("SELECT Name,Mobile,Age,Height,Weight,Address,FiscaleCode,CID,Sex,Department,NameDoctor,DataNascita FROM Patient WHERE ID =" + x + "  ");
        try {
            while (component.resultSet().next()) {
                lblIDNurse.setText(String.valueOf(tabNurse.getValueAt(y, 0)));
                txtNameNurse.setText(component.resultSet().getString(1));
                txtMobileNurse.setText(component.resultSet().getString(2));
                txtAgeNurse.setText(component.resultSet().getString(3));
                txtHeightNurse.setText(component.resultSet().getString(4));
                txtWeightNurse.setText(component.resultSet().getString(5));
                txtAddressNurse.setText(component.resultSet().getString(6));
                txtFiscaleCodeNurse.setText(component.resultSet().getString(7));
                txtCIDNurse.setText(component.resultSet().getString(8));
                combSettings(cbxSexNurse, component.resultSet().getString(9));
                combSettings(cbxDeparmentNurse, component.resultSet().getString(10));
                jTextField1.setText(component.resultSet().getString(11));
                try {
                    Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(component.resultSet().getString(12));
                    dateNascitaNurse.setDate(date2);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_tabNurseMouseClicked

    private void btnSearchNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNurseActionPerformed
        component.CercaInDB("Patient", txtSearchNurse, tabNurse, cbxTypeSearchNurse, 11);
    }//GEN-LAST:event_btnSearchNurseActionPerformed

    private void txtWeightNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightNurseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightNurseActionPerformed

    private void cbxSexNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexNurseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexNurseActionPerformed

    private void txtNameNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameNurseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameNurseActionPerformed

    private void cbxDeparmentNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDeparmentNurseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDeparmentNurseActionPerformed

    private void txtHeightNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightNurseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightNurseActionPerformed

    private void btnSendtoDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendtoDoctorActionPerformed
        int y = tabNurse.getSelectedRow();
        if (y != -1) {

            int x = valueOf(String.valueOf(tabNurse.getValueAt(y, 0)));
            String str = DataTable(tabNurseBloodTest);
            String query = "UPDATE Patient SET  analysis = '" + str + "' WHERE ID = " + x + "";
            try {
                component.statement().executeUpdate(query);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            JOptionPane.showMessageDialog(null, " saved with success :)");
        } else {
            JOptionPane.showMessageDialog(null, "Select patient from table");
        }

    }//GEN-LAST:event_btnSendtoDoctorActionPerformed

    private void btnXrayNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXrayNurseActionPerformed
        component.FileChoose(btnXrayNurse, lblImage);

        if (component.isValue() == true) {
            frameImage.setLocationRelativeTo(null);
            frameImage.setSize(973, 600);
            frameImage.setLocationRelativeTo(null);
            frameImage.setVisible(true);
        }

    }//GEN-LAST:event_btnXrayNurseActionPerformed

    private void btnSaveImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveImageActionPerformed

        int row = tabNurse.getSelectedRow();
        if (row != -1) {
            int val = valueOf(String.valueOf(tabNurse.getValueAt(row, 0)));
            String columnName = tabNurse.getColumnName(0);
            component.addImage("Patient", "XRay", columnName, val);
            frameImage.dispose();
        } else if (row == -1) {
            JOptionPane.showMessageDialog(null, "Select patient from table to add image");
        }
    }//GEN-LAST:event_btnSaveImageActionPerformed

    private void btnXRayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXRayActionPerformed
        int row = tabDoctor.getSelectedRow();
        if (row != -1) {
            int val = valueOf(String.valueOf(tabDoctor.getValueAt(row, 0)));
            String columnName = tabDoctor.getColumnName(0);
            component.getImage("Patient", "XRay", columnName, val, lblImage);
            frameImage.setSize(973, 600);
            frameImage.setLocationRelativeTo(null);
            frameImage.setVisible(component.isValue());
            btnSaveImage.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Select patient from table to add image");

        }
    }//GEN-LAST:event_btnXRayActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        frameImage.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSEEAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSEEAnalysisActionPerformed

        int row = tabDoctor.getSelectedRow();

        if (row != -1) {
            int val = valueOf(String.valueOf(tabDoctor.getValueAt(row, 0)));

            String query = "select analysis from Patient where ID = " + val + "";
            component.result(query);
            try {

                String analysis = component.resultSet().getString(1);
                if (analysis.equals("")) {

                } else {
                    txtAanalysis.setText(analysis);
                    frameAnalysis.setLocationRelativeTo(btnSEEAnalysis);
                    frameAnalysis.setSize(770, 600);
                    frameAnalysis.setVisible(true);

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "no analysis found ...");
            }

        } else if (row == -1) {

            JOptionPane.showMessageDialog(null, "Select patient from table to see patient analysis");

        }


    }//GEN-LAST:event_btnSEEAnalysisActionPerformed

    private void btnCloseAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseAnalysisActionPerformed
        frameAnalysis.dispose();
        txtAanalysis.setText("");
    }//GEN-LAST:event_btnCloseAnalysisActionPerformed

    private void btnSaveCureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCureActionPerformed
        String text = txtaTherapy.getText();
        int y = tabDoctor.getSelectedRow();

        if (y == -1) {
            JOptionPane.showMessageDialog(Reception, "select patient from table first ");
        } else {

            if (text.equals("")) {
                JOptionPane.showMessageDialog(Reception, " insert Therapy first ");
            } else {
                int x = valueOf(String.valueOf(tabDoctor.getValueAt(y, 0)));
                String query = "Update Patient set Cure='" + text + "'where ID = " + x + " ";
                try {
                    component.statement().executeUpdate(query);
                    JOptionPane.showMessageDialog(null, " saved ");
                } catch (SQLException ex) {
                    Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
    }//GEN-LAST:event_btnSaveCureActionPerformed

    private void cbxMedecineDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMedecineDoctorActionPerformed
        listModel = new DefaultListModel();
        objectVector.add(cbxMedecineDoctor.getSelectedItem());
        for (int i = 0; i < objectVector.size(); i++) {
            listModel.addElement(objectVector.get(i));
        }
        listMedecine.setModel(listModel);
    }//GEN-LAST:event_cbxMedecineDoctorActionPerformed

    private void btnRemoveMedecineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveMedecineActionPerformed

        if (listMedecine.getModel().getSize() == 0) {
            JOptionPane.showMessageDialog(null, "List Is Empty");
        } else {

            int x = listMedecine.getSelectedIndex();

            if (x != -1) {
                objectVector.remove(x);
                listModel = new DefaultListModel();
                for (int i = 0; i < objectVector.size(); i++) {
                    listModel.addElement(objectVector.get(i));
                }
                listMedecine.setModel(listModel);
            } else if (x == -1) {
                JOptionPane.showMessageDialog(null, "select medecine ");
            }

        }


    }//GEN-LAST:event_btnRemoveMedecineActionPerformed

    private void btnSaveMedecineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveMedecineActionPerformed
        int y = tabDoctor.getSelectedRow();

        if (y == -1) {
            JOptionPane.showMessageDialog(Reception, "select patient from table first ");
        } else {
            if (listMedecine.getModel().getSize() == 0) {

                JOptionPane.showMessageDialog(Reception, "you forgot to add medecine ");
            } else {
                int x = valueOf(String.valueOf(tabDoctor.getValueAt(y, 0)));
                String str = "";
                for (int i = 0; i < listMedecine.getModel().getSize(); i++) {
                    str += listMedecine.getModel().getElementAt(i) + ":";
                }

                String query = "Update Patient Set Medecine ='" + str + "' where ID =" + x + "";
                try {
                    component.statement().executeUpdate(query);
                    JOptionPane.showMessageDialog(null, " saved ");
                } catch (SQLException ex) {
                    Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }


    }//GEN-LAST:event_btnSaveMedecineActionPerformed

    private void btnSaveSituationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSituationActionPerformed
        int y = tabDoctor.getSelectedRow();
        String text = txtASituation.getText();
        if (y == -1) {
            JOptionPane.showMessageDialog(null, "select patient from table first ");
        } else {

            if (text.equals("")) {
                JOptionPane.showMessageDialog(null, "add Situation to save it ");
            } else {
                try {
                    int x = valueOf(String.valueOf(tabDoctor.getValueAt(y, 0)));
                    String query = "UPDATE Patient SET Situation ='" + text + "'WHERE ID =" + x + "";

                    component.statement().execute(query);

                    JOptionPane.showMessageDialog(null, " saved ");
                } catch (SQLException ex) {
                    Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }


    }//GEN-LAST:event_btnSaveSituationActionPerformed

    private void btnOprationDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOprationDoctorActionPerformed

        int y = tabDoctor.getSelectedRow();

        if (y == -1) {
            JOptionPane.showMessageDialog(Reception, "select patient from table first ");
        } else {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            dateOprationDoctor.getDate();
            txtOperationhours.getText();
            txtOperationmin.getText();
            cbxTypeBloodDoctor.getSelectedItem();

            String Operation
                    = "////////////// Opration ////////////" + "\n"
                    + "////////////// Start ////////////" + "\n"
                    + "ID of Patient   :" + tabDoctor.getValueAt(y, 0) + "\n"
                    + "Name of Patient :" + tabDoctor.getValueAt(y, 1) + "\n"
                    + "Type of blood needed : " + cbxTypeBloodDoctor.getSelectedItem() + "\n"
                    + "Date  of Opration : " + df.format(dateOprationDoctor.getDate()) + "\n"
                    + "Time of Opration : " + txtOperationhours.getText() + ":" + txtOperationmin.getText() + "\n"
                    + "////////////// Opration ////////////" + "\n"
                    + "////////////// END ////////////" + "\n";

            int x = valueOf(String.valueOf(tabDoctor.getValueAt(y, 0)));
            String query = "Update Patient set DateEntered='" + Operation + "'where ID = " + x + " ";
            try {
                component.statement().executeUpdate(query);
                JOptionPane.showMessageDialog(null, " saved ");
            } catch (SQLException ex) {
                Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnOprationDoctorActionPerformed

    private void txtOperationminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOperationminMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOperationminMouseClicked

    private void ttabPatientPharmacistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttabPatientPharmacistMouseClicked
        double totale = 0;

        int x = ttabPatientPharmacist.getSelectedRow();
        if (x == -1) {
            JOptionPane.showMessageDialog(Reception, "select patient from table first ");
        } else {
            int y = valueOf(String.valueOf(ttabPatientPharmacist.getValueAt(x, 0)));
            String query = "SELECT ID, Name, Age, DataNascita, Sex, FiscaleCode, CID,  NameDoctor, Department, Medecine FROM Patient WHERE ID = " + y + "";
            component.result(query);

            try {
                lblIDPatient1.setText(component.resultSet().getString(1));
                txtNamePatient1.setText(component.resultSet().getString(2));
                txtAgePatient1.setText(component.resultSet().getString(3));
                txtBirthPharmacist.setText(component.resultSet().getString(4));
                txtSexPH.setText(component.resultSet().getString(5));
                txtDepartmentPH.setText(component.resultSet().getString(9));
                txtNameDotorPH.setText(component.resultSet().getString(8));
                txtFiscaleCodePH.setText(component.resultSet().getString(6));
                txtCIDPH.setText(component.resultSet().getString(7));
                if (component.resultSet().getString(10).equals("")) {

                } else {

                    String[] arr = component.resultSet().getString(10).split(":");
                    Vector<String> list = new Vector();
                    for (int i = 0; i < arr.length; i++) {

                        list.add(arr[i]);

                        component.result("SELECT Price FROM Medecine WHERE NameMedecine = '" + arr[i] + "' ");

                        totale = totale + Double.valueOf(component.resultSet().getString(1));

                    }
                    txttotalePH.setText(String.valueOf(totale));
                    DefaultListModel model = new DefaultListModel();
                    for (int i = 0; i < list.size(); i++) {
                        model.addElement(list.get(i));
                    }
                    listMedecinePharmacist.setModel(model);

                }

            } catch (SQLException e) {

                Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, e);
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "no medecine fined for patient selected");

            }

        }


    }//GEN-LAST:event_ttabPatientPharmacistMouseClicked

    private void txtSearchPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPatient1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPatient1ActionPerformed

    private void txtSearchPatient1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchPatient1MouseClicked
        txtSearchPatient1.setText("");
    }//GEN-LAST:event_txtSearchPatient1MouseClicked

    private void btnSearchPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPatient1ActionPerformed
        component.CercaInDB("Patient", txtSearchPatient1, ttabPatientPharmacist, cbxTypeSearchPatient1, 21);

    }//GEN-LAST:event_btnSearchPatient1ActionPerformed

    private void btnResetPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPatient1ActionPerformed

        listMedecinePharmacist.setModel(new DefaultListModel<String>());
        txttotalePH.setText("");
        lblIDPatient1.setText("");
        txtNamePatient1.setText("");
        txtAgePatient1.setText("");
        txtBirthPharmacist.setText("");
        txtSexPH.setText("");
        txtDepartmentPH.setText("");
        txtNameDotorPH.setText("");
        txtFiscaleCodePH.setText("");
        txtCIDPH.setText("");
        component.showTableQuery(ttabPatientPharmacist, "select ID ,Name from Patient ");
    }//GEN-LAST:event_btnResetPatient1ActionPerformed

    private void txtNamePatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamePatient1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamePatient1ActionPerformed

    private void txtFiscaleCodePHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiscaleCodePHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiscaleCodePHActionPerformed

    private void txtSerachPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerachPHActionPerformed


    }//GEN-LAST:event_txtSerachPHActionPerformed

    private void tabMedecinePharmacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMedecinePharmacyMouseClicked
        int x = tabMedecinePharmacy.getSelectedRow();
        if (x == -1) {
            JOptionPane.showMessageDialog(Reception, "select patient from table first ");
        } else {
            int y = valueOf(String.valueOf(tabMedecinePharmacy.getValueAt(x, 0)));
            component.result("SELECT  NameMedecine, Price FROM Medecine WHERE ID = " + y + "");
            try {
                txtMedecine.setText(component.resultSet().getString(1));
                txtPrice.setText(component.resultSet().getString(2));
            } catch (SQLException e) {
                Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, e);

            }

        }


    }//GEN-LAST:event_tabMedecinePharmacyMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            component.statement().execute("INSERT INTO Medecine ( NameMedecine,Price ) VALUES ( '" + txtMedecine.getText() + "','" + txtPrice.getText() + "' )");
            component.showdbTabella(tabMedecinePharmacy, "Medecine", 0);

        } catch (SQLException ex) {
            Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        component.showTableQuery(tabMedecinePharmacy, "SELECT ID, NameMedecine, Price FROM Medecine WHERE NameMedecine like '%" + txtSerachPH.getText() + "%'");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        component.delete(tabMedecinePharmacy, "Medecine");
        component.showTableQuery(tabMedecinePharmacy, "SELECT ID, NameMedecine, Price FROM Medecine ");


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        component.update(tabMedecinePharmacy, "Medecine");
        component.showTableQuery(tabMedecinePharmacy, "SELECT ID, NameMedecine, Price FROM Medecine ");


    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        component.showTableQuery(tabMedecinePharmacy, "SELECT ID, NameMedecine, Price FROM Medecine ");
        txtMedecine.setText("");
        txtPrice.setText("");
        txtSerachPH.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        try {

            String query = "SELECT Job FROM Employee WHERE User = '" + txtUser.getText() + "' AND  Password = '" + txtPassword.getText() + "'";
            component.result(query);

            job = component.resultSet().getString(1);
        } catch (SQLException e) {
        }
        if (!"hey".equals(job)) {
            if (job.equals("Admin")) {

                frameFix(Employee);
                component.addCombo(cbxTypeSearchEmployee, "Employee", 0);
                component.showdbTabella(tabEmpolyee, "Employee", 0);
                this.dispose();

            } else if (job.equals("Doctor")) {

                frameFix(Doctor);
                objectVector = new Vector<Object>();
                component.Combo(cbxMedecineDoctor, "SELECT NameMedecine FROM Medecine");
                component.showdbTabella(tabDoctor, "Patient", 11);
                component.addCombo(cbxTypeSearchDoctor, "Patient", 11);
                this.dispose();
            } else if (job.equals("Nurse")) {
                frameFix(Nurse);
                component.showdbTabella(tabNurse, "Patient", 11);
                component.addCombo(cbxTypeSearchNurse, "Patient", 11);
                this.dispose();
            } else if (job.equals("Pharmacist")) {
                frameFix(Pharmacist);
                component.addCombo(cbxTypeSearchPatient1, "Patient", 21);
                component.showTableQuery(ttabPatientPharmacist, "select ID ,Name from Patient ");
                component.showTableQuery(tabMedecinePharmacy, "SELECT ID, NameMedecine, Price FROM Medecine");
                this.dispose();
            } else if (job.equals("Receptionist")) {
                frameFix(Reception);

                component.Combo(cbxNameDoctor, "SELECT Name FROM Employee WHERE Job = 'Doctor' ");
                component.showdbTabella(tabPatient, "Patient", 9);
                component.addCombo(cbxTypeSearchPatient, "Patient", 9);
                this.dispose();

            } else {

                JOptionPane.showMessageDialog(null, "Password o user name Sbagliati");

            }
        } else if ("hey".equals(job)) {
            JOptionPane.showMessageDialog(null, "Password o user name Sbagliati");

        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblBackAppointment1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackAppointment1MouseClicked
        closeFrame(Doctor);
        job = "hey";
    }//GEN-LAST:event_lblBackAppointment1MouseClicked

    private void lblBackAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackAppointmentMouseClicked
        closeFrame(Reception);
        job = "hey";
    }//GEN-LAST:event_lblBackAppointmentMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        closeFrame(Employee);
        job = "hey";
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        closeFrame(Nurse);
        job = "hey";
    }//GEN-LAST:event_jLabel55MouseClicked

    private void lblBackAppointment2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackAppointment2MouseClicked
        closeFrame(Pharmacist);
        job = "hey";
    }//GEN-LAST:event_lblBackAppointment2MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int x = ttabPatientPharmacist.getSelectedRow();

        if (x == -1) {
            JOptionPane.showMessageDialog(null, "select patient from table first ");
        } else {
            int y = valueOf(String.valueOf(ttabPatientPharmacist.getValueAt(x, 0)));
            try {
                component.statement().execute("UPDATE Patient SET  Room = '" + txttotalePH.getText() + "' WHERE ID =" + y + "");
                JOptionPane.showMessageDialog(null, "Payed :)");
            } catch (SQLException ex) {
                Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnPatentStayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatentStayActionPerformed
        txtAPayReceipt.setText("");
        try {
            int x = tabPatient.getSelectedRow();

            if (x == -1) {
                JOptionPane.showMessageDialog(null, "select patient from table first ");
            } else {
                int y = valueOf(String.valueOf(tabPatient.getValueAt(x, 0)));
                component.result("SELECT  Name, Address, Mobile, Age, DataNascita, Height, Weight, Sex, FiscaleCode, CID, Appointment, NameDoctor, Department, Situation, Medecine, Room, DateEntered, Cure, analysis FROM Patient WHERE ID = " + y + "");

                txtNamePatientPay.setText(component.resultSet().getString(1));
                txtTotalMedecine.setText(component.resultSet().getString(16));
                txtAPayReceipt.setText("///////////////// data Patient ///////////////////" + "\n"
                        + "Name patient :  " + component.resultSet().getString(1) + "\n"
                        + "Address patient :  " + component.resultSet().getString(2) + "\n"
                        + "Mobile patient :  " + component.resultSet().getString(3) + "\n"
                        + "Age patient :  " + component.resultSet().getString(4) + "\n"
                        + "DataNascita patient :  " + component.resultSet().getString(5) + "\n"
                        + "Height patient :  " + component.resultSet().getString(6) + "\n"
                        + "Weight patient :  " + component.resultSet().getString(7) + "\n"
                        + "Sex patient :  " + component.resultSet().getString(8) + "\n"
                        + "FiscaleCode patient :  " + component.resultSet().getString(9) + "\n"
                        + "CID patient :  " + component.resultSet().getString(10) + "\n"
                        + "Appointment patient :  " + component.resultSet().getString(11) + "\n"
                        + "NameDoctor patient :  " + component.resultSet().getString(12) + "\n"
                        + "Department patient :  " + component.resultSet().getString(13) + "\n"
                        + "Situation patient :  " + component.resultSet().getString(14) + "\n"
                        + "");
                String[] arr = component.resultSet().getString(15).split(":");
                for (int i = 0; i < arr.length; i++) {
                    txtAPayReceipt.append(arr[i] + "\n");

                }

                txtAPayReceipt.append("totalMedecine patient :" + component.resultSet().getString(16) + "\n"
                        + "DateEntered patient :  " + component.resultSet().getString(17) + "\n"
                        + "Cure patient :  " + component.resultSet().getString(18) + "\n"
                        + "analysis patient :  " + component.resultSet().getString(19) + "\n"
                        + "");

                double a = Double.valueOf(txtTotalMedecine.getText()) * 17;
                txtTotal2.setText(String.valueOf(a));

            }

        } catch (HeadlessException | NumberFormatException | SQLException e) {
        }


    }//GEN-LAST:event_btnPatentStayActionPerformed

    private void btnPayReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayReceiptActionPerformed

        try {
            int x = tabPatient.getSelectedRow();

            if (x == -1) {
                JOptionPane.showMessageDialog(null, "select patient from table first ");
            } else {
                int y = parseInt(String.valueOf(tabPatient.getValueAt(x, 0)));

                if (dateExit.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "add Date first thanks ");
                } else {
                    component.statement().execute("UPDATE Patient SET  DateExit = '" + dateExit.getDate() + "' WHERE ID =" + y + "");
                    component.result("Select DateExit from Patient Where ID=" + y + "");
                    txtAPayReceipt.append("Date Exit Patient :" + component.resultSet().getString(1) + "\n" + "Payed :" + txtTotal2.getText());
                    txtAPayReceipt.append("///////////////// data Patient ///////////////////");

                    component.statement().execute("UPDATE Patient SET  Payment = '" + txtAPayReceipt.getText() + "' WHERE ID =" + y + "");
                    JOptionPane.showMessageDialog(null, "  ...payed... ");
                }

            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }//GEN-LAST:event_btnPayReceiptActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtAPayReceipt.setText("");
        txtTotalMedecine.setText("");
        txtTotal2.setText("");
        dateExit.setDate(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
//       btnLogin.setBackground(new Color(0, 120, 255, 100));
//       btnLogin.setBorder(null);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void jLabel95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseClicked
        Links("https://www.youtube.com/watch?v=oio_9uMvsEI");
    }//GEN-LAST:event_jLabel95MouseClicked

    private void jLabel96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseClicked
        Links("https://twitter.com/model_hospital?lang=fr");
    }//GEN-LAST:event_jLabel96MouseClicked

    private void jLabel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel92MouseClicked
        Links("https://www.facebook.com/MemorialHospitalJax/");
    }//GEN-LAST:event_jLabel92MouseClicked

    private void jLabel94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseClicked
        Links("https://www.whatsapp.com/?l=fr");
    }//GEN-LAST:event_jLabel94MouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            int x = tabPatient.getSelectedRow();

            if (x == -1) {
                JOptionPane.showMessageDialog(null, "select patient from table first ");
            } else {
                int y = parseInt(String.valueOf(tabPatient.getValueAt(x, 0)));
                component.result("Select Payment from Patient Where ID=" + y + "");
                String receipt = component.resultSet().getString(1);

                PrintReceipt(receipt);


            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }


    }//GEN-LAST:event_btnPrintActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String query = "SELECT User, Password FROM Employee WHERE Name = '" + txtNameMail.getText() + "' AND Job = '" + cbxJobMail.getSelectedItem() + "' AND Department = '" + cbxDepartmentMAil.getSelectedItem() + "' AND Mobile = '" + txtMobileMail.getText() + "' AND EMail = '" + txtEmailMail.getText() + "'";
            component.result(query);
            if (component.resultSet().isClosed()) {
                JOptionPane.showMessageDialog(null, "input your correct info ");
            } else {
                String message = "user is :" + component.resultSet().getString(1) + "\n" + "Password is :" + component.resultSet().getString(2);
                GoogleMail gmail = new GoogleMail();
                gmail.send("chehhhir@gmail.com", message);
                JOptionPane.showMessageDialog(null, "check your email ");

            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "you forgot some input ");

        } catch (SQLException ex) {
            Logger.getLogger(Hospital.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel98MouseClicked
        this.dispose();

        frameEmail.setLocationRelativeTo(null);
        frameEmail.setSize(488, 427);
        frameEmail.setVisible(true);
        component.Combo(cbxJobMail, "select Job FROM Employee ");


    }//GEN-LAST:event_jLabel98MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        frameEmail.dispose();
        this.setVisible(true);
        txtMobileMail.setText("");
        cbxJobMail.setSelectedIndex(0);
        txtNameMail.setText("");
        cbxDepartmentMAil.setSelectedIndex(0);
        txtEmailMail.setText("");


    }//GEN-LAST:event_jButton4ActionPerformed
    // End of variables declaration//GEN-END:variables
}
