/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.cocd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.cocd.dm.*;
import chosun.ciis.co.cocd.rec.*;

/**
 * 
 */


public class CO_COCD_1020_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList commcdcur1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String g_cmpy_cd;
	public String g_job_clsf;
	public String g_cd_clsf;
	public String g_cd;
	public String g_use_yn;
	public String g_cdnm;
	public String g_cd_abrv_nm;
	public String g_mang_cd_1;
	public String g_mang_cd_2;
	public String g_mang_cd_3;
	public String g_mang_cd_4;
	public String g_mang_cd_5;
	public String g_mang_cd_6;
	public String g_mang_cd_7;
	public String g_mang_cd_8;
	public String g_mang_cd_9;
	public String g_mang_cd_10;
	public String g_mang_cd_11;
	public String g_mang_cd_12;
	public String g_tbl_nm;
	public String g_remk;
	public String g_upd_yn;
	public String g_incmg_pers_ip;
	public String g_incmg_pers;
	public String g_incmg_dt_tm;
	public String g_chg_pers;
	public String g_chg_dt_tm;

	public CO_COCD_1020_LDataSet(){}
	public CO_COCD_1020_LDataSet(String errcode, String errmsg, String g_cmpy_cd, String g_job_clsf, String g_cd_clsf, String g_cd, String g_use_yn, String g_cdnm, String g_cd_abrv_nm, String g_mang_cd_1, String g_mang_cd_2, String g_mang_cd_3, String g_mang_cd_4, String g_mang_cd_5, String g_mang_cd_6, String g_mang_cd_7, String g_mang_cd_8, String g_mang_cd_9, String g_mang_cd_10, String g_mang_cd_11, String g_mang_cd_12, String g_tbl_nm, String g_remk, String g_upd_yn, String g_incmg_pers_ip, String g_incmg_pers, String g_incmg_dt_tm, String g_chg_pers, String g_chg_dt_tm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.g_cmpy_cd = g_cmpy_cd;
		this.g_job_clsf = g_job_clsf;
		this.g_cd_clsf = g_cd_clsf;
		this.g_cd = g_cd;
		this.g_use_yn = g_use_yn;
		this.g_cdnm = g_cdnm;
		this.g_cd_abrv_nm = g_cd_abrv_nm;
		this.g_mang_cd_1 = g_mang_cd_1;
		this.g_mang_cd_2 = g_mang_cd_2;
		this.g_mang_cd_3 = g_mang_cd_3;
		this.g_mang_cd_4 = g_mang_cd_4;
		this.g_mang_cd_5 = g_mang_cd_5;
		this.g_mang_cd_6 = g_mang_cd_6;
		this.g_mang_cd_7 = g_mang_cd_7;
		this.g_mang_cd_8 = g_mang_cd_8;
		this.g_mang_cd_9 = g_mang_cd_9;
		this.g_mang_cd_10 = g_mang_cd_10;
		this.g_mang_cd_11 = g_mang_cd_11;
		this.g_mang_cd_12 = g_mang_cd_12;
		this.g_tbl_nm = g_tbl_nm;
		this.g_remk = g_remk;
		this.g_upd_yn = g_upd_yn;
		this.g_incmg_pers_ip = g_incmg_pers_ip;
		this.g_incmg_pers = g_incmg_pers;
		this.g_incmg_dt_tm = g_incmg_dt_tm;
		this.g_chg_pers = g_chg_pers;
		this.g_chg_dt_tm = g_chg_dt_tm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setG_cmpy_cd(String g_cmpy_cd){
		this.g_cmpy_cd = g_cmpy_cd;
	}

	public void setG_job_clsf(String g_job_clsf){
		this.g_job_clsf = g_job_clsf;
	}

	public void setG_cd_clsf(String g_cd_clsf){
		this.g_cd_clsf = g_cd_clsf;
	}

	public void setG_cd(String g_cd){
		this.g_cd = g_cd;
	}

	public void setG_use_yn(String g_use_yn){
		this.g_use_yn = g_use_yn;
	}

	public void setG_cdnm(String g_cdnm){
		this.g_cdnm = g_cdnm;
	}

	public void setG_cd_abrv_nm(String g_cd_abrv_nm){
		this.g_cd_abrv_nm = g_cd_abrv_nm;
	}

	public void setG_mang_cd_1(String g_mang_cd_1){
		this.g_mang_cd_1 = g_mang_cd_1;
	}

	public void setG_mang_cd_2(String g_mang_cd_2){
		this.g_mang_cd_2 = g_mang_cd_2;
	}

	public void setG_mang_cd_3(String g_mang_cd_3){
		this.g_mang_cd_3 = g_mang_cd_3;
	}

	public void setG_mang_cd_4(String g_mang_cd_4){
		this.g_mang_cd_4 = g_mang_cd_4;
	}

	public void setG_mang_cd_5(String g_mang_cd_5){
		this.g_mang_cd_5 = g_mang_cd_5;
	}

	public void setG_mang_cd_6(String g_mang_cd_6){
		this.g_mang_cd_6 = g_mang_cd_6;
	}

	public void setG_mang_cd_7(String g_mang_cd_7){
		this.g_mang_cd_7 = g_mang_cd_7;
	}

	public void setG_mang_cd_8(String g_mang_cd_8){
		this.g_mang_cd_8 = g_mang_cd_8;
	}

	public void setG_mang_cd_9(String g_mang_cd_9){
		this.g_mang_cd_9 = g_mang_cd_9;
	}

	public void setG_mang_cd_10(String g_mang_cd_10){
		this.g_mang_cd_10 = g_mang_cd_10;
	}

	public void setG_mang_cd_11(String g_mang_cd_11){
		this.g_mang_cd_11 = g_mang_cd_11;
	}

	public void setG_mang_cd_12(String g_mang_cd_12){
		this.g_mang_cd_12 = g_mang_cd_12;
	}

	public void setG_tbl_nm(String g_tbl_nm){
		this.g_tbl_nm = g_tbl_nm;
	}

	public void setG_remk(String g_remk){
		this.g_remk = g_remk;
	}

	public void setG_upd_yn(String g_upd_yn){
		this.g_upd_yn = g_upd_yn;
	}

	public void setG_incmg_pers_ip(String g_incmg_pers_ip){
		this.g_incmg_pers_ip = g_incmg_pers_ip;
	}

	public void setG_incmg_pers(String g_incmg_pers){
		this.g_incmg_pers = g_incmg_pers;
	}

	public void setG_incmg_dt_tm(String g_incmg_dt_tm){
		this.g_incmg_dt_tm = g_incmg_dt_tm;
	}

	public void setG_chg_pers(String g_chg_pers){
		this.g_chg_pers = g_chg_pers;
	}

	public void setG_chg_dt_tm(String g_chg_dt_tm){
		this.g_chg_dt_tm = g_chg_dt_tm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getG_cmpy_cd(){
		return this.g_cmpy_cd;
	}

	public String getG_job_clsf(){
		return this.g_job_clsf;
	}

	public String getG_cd_clsf(){
		return this.g_cd_clsf;
	}

	public String getG_cd(){
		return this.g_cd;
	}

	public String getG_use_yn(){
		return this.g_use_yn;
	}

	public String getG_cdnm(){
		return this.g_cdnm;
	}

	public String getG_cd_abrv_nm(){
		return this.g_cd_abrv_nm;
	}

	public String getG_mang_cd_1(){
		return this.g_mang_cd_1;
	}

	public String getG_mang_cd_2(){
		return this.g_mang_cd_2;
	}

	public String getG_mang_cd_3(){
		return this.g_mang_cd_3;
	}

	public String getG_mang_cd_4(){
		return this.g_mang_cd_4;
	}

	public String getG_mang_cd_5(){
		return this.g_mang_cd_5;
	}

	public String getG_mang_cd_6(){
		return this.g_mang_cd_6;
	}

	public String getG_mang_cd_7(){
		return this.g_mang_cd_7;
	}

	public String getG_mang_cd_8(){
		return this.g_mang_cd_8;
	}

	public String getG_mang_cd_9(){
		return this.g_mang_cd_9;
	}

	public String getG_mang_cd_10(){
		return this.g_mang_cd_10;
	}

	public String getG_mang_cd_11(){
		return this.g_mang_cd_11;
	}

	public String getG_mang_cd_12(){
		return this.g_mang_cd_12;
	}

	public String getG_tbl_nm(){
		return this.g_tbl_nm;
	}

	public String getG_remk(){
		return this.g_remk;
	}

	public String getG_upd_yn(){
		return this.g_upd_yn;
	}

	public String getG_incmg_pers_ip(){
		return this.g_incmg_pers_ip;
	}

	public String getG_incmg_pers(){
		return this.g_incmg_pers;
	}

	public String getG_incmg_dt_tm(){
		return this.g_incmg_dt_tm;
	}

	public String getG_chg_pers(){
		return this.g_chg_pers;
	}

	public String getG_chg_dt_tm(){
		return this.g_chg_dt_tm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.g_cmpy_cd = Util.checkString(cstmt.getString(7));
		this.g_job_clsf = Util.checkString(cstmt.getString(8));
		this.g_cd_clsf = Util.checkString(cstmt.getString(9));
		this.g_cd = Util.checkString(cstmt.getString(10));
		this.g_use_yn = Util.checkString(cstmt.getString(11));
		this.g_cdnm = Util.checkString(cstmt.getString(12));
		this.g_cd_abrv_nm = Util.checkString(cstmt.getString(13));
		this.g_mang_cd_1 = Util.checkString(cstmt.getString(14));
		this.g_mang_cd_2 = Util.checkString(cstmt.getString(15));
		this.g_mang_cd_3 = Util.checkString(cstmt.getString(16));
		this.g_mang_cd_4 = Util.checkString(cstmt.getString(17));
		this.g_mang_cd_5 = Util.checkString(cstmt.getString(18));
		this.g_mang_cd_6 = Util.checkString(cstmt.getString(19));
		this.g_mang_cd_7 = Util.checkString(cstmt.getString(20));
		this.g_mang_cd_8 = Util.checkString(cstmt.getString(21));
		this.g_mang_cd_9 = Util.checkString(cstmt.getString(22));
		this.g_mang_cd_10 = Util.checkString(cstmt.getString(23));
		this.g_mang_cd_11 = Util.checkString(cstmt.getString(24));
		this.g_mang_cd_12 = Util.checkString(cstmt.getString(25));
		this.g_tbl_nm = Util.checkString(cstmt.getString(26));
		this.g_remk = Util.checkString(cstmt.getString(27));
		this.g_upd_yn = Util.checkString(cstmt.getString(28));
		this.g_incmg_pers_ip = Util.checkString(cstmt.getString(29));
		this.g_incmg_pers = Util.checkString(cstmt.getString(30));
		this.g_incmg_dt_tm = Util.checkString(cstmt.getString(31));
		this.g_chg_pers = Util.checkString(cstmt.getString(32));
		this.g_chg_dt_tm = Util.checkString(cstmt.getString(33));
		ResultSet rset0 = (ResultSet) cstmt.getObject(34);
		while(rset0.next()){
			CO_COCD_1020_LCOMMCDCUR1Record rec = new CO_COCD_1020_LCOMMCDCUR1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.mang_cd_1 = Util.checkString(rset0.getString("mang_cd_1"));
			rec.mang_cd_2 = Util.checkString(rset0.getString("mang_cd_2"));
			rec.mang_cd_3 = Util.checkString(rset0.getString("mang_cd_3"));
			rec.mang_cd_4 = Util.checkString(rset0.getString("mang_cd_4"));
			rec.mang_cd_5 = Util.checkString(rset0.getString("mang_cd_5"));
			rec.mang_cd_6 = Util.checkString(rset0.getString("mang_cd_6"));
			rec.mang_cd_7 = Util.checkString(rset0.getString("mang_cd_7"));
			rec.mang_cd_8 = Util.checkString(rset0.getString("mang_cd_8"));
			rec.mang_cd_9 = Util.checkString(rset0.getString("mang_cd_9"));
			rec.mang_cd_10 = Util.checkString(rset0.getString("mang_cd_10"));
			rec.mang_cd_11 = Util.checkString(rset0.getString("mang_cd_11"));
			rec.mang_cd_12 = Util.checkString(rset0.getString("mang_cd_12"));
			rec.tbl_nm = Util.checkString(rset0.getString("tbl_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.upd_yn = Util.checkString(rset0.getString("upd_yn"));
			rec.incmg_pers_ip = Util.checkString(rset0.getString("incmg_pers_ip"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.commcdcur1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_COCD_1020_LDataSet ds = (CO_COCD_1020_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.commcdcur1.size(); i++){
		CO_COCD_1020_LCOMMCDCUR1Record commcdcur1Rec = (CO_COCD_1020_LCOMMCDCUR1Record)ds.commcdcur1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getG_cmpy_cd()%>
<%= ds.getG_job_clsf()%>
<%= ds.getG_cd_clsf()%>
<%= ds.getG_cd()%>
<%= ds.getG_use_yn()%>
<%= ds.getG_cdnm()%>
<%= ds.getG_cd_abrv_nm()%>
<%= ds.getG_mang_cd_1()%>
<%= ds.getG_mang_cd_2()%>
<%= ds.getG_mang_cd_3()%>
<%= ds.getG_mang_cd_4()%>
<%= ds.getG_mang_cd_5()%>
<%= ds.getG_mang_cd_6()%>
<%= ds.getG_mang_cd_7()%>
<%= ds.getG_mang_cd_8()%>
<%= ds.getG_mang_cd_9()%>
<%= ds.getG_mang_cd_10()%>
<%= ds.getG_mang_cd_11()%>
<%= ds.getG_mang_cd_12()%>
<%= ds.getG_tbl_nm()%>
<%= ds.getG_remk()%>
<%= ds.getG_upd_yn()%>
<%= ds.getG_incmg_pers_ip()%>
<%= ds.getG_incmg_pers()%>
<%= ds.getG_incmg_dt_tm()%>
<%= ds.getG_chg_pers()%>
<%= ds.getG_chg_dt_tm()%>
<%= ds.getCommcdcur1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= commcdcur1Rec.cd%>
<%= commcdcur1Rec.use_yn%>
<%= commcdcur1Rec.cdnm%>
<%= commcdcur1Rec.cd_abrv_nm%>
<%= commcdcur1Rec.mang_cd_1%>
<%= commcdcur1Rec.mang_cd_2%>
<%= commcdcur1Rec.mang_cd_3%>
<%= commcdcur1Rec.mang_cd_4%>
<%= commcdcur1Rec.mang_cd_5%>
<%= commcdcur1Rec.mang_cd_6%>
<%= commcdcur1Rec.mang_cd_7%>
<%= commcdcur1Rec.mang_cd_8%>
<%= commcdcur1Rec.mang_cd_9%>
<%= commcdcur1Rec.mang_cd_10%>
<%= commcdcur1Rec.mang_cd_11%>
<%= commcdcur1Rec.mang_cd_12%>
<%= commcdcur1Rec.tbl_nm%>
<%= commcdcur1Rec.remk%>
<%= commcdcur1Rec.upd_yn%>
<%= commcdcur1Rec.incmg_pers_ip%>
<%= commcdcur1Rec.incmg_pers%>
<%= commcdcur1Rec.incmg_dt_tm%>
<%= commcdcur1Rec.chg_pers%>
<%= commcdcur1Rec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 18 10:59:52 KST 2009 */