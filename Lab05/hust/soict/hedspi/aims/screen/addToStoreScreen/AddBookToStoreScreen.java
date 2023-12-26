package hust.soict.hedspi.aims.screen.addToStoreScreen;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.hedspi.aims.exception.DuplicateMediaException;
import hust.soict.hedspi.aims.exception.LimitExceededException;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.store.Aims;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle;
    private JTextField tfCategory;
    private JTextField tfAuthors;
    private JTextField tfCost;

    public AddBookToStoreScreen() {
        super("Book");

        JPanel center = createCenter();
        tfTitle = addInputField("Title: *", center);
        tfCategory = addInputField("Category:", center);
        tfAuthors = addInputField("Author(s):", center);
        tfCost = addInputField("Cost: *", center);
        center.add(Box.createRigidArea(new Dimension(10, 40)));

        add(center, BorderLayout.CENTER);
        add(createSouth(new ButtonListener()), BorderLayout.SOUTH);

        setVisible(true);
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "OK": {
                    if (tfTitle.getText().equals("") || tfCost.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Some required fields are empty!", "Error",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    Book book = new Book(tfTitle.getText(), tfCategory.getText(), Float.parseFloat(tfCost.getText()));
                    for (String author : tfAuthors.getText().split(",\\s*")) {
                        book.addAuthor(author);
                    }

                    try {
                        Aims.getStore().addMedia(book);
                    } catch (DuplicateMediaException | LimitExceededException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    Aims.getStoreScreen().loadItemsToStore();

                }
                break;
                case "Cancel":
                    setVisible(false);
                    break;
            }
        }

    }

}