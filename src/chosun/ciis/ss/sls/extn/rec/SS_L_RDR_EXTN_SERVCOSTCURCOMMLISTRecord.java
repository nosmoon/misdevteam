/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord.java
* ��� : Ȯ����Ȳ-����ISȮ��-�����
* �ۼ����� : 2005-02-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-����ISȮ��-�����
 */


public class SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String basidt;
	public String stafno;
	public String stafnm;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String email;
	public int totqty;
	public int servcost;

	public SS_L_RDR_EXTN_SERVCOSTCURCOMMLISTRecord(){}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setPtph_no1(String ptph_no1){
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2){
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3){
		this.ptph_no3 = ptph_no3;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setTotqty(int totqty){
		this.totqty = totqty;
	}

	public void setServcost(int servcost){
		this.servcost = servcost;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getPtph_no1(){
		return this.ptph_no1;
	}

	public String getPtph_no2(){
		return this.ptph_no2;
	}

	public String getPtph_no3(){
		return this.ptph_no3;
	}

	public String getEmail(){
		return this.email;
	}

	public int getTotqty(){
		return this.totqty;
	}

	public int getServcost(){
		return this.servcost;
	}
}

/* �ۼ��ð� : Sun Feb 20 00:49:04 KST 2005 */