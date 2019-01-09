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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_3010_LCURLIST2Record;
import chosun.ciis.ad.dep.rec.AD_DEP_3010_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_3010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_3010_LDataSet(){}
	public AD_DEP_3010_LDataSet(String errcode, String errmsg){
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
			AD_DEP_3010_LCURLISTRecord rec = new AD_DEP_3010_LCURLISTRecord();
			rec.hndl_clsf = Util.checkString(rset0.getString("hndl_clsf"));
			rec.hndl_clsf_nm = Util.checkString(rset0.getString("hndl_clsf_nm"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.pubc_avg = Util.checkString(rset0.getString("pubc_avg"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.dhon_amt = Util.checkString(rset0.getString("dhon_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.sago_avg = Util.checkString(rset0.getString("sago_avg"));
			rec.sil_rcpm_avg = Util.checkString(rset0.getString("sil_rcpm_avg"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			AD_DEP_3010_LCURLIST2Record rec = new AD_DEP_3010_LCURLIST2Record();
			rec.pubc_yymm = Util.checkString(rset1.getString("pubc_yymm"));
			rec.pubc_amt = Util.checkString(rset1.getString("pubc_amt"));
			rec.rcpm_amt = Util.checkString(rset1.getString("rcpm_amt"));
			rec.pubc_avg = Util.checkString(rset1.getString("pubc_avg"));
			rec.misu_amt = Util.checkString(rset1.getString("misu_amt"));
			rec.dhon_amt = Util.checkString(rset1.getString("dhon_amt"));
			rec.tot_amt = Util.checkString(rset1.getString("tot_amt"));
			rec.sago_avg = Util.checkString(rset1.getString("sago_avg"));
			rec.sil_rcpm_avg = Util.checkString(rset1.getString("sil_rcpm_avg"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_3010_LDataSet ds = (AD_DEP_3010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_3010_LCURLISTRecord curlistRec = (AD_DEP_3010_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_DEP_3010_LCURLIST2Record curlist2Rec = (AD_DEP_3010_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlistRec.hndl_clsf%>
<%= curlistRec.hndl_clsf_nm%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.pubc_avg%>
<%= curlistRec.misu_amt%>
<%= curlistRec.dhon_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.sago_avg%>
<%= curlistRec.sil_rcpm_avg%>
<%= curlist2Rec.pubc_yymm%>
<%= curlist2Rec.pubc_amt%>
<%= curlist2Rec.rcpm_amt%>
<%= curlist2Rec.pubc_avg%>
<%= curlist2Rec.misu_amt%>
<%= curlist2Rec.dhon_amt%>
<%= curlist2Rec.tot_amt%>
<%= curlist2Rec.sago_avg%>
<%= curlist2Rec.sil_rcpm_avg%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 20:42:38 KST 2009 */