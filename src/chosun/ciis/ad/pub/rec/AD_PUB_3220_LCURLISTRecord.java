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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_3220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_slip_no;
	public String dlco_nm;
	public String dlco_no;
	public String dn;
	public String cm;
	public String uprc;
	public String advt_fee;
	public String indt_clsf_nm;

	public AD_PUB_3220_LCURLISTRecord(){}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setIndt_clsf_nm(String indt_clsf_nm){
		this.indt_clsf_nm = indt_clsf_nm;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDn(){
		return this.dn;
	}

	public String getCm(){
		return this.cm;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getIndt_clsf_nm(){
		return this.indt_clsf_nm;
	}
}

/* 작성시간 : Mon Mar 31 15:55:14 KST 2014 */