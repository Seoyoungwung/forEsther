package com.forEsther.vo.orderitemvo;

import lombok.Data;

//�ֹ��׸�

@Data
public class OrderItemVO {
	private String order_item_code; //�ֹ��׸��ڵ�
    private String item_code;  //�׸��ڵ� - ǰ�� FK
    private String order_code;  //�ֹ����ڵ� - �ֹ��� FK
    private String item_name;  //ǰ���
    private int quantity;  //����
    private int unit_price;  //�ǸŴܰ�
}
