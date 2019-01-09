/***************************************************************************************************
* 파일명	: 
* 기능		: 
* 작성일자	: 2004-01-13
* 작성자	: 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	:
* 수정자	:
* 수정일자	:
* 백업		: 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.rec;

import java.sql.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.ds.*;

/**
 *
 *
 */


public class SS_L_MIGRMECDMIGRCRMMECDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String sinmoon;
	public String af_code;
	public String yuga;
	public String jyuga;
	public String muga;
	public String total;
	public String jungji;

	public SS_L_MIGRMECDMIGRCRMMECDCURRecord(){}

	public void setSinmoon(String sinmoon){
		this.sinmoon = sinmoon;
	}

	public void setAf_code(String af_code){
		this.af_code = af_code;
	}

	public void setYuga(String yuga){
		this.yuga = yuga;
	}

	public void setJyuga(String jyuga){
		this.jyuga = jyuga;
	}

	public void setMuga(String muga){
		this.muga = muga;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public void setJungji(String jungji){
		this.jungji = jungji;
	}

	public String getSinmoon(){
		return this.sinmoon;
	}

	public String getAf_code(){
		return this.af_code;
	}

	public String getYuga(){
		return this.yuga;
	}

	public String getJyuga(){
		return this.jyuga;
	}

	public String getMuga(){
		return this.muga;
	}

	public String getTotal(){
		return this.total;
	}

	public String getJungji(){
		return this.jungji;
	}
}

/* 작성시간 : Wed Mar 24 15:35:34 KST 2004 */