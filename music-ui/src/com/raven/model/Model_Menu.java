package com.raven.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_Menu {

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Model_Menu(String menuName, String icon) {
        this.menuName = menuName;
        this.icon = icon;
    }

    public Model_Menu() {
    }

    private String menuName;
    private String icon;

    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("/com/raven/icon/" + icon + ".png"));
    }

    public Icon toIconSelected() {
        return new ImageIcon(getClass().getResource("/com/raven/icon/" + icon + "_selected.png"));
    }
}
