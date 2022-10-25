package com.company.sample.screen.office;

import io.jmix.ui.screen.*;
import com.company.sample.entity.Office;

@UiController("Office.browse")
@UiDescriptor("office-browse.xml")
@LookupComponent("officesTable")
public class OfficeBrowse extends StandardLookup<Office> {
}