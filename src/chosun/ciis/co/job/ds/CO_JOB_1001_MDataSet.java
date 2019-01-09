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


package chosun.ciis.co.job.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.co.job.rec.CO_JOB_1001_MCURLISTRecord;

/**
 * 
 */


public class CO_JOB_1001_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String job_clsf;

	public CO_JOB_1001_MDataSet(){}
	public CO_JOB_1001_MDataSet(String errcode, String errmsg, String job_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.job_clsf = job_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.job_clsf = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			CO_JOB_1001_MCURLISTRecord rec = new CO_JOB_1001_MCURLISTRecord();
			rec.orga_cd = Util.checkString(rset0.getString("orga_cd"));
			rec.orga_nm = Util.checkString(rset0.getString("orga_nm"));
			rec.supr_orga_cd = Util.checkString(rset0.getString("supr_orga_cd"));
			rec.depth = Util.checkString(rset0.getString("depth"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_JOB_1001_MDataSet ds = (CO_JOB_1001_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_JOB_1001_MCURLISTRecord curlistRec = (CO_JOB_1001_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getJob_clsf()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.orga_cd%>
<%= curlistRec.orga_nm%>
<%= curlistRec.supr_orga_cd%>
<%= curlistRec.depth%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 09:44:36 KST 2009 */