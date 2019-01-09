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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1203_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1203_LDataSet(){}
	public AS_ASET_1203_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AS_ASET_1203_LCURLIST1Record rec = new AS_ASET_1203_LCURLIST1Record();
			rec.chg_dt = Util.checkString(rset0.getString("chg_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AS_ASET_1203_LCURLIST2Record rec = new AS_ASET_1203_LCURLIST2Record();
			rec.aset_no = Util.checkString(rset1.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset1.getString("aset_nm"));
			rec.chg_amt = Util.checkString(rset1.getString("chg_amt"));
			rec.chg_vat_amt = Util.checkString(rset1.getString("chg_vat_amt"));
			rec.hsty_cnt = Util.checkString(rset1.getString("hsty_cnt"));
			rec.hsty_dlco_ern = Util.checkString(rset1.getString("hsty_dlco_ern"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.dtls_remk = Util.checkString(rset1.getString("dtls_remk"));
			rec.cmpy_cd = Util.checkString(rset1.getString("cmpy_cd"));
			rec.chg_clsf = Util.checkString(rset1.getString("chg_clsf"));
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.occr_seq = Util.checkString(rset1.getString("occr_seq"));
			rec.sub_seq = Util.checkString(rset1.getString("sub_seq"));
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASET_1203_LDataSet ds = (AS_ASET_1203_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AS_ASET_1203_LCURLIST1Record curlist1Rec = (AS_ASET_1203_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AS_ASET_1203_LCURLIST2Record curlist2Rec = (AS_ASET_1203_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.chg_dt%>
<%= curlist1Rec.remk%>
<%= curlist2Rec.aset_no%>
<%= curlist2Rec.aset_nm%>
<%= curlist2Rec.chg_amt%>
<%= curlist2Rec.chg_vat_amt%>
<%= curlist2Rec.hsty_cnt%>
<%= curlist2Rec.hsty_dlco_ern%>
<%= curlist2Rec.dlco_nm%>
<%= curlist2Rec.dtls_remk%>
<%= curlist2Rec.cmpy_cd%>
<%= curlist2Rec.chg_clsf%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.occr_seq%>
<%= curlist2Rec.sub_seq%>
<%= curlist2Rec.dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 10:27:15 KST 2009 */