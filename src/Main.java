import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        static String login, password, password2;
    static boolean b;
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            while (true) {
                int result = JOptionPane.showConfirmDialog(frame,
                        "�� ������ ������������������?",
                        "���������������� ����",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.ERROR_MESSAGE,
                        null);

                if (result == JOptionPane.YES_OPTION) {


                    do {
                        login = JOptionPane.showInputDialog(
                                frame,
                                "<html><h2>������� ��� �����: ");

                    } while (login.isEmpty() || login.length() <= 5 || login.contains(" "));

                    do {
                        password = JOptionPane.showInputDialog(
                                frame,
                                "<html><h2>������� ��� ������: ");

                        Pattern p = Pattern.compile("(([A-Z].*[0-9]))");
                        Matcher m = p.matcher(password);
                        b = m.find();

                    } while (password.isEmpty() || password.length() <= 8 || password.contains(" ") || b == false);

                    while (!password.equals(password2)) {
                        password2 = JOptionPane.showInputDialog(
                                frame,
                                "<html><h2>��������� ��� ������: ");
                    }

                    JOptionPane.showMessageDialog(frame, "����������� ������ �������");
                }
                else if (result == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            }
        }
}