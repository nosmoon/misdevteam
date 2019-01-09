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


public class SP_SUP_1020_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dt;
	public String dlco_no;
	public String dlco_nm;
	public String vist_bgn_hh;
	public String vist_bgn_mm;
	public String vist_end_hh;
	public String vist_end_mm;
	public String vist_obj_clsf;
	public String vist_clsf;
	public String callcoms;
	public String job_cont;

	public SP_SUP_1020_SDataSet(){}
	public SP_SUP_1020_SDataSet(String errcode, String errmsg, String dt, String dlco_no, String dlco_nm, String vist_bgn_hh, String vist_bgn_mm, String vist_end_hh, String vist_end_mm, String vist_obj_clsf, String vist_clsf, String callcoms, String job_cont){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dt = dt;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.vist_bgn_hh = vist_bgn_hh;
		this.vist_bgn_mm = vist_bgn_mm;
		this.vist_end_hh = vist_end_hh;
		this.vist_end_mm = vist_end_mm;
		this.vist_obj_clsf = vist_obj_clsf;
		this.vist_clsf = vist_clsf;
		this.callcoms = callcoms;
		this.job_cont = job_cont;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDt(String dt){
		this.dt = dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setVist_bgn_hh(String vist_bgn_hh){
		this.vist_bgn_hh = vist_bgn_hh;
	}

	public void setVist_bgn_mm(String vist_bgn_mm){
		this.vist_bgn_mm = vist_bgn_mm;
	}

	public void setVist_end_hh(String vist_end_hh){
		this.vist_end_hh = vist_end_hh;
	}

	public void setVist_end_mm(String vist_end_mm){
		this.vist_end_mm = vist_end_mm;
	}

	public void setVist_obj_clsf(String vist_obj_clsf){
		this.vist_obj_clsf = vist_obj_clsf;
	}

	public void setVist_clsf(String vist_clsf){
		this.vist_clsf = vist_clsf;
	}

	public void setCallcoms(String callcoms){
		this.callcoms = callcoms;
	}

	public void setJob_cont(String job_cont){
		this.job_cont = job_cont;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDt(){
		return this.dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getVist_bgn_hh(){
		return this.vist_bgn_hh;
	}

	public String getVist_bgn_mm(){
		return this.vist_bgn_mm;
	}

	public String getVist_end_hh(){
		return this.vist_end_hh;
	}

	public String getVist_end_mm(){
		return this.vist_end_mm;
	}

	public String getVist_obj_clsf(){
		return this.vist_obj_clsf;
	}

	public String getVist_clsf(){
		return this.vist_clsf;
	}

	public String getCallcoms(){
		return this.callcoms;
	}

	public String getJob_cont(){
		return this.job_cont;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dt = Util.checkString(cstmt.getString(5));
		this.dlco_no = Util.checkString(cstmt.getString(6));
		this.dlco_nm = Util.checkString(cstmt.getString(7));
		this.vist_bgn_hh = Util.checkString(cstmt.getString(8));
		this.vist_bgn_mm = Util.checkString(cstmt.getString(9));
		this.vist_end_hh = Util.checkString(cstmt.getString(10));
		this.vist_end_mm = Util.checkString(cstmt.getString(11));
		this.vist_obj_clsf = Util.checkString(cstmt.getString(12));
		this.vist_clsf = Util.checkString(cstmt.getString(13));
		this.callcoms = Util.checkString(cstmt.getString(14));
		this.job_cont = Util.checkString(cstmt.getString(15));
		ResultSet rset0 = (ResultSet) cstmt.getObject(16);
		while(rset0.next()){
			SP_SUP_1020_SCURLIST1Record rec = new SP_SUP_1020_SCURLIST1Record();
			rec.step = Util.checkString(rset0.getString("step"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.up_cd = Util.checkString(rset0.getString("up_cd"));
			rec.sort = Util.checkString(rset0.getString("sort"));
			rec.job_clas = Util.checkString(rset0.getString("job_clas"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SP_SUP_1020_SDataSet ds = (SP_SUP_1020_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		SP_SUP_1020_SCURLIST1Record curlist1Rec = (SP_SUP_1020_SCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDt()%>
<%= ds.getDlco_no()%>
<%= ds.getDlco_nm()%>
<%= ds.getVist_bgn_hh()%>
<%= ds.getVist_bgn_mm()%>
<%= ds.getVist_end_hh()%>
<%= ds.getVist_end_mm()%>
<%= ds.getVist_obj_clsf()%>
<%= ds.getVist_clsf()%>
<%= ds.getCallcoms()%>
<%= ds.getJob_cont()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.step%>
<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.up_cd%>
<%= curlist1Rec.sort%>
<%= curlist1Rec.job_clas%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 18 21:43:01 KST 2012 */