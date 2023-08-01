package com.forEsther.vo.itemvo;

import lombok.Data;

//ǰ��
@Data
public class ItemVO {
    private String item_code; // ǰ���ڵ�
    private String item_name; // ǰ���
    private String item_specification; // �԰� (1kg, 10kg, 1box...)
    private int safety_stock; // �������
    private int serial_lot_status; // �ø����Ʈ ����
    private String procurement; // ���� (�������� -> ���� or ����)
    private String item_classification; // ǰ�񱸺� (�����, ��ǰ, ����)
}
