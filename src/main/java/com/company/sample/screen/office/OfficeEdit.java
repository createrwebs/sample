package com.company.sample.screen.office;

import io.jmix.ui.screen.*;
import com.company.sample.entity.Office;

@UiController("Office.edit")
@UiDescriptor("office-edit.xml")
@EditedEntityContainer("officeDc")
public class OfficeEdit extends StandardEditor<Office> {
}