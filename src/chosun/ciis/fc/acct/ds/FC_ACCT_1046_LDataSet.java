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


public class FC_ACCT_1046_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_1046_LDataSet(){}
	public FC_ACCT_1046_LDataSet(String errcode, String errmsg){
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
			FC_ACCT_1046_LCURLISTRecord rec = new FC_ACCT_1046_LCURLISTRecord();
			rec.insd_acct_cd = Util.checkString(rset0.getString("insd_acct_cd"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acct_subj_nm = Util.checkString(rset0.getString("acct_subj_nm"));
			rec.acct_abrv_nm = Util.checkString(rset0.getString("acct_abrv_nm"));
			rec.slip_incmg_exne = Util.checkString(rset0.getString("slip_incmg_exne"));
			rec.drcr_occr_clsf = Util.checkString(rset0.getString("drcr_occr_clsf"));
			rec.drcr_bal_clsf = Util.checkString(rset0.getString("drcr_bal_clsf"));
			rec.tbs_exne = Util.checkString(rset0.getString("tbs_exne"));
			rec.balsht_exne = Util.checkString(rset0.getString("balsht_exne"));
			rec.pfls_stat_exne = Util.checkString(rset0.getString("pfls_stat_exne"));
			rec.setoff_yn = Util.checkString(rset0.getString("setoff_yn"));
			rec.supr_acct_cd = Util.checkString(rset0.getString("supr_acct_cd"));
			rec.vip_aset_debt_exne = Util.checkString(rset0.getString("vip_aset_debt_exne"));
			rec.acct_levl = Util.checkString(rset0.getString("acct_levl"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.use_dt = Util.checkString(rset0.getString("use_dt"));
			rec.wste_dt = Util.checkString(rset0.getString("wste_dt"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.acct_nm_styl = Util.checkString(rset0.getString("acct_nm_styl"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_1046_LDataSet ds = (FC_ACCT_1046_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_1046_LCURLISTRecord curlistRec = (FC_ACCT_1046_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.insd_acct_cd%>
<%= curlistRec.acct_cd%>
<%= curlistRec.acct_subj_nm%>
<%= curlistRec.acct_abrv_nm%>
<%= curlistRec.slip_incmg_exne%>
<%= curlistRec.drcr_occr_clsf%>
<%= curlistRec.drcr_bal_clsf%>
<%= curlistRec.tbs_exne%>
<%= curlistRec.balsht_exne%>
<%= curlistRec.pfls_stat_exne%>
<%= curlistRec.setoff_yn%>
<%= curlistRec.supr_acct_cd%>
<%= curlistRec.vip_aset_debt_exne%>
<%= curlistRec.acct_levl%>
<%= curlistRec.use_yn%>
<%= curlistRec.use_dt%>
<%= curlistRec.wste_dt%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.acct_nm_styl%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 17:37:53 KST 2009 */