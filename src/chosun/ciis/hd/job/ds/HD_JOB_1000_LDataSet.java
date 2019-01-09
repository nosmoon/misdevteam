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


package chosun.ciis.hd.job.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.job.dm.*;
import chosun.ciis.hd.job.rec.*;

/**
 * 
 */


public class HD_JOB_1000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_JOB_1000_LDataSet(){}
	public HD_JOB_1000_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_JOB_1000_LCURLISTRecord rec = new HD_JOB_1000_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.chrg_job = Util.checkString(rset0.getString("chrg_job"));
			rec.dtls_job = Util.checkString(rset0.getString("dtls_job"));
			rec.aprv_stat = Util.checkString(rset0.getString("aprv_stat"));
			rec.aprv_stat_yn = Util.checkString(rset0.getString("aprv_stat_yn"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.cur_jobnon_cd = Util.checkString(rset0.getString("cur_jobnon_cd"));
			rec.cur_jobnon_nm = Util.checkString(rset0.getString("cur_jobnon_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_JOB_1000_LDataSet ds = (HD_JOB_1000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_JOB_1000_LCURLISTRecord curlistRec = (HD_JOB_1000_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.frdt%>
<%= curlistRec.todt%>
<%= curlistRec.part_cd%>
<%= curlistRec.part_nm%>
<%= curlistRec.chrg_job%>
<%= curlistRec.dtls_job%>
<%= curlistRec.aprv_stat%>
<%= curlistRec.aprv_stat_yn%>
<%= curlistRec.seq%>
<%= curlistRec.cur_jobnon_cd%>
<%= curlistRec.cur_jobnon_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 17:31:28 KST 2009 */