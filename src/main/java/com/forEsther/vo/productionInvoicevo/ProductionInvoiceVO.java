package com.forEsther.vo.productionInvoicevo;

import java.util.Date;

import lombok.Data;

//������ǥ
@Data
public class ProductionInvoiceVO { 
    private String production_plan_code; //����ó����ȹ���ڵ� (-> ProductionPlanVO ��ü���� �޾ƿ� ����)
    private String employee_id; //��� (-> UserVO ��ü���� �޾ƿ� ����)
    private Date invoice_issuance_date; //������ǥ�߱�����
}