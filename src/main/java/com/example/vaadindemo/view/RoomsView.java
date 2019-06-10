package com.example.vaadindemo.view;

import com.example.vaadindemo.component.RoomForm;
import com.example.vaadindemo.entity.Room;
import com.example.vaadindemo.repository.RoomRepository;
import com.example.vaadindemo.util.RefreshAware;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@Route
public class RoomsView extends VerticalLayout implements RefreshAware {

    @Autowired
    private RoomRepository repository;
    @Autowired
    private RoomForm roomForm;
    private Grid<Room> grid;

    @PostConstruct
    public void init() {
        try {
            if(repository.findAll().isEmpty()) {
                Room room0 = new Room();
                room0.setId(0);
                room0.setLevel(1);
                room0.setName("AlmaTerem");
                repository.save(room0);

                Room room1 = new Room();
                room1.setId(1);
                room1.setLevel(0);
                room1.setName("KörteTerem");
                repository.save(room1);

                Room room2 = new Room();
                room2.setId(2);
                room2.setLevel(4);
                room2.setName("CseresznyeTerem");
                repository.save(room2);

                Room room3 = new Room();
                room3.setId(3);
                room3.setLevel(2);
                room3.setName("BarackTerem");
                repository.save(room3);
            }

            grid = new Grid<>();
            grid.setItems(repository.findAll());
            grid.addColumn(Room::getId).setHeader("Azonosító");
            grid.addColumn(Room::getName).setHeader("Terem neve");
            grid.addColumn(Room::getLevel).setHeader("Szint");
            grid.asSingleSelect().addValueChangeListener(e -> {
                if(e.getValue() != null) {
                    roomForm.initEdit(e.getValue().getId());
                }
            });

            Button newBtn = new Button("New", VaadinIcon.PLUS.create());
            newBtn.addClickListener(event -> roomForm.initSave());

            add(newBtn);
            add(grid);
            add(roomForm);
            roomForm.setRefreshAware(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void processRefresh() {
        try {
            grid.setItems(repository.findAll());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
