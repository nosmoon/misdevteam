/***************************************************************************************************
* 파일명   : SP_AD_COM_1030_L.java
* 기능     : 업무연락-업무지시답변 조회
* 작성일자 : 2009-01-15
* 작성자   : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.co.job.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.co.job.rec.CO_JOB_1030_LCURLISTRecord;

/**
 * 업무연락-업무지시답변 조회
 */


public class CO_JOB_1030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;

	public CO_JOB_1030_LDataSet(){}
	public CO_JOB_1030_LDataSet(String errcode, String errmsg, long totalcnt){
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
		if(!"".equals(this.errcode)){			return;		}
		this.totalcnt = cstmt.getLong(6);
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			CO_JOB_1030_LCURLISTRecord rec = new CO_JOB_1030_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.cntc_seq = rset0.getInt("cntc_seq");
			rec.answer_seq = rset0.getInt("answer_seq");
			rec.answer_pers = Util.checkString(rset0.getString("answer_pers"));
			rec.answer_cont = Util.checkString(rset0.getString("answer_cont"));
			rec.add_file_nm = Util.checkString(rset0.getString("add_file_nm"));
			rec.answer_dt = Util.checkString(rset0.getString("answer_dt"));
			rec.team_cd = Util.checkString(rset0.getString("team_cd"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_JOB_1030_LDataSet ds = (CO_JOB_1030_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_JOB_1030_LCURLISTRecord curlistRec = (CO_JOB_1030_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.medi_clsf%>
<%= curlistRec.cntc_seq%>
<%= curlistRec.answer_seq%>
<%= curlistRec.answer_pers%>
<%= curlistRec.answer_cont%>
<%= curlistRec.add_file_nm%>
<%= curlistRec.answer_dt%>
<%= curlistRec.team_cd%>
<%= curlistRec.part_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 23 14:11:28 KST 2009 */