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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_3411_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String gubun;
	public String medi_cd;
	public String sect_cd;
	public String wgt;

	public MT_PRNPAP_3411_LCURLISTRecord(){}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getWgt(){
		return this.wgt;
	}
}

/* �ۼ��ð� : Wed Aug 12 21:07:32 KST 2009 */