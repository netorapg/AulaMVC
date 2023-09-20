package com.coconut.gregory.controll;

import com.coconut.gregory.model.diagram.Coconut;
import com.coconut.gregory.model.service.CoconutService;

public class CoconutController {
    private CoconutService service;
    
    public CoconutController() {
        service = new CoconutService();
    }

    public void insert(Coconut coco) {
        service.insert(coco);
    }
    
}
