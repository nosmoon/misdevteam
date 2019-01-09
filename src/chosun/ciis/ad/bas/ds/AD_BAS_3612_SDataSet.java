/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.16
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;


/**
 * 
 */


public class AD_BAS_3612_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable
{
	public String errcode;
	public String errmsg;
	
	public String zip1;
	public String zip2;
	public String addr;
	public String dtls_addr;
	public String slcrg_pers;
	public String slcrg_pers_nm;
	public String mchrg_pers;
	public String mchrg_pers_nm;

	public AD_BAS_3612_SDataSet(){}
	public AD_BAS_3612_SDataSet(String errcode, String errmsg, String zip1, String zip2, String addr, String dtls_addr, String slcrg_pers, String slcrg_pers_nm, String mchrg_pers, String mchrg_pers_nm) {
		super();
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.zip1 = zip1;
		this.zip2 = zip2;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.slcrg_pers = slcrg_pers;
		this.slcrg_pers_nm = slcrg_pers_nm;
		this.mchrg_pers = mchrg_pers;
		this.mchrg_pers_nm = mchrg_pers_nm;
	}	
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDtls_addr() {
		return dtls_addr;
	}
	public void setDtls_addr(String dtls_addr) {
		this.dtls_addr = dtls_addr;
	}
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getZip1() {
		return zip1;
	}
	public void setZip1(String zip1) {
		this.zip1 = zip1;
	}
	public String getZip2() {
		return zip2;
	}
	public void setZip2(String zip2) {
		this.zip2 = zip2;
	}
	
	public String getMchrg_pers() {
		return mchrg_pers;
	}
	public void setMchrg_pers(String mchrg_pers) {
		this.mchrg_pers = mchrg_pers;
	}
	public String getSlcrg_pers() {
		return slcrg_pers;
	}
	public void setSlcrg_pers(String slcrg_pers) {
		this.slcrg_pers = slcrg_pers;
	}
	public String getMchrg_pers_nm() {
		return mchrg_pers_nm;
	}
	public void setMchrg_pers_nm(String mchrg_pers_nm) {
		this.mchrg_pers_nm = mchrg_pers_nm;
	}
	public String getSlcrg_pers_nm() {
		return slcrg_pers_nm;
	}
	public void setSlcrg_pers_nm(String slcrg_pers_nm) {
		this.slcrg_pers_nm = slcrg_pers_nm;
	}
	
	public void getValues(CallableStatement cstmt) throws SQLException
	{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode))		return;		
		
		this.zip1 		= Util.checkString(cstmt.getString(5));
		this.zip2 		= Util.checkString(cstmt.getString(6));
		this.addr 		= Util.checkString(cstmt.getString(7));
		this.dtls_addr 	= Util.checkString(cstmt.getString(8));
		this.slcrg_pers	= Util.checkString(cstmt.getString(9));
		this.slcrg_pers_nm	= Util.checkString(cstmt.getString(10));
		this.mchrg_pers	= Util.checkString(cstmt.getString(11));
		this.mchrg_pers_nm	= Util.checkString(cstmt.getString(12));
	}	
}