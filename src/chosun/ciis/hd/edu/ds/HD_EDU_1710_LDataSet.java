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


package chosun.ciis.hd.edu.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.dm.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_1710_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EDU_1710_LDataSet(){}
	public HD_EDU_1710_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			HD_EDU_1710_LCURLISTRecord rec = new HD_EDU_1710_LCURLISTRecord();
			rec.chrg_job = Util.checkString(rset0.getString("chrg_job"));
			rec.edu_frdt = Util.checkString(rset0.getString("edu_frdt"));
			rec.edu_todt = Util.checkString(rset0.getString("edu_todt"));
			rec.edu_nm = Util.checkString(rset0.getString("edu_nm"));
			rec.edu_instt = Util.checkString(rset0.getString("edu_instt"));
			rec.edu_tm_clsf_nm = Util.checkString(rset0.getString("edu_tm_clsf_nm"));
			rec.edu_fr_tm = Util.checkString(rset0.getString("edu_fr_tm"));
			rec.edu_to_tm = Util.checkString(rset0.getString("edu_to_tm"));
			rec.edu_cost = Util.checkString(rset0.getString("edu_cost"));
			rec.edu_sply_cost = Util.checkString(rset0.getString("edu_sply_cost"));
			rec.course_nm = Util.checkString(rset0.getString("course_nm"));
			rec.lang_nm = Util.checkString(rset0.getString("lang_nm"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			System.out.println("1212121212");
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_TRIP_1010_LDataSet ds = (HD_TRIP_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_TRIP_1010_LCURLISTRecord curlistRec = (HD_TRIP_1010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.proc_stat_nm%>
<%= curlistRec.busi_trip_frdt%>
<%= curlistRec.busi_trip_todt%>
<%= curlistRec.busi_trip_clsf_nm%>
<%= curlistRec.busi_trip_purp%>
<%= curlistRec.medi_cd%>
<%= curlistRec.dtls_medi_cd%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.proc_stat%>
<%= curlistRec.emp_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 01 11:14:18 KST 2017 */