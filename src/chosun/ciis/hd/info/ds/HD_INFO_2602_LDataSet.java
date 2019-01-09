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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2602_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_2602_LDataSet(){}
	public HD_INFO_2602_LDataSet(String errcode, String errmsg){
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
			HD_INFO_2602_LCURLIST1Record rec = new HD_INFO_2602_LCURLIST1Record();
			rec.rptv_movm_nm = Util.checkString(rset0.getString("rptv_movm_nm"));
			rec.vip_serv_job = Util.checkString(rset0.getString("vip_serv_job"));
			rec.cntr_cnclus_dt = Util.checkString(rset0.getString("cntr_cnclus_dt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			HD_INFO_2602_LCURLIST2Record rec = new HD_INFO_2602_LCURLIST2Record();
			rec.aply_yymm = Util.checkString(rset1.getString("aply_yymm"));
			rec.emp_cnt = Util.checkString(rset1.getString("emp_cnt"));
			rec.cmpy_nm = Util.checkString(rset1.getString("cmpy_nm"));
			rec.mm_servcost = Util.checkString(rset1.getString("mm_servcost"));
			rec.one_pers_servcost = Util.checkString(rset1.getString("one_pers_servcost"));
			rec.spc_matt = Util.checkString(rset1.getString("spc_matt"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_2602_LDataSet ds = (HD_INFO_2602_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_INFO_2602_LCURLIST1Record curlist1Rec = (HD_INFO_2602_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_INFO_2602_LCURLIST2Record curlist2Rec = (HD_INFO_2602_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.rptv_movm_nm%>
<%= curlist1Rec.vip_serv_job%>
<%= curlist1Rec.cntr_cnclus_dt%>
<%= curlist2Rec.aply_yymm%>
<%= curlist2Rec.emp_cnt%>
<%= curlist2Rec.cmpy_nm%>
<%= curlist2Rec.mm_servcost%>
<%= curlist2Rec.one_pers_servcost%>
<%= curlist2Rec.spc_matt%>
<%= curlist2Rec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 15:34:37 KST 2009 */