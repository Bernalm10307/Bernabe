package topicos1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clase1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Clase1 C = new Clase1();
		C.setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clase1 frame = new Clase1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Clase1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtFibo = new JTextArea();
		txtFibo.setEditable(false);
		txtFibo.setBounds(47, 138, 310, 93);
		contentPane.add(txtFibo);
		
		JLabel lblNewLabel = new JLabel("IMPRESION DEL RESULTADO DE LA SERIE FIBO:");
		lblNewLabel.setBounds(47, 102, 401, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("INGRESE NUMERO: ");
		lblNewLabel_1.setBounds(0, 41, 142, 26);
		contentPane.add(lblNewLabel_1);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(156, 45, 96, 19);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnOperacion = new JButton("REALIZAR OPERACION.");
		btnOperacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Capturar();
			}
			void Capturar() { 
				int N;
				N = Integer.parseInt(txtNumero.getText());
				int V1=0, V2=1, V3, i=1;
				while (i<N) {
		            V3 = V1 + V2;
		            V1 = V2;
		            V2 = V3;
		            i++;
		            txtFibo.append(V3 + " ,");
		        }
			}
		});
		btnOperacion.setBounds(263, 37, 196, 35);
		contentPane.add(btnOperacion);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Limpiar();
			}
			void Limpiar() {
				txtNumero.setText(null);
				txtFibo.setText(null);
			}
		});
		btnLimpiar.setBounds(58, 252, 96, 34);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(263, 252, 94, 34);
		contentPane.add(btnSalir);
	}
}
