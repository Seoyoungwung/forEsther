package com.forEsther.vo.purchaseorderitemvo;

import lombok.Data;

//���ְ�ȹ�׸�

@Data
public class PurchaseOrderItemVO {
    private String purchase_order_item_code; //���ְ�ȹ�׸��ڵ�
    private String item_code;  //ǰ���ڵ�  ǰ�� FK
    private String plan_of_purchase_orders_code; //���ְ�ȹ����ȣ  ���ְ�ȹ�� FK
    private String supplier; //����ó
    private String item_name; //ǰ���
    private int order_quantity;  //���ּ���
    private String item_specification;  //�԰�
    private int purchase_price;  //���Ŵܰ�
}
