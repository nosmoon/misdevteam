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


package chosun.ciis.ad.bas.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.bas.rec.AD_BAS_1610_LCURLISTRecord;

/**
 * 
 */


public class AD_BAS_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_1610_LDataSet(){}
	public AD_BAS_1610_LDataSet(String errcode, String errmsg){
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
			AD_BAS_1610_LCURLISTRecord rec = new AD_BAS_1610_LCURLISTRecord();
			rec.basi_dt = Util.checkString(rset0.getString("basi_dt"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.mang_mortg_surp_amt = Util.checkString(rset0.getString("mang_mortg_surp_amt"));
			rec.busn_mortg_surp_amt = Util.checkString(rset0.getString("busn_mortg_surp_amt"));
			rec.mchrg_pers_nm = Util.checkString(rset0.getString("mchrg_pers_nm"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.make_dt = Util.checkString(rset0.getString("make_dt"));
			rec.diary_titl = Util.checkString(rset0.getString("diary_titl"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.make_pers = Util.checkString(rset0.getString("make_pers"));
			rec.make_pers_nm = Util.checkString(rset0.getString("make_pers_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1610_LDataSet ds = (AD_BAS_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1610_LCURLISTRecord curlistRec = (AD_BAS_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.basi_dt%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.mang_mortg_surp_amt%>
<%= curlistRec.busn_mortg_surp_amt%>
<%= curlistRec.mchrg_pers_nm%>
<%= curlistRec.slcrg_pers_nm%>
<%= curlistRec.make_dt%>
<%= curlistRec.diary_titl%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.make_pers%>
<%= curlistRec.make_pers_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 13:17:17 KST 2009 */