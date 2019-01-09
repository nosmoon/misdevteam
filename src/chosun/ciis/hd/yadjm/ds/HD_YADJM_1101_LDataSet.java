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


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_1101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_YADJM_1101_LDataSet(){}
	public HD_YADJM_1101_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_YADJM_1101_LCURLIST1Record rec = new HD_YADJM_1101_LCURLIST1Record();
			rec.tot_saly_sctn_1 = Util.checkString(rset0.getString("tot_saly_sctn_1"));
			rec.tot_saly_sctn_2 = Util.checkString(rset0.getString("tot_saly_sctn_2"));
			rec.labr_incm_add_amt = Util.checkString(rset0.getString("labr_incm_add_amt"));
			rec.labr_incm_dedu_amt = Util.checkString(rset0.getString("labr_incm_dedu_amt"));
			rec.labr_incm_dduc_rate = Util.checkString(rset0.getString("labr_incm_dduc_rate"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_YADJM_1101_LCURLIST2Record rec = new HD_YADJM_1101_LCURLIST2Record();
			rec.txn_std_sctn_1 = Util.checkString(rset1.getString("txn_std_sctn_1"));
			rec.txn_std_sctn_2 = Util.checkString(rset1.getString("txn_std_sctn_2"));
			rec.rate = Util.checkString(rset1.getString("rate"));
			rec.dedu_amt = Util.checkString(rset1.getString("dedu_amt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_1101_LDataSet ds = (HD_YADJM_1101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_YADJM_1101_LCURLIST1Record curlist1Rec = (HD_YADJM_1101_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_YADJM_1101_LCURLIST2Record curlist2Rec = (HD_YADJM_1101_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.tot_saly_sctn_1%>
<%= curlist1Rec.tot_saly_sctn_2%>
<%= curlist1Rec.labr_incm_add_amt%>
<%= curlist1Rec.labr_incm_dedu_amt%>
<%= curlist1Rec.labr_incm_dduc_rate%>
<%= curlist1Rec.seq%>
<%= curlist2Rec.txn_std_sctn_1%>
<%= curlist2Rec.txn_std_sctn_2%>
<%= curlist2Rec.rate%>
<%= curlist2Rec.dedu_amt%>
<%= curlist2Rec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 10:22:51 KST 2009 */