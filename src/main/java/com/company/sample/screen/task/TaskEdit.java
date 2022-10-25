package com.company.sample.screen.task;

import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.*;
import com.company.sample.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.sample.app.TaskService;
@UiController("Task_.edit")
@UiDescriptor("task-edit.xml")
@EditedEntityContainer("taskDc")
public class TaskEdit extends StandardEditor<Task> {
    @Autowired
    //private InstanceContainer<Task> taskDc;
   private TaskService taskService;
    @Subscribe
    public void onInitEntity(InitEntityEvent<Task> event) {
    event.getEntity().setAssignee(taskService.findLeastbusyUser());
   
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        
    }
}