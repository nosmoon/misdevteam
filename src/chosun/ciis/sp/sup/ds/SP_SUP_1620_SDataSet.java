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


package chosun.ciis.sp.sup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.rec.*;

/**
 * 
 */


public class SP_SUP_1620_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String seq;
	public String req_clsf;
	public String titl;
	public String make_pers_nm;
	public String make_dt;
	public String cont;
	public String proc_pers;
	public String proc_dt;
	public String proc_stat;
	public String proc_cont;

	public SP_SUP_1620_SDataSet(){}
	public SP_SUP_1620_SDataSet(String errcode, String errmsg, String seq, String req_clsf, String titl, String make_pers_nm, String make_dt, String cont, String proc_pers, String proc_dt, String proc_stat, String proc_cont){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.seq = seq;
		this.req_clsf = req_clsf;
		this.titl = titl;
		this.make_pers_nm = make_pers_nm;
		this.make_dt = make_dt;
		this.cont = cont;
		this.proc_pers = proc_pers;
		this.proc_dt = proc_dt;
		this.proc_stat = proc_stat;
		this.proc_cont = proc_cont;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setReq_clsf(String req_clsf){
		this.req_clsf = req_clsf;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setMake_pers_nm(String make_pers_nm){
		this.make_pers_nm = make_pers_nm;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setProc_pers(String proc_pers){
		this.proc_pers = proc_pers;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_cont(String proc_cont){
		this.proc_cont = proc_cont;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getReq_clsf(){
		return this.req_clsf;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getMake_pers_nm(){
		return this.make_pers_nm;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getCont(){
		return this.cont;
	}

	public String getProc_pers(){
		return this.proc_pers;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_cont(){
		return this.proc_cont;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.seq = Util.checkString(cstmt.getString(5));
		this.req_clsf = Util.checkString(cstmt.getString(6));
		this.titl = Util.checkString(cstmt.getString(7));
		this.make_pers_nm = Util.checkString(cstmt.getString(8));
		this.make_dt = Util.checkString(cstmt.getString(9));
		this.cont = Util.checkString(cstmt.getString(10));
		this.proc_pers = Util.checkString(cstmt.getString(11));
		this.proc_dt = Util.checkString(cstmt.getString(12));
		this.proc_stat = Util.checkString(cstmt.getString(13));
		this.proc_cont = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SUP_1620_SDataSet ds = (SP_SUP_1620_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSeq()%>
<%= ds.getReq_clsf()%>
<%= ds.getTitl()%>
<%= ds.getMake_pers_nm()%>
<%= ds.getMake_dt()%>
<%= ds.getCont()%>
<%= ds.getProc_pers()%>
<%= ds.getProc_dt()%>
<%= ds.getProc_stat()%>
<%= ds.getProc_cont()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 05 19:27:29 KST 2012 */