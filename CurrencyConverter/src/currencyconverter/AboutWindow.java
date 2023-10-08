
package currencyconverter;

/**
 * @author Naiim
 */
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.util.ResourceBundle;

public class AboutWindow extends JFrame {
	private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("localization.translation"); 
	private JPanel contentPane;
	private static AboutWindow windowInstance = null;

	
	private AboutWindow() {
		setTitle(BUNDLE.getString("AboutWindow.this.title")); 
		setBounds(100, 100, 347, 260);
		setLocationRelativeTo(null);
		setResizable( false );

		// Window components
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Label "author"
		JLabel lblAuthor = new JLabel(BUNDLE.getString("AboutWindow.lblAuthor.text")); 
		lblAuthor.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuthor.setBounds(65, 122, 219, 33);

		

		// label "title"
		JLabel lblTitle = new JLabel("Currency Converter");
		lblTitle.setBounds(65, 12, 219, 33);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 15));
		contentPane.add(lblTitle);

		// label "licence"
		JLabel lblLicenceMit = new JLabel(" ");
		lblLicenceMit.setBounds(65, 77, 219, 33);
		lblLicenceMit.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblLicenceMit);

		// label "version"
		JLabel lblVersion = new JLabel("Version 1.0");
		lblVersion.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersion.setBounds(65, 45, 219, 33);
		contentPane.add(lblVersion);
		contentPane.add(lblAuthor);
	}

	// Check if the window is already created to launch only one instance of the window.
	public static AboutWindow getInstance() {
		if (windowInstance == null) {
			windowInstance = new AboutWindow();
		}
		 return windowInstance;
	}
}