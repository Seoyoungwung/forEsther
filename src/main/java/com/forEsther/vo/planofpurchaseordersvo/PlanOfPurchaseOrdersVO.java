package com.forEsther.vo.planofpurchaseordersvo;

import java.util.Date;

import lombok.Data;

//���ְ�ȹ��
@Data
public class PlanOfPurchaseOrdersVO { 
    private String plan_of_purchase_orders_code; //���ְ�ȹ����ȣ
    private String plan_name; //���ְ�ȹ����
    private String employee_id; //��� (-> UserVO ��ü���� �޾ƿ� ����)
    private Date creation_date; //�ۼ�����
    private String status; //���� (�� : ���, ������û, ����, �ݷ�)
}
