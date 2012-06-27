package com.vaadin.demo.tutorial.addressbook.ui;

import com.vaadin.ui.VerticalSplitPanel;

@SuppressWarnings("serial")
public class ListView extends VerticalSplitPanel {
    public ListView(PersonList personList, PersonForm personForm) {
        addStyleName("view");
        setFirstComponent(personList);
        setSecondComponent(personForm);
        setSplitPosition(40);
    }
}