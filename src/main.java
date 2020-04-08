import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class main {

	private JFrame frmFlightManagement;
	private JTable p4_table;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frmFlightManagement.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFlightManagement = new JFrame();
		frmFlightManagement.setResizable(false);
		BorderLayout borderLayout = (BorderLayout) frmFlightManagement.getContentPane().getLayout();
		borderLayout.setVgap(10);
		frmFlightManagement.setTitle("Flight Management");
		frmFlightManagement.setBounds(100, 100, 800, 500);
		frmFlightManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new EmptyBorder(0, 5, 0, 5));
		frmFlightManagement.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		
		JPanel p1_lichchuyenbay = new JPanel();
		p1_lichchuyenbay.setBorder(new EmptyBorder(0, 0, 10, 0));
		tabbedPane.addTab("Lịch Chuyến Bay", null, p1_lichchuyenbay, null);
		p1_lichchuyenbay.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel p1_1 = new JPanel();
		p1_1.setBorder(new EmptyBorder(10, 10, 0, 10));
		p1_lichchuyenbay.add(p1_1);
		p1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel p1_1_lbl = new JLabel("Lịch Chuyến Bay");
		p1_1_lbl.setBorder(new EmptyBorder(0, 0, 5, 0));
		p1_1_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		p1_1_lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1_1.add(p1_1_lbl, BorderLayout.NORTH);
		
		JPanel p1_1a = new JPanel();
		p1_1.add(p1_1a, BorderLayout.CENTER);
		p1_1a.setLayout(new GridLayout(1, 4, 20, 0));
		
		JPanel panel = new JPanel();
		p1_1a.add(panel);
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Mã chuyến bay:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sân bay đi:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ngày - giờ:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Số lượng ghế hạng 1");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		p1_1a.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 1, 0, 5));
		
		JComboBox comboBox = new JComboBox();
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		panel_2.add(comboBox_2);
		
		JSpinner spinner = new JSpinner();
		panel_2.add(spinner);
		
		JPanel panel_3 = new JPanel();
		p1_1a.add(panel_3);
		panel_3.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Giá vé:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sân bay đến:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Thời gian bay:");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Số lượng ghế hạng 2:");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_3.add(lblNewLabel_7);
		
		JPanel panel_4 = new JPanel();
		p1_1a.add(panel_4);
		panel_4.setLayout(new GridLayout(4, 1, 0, 5));
		
		textField = new JTextField();
		panel_4.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		panel_4.add(comboBox_3);
		
		textField_1 = new JTextField();
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JSpinner spinner_1 = new JSpinner();
		panel_4.add(spinner_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(10, 10, 0, 10));
		p1_lichchuyenbay.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_5.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel_1.add(panel_5, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Lưu thay đổi");
		panel_5.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "S\u00E2n Bay Trung Gian", "Th\u1EDDi Gian D\u1EEBng", "Ghi Ch\u00FA"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel p2_vechuyenbay = new JPanel();
		p2_vechuyenbay.setBorder(new EmptyBorder(0, 0, 10, 0));
		tabbedPane.addTab("Vé Chuyến Bay", null, p2_vechuyenbay, null);
		p2_vechuyenbay.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EmptyBorder(10, 10, 0, 10));
		p2_vechuyenbay.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Vé Chuyến Bay");
		lblNewLabel_8.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_6.add(lblNewLabel_8, BorderLayout.NORTH);
		
		JPanel panel_8 = new JPanel();
		panel_6.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new GridLayout(1, 4, 20, 0));
		
		JPanel panel_9 = new JPanel();
		panel_8.add(panel_9);
		panel_9.setLayout(new GridLayout(3, 1, 0, 25));
		
		JLabel lblNewLabel_9 = new JLabel("Chuyến bay:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_9.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("CMND:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_9.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Hạng vé:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_9.add(lblNewLabel_11);
		
		JPanel panel_10 = new JPanel();
		panel_8.add(panel_10);
		panel_10.setLayout(new GridLayout(3, 1, 0, 25));
		
		JComboBox comboBox_4 = new JComboBox();
		panel_10.add(comboBox_4);
		
		textField_2 = new JTextField();
		panel_10.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_10.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 2, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hạng 1");
		rdbtnNewRadioButton.setSelected(true);
		panel_13.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hạng 2");
		panel_13.add(rdbtnNewRadioButton_1);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rdbtnNewRadioButton);
		bg1.add(rdbtnNewRadioButton_1);
		
		JPanel panel_11 = new JPanel();
		panel_8.add(panel_11);
		panel_11.setLayout(new GridLayout(3, 1, 0, 25));
		
		JLabel lblNewLabel_12 = new JLabel("Hành khách:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_11.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Điện thoại:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_11.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Giá tiền:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_11.add(lblNewLabel_14);
		
		JPanel panel_12 = new JPanel();
		panel_8.add(panel_12);
		panel_12.setLayout(new GridLayout(3, 1, 0, 25));
		
		textField_3 = new JTextField();
		panel_12.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		panel_12.add(textField_4);
		textField_4.setColumns(10);
		
		JTextArea txtrVnd = new JTextArea();
		txtrVnd.setText("0 VND");
		panel_12.add(txtrVnd);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new EmptyBorder(0, 10, 0, 10));
		p2_vechuyenbay.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnNewButton_1 = new JButton("Lưu thông tin");
		panel_7.add(btnNewButton_1);
		
		JPanel p3_phieudatcho = new JPanel();
		p3_phieudatcho.setBorder(new EmptyBorder(0, 0, 10, 0));
		tabbedPane.addTab("Phiếu Đặt Chỗ", null, p3_phieudatcho, null);
		p3_phieudatcho.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new EmptyBorder(10, 10, 0, 10));
		p3_phieudatcho.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_15 = new JLabel("Phiếu Đặt Chỗ");
		lblNewLabel_15.setBorder(new EmptyBorder(0, 0, 5, 0));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_14.add(lblNewLabel_15, BorderLayout.NORTH);
		
		JPanel panel_16 = new JPanel();
		panel_14.add(panel_16, BorderLayout.CENTER);
		panel_16.setLayout(new GridLayout(1, 4, 20, 0));
		
		JPanel panel_17 = new JPanel();
		panel_16.add(panel_17);
		panel_17.setLayout(new GridLayout(3, 1, 0, 25));
		
		JLabel lblNewLabel_16 = new JLabel("Chuyến bay:");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_17.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("CMND:");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_17.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Hạng vé:");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_17.add(lblNewLabel_18);
		
		JPanel panel_18 = new JPanel();
		panel_16.add(panel_18);
		panel_18.setLayout(new GridLayout(3, 1, 0, 25));
		
		JComboBox comboBox_5 = new JComboBox();
		panel_18.add(comboBox_5);
		
		textField_5 = new JTextField();
		panel_18.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_21 = new JPanel();
		panel_18.add(panel_21);
		panel_21.setLayout(new GridLayout(1, 2, 0, 0));
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Hạng 1");
		rdbtnNewRadioButton_2.setSelected(true);
		panel_21.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Hạng 2");
		panel_21.add(rdbtnNewRadioButton_3);
		
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(rdbtnNewRadioButton_2);
		bg2.add(rdbtnNewRadioButton_3);
		
		JPanel panel_19 = new JPanel();
		panel_16.add(panel_19);
		panel_19.setLayout(new GridLayout(3, 1, 0, 25));
		
		JLabel lblNewLabel_20 = new JLabel("Hành khách:");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_19.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Điên thoại:");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_19.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Giá tiền:");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_19.add(lblNewLabel_22);
		
		JPanel panel_20 = new JPanel();
		panel_16.add(panel_20);
		panel_20.setLayout(new GridLayout(3, 1, 0, 25));
		
		textField_6 = new JTextField();
		panel_20.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		panel_20.add(textField_7);
		textField_7.setColumns(10);
		
		JTextArea txtrVnd_1 = new JTextArea();
		txtrVnd_1.setText("0 VND");
		panel_20.add(txtrVnd_1);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new EmptyBorder(0, 10, 0, 10));
		p3_phieudatcho.add(panel_15);
		panel_15.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnNewButton_2 = new JButton("Đặt vé");
		panel_15.add(btnNewButton_2);
		
		JPanel p4_danhsachchuyenbay = new JPanel();
		p4_danhsachchuyenbay.setBorder(new EmptyBorder(0, 0, 10, 0));
		tabbedPane.addTab("Danh Sách Chuyến Bay", null, p4_danhsachchuyenbay, null);
		p4_danhsachchuyenbay.setLayout(new BorderLayout(0, 0));
		
		JPanel p4_1 = new JPanel();
		p4_1.setBorder(new EmptyBorder(0, 10, 0, 10));
		p4_danhsachchuyenbay.add(p4_1, BorderLayout.CENTER);
		p4_1.setLayout(new BorderLayout(0, 5));
		
		JLabel p4_lbl = new JLabel("Danh Sách Chuyến Bay");
		p4_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		p4_lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		p4_1.add(p4_lbl, BorderLayout.NORTH);
		
		JScrollPane p4_scrollpane = new JScrollPane();
		p4_1.add(p4_scrollpane, BorderLayout.CENTER);
		
		p4_table = new JTable();
		p4_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "S\u00E2n Bay \u0110i", "S\u00E2n Bay \u0110\u1EBFn", "Kh\u1EDFi H\u00E0nh", "Th\u1EDDi Gian", "S\u1ED1 Gh\u1EBF Tr\u1ED1ng", "S\u1ED1 Gh\u1EBF \u0110\u1EB7t"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		p4_scrollpane.setViewportView(p4_table);
		
		
		JPanel p4_2 = new JPanel();
		p4_2.setBorder(new EmptyBorder(10, 10, 10, 10));
		p4_danhsachchuyenbay.add(p4_2, BorderLayout.NORTH);
		p4_2.setLayout(new BorderLayout(20, 0));
		
		JPanel p4_2a = new JPanel();
		p4_2.add(p4_2a, BorderLayout.CENTER);
		p4_2a.setLayout(new GridLayout(0, 3, 10, 0));
		
		JComboBox p4_cbbox_start = new JComboBox();
		p4_cbbox_start.setModel(new DefaultComboBoxModel(new String[] {"     -- Chọn Điểm Đi --"}));
		p4_cbbox_start.setToolTipText("");
		p4_cbbox_start.setFont(new Font("Tahoma", Font.PLAIN, 13));
		p4_2a.add(p4_cbbox_start);
		
		JComboBox p4_cbbox_destination = new JComboBox();
		p4_cbbox_destination.setModel(new DefaultComboBoxModel(new String[] {"     -- Chọn Điểm Đến --"}));
		p4_cbbox_destination.setFont(new Font("Tahoma", Font.PLAIN, 13));
		p4_2a.add(p4_cbbox_destination);
		
		JComboBox p4_cbbox_department = new JComboBox();
		p4_cbbox_department.setModel(new DefaultComboBoxModel(new String[] {"     -- Giờ Khởi Hành --"}));
		p4_cbbox_department.setFont(new Font("Tahoma", Font.PLAIN, 13));
		p4_2a.add(p4_cbbox_department);
		
		JPanel p4_2b = new JPanel();
		p4_2.add(p4_2b, BorderLayout.EAST);
		p4_2b.setLayout(new GridLayout(0, 2, 10, 0));
		
		JButton p4_btn_search = new JButton("Tìm Kiếm");
		p4_btn_search.setFont(new Font("Tahoma", Font.PLAIN, 13));
		p4_2b.add(p4_btn_search);
		
		JButton p4_btn_all = new JButton("Xem Tất Cả");
		p4_btn_all.setFont(new Font("Tahoma", Font.PLAIN, 13));
		p4_2b.add(p4_btn_all);
		
		JPanel p5_doanhthu = new JPanel();
		p5_doanhthu.setBorder(new EmptyBorder(0, 0, 10, 0));
		tabbedPane.addTab("Doanh Thu", null, p5_doanhthu, null);
		p5_doanhthu.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.RIGHT);
		tabbedPane_1.setBorder(new EmptyBorder(0, 10, 0, 10));
		tabbedPane_1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		p5_doanhthu.add(tabbedPane_1);
		
		JPanel panel_22 = new JPanel();
		tabbedPane_1.addTab("Doanh Thu Tháng", null, panel_22, null);
		panel_22.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_24 = new JPanel();
		panel_24.setBorder(new EmptyBorder(5, 10, 5, 10));
		panel_22.add(panel_24, BorderLayout.NORTH);
		panel_24.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_25 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_25.getLayout();
		flowLayout_1.setHgap(40);
		panel_24.add(panel_25, BorderLayout.CENTER);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"   -- Tháng --   ", "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12"}));
		panel_25.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"   -- Năm --   ", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		panel_25.add(comboBox_7);
		
		JPanel panel_26 = new JPanel();
		panel_24.add(panel_26, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("Xem\r\n");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_26.add(btnNewButton_3);
		
		JPanel panel_27 = new JPanel();
		panel_22.add(panel_27, BorderLayout.CENTER);
		panel_27.setLayout(new BorderLayout(0, 5));
		
		JLabel lblNewLabel_19 = new JLabel("Doanh Thu Tháng");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_27.add(lblNewLabel_19, BorderLayout.NORTH);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_27.add(scrollPane_1, BorderLayout.CENTER);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Chuy\u1EBFn Bay", "S\u1ED1 V\u00E9", "Doanh Thu", "T\u1EC9 L\u1EC7"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Float.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_23 = new JPanel();
		tabbedPane_1.addTab("Doanh Thu Năm", null, panel_23, null);
		panel_23.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_28.setBorder(new EmptyBorder(5, 10, 5, 10));
		panel_23.add(panel_28, BorderLayout.NORTH);
		panel_28.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_29 = new JPanel();
		panel_28.add(panel_29, BorderLayout.CENTER);
		panel_29.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"   -- Năm --   ", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020 "}));
		comboBox_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_29.add(comboBox_8);
		
		JPanel panel_30 = new JPanel();
		panel_28.add(panel_30, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("Xem");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel_30.add(btnNewButton_4);
		
		JPanel panel_31 = new JPanel();
		panel_23.add(panel_31, BorderLayout.CENTER);
		panel_31.setLayout(new BorderLayout(0, 5));
		
		JLabel lblNewLabel_23 = new JLabel("Doanh Thu Năm");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_31.add(lblNewLabel_23, BorderLayout.NORTH);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panel_31.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"STT", "Th\u00E1ng", "S\u1ED1 Chuy\u1EBFn Bay", "Doanh Thu", "T\u1EC9 L\u1EC7"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class, Float.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_2.setViewportView(table_2);
		
		JPanel p6_quydinh = new JPanel();
		p6_quydinh.setBorder(new EmptyBorder(10, 0, 10, 0));
		tabbedPane.addTab("Cài Đặt Quy Định", null, p6_quydinh, null);
		p6_quydinh.setLayout(new GridLayout(1, 0, 20, 0));
		
		JPanel panel_32 = new JPanel();
		p6_quydinh.add(panel_32);
		panel_32.setLayout(new GridLayout(8, 0, 0, 20));
		
		JLabel lblNewLabel_24 = new JLabel("Số lượng sân bay:");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_32.add(lblNewLabel_24);
		
		JLabel lblNewLabel_24_1 = new JLabel("Thời gian bay tối thiểu:");
		lblNewLabel_24_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_32.add(lblNewLabel_24_1);
		
		JLabel lblNewLabel_24_2 = new JLabel("Số sân bay trung gian tối đa:");
		lblNewLabel_24_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_32.add(lblNewLabel_24_2);
		
		JLabel lblNewLabel_24_3 = new JLabel("Thời gian dừng tối thiểu:");
		lblNewLabel_24_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_32.add(lblNewLabel_24_3);
		
		JLabel lblNewLabel_24_4 = new JLabel("Thời gian dừng tối đa:");
		lblNewLabel_24_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_32.add(lblNewLabel_24_4);
		
		JLabel lblNewLabel_24_5 = new JLabel("Số lượng hạng vé:");
		lblNewLabel_24_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_32.add(lblNewLabel_24_5);
		
		JLabel lblNewLabel_24_6 = new JLabel("Thời gian chậm nhất khi đặt vé:");
		lblNewLabel_24_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24_6.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_32.add(lblNewLabel_24_6);
		
		JLabel lblNewLabel_24_7 = new JLabel("Thời gian hủy đặt vé:");
		lblNewLabel_24_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_32.add(lblNewLabel_24_7);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBorder(new EmptyBorder(0, 0, 0, 300));
		p6_quydinh.add(panel_33);
		panel_33.setLayout(new GridLayout(8, 0, 0, 20));
		
		JSpinner spinner_2 = new JSpinner();
		panel_33.add(spinner_2);
		
		JPanel panel_34 = new JPanel();
		panel_33.add(panel_34);
		panel_34.setLayout(new GridLayout(1, 0, 0, 0));
		
		JSpinner spinner_3 = new JSpinner();
		panel_34.add(spinner_3);
		
		JLabel lblNewLabel_25 = new JLabel("phút");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_34.add(lblNewLabel_25);
		
		JSpinner spinner_4 = new JSpinner();
		panel_33.add(spinner_4);
		
		JPanel panel_35 = new JPanel();
		panel_33.add(panel_35);
		panel_35.setLayout(new GridLayout(1, 0, 0, 0));
		
		JSpinner spinner_5 = new JSpinner();
		panel_35.add(spinner_5);
		
		JLabel lblNewLabel_26 = new JLabel("phút");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_35.add(lblNewLabel_26);
		
		JPanel panel_36 = new JPanel();
		panel_33.add(panel_36);
		panel_36.setLayout(new GridLayout(1, 0, 0, 0));
		
		JSpinner spinner_6 = new JSpinner();
		panel_36.add(spinner_6);
		
		JLabel lblNewLabel_27 = new JLabel("phút");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_36.add(lblNewLabel_27);
		
		JSpinner spinner_7 = new JSpinner();
		panel_33.add(spinner_7);
		
		JPanel panel_37 = new JPanel();
		panel_33.add(panel_37);
		panel_37.setLayout(new GridLayout(1, 0, 0, 0));
		
		JSpinner spinner_8 = new JSpinner();
		panel_37.add(spinner_8);
		
		JLabel lblNewLabel_28 = new JLabel("giờ");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_37.add(lblNewLabel_28);
		
		JPanel panel_38 = new JPanel();
		panel_33.add(panel_38);
		panel_38.setLayout(new GridLayout(1, 0, 0, 0));
		
		JSpinner spinner_9 = new JSpinner();
		panel_38.add(spinner_9);
		
		JLabel lblNewLabel_29 = new JLabel("giờ");
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel_38.add(lblNewLabel_29);
		
		JPanel p_picture = new JPanel();
		frmFlightManagement.getContentPane().add(p_picture, BorderLayout.NORTH);
		p_picture.setLayout(new BorderLayout(0, 0));
		
		JLabel Picture = new JLabel("Insert image here!\r\n");
		Picture.setHorizontalAlignment(SwingConstants.CENTER);
		Picture.setFont(new Font("Tahoma", Font.ITALIC, 60));
		p_picture.add(Picture, BorderLayout.NORTH);
	}

}
