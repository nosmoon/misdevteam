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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1007_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_no;
	public String make_natn;
	public String make_cmpy;
	public String make_yymm;
	public String make_no;
	public String mang_no;
	public String remk;

	public AS_ASET_1007_SCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setMake_natn(String make_natn){
		this.make_natn = make_natn;
	}

	public void setMake_cmpy(String make_cmpy){
		this.make_cmpy = make_cmpy;
	}

	public void setMake_yymm(String make_yymm){
		this.make_yymm = make_yymm;
	}

	public void setMake_no(String make_no){
		this.make_no = make_no;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getMake_natn(){
		return this.make_natn;
	}

	public String getMake_cmpy(){
		return this.make_cmpy;
	}

	public String getMake_yymm(){
		return this.make_yymm;
	}

	public String getMake_no(){
		return this.make_no;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* �ۼ��ð� : Tue Mar 03 17:11:41 KST 2009 */