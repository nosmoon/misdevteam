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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_3203_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ern;
	public String dlco_nm;
	public String occr_no;
	public String dr_amt;

	public EN_INNEXP_3203_LCURLISTRecord(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setOccr_no(String occr_no){
		this.occr_no = occr_no;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getOccr_no(){
		return this.occr_no;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}
}

/* �ۼ��ð� : Mon May 11 20:05:31 KST 2009 */