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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_BAS_1920_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String diary_titl;
	public String make_dt;
	public String make_pers;
	public String make_pers_nm;
	public String dlco_no;
	public String dlco_nm;
	public String diary_cont;
	public String opn;
	public String chg_dt_tm;
	public String chg_pers;

	public AD_BAS_1920_SDataSet(){}
	public AD_BAS_1920_SDataSet(String errcode, String errmsg, String diary_titl, String make_dt, String make_pers, String make_pers_nm, String dlco_no, String dlco_nm, String diary_cont, String opn, String chg_dt_tm, String chg_pers){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.diary_titl = diary_titl;
		this.make_dt = make_dt;
		this.make_pers = make_pers;
		this.make_pers_nm = make_pers_nm;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.diary_cont = diary_cont;
		this.opn = opn;
		this.chg_dt_tm = chg_dt_tm;
		this.chg_pers = chg_pers;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDiary_titl(String diary_titl){
		this.diary_titl = diary_titl;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setMake_pers_nm(String make_pers_nm){
		this.make_pers_nm = make_pers_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDiary_cont(String diary_cont){
		this.diary_cont = diary_cont;
	}

	public void setOpn(String opn){
		this.opn = opn;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDiary_titl(){
		return this.diary_titl;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getMake_pers_nm(){
		return this.make_pers_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDiary_cont(){
		return this.diary_cont;
	}

	public String getOpn(){
		return this.opn;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.diary_titl = Util.checkString(cstmt.getString(7));
		this.make_dt = Util.checkString(cstmt.getString(8));
		this.make_pers = Util.checkString(cstmt.getString(9));
		this.make_pers_nm = Util.checkString(cstmt.getString(10));
		this.dlco_no = Util.checkString(cstmt.getString(11));
		this.dlco_nm = Util.checkString(cstmt.getString(12));
		this.diary_cont = Util.checkString(cstmt.getString(13));
		this.opn = Util.checkString(cstmt.getString(14));
		this.chg_dt_tm = Util.checkString(cstmt.getString(15));
		this.chg_pers = Util.checkString(cstmt.getString(16));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1920_SDataSet ds = (AD_BAS_1920_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDiary_titl()%>
<%= ds.getMake_dt()%>
<%= ds.getMake_pers()%>
<%= ds.getMake_pers_nm()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getDiary_cont()%>
<%= ds.getOpn()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getChg_pers()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 13:57:37 KST 2009 */