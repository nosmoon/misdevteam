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

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.job.dm.*;
import chosun.ciis.co.job.rec.*;

/**
 * 
 */


public class CO_JOB_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public CO_JOB_1010_LDataSet(){}
	public CO_JOB_1010_LDataSet(String errcode, String errmsg, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.totalcnt = cstmt.getLong(11);
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			CO_JOB_1010_LCURLISTRecord rec = new CO_JOB_1010_LCURLISTRecord();
			rec.wr_clsf = Util.checkString(rset0.getString("wr_clsf"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.answer_yn = Util.checkString(rset0.getString("answer_yn"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.make_pers = Util.checkString(rset0.getString("make_pers"));
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.cntc_seq = Util.checkString(rset0.getString("cntc_seq"));
			rec.rmsg_cnt = Util.checkString(rset0.getString("rmsg_cnt"));
			rec.answer_cnt = Util.checkString(rset0.getString("answer_cnt"));
			rec.add_file_nm = Util.checkString(rset0.getString("add_file_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_JOB_1010_LDataSet ds = (CO_JOB_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_JOB_1010_LCURLISTRecord curlistRec = (CO_JOB_1010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTotalcnt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.wr_clsf%>
<%= curlistRec.titl%>
<%= curlistRec.answer_yn%>
<%= curlistRec.make_dt%>
<%= curlistRec.make_pers%>
<%= curlistRec.job_clsf%>
<%= curlistRec.cntc_seq%>
<%= curlistRec.rmsg_cnt%>
<%= curlistRec.answer_cnt%>
<%= curlistRec.add_file_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 15 18:01:43 KST 2012 */