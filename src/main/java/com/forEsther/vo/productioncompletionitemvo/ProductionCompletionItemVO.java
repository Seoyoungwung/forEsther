package com.forEsther.vo.productioncompletionitemvo;

import lombok.Data;

//����Ϸ��׸�

@Data
public class ProductionCompletionItemVO {
    private String production_plan_item_code; //�����ȹǰ���ڵ�
    private String production_plan_code;  //����ó����ȹ���ڵ�
    private int actual_production_quantity;  //�����������
}
