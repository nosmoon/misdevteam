/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
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
 * 
 */


public class SS_L_EXTN_PATY_NEWUSERLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String empseq;
	public String cmpycd;
	public String prn;
	public String empnm;
	public String deptnm;

	public SS_L_EXTN_PATY_NEWUSERLISTRecord(){}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}
}

/* �ۼ��ð� : Mon Jun 04 14:30:59 KST 2012 */