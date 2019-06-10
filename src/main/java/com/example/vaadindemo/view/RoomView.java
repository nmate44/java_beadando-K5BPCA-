package com.example.vaadindemo.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class RoomView extends VerticalLayout {

    public RoomView() {
        add(new Text("Ez egy terem képernyő."));
    }
}
