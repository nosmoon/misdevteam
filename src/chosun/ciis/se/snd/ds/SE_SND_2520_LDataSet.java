/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2520_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SND_2520_LDataSet(){}
	public SE_SND_2520_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			SE_SND_2520_LCURLISTRecord rec = new SE_SND_2520_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.reg_dt = Util.checkString(rset0.getString("reg_dt"));
			rec.reg_seq = Util.checkString(rset0.getString("reg_seq"));
			rec.ptcr_seq = Util.checkString(rset0.getString("ptcr_seq"));
			rec.route_clsf = Util.checkString(rset0.getString("route_clsf"));
			rec.tran_uprc_cd = Util.checkString(rset0.getString("tran_uprc_cd"));
			rec.tran_uprc_route_nm = Util.checkString(rset0.getString("tran_uprc_route_nm"));
			rec.prt_plac_cd = Util.checkString(rset0.getString("prt_plac_cd"));
			rec.tran_uprc_clas = Util.checkString(rset0.getString("tran_uprc_clas"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.tran_cmpy_cd = Util.checkString(rset0.getString("tran_cmpy_cd"));
			rec.tran_cmpy_nm = Util.checkString(rset0.getString("tran_cmpy_nm"));
			rec.std_tran_uprc = Util.checkString(rset0.getString("std_tran_uprc"));
			rec.pay_tran_uprc = Util.checkString(rset0.getString("pay_tran_uprc"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			rec.pay_mthd_clsf = Util.checkString(rset0.getString("pay_mthd_clsf"));
			rec.stmt_clsf = Util.checkString(rset0.getString("stmt_clsf"));
			rec.stmt_no = Util.checkString(rset0.getString("stmt_no"));
			rec.elec_stmt_yn = Util.checkString(rset0.getString("elec_stmt_yn"));
			rec.elec_stmt_id = Util.checkString(rset0.getString("elec_stmt_id"));
			rec.stmt_id = Util.checkString(rset0.getString("stmt_id"));
			rec.rcpt_clsf = Util.checkString(rset0.getString("rcpt_clsf"));
			rec.stmt_dt = Util.checkString(rset0.getString("stmt_dt"));
			rec.work_dds = Util.checkString(rset0.getString("work_dds"));
			rec.pay_tran_cost = Util.checkString(rset0.getString("pay_tran_cost"));
			rec.vat = Util.checkString(rset0.getString("vat"));
			rec.eps_no = Util.checkString(rset0.getString("eps_no"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.zip = Util.checkString(rset0.getString("zip"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtls_addr = Util.checkString(rset0.getString("dtls_addr"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.bank_cd = Util.checkString(rset0.getString("bank_cd"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			//rec.grp_assctn_yn = Util.checkString(rset0.getString("grp_assctn_yn"));
			this.curlist.add(rec);
		} 
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SND_2520_LDataSet ds = (SE_SND_2520_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_SND_2520_LCURLISTRecord curlistRec = (SE_SND_2520_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.reg_dt%>
<%= curlistRec.reg_seq%>
<%= curlistRec.ptcr_seq%>
<%= curlistRec.route_clsf%>
<%= curlistRec.tran_uprc_cd%>
<%= curlistRec.tran_uprc_route_nm%>
<%= curlistRec.prt_plac_cd%>
<%= curlistRec.tran_uprc_clas%>
<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.tran_cmpy_cd%>
<%= curlistRec.tran_cmpy_nm%>
<%= curlistRec.std_tran_uprc%>
<%= curlistRec.pay_tran_uprc%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_clsf%>
<%= curlistRec.pay_mthd_clsf%>
<%= curlistRec.stmt_clsf%>
<%= curlistRec.stmt_no%>
<%= curlistRec.elec_stmt_yn%>
<%= curlistRec.elec_stmt_id%>
<%= curlistRec.stmt_id%>
<%= curlistRec.rcpt_clsf%>
<%= curlistRec.stmt_dt%>
<%= curlistRec.work_dds%>
<%= curlistRec.pay_tran_cost%>
<%= curlistRec.vat%>
<%= curlistRec.eps_no%>
<%= curlistRec.acct_no%>
<%= curlistRec.zip%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
<%= curlistRec.tel_no%>
<%= curlistRec.car_no%>
<%= curlistRec.bank_cd%>
<%= curlistRec.sect_nm%>
<%= curlistRec.remk%>
<%= curlistRec.grp_assctn_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 04 20:32:25 KST 2009 */