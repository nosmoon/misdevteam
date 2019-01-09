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


package chosun.ciis.is.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.dm.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_DEP_1610_LDataSet(){}
	public IS_DEP_1610_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			IS_DEP_1610_LCURLISTRecord rec = new IS_DEP_1610_LCURLISTRecord();
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.slip_clsf = Util.checkString(rset0.getString("slip_clsf"));
			rec.slip_clsf_nm = Util.checkString(rset0.getString("slip_clsf_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_nm2 = Util.checkString(rset0.getString("dlco_nm2"));
			rec.mang_chrg_pers = Util.checkString(rset0.getString("mang_chrg_pers"));
			rec.per_rcpm_slip_no = Util.checkString(rset0.getString("per_rcpm_slip_no"));
			rec.yesu_amt = Util.checkString(rset0.getString("yesu_amt"));
			rec.subseq = Util.checkString(rset0.getString("subseq"));
			rec.yesu_exch_amt = Util.checkString(rset0.getString("yesu_exch_amt"));
			rec.sunsu_amt = Util.checkString(rset0.getString("sunsu_amt"));
			rec.sunsu_exch_amt = Util.checkString(rset0.getString("sunsu_exch_amt"));
			rec.gita_exch_amt = Util.checkString(rset0.getString("gita_exch_amt"));
			rec.gita_amt = Util.checkString(rset0.getString("gita_amt"));
			rec.bsamt = Util.checkString(rset0.getString("bsamt"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			IS_DEP_1610_LCURLIST2Record rec = new IS_DEP_1610_LCURLIST2Record();
			rec.slip_clsf_nm = Util.checkString(rset1.getString("slip_clsf_nm"));
			rec.tot_yesu_amt = Util.checkString(rset1.getString("tot_yesu_amt"));
			rec.tot_yesu_exch_amt = Util.checkString(rset1.getString("tot_yesu_exch_amt"));
			rec.tot_sunsu_amt = Util.checkString(rset1.getString("tot_sunsu_amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_DEP_1610_LDataSet ds = (IS_DEP_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_DEP_1610_LCURLISTRecord curlistRec = (IS_DEP_1610_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		IS_DEP_1610_LCURLIST2Record curlist2Rec = (IS_DEP_1610_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.slip_clsf%>
<%= curlistRec.slip_clsf_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_nm2%>
<%= curlistRec.mang_chrg_pers%>
<%= curlistRec.per_rcpm_slip_no%>
<%= curlistRec.yesu_amt%>
<%= curlistRec.subseq%>
<%= curlistRec.yesu_exch_amt%>
<%= curlistRec.sunsu_amt%>
<%= curlistRec.sunsu_exch_amt%>
<%= curlistRec.gita_exch_amt%>
<%= curlistRec.gita_amt%>
<%= curlistRec.bsamt%>
<%= curlistRec.misu_amt%>
<%= curlist2Rec.slip_clsf_nm%>
<%= curlist2Rec.tot_yesu_amt%>
<%= curlist2Rec.tot_yesu_exch_amt%>
<%= curlist2Rec.tot_sunsu_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 22 10:41:42 KST 2012 */