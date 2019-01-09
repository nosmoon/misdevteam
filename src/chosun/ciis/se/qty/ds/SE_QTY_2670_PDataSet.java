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


package chosun.ciis.se.qty.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2670_PDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_b = new ArrayList();
	public ArrayList curlist_a = new ArrayList();
	public ArrayList curlist_c = new ArrayList();
	public String errcode;
	public String errmsg;
	public String issu_dt;
	public String c_ser_no;
	public String s_ser_no;
	public String p_cnt;
	public String ecnt_a_nm;
	public String ecnt_b_nm;
	public String sect_a_nm;
	public String sect_b_nm;
	public String sect_c_nm;
	public String remk_a;
	public String remk_b;
	public String remk_c;
	public String remk_d;

	public SE_QTY_2670_PDataSet(){}
	public SE_QTY_2670_PDataSet(String errcode, String errmsg, String issu_dt, String c_ser_no, String s_ser_no, String p_cnt, String ecnt_a_nm, String ecnt_b_nm, String sect_a_nm, String sect_b_nm, String sect_c_nm, String remk_a, String remk_b, String remk_c, String remk_d){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.issu_dt = issu_dt;
		this.c_ser_no = c_ser_no;
		this.s_ser_no = s_ser_no;
		this.p_cnt = p_cnt;
		this.ecnt_a_nm = ecnt_a_nm;
		this.ecnt_b_nm = ecnt_b_nm;
		this.sect_a_nm = sect_a_nm;
		this.sect_b_nm = sect_b_nm;
		this.sect_c_nm = sect_c_nm;
		this.remk_a = remk_a;
		this.remk_b = remk_b;
		this.remk_c = remk_c;
		this.remk_d = remk_d;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setC_ser_no(String c_ser_no){
		this.c_ser_no = c_ser_no;
	}

	public void setS_ser_no(String s_ser_no){
		this.s_ser_no = s_ser_no;
	}

	public void setP_cnt(String p_cnt){
		this.p_cnt = p_cnt;
	}

	public void setEcnt_a_nm(String ecnt_a_nm){
		this.ecnt_a_nm = ecnt_a_nm;
	}

	public void setEcnt_b_nm(String ecnt_b_nm){
		this.ecnt_b_nm = ecnt_b_nm;
	}

	public void setSect_a_nm(String sect_a_nm){
		this.sect_a_nm = sect_a_nm;
	}

	public void setSect_b_nm(String sect_b_nm){
		this.sect_b_nm = sect_b_nm;
	}

	public void setSect_c_nm(String sect_c_nm){
		this.sect_c_nm = sect_c_nm;
	}

	public void setRemk_a(String remk_a){
		this.remk_a = remk_a;
	}

	public void setRemk_b(String remk_b){
		this.remk_b = remk_b;
	}

	public void setRemk_c(String remk_c){
		this.remk_c = remk_c;
	}

	public void setRemk_d(String remk_d){
		this.remk_d = remk_d;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getC_ser_no(){
		return this.c_ser_no;
	}

	public String getS_ser_no(){
		return this.s_ser_no;
	}

	public String getP_cnt(){
		return this.p_cnt;
	}

	public String getEcnt_a_nm(){
		return this.ecnt_a_nm;
	}

	public String getEcnt_b_nm(){
		return this.ecnt_b_nm;
	}

	public String getSect_a_nm(){
		return this.sect_a_nm;
	}

	public String getSect_b_nm(){
		return this.sect_b_nm;
	}

	public String getSect_c_nm(){
		return this.sect_c_nm;
	}

	public String getRemk_a(){
		return this.remk_a;
	}

	public String getRemk_b(){
		return this.remk_b;
	}

	public String getRemk_c(){
		return this.remk_c;
	}

	public String getRemk_d(){
		return this.remk_d;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.issu_dt = Util.checkString(cstmt.getString(9));
		this.c_ser_no = Util.checkString(cstmt.getString(10));
		this.s_ser_no = Util.checkString(cstmt.getString(11));
		this.p_cnt = Util.checkString(cstmt.getString(12));
		this.ecnt_a_nm = Util.checkString(cstmt.getString(13));
		this.ecnt_b_nm = Util.checkString(cstmt.getString(14));
		this.sect_a_nm = Util.checkString(cstmt.getString(15));
		this.sect_b_nm = Util.checkString(cstmt.getString(16));
		this.sect_c_nm = Util.checkString(cstmt.getString(17));
		this.remk_a = Util.checkString(cstmt.getString(18));
		this.remk_b = Util.checkString(cstmt.getString(19));
		this.remk_c = Util.checkString(cstmt.getString(20));
		this.remk_d = Util.checkString(cstmt.getString(21));
		ResultSet rset0 = (ResultSet) cstmt.getObject(22);
		while(rset0.next()){
			SE_QTY_2670_PCURLIST_ARecord rec = new SE_QTY_2670_PCURLIST_ARecord();
			rec.prt_plac_cd = Util.checkString(rset0.getString("prt_plac_cd"));
			rec.prt_plac_nm = Util.checkString(rset0.getString("prt_plac_nm"));
			rec.a_ledt_ecnt_cd = Util.checkString(rset0.getString("a_ledt_ecnt_cd"));
			rec.a_qty = Util.checkString(rset0.getString("a_qty"));
			rec.b_ledt_ecnt_cd = Util.checkString(rset0.getString("b_ledt_ecnt_cd"));
			rec.b_qty = Util.checkString(rset0.getString("b_qty"));
			this.curlist_a.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(23);
		while(rset1.next()){
			SE_QTY_2670_PCURLIST_BRecord rec = new SE_QTY_2670_PCURLIST_BRecord();
			rec.real_prt_plac_cd = Util.checkString(rset1.getString("real_prt_plac_cd"));
			rec.real_prt_plac_nm = Util.checkString(rset1.getString("real_prt_plac_nm"));
			rec.a_pcnt = Util.checkString(rset1.getString("a_pcnt"));
			rec.a_qty = Util.checkString(rset1.getString("a_qty"));
			rec.b_pcnt = Util.checkString(rset1.getString("b_pcnt"));
			rec.b_qty = Util.checkString(rset1.getString("b_qty"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			this.curlist_b.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(24);
		while(rset2.next()){
			SE_QTY_2670_PCURLIST_CRecord rec = new SE_QTY_2670_PCURLIST_CRecord();
			rec.a_prt_plac_cd = Util.checkString(rset2.getString("a_prt_plac_cd"));
			rec.a_prt_plac_nm = Util.checkString(rset2.getString("a_prt_plac_nm"));
			rec.a_pcnt = Util.checkString(rset2.getString("a_pcnt"));
			rec.a_qty = Util.checkString(rset2.getString("a_qty"));
			rec.b_route_prt_plac_cd = Util.checkString(rset2.getString("b_route_prt_plac_cd"));
			rec.b_route_prt_plac_nm = Util.checkString(rset2.getString("b_route_prt_plac_nm"));
			rec.b_qty = Util.checkString(rset2.getString("b_qty"));
			this.curlist_c.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_QTY_2670_PDataSet ds = (SE_QTY_2670_PDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		SE_QTY_2670_PCURLIST_ARecord curlist_aRec = (SE_QTY_2670_PCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_b.size(); i++){
		SE_QTY_2670_PCURLIST_BRecord curlist_bRec = (SE_QTY_2670_PCURLIST_BRecord)ds.curlist_b.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_c.size(); i++){
		SE_QTY_2670_PCURLIST_CRecord curlist_cRec = (SE_QTY_2670_PCURLIST_CRecord)ds.curlist_c.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getIssu_dt()%>
<%= ds.getC_ser_no()%>
<%= ds.getS_ser_no()%>
<%= ds.getP_cnt()%>
<%= ds.getEcnt_a_nm()%>
<%= ds.getEcnt_b_nm()%>
<%= ds.getSect_a_nm()%>
<%= ds.getSect_b_nm()%>
<%= ds.getSect_c_nm()%>
<%= ds.getRemk_a()%>
<%= ds.getRemk_b()%>
<%= ds.getRemk_c()%>
<%= ds.getRemk_d()%>
<%= ds.getCurlist_a()%>
<%= ds.getCurlist_b()%>
<%= ds.getCurlist_c()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_aRec.prt_plac_cd%>
<%= curlist_aRec.prt_plac_nm%>
<%= curlist_aRec.a_ledt_ecnt_cd%>
<%= curlist_aRec.a_qty%>
<%= curlist_aRec.b_ledt_ecnt_cd%>
<%= curlist_aRec.b_qty%>
<%= curlist_bRec.real_prt_plac_cd%>
<%= curlist_bRec.real_prt_plac_nm%>
<%= curlist_bRec.a_pcnt%>
<%= curlist_bRec.a_qty%>
<%= curlist_bRec.b_pcnt%>
<%= curlist_bRec.b_qty%>
<%= curlist_bRec.remk%>
<%= curlist_cRec.a_prt_plac_cd%>
<%= curlist_cRec.a_prt_plac_nm%>
<%= curlist_cRec.a_pcnt%>
<%= curlist_cRec.a_qty%>
<%= curlist_cRec.b_route_prt_plac_cd%>
<%= curlist_cRec.b_route_prt_plac_nm%>
<%= curlist_cRec.b_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 16 10:15:53 KST 2009 */