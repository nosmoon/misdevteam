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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_9001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String drvr_cd;
	public String drvr_nm;
	public String driv_yn;
	public String nondriv_clsf;

	public MT_ETCCAR_9001_LCURLISTRecord(){}

	public void setDrvr_cd(String drvr_cd){
		this.drvr_cd = drvr_cd;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setDriv_yn(String driv_yn){
		this.driv_yn = driv_yn;
	}

	public void setNondriv_clsf(String nondriv_clsf){
		this.nondriv_clsf = nondriv_clsf;
	}

	public String getDrvr_cd(){
		return this.drvr_cd;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getDriv_yn(){
		return this.driv_yn;
	}

	public String getNondriv_clsf(){
		return this.nondriv_clsf;
	}
}

/* �ۼ��ð� : Fri Aug 24 14:52:08 KST 2012 */