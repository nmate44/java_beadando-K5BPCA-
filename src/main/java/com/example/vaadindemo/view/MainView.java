package com.example.vaadindemo.view;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends AbstractView {

    public MainView() {
            Text title = new Text("Main Page");
            add(title);

            Anchor coursesl = new Anchor();
            coursesl.setText("Courses");
            coursesl.setHref("/courses");
            add(coursesl);

            Anchor coursel = new Anchor();
            coursel.setText("Course");
            coursel.setHref("/course");
            add(coursel);

            Anchor roomsl = new Anchor();
            roomsl.setText("Rooms");
            roomsl.setHref("/rooms");
            add(roomsl);

            Anchor rooml = new Anchor();
            rooml.setText("Room");
            rooml.setHref("/room");
            add(rooml);
    }
}
