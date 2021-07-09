package com.raven.component;

import com.raven.model.Model_Profile;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ListProfile<E extends Object> extends JList<E> {

    private final DefaultListModel model;

    public ListProfile() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
    }

    @Override
    public ListCellRenderer getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean selected, boolean focus) {
                Model_Profile data;
                if (o instanceof Model_Profile) {
                    data = (Model_Profile) o;
                } else {
                    data = new Model_Profile("Name", "Description", new ImageIcon(getClass().getResource("/com/raven/icon/artists_selected.png")));
                }
                ItemProfile item = new ItemProfile(data);
                return item;
            }
        };
    }

    public void addItem(Model_Profile data) {
        model.addElement(data);
    }
}
