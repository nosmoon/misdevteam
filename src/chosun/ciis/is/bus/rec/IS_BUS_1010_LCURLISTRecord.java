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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String make_dt;
	public String make_seq;
	public String chrg_pers;
	public String chrg_pers_nm;

	public IS_BUS_1010_LCURLISTRecord(){}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setMake_seq(String make_seq){
		this.make_seq = make_seq;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getMake_seq(){
		return this.make_seq;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}
}

/* �ۼ��ð� : Thu Jun 07 18:01:33 KST 2012 */