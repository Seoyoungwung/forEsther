package com.forEsther.vo.productionplanitemvo;

import lombok.Data;

//�����ȹ�׸�

@Data
public class ProductionPlanItemVO {
    private String production_plan_item_code; //�����ȹ�׸��ڵ�
    private String item_code; //ǰ���ڵ�  ǰ�� FK
    private String production_plan_code;  //����ó����ȹ���ڵ�  ����ó����ȹ��FK
    private String product_name;  //��ǰ��
    private String bom_code;  //bom �ڵ�
    private int scheduled_quantity;  //���꿹������
}
