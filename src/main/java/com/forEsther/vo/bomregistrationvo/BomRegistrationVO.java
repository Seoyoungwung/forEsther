package com.forEsther.vo.bomregistrationvo;

import lombok.Data;

//BOM ���
@Data
public class BomRegistrationVO { 
    private String bom_registration_code; //BOM����ڵ�
    private String bom_code; //BOM�ڵ� (-> BomVO ��ü���� �޾ƿ� ����)
    private String item_code; //ǰ���ڵ� (-> ItemVO ��ü���� �޾ƿ� ����)
    private int required_quantity; //����� �ʿ����
}
