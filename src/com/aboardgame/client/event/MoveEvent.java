package com.aboardgame.client.event;

import com.google.gwt.event.shared.GwtEvent;

public class MoveEvent extends GwtEvent<MoveEventHandler> {
    public static Type<MoveEventHandler> TYPE = new Type<MoveEventHandler>();
    
    @Override
    public Type<MoveEventHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(MoveEventHandler handler) {
        handler.onMoveEvent(this);
    }

}
