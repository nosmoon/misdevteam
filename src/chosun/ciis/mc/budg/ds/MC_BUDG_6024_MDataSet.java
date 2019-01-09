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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6024_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_srch_job_clsf_cd;
	public String xx_exec_no;

	public MC_BUDG_6024_MDataSet(){}
	public MC_BUDG_6024_MDataSet(String errcode, String errmsg, String xx_srch_job_clsf_cd, String xx_exec_no){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_srch_job_clsf_cd = xx_srch_job_clsf_cd;
		this.xx_exec_no = xx_exec_no;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_srch_job_clsf_cd(String xx_srch_job_clsf_cd){
		this.xx_srch_job_clsf_cd = xx_srch_job_clsf_cd;
	}

	public void setXx_exec_no(String xx_exec_no){
		this.xx_exec_no = xx_exec_no;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_srch_job_clsf_cd(){
		return this.xx_srch_job_clsf_cd;
	}

	public String getXx_exec_no(){
		return this.xx_exec_no;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MC_BUDG_6024_MCURLIST1Record rec = new MC_BUDG_6024_MCURLIST1Record();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MC_BUDG_6024_MCURLIST2Record rec = new MC_BUDG_6024_MCURLIST2Record();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.curlist2.add(rec);
		}
		this.xx_srch_job_clsf_cd = Util.checkString(cstmt.getString(7));
		this.xx_exec_no = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6024_MDataSet ds = (MC_BUDG_6024_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MC_BUDG_6024_MCURLIST1Record curlist1Rec = (MC_BUDG_6024_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MC_BUDG_6024_MCURLIST2Record curlist2Rec = (MC_BUDG_6024_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getXx_srch_job_clsf_cd()%>
<%= ds.getXx_exec_no()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd_nm%>
<%= curlist1Rec.cd%>
<%= curlist2Rec.cd_nm%>
<%= curlist2Rec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 16 19:17:54 KST 2012 */