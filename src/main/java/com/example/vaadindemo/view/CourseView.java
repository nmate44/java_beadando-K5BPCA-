package com.example.vaadindemo.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class CourseView extends VerticalLayout {

    public CourseView() {
        add(new Text("Egy kurzus"));
    }
}
