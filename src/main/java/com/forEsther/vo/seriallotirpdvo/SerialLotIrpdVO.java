package com.forEsther.vo.seriallotirpdvo;

import lombok.Data;

//�ø����Ʈ �����Һ�

@Data
public class SerialLotIrpdVO {
    private String serial_lot_irpd_code; //�����Һ��ڵ�
    private String serial_lot_code;  //�ø����Ʈ�ڵ�  - �ø����Ʈ FK
    private String item_name;  //ǰ���
    private String irpd_category;  //���ұ���(�԰�, ���)
    private int variation_quantity; //���� ����
    private int stock_quantity;  //��� ����
    private String related_invoice; // ������ǥ
    private String customer_name; //�ŷ�ó��
}
