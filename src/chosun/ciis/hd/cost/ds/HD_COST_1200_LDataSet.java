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


package chosun.ciis.hd.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.dm.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_1200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_COST_1200_LDataSet(){}
	public HD_COST_1200_LDataSet(String errcode, String errmsg){
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
			HD_COST_1200_LCURLISTRecord rec = new HD_COST_1200_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.card_mang_no = Util.checkString(rset0.getString("card_mang_no"));
			rec.carc_mang_no1 = Util.checkString(rset0.getString("carc_mang_no1"));
			rec.carc_mang_no2 = Util.checkString(rset0.getString("carc_mang_no2"));
			rec.memb_dnmn = Util.checkString(rset0.getString("memb_dnmn"));
			rec.card_no = Util.checkString(rset0.getString("card_no"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.use_pers_emp_no = Util.checkString(rset0.getString("use_pers_emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.mtry_dt = Util.checkString(rset0.getString("mtry_dt"));
			rec.decid_dd = Util.checkString(rset0.getString("decid_dd"));
			rec.decid_bank_cd = Util.checkString(rset0.getString("decid_bank_cd"));
			rec.bank_nm = Util.checkString(rset0.getString("bank_nm"));
			rec.wste_dt = Util.checkString(rset0.getString("wste_dt"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.corp_card_clsf = Util.checkString(rset0.getString("corp_card_clsf"));
			rec.hd_card_type = Util.checkString(rset0.getString("hd_card_type"));
			rec.hd_card_stat = Util.checkString(rset0.getString("hd_card_stat"));
			rec.hd_mang_clsf = Util.checkString(rset0.getString("hd_mang_clsf"));
			rec.hd_mang_dty_nm = Util.checkString(rset0.getString("hd_mang_dty_nm"));
			rec.hd_oil_type = Util.checkString(rset0.getString("hd_oil_type"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_COST_1200_LDataSet ds = (HD_COST_1200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_COST_1200_LCURLISTRecord curlistRec = (HD_COST_1200_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.card_mang_no%>
<%= curlistRec.carc_mang_no1%>
<%= curlistRec.carc_mang_no2%>
<%= curlistRec.memb_dnmn%>
<%= curlistRec.card_no%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.use_pers_emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.issu_dt%>
<%= curlistRec.mtry_dt%>
<%= curlistRec.decid_dd%>
<%= curlistRec.decid_bank_cd%>
<%= curlistRec.bank_nm%>
<%= curlistRec.wste_dt%>
<%= curlistRec.use_yn%>
<%= curlistRec.corp_card_clsf%>
<%= curlistRec.hd_card_type%>
<%= curlistRec.hd_card_stat%>
<%= curlistRec.hd_mang_clsf%>
<%= curlistRec.hd_mang_dty_nm%>
<%= curlistRec.hd_oil_type%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 20 15:29:59 KST 2009 */