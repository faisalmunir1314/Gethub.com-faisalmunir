import javax.swing.*;

public class UniversityPortal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("University Portal");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblCms = new JLabel("CMS:");
        lblCms.setBounds(50, 30, 100, 25);
        JTextField txtCms = new JTextField();
        txtCms.setBounds(150, 30, 200, 25);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(50, 70, 100, 25);
        JTextField txtName = new JTextField();
        txtName.setBounds(150, 70, 200, 25);

        JLabel lblAge = new JLabel("Age:");
        lblAge.setBounds(50, 110, 100, 25);
        JTextField txtAge = new JTextField();
        txtAge.setBounds(150, 110, 200, 25);

        JLabel lblAddress = new JLabel("Address:");
        lblAddress.setBounds(50, 150, 100, 25);
        JTextField txtAddress = new JTextField();
        txtAddress.setBounds(150, 150, 200, 25);

        JLabel lblSemester = new JLabel("Semester:");
        lblSemester.setBounds(50, 190, 100, 25);
        JTextField txtSemester = new JTextField();
        txtSemester.setBounds(150, 190, 200, 25);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(180, 240, 100, 30);

        frame.add(lblCms);
        frame.add(txtCms);
        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblAge);
        frame.add(txtAge);
        frame.add(lblAddress);
        frame.add(txtAddress);
        frame.add(lblSemester);
        frame.add(txtSemester);
        frame.add(btnSubmit);

        frame.setVisible(true);
    }
}
