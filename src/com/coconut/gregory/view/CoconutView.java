package com.coconut.gregory.view;

import java.util.Scanner;

import com.coconut.gregory.controll.CoconutController;
import com.coconut.gregory.model.diagram.Coconut;
import com.coconut.gregory.utils.MessageUtil;

public class CoconutView {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        CoconutController controller = new CoconutController();
        System.out.println(MessageUtil.INSERT_WEIGHT);
        double weight = tc.nextDouble();

        Coconut coco = new Coconut(true, weight);
        controller.insert(coco);

        tc.close();
        
        

    }
}
