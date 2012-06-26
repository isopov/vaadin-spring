/*
 * Copyright 2011 Navin Peiris <navin.peiris@gmail.com>, Melbourne, Australia.
 * All Rights Reserved.
 */

package com.sopovs.moradanen.vaadin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sopovs.moradanen.vaadin.dao.DummyDao;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

/**
 * The main window for the demo.
 * 
 * @author Navin Peiris
 * @since 1.0.0
 */
@Component
@Scope("session")
public class MainWindow extends Window {
    private static final long serialVersionUID = 1L;


    @Autowired
    private DummyDao dao;

    public MainWindow() {
        super(VaadinSpringDemoApplication.APPLICATION_TITLE);

        addComponent(new Label(VaadinSpringDemoApplication.APPLICATION_TITLE));
    }

    @PostConstruct
    public void addInstanceLabels() {
    	assert dao != null;
        addComponent(new Label("It works"));
    }
}
