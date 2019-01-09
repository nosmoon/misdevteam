/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mchrg_pers;
	public String mchrg_nm;
	public String dlco_nm;
	public String dlco_no;
	public String chrg_area;
	public String hndl_clsf;

	public AD_BAS_1410_LCURLISTRecord(){}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setMchrg_nm(String mchrg_nm){
		this.mchrg_nm = mchrg_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setChrg_area(String chrg_area){
		this.chrg_area = chrg_area;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getMchrg_nm(){
		return this.mchrg_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getChrg_area(){
		return this.chrg_area;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}
}

/* 작성시간 : Fri Dec 02 17:59:53 KST 2011 */