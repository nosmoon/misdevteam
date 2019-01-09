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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1121_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_1121_LDataSet(){}
	public FC_ACCT_1121_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_1121_LCURLISTRecord rec = new FC_ACCT_1121_LCURLISTRecord();
			rec.impt_expn_clsf_cd_nm = Util.checkString(rset0.getString("impt_expn_clsf_cd_nm"));
			rec.fund_cd = Util.checkString(rset0.getString("fund_cd"));
			rec.fund_cdnm = Util.checkString(rset0.getString("fund_cdnm"));
			rec.pay_cycl_cd_nm = Util.checkString(rset0.getString("pay_cycl_cd_nm"));
			rec.pay_wkdy_nm = Util.checkString(rset0.getString("pay_wkdy_nm"));
			rec.pay_dd_nm = Util.checkString(rset0.getString("pay_dd_nm"));
			rec.repe_yn_nm = Util.checkString(rset0.getString("repe_yn_nm"));
			rec.repe_cycl = Util.checkString(rset0.getString("repe_cycl"));
			rec.repe_end_yymm = Util.checkString(rset0.getString("repe_end_yymm"));
			rec.repe_dd = Util.checkString(rset0.getString("repe_dd"));
			rec.use_yn_nm = Util.checkString(rset0.getString("use_yn_nm"));
			rec.impt_expn_clsf_cd = Util.checkString(rset0.getString("impt_expn_clsf_cd"));
			rec.pay_cycl_cd = Util.checkString(rset0.getString("pay_cycl_cd"));
			rec.pay_wkdy = Util.checkString(rset0.getString("pay_wkdy"));
			rec.pay_dd = Util.checkString(rset0.getString("pay_dd"));
			rec.pay_dd2 = Util.checkString(rset0.getString("pay_dd2"));
			rec.repe_yn = Util.checkString(rset0.getString("repe_yn"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.use_yn_han = Util.checkString(rset0.getString("use_yn_han"));
			rec.hd_bsdd_afbf_flag = Util.checkString(rset0.getString("hd_bsdd_afbf_flag"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_1121_LDataSet ds = (FC_ACCT_1121_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_1121_LCURLISTRecord curlistRec = (FC_ACCT_1121_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.impt_expn_clsf_cd_nm%>
<%= curlistRec.fund_cd%>
<%= curlistRec.fund_cdnm%>
<%= curlistRec.pay_cycl_cd_nm%>
<%= curlistRec.pay_wkdy_nm%>
<%= curlistRec.pay_dd_nm%>
<%= curlistRec.repe_yn_nm%>
<%= curlistRec.repe_cycl%>
<%= curlistRec.repe_end_yymm%>
<%= curlistRec.repe_dd%>
<%= curlistRec.use_yn_nm%>
<%= curlistRec.impt_expn_clsf_cd%>
<%= curlistRec.pay_cycl_cd%>
<%= curlistRec.pay_wkdy%>
<%= curlistRec.pay_dd%>
<%= curlistRec.pay_dd2%>
<%= curlistRec.repe_yn%>
<%= curlistRec.use_yn%>
<%= curlistRec.use_yn_han%>
<%= curlistRec.hd_bsdd_afbf_flag%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 17:59:19 KST 2009 */