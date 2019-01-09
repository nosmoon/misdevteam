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


package chosun.ciis.mt.etcpc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_2300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_2300_LDataSet(){}
	public MT_ETCPC_2300_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_ETCPC_2300_LCURLIST1Record rec = new MT_ETCPC_2300_LCURLIST1Record();
			rec.swlics_no = Util.checkString(rset0.getString("swlics_no"));
			rec.swver = Util.checkString(rset0.getString("swver"));
			rec.lisno = Util.checkString(rset0.getString("lisno"));
			rec.swlics_cnt = Util.checkString(rset0.getString("swlics_cnt"));
			rec.swestb_dt = Util.checkString(rset0.getString("swestb_dt"));
			rec.swclsf = Util.checkString(rset0.getString("swclsf"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.mchn_mang_no = Util.checkString(rset0.getString("mchn_mang_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_ETCPC_2300_LCURLIST2Record rec = new MT_ETCPC_2300_LCURLIST2Record();
			rec.swver = Util.checkString(rset1.getString("swver"));
			rec.scnt = Util.checkString(rset1.getString("scnt"));
			rec.swlics_cnt = Util.checkString(rset1.getString("swlics_cnt"));
			rec.swclsf = Util.checkString(rset1.getString("swclsf"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			MT_ETCPC_2300_LCURLIST3Record rec = new MT_ETCPC_2300_LCURLIST3Record();
			rec.swnm = Util.checkString(rset2.getString("swnm"));
			rec.swmang_no = Util.checkString(rset2.getString("swmang_no"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCPC_2300_LDataSet ds = (MT_ETCPC_2300_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_2300_LCURLIST1Record curlist1Rec = (MT_ETCPC_2300_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_ETCPC_2300_LCURLIST2Record curlist2Rec = (MT_ETCPC_2300_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_ETCPC_2300_LCURLIST3Record curlist3Rec = (MT_ETCPC_2300_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.swlics_no%>
<%= curlist1Rec.swver%>
<%= curlist1Rec.lisno%>
<%= curlist1Rec.swlics_cnt%>
<%= curlist1Rec.swestb_dt%>
<%= curlist1Rec.swclsf%>
<%= curlist1Rec.remk%>
<%= curlist1Rec.mchn_mang_no%>
<%= curlist1Rec.seq%>
<%= curlist2Rec.swver%>
<%= curlist2Rec.scnt%>
<%= curlist2Rec.swlics_cnt%>
<%= curlist2Rec.swclsf%>
<%= curlist3Rec.swnm%>
<%= curlist3Rec.swmang_no%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 11:20:32 KST 2009 */