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


package chosun.ciis.co.semuro.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.semuro.dm.*;
import chosun.ciis.co.semuro.rec.*;

/**
 * 
 */


public class CO_SEMURO_1400_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_SEMURO_1400_LDataSet(){}
	public CO_SEMURO_1400_LDataSet(String errcode, String errmsg){
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
			CO_SEMURO_1400_LCURLISTRecord rec = new CO_SEMURO_1400_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.semuro_no = Util.checkString(rset0.getString("semuro_no"));
			rec.tax_stmt_clsf = Util.checkString(rset0.getString("tax_stmt_clsf"));
			rec.rmsg_pers_semuro_id = Util.checkString(rset0.getString("rmsg_pers_semuro_id"));
			rec.send_pers_id = Util.checkString(rset0.getString("send_pers_id"));
			rec.send_pers_eps_no = Util.checkString(rset0.getString("send_pers_eps_no"));
			rec.send_pers_presi_flnm = Util.checkString(rset0.getString("send_pers_presi_flnm"));
			rec.send_pers_firmnm = Util.checkString(rset0.getString("send_pers_firmnm"));
			rec.send_pers_addr = Util.checkString(rset0.getString("send_pers_addr"));
			rec.send_pers_bizcond = Util.checkString(rset0.getString("send_pers_bizcond"));
			rec.send_pers_indt = Util.checkString(rset0.getString("send_pers_indt"));
			rec.send_pers_email = Util.checkString(rset0.getString("send_pers_email"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.tot_suply_amt = Util.checkString(rset0.getString("tot_suply_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			rec.tot_tax_amt = Util.checkString(rset0.getString("tot_tax_amt"));
			rec.cash = Util.checkString(rset0.getString("cash"));
			rec.note = Util.checkString(rset0.getString("note"));
			rec.chqe = Util.checkString(rset0.getString("chqe"));
			rec.trust_unrcp_amt = Util.checkString(rset0.getString("trust_unrcp_amt"));
			rec.rcpt_clam_yn = Util.checkString(rset0.getString("rcpt_clam_yn"));
			rec.stat_clsf = Util.checkString(rset0.getString("stat_clsf"));
			rec.stat_clsf_dt_tm = Util.checkString(rset0.getString("stat_clsf_dt_tm"));
			rec.get_yn			= Util.checkString(rset0.getString("get_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_SEMURO_1400_LDataSet ds = (CO_SEMURO_1400_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_SEMURO_1400_LCURLISTRecord curlistRec = (CO_SEMURO_1400_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.semuro_no%>
<%= curlistRec.tax_stmt_clsf%>
<%= curlistRec.rmsg_pers_semuro_id%>
<%= curlistRec.send_pers_id%>
<%= curlistRec.send_pers_eps_no%>
<%= curlistRec.send_pers_presi_flnm%>
<%= curlistRec.send_pers_firmnm%>
<%= curlistRec.send_pers_addr%>
<%= curlistRec.send_pers_bizcond%>
<%= curlistRec.send_pers_indt%>
<%= curlistRec.send_pers_email%>
<%= curlistRec.issu_dt%>
<%= curlistRec.tot_suply_amt%>
<%= curlistRec.tot_amt%>
<%= curlistRec.tot_tax_amt%>
<%= curlistRec.cash%>
<%= curlistRec.note%>
<%= curlistRec.chqe%>
<%= curlistRec.trust_unrcp_amt%>
<%= curlistRec.rcpt_clam_yn%>
<%= curlistRec.stat_clsf%>
<%= curlistRec.stat_clsf_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 16 10:17:36 KST 2009 */