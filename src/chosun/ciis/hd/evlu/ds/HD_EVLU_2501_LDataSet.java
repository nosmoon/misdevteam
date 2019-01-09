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


package chosun.ciis.hd.evlu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_2501_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String pgm_id;
	public String pgm_nm;
	public String pgm_url;
	public String job_clsf;
	public String annc_link_clsf;

	public HD_EVLU_2501_LDataSet(){}
	public HD_EVLU_2501_LDataSet(String errcode, String errmsg, String pgm_id, String pgm_nm, String pgm_url, String job_clsf, String annc_link_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.pgm_id = pgm_id;
		this.pgm_nm = pgm_nm;
		this.pgm_url = pgm_url;
		this.job_clsf = job_clsf;
		this.annc_link_clsf = annc_link_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPgm_id(String pgm_id){
		this.pgm_id = pgm_id;
	}

	public void setPgm_nm(String pgm_nm){
		this.pgm_nm = pgm_nm;
	}

	public void setPgm_url(String pgm_url){
		this.pgm_url = pgm_url;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setAnnc_link_clsf(String annc_link_clsf){
		this.annc_link_clsf = annc_link_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPgm_id(){
		return this.pgm_id;
	}

	public String getPgm_nm(){
		return this.pgm_nm;
	}

	public String getPgm_url(){
		return this.pgm_url;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getAnnc_link_clsf(){
		return this.annc_link_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.pgm_id = Util.checkString(cstmt.getString(7));
		this.pgm_nm = Util.checkString(cstmt.getString(8));
		this.pgm_url = Util.checkString(cstmt.getString(9));
		this.job_clsf = Util.checkString(cstmt.getString(10));
		this.annc_link_clsf = Util.checkString(cstmt.getString(11));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			HD_EVLU_2501_LCURLISTRecord rec = new HD_EVLU_2501_LCURLISTRecord();
			rec.sel_chk = Util.checkString(rset0.getString("sel_chk"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.db_status = Util.checkString(rset0.getString("db_status"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.ptph_no = Util.checkString(rset0.getString("ptph_no"));
			rec.email_id = Util.checkString(rset0.getString("email_id"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EVLU_2501_LDataSet ds = (HD_EVLU_2501_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EVLU_2501_LCURLISTRecord curlistRec = (HD_EVLU_2501_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPgm_id()%>
<%= ds.getPgm_nm()%>
<%= ds.getPgm_url()%>
<%= ds.getJob_clsf()%>
<%= ds.getAnnc_link_clsf()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.sel_chk%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.db_status%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.ptph_no%>
<%= curlistRec.email_id%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 16:14:44 KST 2015 */