package com.forEsther.vo.productionplanvo;

import java.util.Date;

import lombok.Data;

//����ó����ȹ��
@Data
public class ProductionPlanVO { 
    private String production_plan_code; //����ó����ȹ���ڵ�
    private String production_plan_name; //����ó����ȹ����
    private Date creation_date; //�ۼ�����
    private String employee_id; //��� (-> UserVO ��ü���� �޾ƿ� ����)
    private String status; //���� ����(�� : �ݷ�,���꿹��,������,������ǥ)
}