package com.dalixinc.components;

import java.util.List;

/**
 * @author Dale © 2023
 *
 * This class represents the fundamental line item of work, which is ties to a cose that time will we be
 * booked against in Timesheets. It is composed of one or more {@link com.dalixinc.components.Task} items, each which can have a clock running
 * for them - the total time will be accumulated by the project.
 *
 */
public class Project {
    private List<Task> taskList;
    private long grandTotal;
    private String projectCode;
    private String projectName;

}
