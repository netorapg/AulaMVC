package com.coconut.gregory.model.service;

import java.util.ArrayList;

import com.coconut.gregory.model.diagram.Coconut;

public class CoconutService {
    private ArrayList<Coconut> cocos;
    public void insert(Coconut coco) {
        if(coco.getWeight() < 500)
            coco.setGood(false);

        cocos.add(coco);
    }
    
}
