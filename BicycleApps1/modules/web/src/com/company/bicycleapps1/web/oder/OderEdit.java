package com.company.bicycleapps1.web.oder;

import com.company.bicycleapps1.entity.OderStatus;
import com.company.bicycleapps1.service.Oder1Service;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.bicycleapps1.entity.Oder;

import javax.inject.Inject;

public class OderEdit extends AbstractEditor<Oder> {
    @Inject
    private Oder1Service oder1Service;

    @Override
    protected void initNewItem(Oder item){
        super.initNewItem(item);

        item.setStatus(OderStatus.NEW);
    }

    @Override
    protected boolean preCommit() {
        Oder oder = getItem();
        oder.setAmount(oder1Service.calculateAmount(oder));
        return super.preCommit();
    }



}
