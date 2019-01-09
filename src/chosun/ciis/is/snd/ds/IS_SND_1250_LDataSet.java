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


package chosun.ciis.is.snd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.rec.*;

/**
 * 
 */


public class IS_SND_1250_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String wh_cd;
	public String send_dt;
	public String send_seq;
	public String send_atic_no;
	public String send_atic_nm;
	public String sendclsf;
	public String serv_ref;
	public String cntc_plac;
	public String send_fee;
	public String start_tm;
	public String end_tm;
	public String remk;

	public IS_SND_1250_LDataSet(){}
	public IS_SND_1250_LDataSet(String errcode, String errmsg, String wh_cd, String send_dt, String send_seq, String send_atic_no, String send_atic_nm, String sendclsf, String serv_ref, String cntc_plac, String send_fee, String start_tm, String end_tm, String remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.wh_cd = wh_cd;
		this.send_dt = send_dt;
		this.send_seq = send_seq;
		this.send_atic_no = send_atic_no;
		this.send_atic_nm = send_atic_nm;
		this.sendclsf = sendclsf;
		this.serv_ref = serv_ref;
		this.cntc_plac = cntc_plac;
		this.send_fee = send_fee;
		this.start_tm = start_tm;
		this.end_tm = end_tm;
		this.remk = remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setSend_dt(String send_dt){
		this.send_dt = send_dt;
	}

	public void setSend_seq(String send_seq){
		this.send_seq = send_seq;
	}

	public void setSend_atic_no(String send_atic_no){
		this.send_atic_no = send_atic_no;
	}

	public void setSend_atic_nm(String send_atic_nm){
		this.send_atic_nm = send_atic_nm;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setServ_ref(String serv_ref){
		this.serv_ref = serv_ref;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public void setSend_fee(String send_fee){
		this.send_fee = send_fee;
	}

	public void setStart_tm(String start_tm){
		this.start_tm = start_tm;
	}

	public void setEnd_tm(String end_tm){
		this.end_tm = end_tm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getSend_dt(){
		return this.send_dt;
	}

	public String getSend_seq(){
		return this.send_seq;
	}

	public String getSend_atic_no(){
		return this.send_atic_no;
	}

	public String getSend_atic_nm(){
		return this.send_atic_nm;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getServ_ref(){
		return this.serv_ref;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getSend_fee(){
		return this.send_fee;
	}

	public String getStart_tm(){
		return this.start_tm;
	}

	public String getEnd_tm(){
		return this.end_tm;
	}

	public String getRemk(){
		return this.remk;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.wh_cd = Util.checkString(cstmt.getString(23));
		this.send_dt = Util.checkString(cstmt.getString(24));
		this.send_seq = Util.checkString(cstmt.getString(25));
		this.send_atic_no = Util.checkString(cstmt.getString(26));
		this.send_atic_nm = Util.checkString(cstmt.getString(27));
		this.sendclsf = Util.checkString(cstmt.getString(28));
		this.serv_ref = Util.checkString(cstmt.getString(29));
		this.cntc_plac = Util.checkString(cstmt.getString(30));
		this.send_fee = Util.checkString(cstmt.getString(31));
		this.start_tm = Util.checkString(cstmt.getString(32));
		this.end_tm = Util.checkString(cstmt.getString(33));
		this.remk = Util.checkString(cstmt.getString(34));
		ResultSet rset0 = (ResultSet) cstmt.getObject(35);
		while(rset0.next()){
			IS_SND_1250_LCURLIST1Record rec = new IS_SND_1250_LCURLIST1Record();
			rec.send_cmpy_cd = Util.checkString(rset0.getString("send_cmpy_cd"));
			rec.advcs_cd = Util.checkString(rset0.getString("advcs_cd"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.advt_nm = Util.checkString(rset0.getString("advt_nm"));
			rec.std_cd = Util.checkString(rset0.getString("std_cd"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.scat_dt = Util.checkString(rset0.getString("scat_dt"));
			rec.bnch_qty = Util.checkString(rset0.getString("bnch_qty"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.bnch_qunt = Util.checkString(rset0.getString("bnch_qunt"));
			rec.asnt_dstc_cd = Util.checkString(rset0.getString("asnt_dstc_cd"));
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			rec.purc_dlco_no = Util.checkString(rset0.getString("purc_dlco_no"));
			rec.purc_dlco_nm = Util.checkString(rset0.getString("purc_dlco_nm"));
			rec.dstc_seqo = Util.checkString(rset0.getString("dstc_seqo"));
			rec.cmpy_cd_nm = Util.checkString(rset0.getString("cmpy_cd_nm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.acwr_reg_dt = Util.checkString(rset0.getString("acwr_reg_dt"));
			rec.acwr_reg_seq = Util.checkString(rset0.getString("acwr_reg_seq"));
			rec.purc_reg_dt = Util.checkString(rset0.getString("purc_reg_dt"));
			rec.purc_reg_seq = Util.checkString(rset0.getString("purc_reg_seq"));
			rec.group_cnt = Util.checkString(rset0.getString("group_cnt"));
			rec.group_order = Util.checkString(rset0.getString("group_order"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_SND_1250_LDataSet ds = (IS_SND_1250_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_SND_1250_LCURLIST1Record curlist1Rec = (IS_SND_1250_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getWh_cd()%>
<%= ds.getSend_dt()%>
<%= ds.getSend_seq()%>
<%= ds.getSend_atic_no()%>
<%= ds.getSend_atic_nm()%>
<%= ds.getSendclsf()%>
<%= ds.getServ_ref()%>
<%= ds.getCntc_plac()%>
<%= ds.getSend_fee()%>
<%= ds.getStart_tm()%>
<%= ds.getEnd_tm()%>
<%= ds.getRemk()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.send_cmpy_cd%>
<%= curlist1Rec.advcs_cd%>
<%= curlist1Rec.advcs_cd_nm%>
<%= curlist1Rec.advt_nm%>
<%= curlist1Rec.std_cd%>
<%= curlist1Rec.std_cd_nm%>
<%= curlist1Rec.scat_dt%>
<%= curlist1Rec.bnch_qty%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.bnch_qunt%>
<%= curlist1Rec.asnt_dstc_cd%>
<%= curlist1Rec.asnt_dstc_cd_nm%>
<%= curlist1Rec.purc_dlco_no%>
<%= curlist1Rec.purc_dlco_nm%>
<%= curlist1Rec.dstc_seqo%>
<%= curlist1Rec.cmpy_cd_nm%>
<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.sub_dept_cd%>
<%= curlist1Rec.chrg_pers%>
<%= curlist1Rec.chrg_pers_nm%>
<%= curlist1Rec.acwr_reg_dt%>
<%= curlist1Rec.acwr_reg_seq%>
<%= curlist1Rec.purc_reg_dt%>
<%= curlist1Rec.purc_reg_seq%>
<%= curlist1Rec.group_cnt%>
<%= curlist1Rec.group_order%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 11 10:26:37 KST 2013 */