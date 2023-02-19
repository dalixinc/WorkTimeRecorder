package com.dalixinc.scratch;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectsPanel extends JPanel {

    public List<ProjectPanel> getProjectPanels() {
        return projectPanels;
    }

    public void setProjectPanels(List<ProjectPanel> projectPanels) {
        this.projectPanels = projectPanels;
    }

    List<ProjectPanel> projectPanels= new ArrayList<>();

    public ProjectsPanel(LayoutManager layout) {
        super(layout);
    }

    public ProjectsPanel() {
        setLayout(new GridLayout(0, 1));
    }


}
