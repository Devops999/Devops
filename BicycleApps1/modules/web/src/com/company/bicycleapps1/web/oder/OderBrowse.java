package com.company.bicycleapps1.web.oder;

import com.company.bicycleapps1.entity.Oder;
import com.company.bicycleapps1.entity.OderStatus;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.data.GroupDatasource;

import javax.inject.Inject;
import java.util.UUID;

public class OderBrowse extends AbstractLookup {

    @Inject
    private GroupDatasource<Oder, UUID> oderDs;

    public void onButtonClick() {
        Oder selectedItem = oderDs.getItem();
        if(selectedItem != null) {
            selectedItem.setStatus(OderStatus.NEW);
            oderDs.commit();
        }
    }
}
