public class utss extends javax.swing.JFrame {

    /**
     * Creates new form utss
     */
    public utss() {
        initComponents();
        JOptionPane.showMessageDialog(null, 
                    "Nama sama nilai jangan sampai kosong yaa", 
                    "info", 
                    JOptionPane.WARNING_MESSAGE);
    }
    
    private void hitung(){
        Integer nilai = Integer.parseInt(tf_nilai.getText());
        String hasil;
        if(nilai>49 && nilai <65){
            hasil = "D";
        }else if(nilai>64 && nilai <75){
            hasil = "C";
        }else if(nilai>74 && nilai <85){
            hasil = "B";
        }else if(nilai>84 && nilai <101){
            hasil = "A";
        }else{
            hasil = "E";
        }
        
        tf_nilai.setText(String.valueOf(hasil));
    }



private void simpanActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(tf_nama.getText().trim().isEmpty() && tf_nilai.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, 
                    "Nama sama nilai isi duluu", 
                    "info", 
                    JOptionPane.WARNING_MESSAGE);
        }else if(tf_nama.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, 
                    "Nama isi duluu", 
                    "info", 
                    JOptionPane.WARNING_MESSAGE);
        }else if(tf_nilai.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, 
                    "Nilai isiiiiii", 
                    "info", 
                    JOptionPane.WARNING_MESSAGE);
        }else{
            hitung();
            String nama = tf_nama.getText();
            tf_nama.setText(String.valueOf(nama));
            tf_nama.setEditable(false);
            tf_nilai.setEditable(false);
            simpan.setEnabled(false);
        }
    }      
