package Calendario;

import Calendario.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;


/**
* Calendario básico contendo um layout básico produzido para atender um
* trabalho de conclusão de curso oferecido pelo pelos alunos Fellipe Adorno
* e Ketlin Monteiro para a Instituição de Ensino IFG - campus Inhumas.
* 
* @author Fellipe Adorno Claudino da Costa
* @version  1.1
* @see Serializable
*/
public class Calendario extends JDialog implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private JScrollPane scroll;
	private JTable table;
	private Calendar calendar;
	private JComboBox<String> mes;
	private JSpinner ano;
	private PersonalizaCalendario rend;
	private FeriadosAno feriados;
        public JPanel retornar;
        
	public Calendario(Frame frame) {
		super(frame, true);
		this.calendar = Calendar.getInstance();
		setTitle("Marcar consulta");
		init();
	}
        public JPanel retornaPainel(){
            return retornar;
        }
	private void init() {
		getContentPane().setLayout(new BorderLayout(5,5));
		UIManager.put("ToolTip.foreground", new ColorUIResource(new Color(255, 137, 0)));
		UIManager.put("ToolTip.background", new ColorUIResource(Color.WHITE));
//		UIManager.put("Tooltip.border", BorderFactory.createCompoundBorder(new EtchedBorder(new Color(50, 50, 50),  new Color(50, 50, 50)), new EmptyBorder(5,5, 5, 5)));
		((JComponent) getContentPane()).setBorder(
				BorderFactory.createCompoundBorder(
						new EtchedBorder(new Color(255, 255, 255), new Color(255, 255, 255)),
						new EmptyBorder(5, 5, 5, 5)));
		
		JPanel header = new JPanel();
		header.setLayout(new BorderLayout(5, 5));
	
		String[] m = {"Janeiro", "Fevereiro", "Mar�o", "Abril", "Maio", "Junho",
				"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		mes = new JComboBox<>(m);
		mes.setSelectedIndex(calendar.get(Calendar.MONTH));
		header.add(mes, BorderLayout.WEST);
	
		ano = new JSpinner();
		ano.setValue((Object) calendar.get(Calendar.YEAR)); 
		header.add(ano, BorderLayout.EAST);
		
		ano.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent arg0) {
				changeDate(mes.getSelectedIndex(), (Integer) ano.getValue());
			}
		});
		mes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeDate(mes.getSelectedIndex(), (Integer) ano.getValue());
			}
		});
		
		addWindowListener( new WindowAdapter() {
                        @Override
			public void windowClosing(WindowEvent e) {
				calendar = null;
				setVisible(false);
			}
		});
		getContentPane().add(header, BorderLayout.NORTH);
		scroll = new JScrollPane();
		getContentPane().add(scroll, BorderLayout.CENTER);
		
		setSize(400, 285);
//		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//		setLocation(frame.getLocation().x + (frame.getSize().width/2 - getSize().width/2),
//		frame.getLocation().y + (frame.getSize().height/2 - getSize().height/2));
//		calendar.set(Calendar.MONTH, mes.getSelectedIndex());
		changeDate(mes.getSelectedIndex(), (Integer) ano.getValue());
                setResizable(true);
                
                this.setLocationRelativeTo(null);
                retornar = header;
	}
        
	public void changeDate(final int mes, final int ano) {
		try {
                    FileInputStream fileIn = new FileInputStream(ano+".year");
                    ObjectInputStream in = new ObjectInputStream(fileIn);
                    feriados = (FeriadosAno) in.readObject();
                    in.close();
                    fileIn.close();
		} catch (IOException | ClassNotFoundException e) {
			feriados = new FeriadosAno(ano);
		}
		calendar.set(Calendar.MONTH, mes);
		calendar.set(Calendar.YEAR, ano);
		rend = new PersonalizaCalendario(calendar, feriados);
		final Object[] col = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
		initTable(col, getCalendario());
		scroll.setViewportView(table);
	}
	
	private Object[][] getCalendario() {
		Object[][] obj = new Object[6][7];
		int j = 0, month = calendar.get(Calendar.MONTH), day = calendar.get(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DATE, 1);
		while(this.calendar.get(Calendar.MONTH) == month) {
			obj[j][calendar.get(Calendar.DAY_OF_WEEK) - 1] = calendar.get(Calendar.DATE);
			j = (calendar.get(Calendar.DAY_OF_WEEK) == 7) ? ++j : j ;
			calendar.add(Calendar.DATE , 1);
		}
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		return obj;
	}
	
	private void initTable(Object[] col, Object[][] row) {
		table = new JTable();
		@SuppressWarnings("serial")
		DefaultTableModel dtm = new DefaultTableModel(row, col){  
                    @Override
                    public boolean isCellEditable(int rowIndex, int mColIndex) {  
                        return false;  
                    }  
                };  
		table.setModel(dtm);
		table.getSelectionModel().setSelectionMode(  
				  ListSelectionModel.SINGLE_SELECTION);  
		table.getColumnModel().getSelectionModel().setSelectionMode(  
				  ListSelectionModel.SINGLE_SELECTION);  
		table.setCellSelectionEnabled(true);
		table.setDefaultRenderer(Object.class, rend);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		table.setCursor(new Cursor(Cursor.HAND_CURSOR));
		table.setFocusable(false);
                table.setRowHeight(30);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JTable target = (JTable)e.getSource();
			    int row = target.getSelectedRow();
			    int col = target.getSelectedColumn();
			    if(target.getValueAt(row, col) != null) {
			    	calendar.set(Calendar.DAY_OF_MONTH, (Integer) target.getValueAt(row, col));
					table.repaint();
				    if(e.getClickCount() > 1) {
						onSelect(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));
						setVisible(false);
				    }
			    }
			}
		});
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				rend.mudarCorSelecionado(-1, -1);
				table.repaint();
			}
		});
		table.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				int col = table.columnAtPoint(e.getPoint());
				if(table.getValueAt(row, col) != null)
					rend.mudarCorSelecionado(row, col);
				else
					rend.mudarCorSelecionado(-1, -1);
				table.repaint();
			}
		});
	}
        
	public void onSelect(int day, int month, int year) {}
	
	public void setAno(int ano) {
		this.ano.setValue((Object) ano);
	}
	public int getAno() {
		return Integer.parseInt((String) this.ano.getValue());
        }
	public void setMes(Object mes) {
		this.mes.setSelectedItem(mes);
	}
	public Object getMes() {
		return this.mes.getSelectedItem();
        }
	public Calendar getValue() {
                while(isVisible()) {}
                if(calendar != null)
                        return calendar;
                return null;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                Calendar r = getValue();
                if(r != null) {
                    return f.format(getValue().getTime());
                }
                return "";
	}
}