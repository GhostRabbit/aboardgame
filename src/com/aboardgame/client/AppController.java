package com.aboardgame.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

public class AppController implements ValueChangeHandler<String> {

    private HasWidgets container;

    public AppController(HandlerManager eventBus) {
    }

    @Override
    public void onValueChange(ValueChangeEvent<String> event) {
        // TODO Auto-generated method stub
    }

    public void go(HasWidgets container) {
        this.container = container;
    }

    public HasWidgets getContainer() {
        return container;
    }

}
