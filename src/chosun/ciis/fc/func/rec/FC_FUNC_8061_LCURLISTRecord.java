/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_8061_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pay_prd_from;
	public String pay_prd_to;
	public String libo_int_rate;
	public String fix_yn;

	public FC_FUNC_8061_LCURLISTRecord(){}

	public void setPay_prd_from(String pay_prd_from){
		this.pay_prd_from = pay_prd_from;
	}

	public void setPay_prd_to(String pay_prd_to){
		this.pay_prd_to = pay_prd_to;
	}

	public void setLibo_int_rate(String libo_int_rate){
		this.libo_int_rate = libo_int_rate;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public String getPay_prd_from(){
		return this.pay_prd_from;
	}

	public String getPay_prd_to(){
		return this.pay_prd_to;
	}

	public String getLibo_int_rate(){
		return this.libo_int_rate;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}
}

/* �ۼ��ð� : Sat Apr 11 13:18:30 KST 2009 */