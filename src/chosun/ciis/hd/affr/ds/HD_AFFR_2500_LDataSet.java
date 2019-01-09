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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_2500_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_2500_LDataSet(){}
	public HD_AFFR_2500_LDataSet(String errcode, String errmsg){
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
			HD_AFFR_2500_LCURLISTRecord rec = new HD_AFFR_2500_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.chk_dt = Util.checkString(rset0.getString("chk_dt"));
			rec.chk_yy = Util.checkString(rset0.getString("chk_yy"));
			rec.chk_hosp_nm = Util.checkString(rset0.getString("chk_hosp_nm"));
			rec.kidny = Util.checkString(rset0.getString("kidny"));
			rec.wgt = Util.checkString(rset0.getString("wgt"));
			rec.std_wgt = Util.checkString(rset0.getString("std_wgt"));
			rec.fatt_prov = Util.checkString(rset0.getString("fatt_prov"));
			rec.blod_pres_high = Util.checkString(rset0.getString("blod_pres_high"));
			rec.blod_pres_low = Util.checkString(rset0.getString("blod_pres_low"));
			rec.puls = Util.checkString(rset0.getString("puls"));
			rec.nkd_sght_lft = Util.checkString(rset0.getString("nkd_sght_lft"));
			rec.nkd_sght_rht = Util.checkString(rset0.getString("nkd_sght_rht"));
			rec.rvis_sght_lft = Util.checkString(rset0.getString("rvis_sght_lft"));
			rec.rvis_sght_rht = Util.checkString(rset0.getString("rvis_sght_rht"));
			rec.spc_idea = Util.checkString(rset0.getString("spc_idea"));
			rec.cmpt_idea_ill_nm_cd_1 = Util.checkString(rset0.getString("cmpt_idea_ill_nm_cd_1"));
			rec.cmpt_idea_remk_1 = Util.checkString(rset0.getString("cmpt_idea_remk_1"));
			rec.cmpt_idea_ill_nm_cd_2 = Util.checkString(rset0.getString("cmpt_idea_ill_nm_cd_2"));
			rec.cmpt_idea_remk_2 = Util.checkString(rset0.getString("cmpt_idea_remk_2"));
			rec.cmpt_idea_ill_nm_cd_3 = Util.checkString(rset0.getString("cmpt_idea_ill_nm_cd_3"));
			rec.cmpt_idea_remk_3 = Util.checkString(rset0.getString("cmpt_idea_remk_3"));
			rec.cmpt_idea_ill_nm_cd_4 = Util.checkString(rset0.getString("cmpt_idea_ill_nm_cd_4"));
			rec.cmpt_idea_remk_4 = Util.checkString(rset0.getString("cmpt_idea_remk_4"));
			rec.cmpt_idea_ill_nm_cd_5 = Util.checkString(rset0.getString("cmpt_idea_ill_nm_cd_5"));
			rec.cmpt_idea_remk_5 = Util.checkString(rset0.getString("cmpt_idea_remk_5"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.blod_sug = Util.checkString(rset0.getString("blod_sug"));
			rec.a_blod_hep = Util.checkString(rset0.getString("a_blod_hep"));
			rec.b_blod_hep = Util.checkString(rset0.getString("b_blod_hep"));
			rec.adv_cont = Util.checkString(rset0.getString("adv_cont"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_2500_LDataSet ds = (HD_AFFR_2500_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_2500_LCURLISTRecord curlistRec = (HD_AFFR_2500_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.emp_no%>
<%= curlistRec.flnm%>
<%= curlistRec.prn%>
<%= curlistRec.chk_dt%>
<%= curlistRec.chk_yy%>
<%= curlistRec.chk_hosp_nm%>
<%= curlistRec.kidny%>
<%= curlistRec.wgt%>
<%= curlistRec.std_wgt%>
<%= curlistRec.fatt_prov%>
<%= curlistRec.blod_pres_high%>
<%= curlistRec.blod_pres_low%>
<%= curlistRec.puls%>
<%= curlistRec.nkd_sght_lft%>
<%= curlistRec.nkd_sght_rht%>
<%= curlistRec.rvis_sght_lft%>
<%= curlistRec.rvis_sght_rht%>
<%= curlistRec.spc_idea%>
<%= curlistRec.cmpt_idea_ill_nm_cd_1%>
<%= curlistRec.cmpt_idea_remk_1%>
<%= curlistRec.cmpt_idea_ill_nm_cd_2%>
<%= curlistRec.cmpt_idea_remk_2%>
<%= curlistRec.cmpt_idea_ill_nm_cd_3%>
<%= curlistRec.cmpt_idea_remk_3%>
<%= curlistRec.cmpt_idea_ill_nm_cd_4%>
<%= curlistRec.cmpt_idea_remk_4%>
<%= curlistRec.cmpt_idea_ill_nm_cd_5%>
<%= curlistRec.cmpt_idea_remk_5%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.blod_sug%>
<%= curlistRec.a_blod_hep%>
<%= curlistRec.b_blod_hep%>
<%= curlistRec.adv_cont%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 18 14:32:19 KST 2013 */