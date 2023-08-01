package com.forEsther.vo.seriallotvo;

import java.util.Date;


import lombok.Data;
// �ø����Ʈ
@Data
public class SerialLotVO {
    private String serial_lot_code; // �ø��� ��Ʈ �ڵ�
    private String item_code; // ǰ���ڵ� (-> ItemVO ��ü���� �޾ƿ� ����)
    private Date registration_date; // ���� (�������)
    private String item_name; // ǰ��� (-> ItemVO ��ü���� �޾ƿ� ����)
    private Date expiration_date; // ������� (�ش� ��ü���� ���� ����)
    private int stock_quantity; // ������
    private String supplier; // ����ó (-> SupplierVO ��ü���� �޾ƿ� ����)
    private String related_invoice; // ������ǥ
    
}