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


package chosun.ciis.is.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1120_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String dept_cd;
	public String dept_nm;
	public String supr_dept_cd;
	public String supr_dept_nm;
	public String hdpt_cd;
	public String erplace_cd;
	public String rslt_dept_cd;
	public String dept_rptv_addr;
	public String step;
	public String tel_no;
	public String fax_no;
	public String srt_seqo;
	public String use_yn;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;

	public IS_BAS_1120_SDataSet(){}
	public IS_BAS_1120_SDataSet(String errcode, String errmsg, String dept_cd, String dept_nm, String supr_dept_cd, String supr_dept_nm, String hdpt_cd, String erplace_cd, String rslt_dept_cd, String dept_rptv_addr, String step, String tel_no, String fax_no, String srt_seqo, String use_yn, String incmg_pers_ip, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.supr_dept_cd = supr_dept_cd;
		this.supr_dept_nm = supr_dept_nm;
		this.hdpt_cd = hdpt_cd;
		this.erplace_cd = erplace_cd;
		this.rslt_dept_cd = rslt_dept_cd;
		this.dept_rptv_addr = dept_rptv_addr;
		this.step = step;
		this.tel_no = tel_no;
		this.fax_no = fax_no;
		this.srt_seqo = srt_seqo;
		this.use_yn = use_yn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setSupr_dept_nm(String supr_dept_nm){
		this.supr_dept_nm = supr_dept_nm;
	}

	public void setHdpt_cd(String hdpt_cd){
		this.hdpt_cd = hdpt_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setRslt_dept_cd(String rslt_dept_cd){
		this.rslt_dept_cd = rslt_dept_cd;
	}

	public void setDept_rptv_addr(String dept_rptv_addr){
		this.dept_rptv_addr = dept_rptv_addr;
	}

	public void setStep(String step){
		this.step = step;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setFax_no(String fax_no){
		this.fax_no = fax_no;
	}

	public void setSrt_seqo(String srt_seqo){
		this.srt_seqo = srt_seqo;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getSupr_dept_nm(){
		return this.supr_dept_nm;
	}

	public String getHdpt_cd(){
		return this.hdpt_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getRslt_dept_cd(){
		return this.rslt_dept_cd;
	}

	public String getDept_rptv_addr(){
		return this.dept_rptv_addr;
	}

	public String getStep(){
		return this.step;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getFax_no(){
		return this.fax_no;
	}

	public String getSrt_seqo(){
		return this.srt_seqo;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dept_cd = Util.checkString(cstmt.getString(5));
		this.dept_nm = Util.checkString(cstmt.getString(6));
		this.supr_dept_cd = Util.checkString(cstmt.getString(7));
		this.supr_dept_nm = Util.checkString(cstmt.getString(8));
		this.hdpt_cd = Util.checkString(cstmt.getString(9));
		this.erplace_cd = Util.checkString(cstmt.getString(10));
		this.rslt_dept_cd = Util.checkString(cstmt.getString(11));
		this.dept_rptv_addr = Util.checkString(cstmt.getString(12));
		this.step = Util.checkString(cstmt.getString(13));
		this.tel_no = Util.checkString(cstmt.getString(14));
		this.fax_no = Util.checkString(cstmt.getString(15));
		this.srt_seqo = Util.checkString(cstmt.getString(16));
		this.use_yn = Util.checkString(cstmt.getString(17));
		this.incmg_pers_ip = Util.checkString(cstmt.getString(18));
		this.incmg_pers = Util.checkString(cstmt.getString(19));
		this.incmg_dt_tm = Util.checkString(cstmt.getString(20));
		this.chg_pers = Util.checkString(cstmt.getString(21));
		this.chg_dt_tm = Util.checkString(cstmt.getString(22));
		ResultSet rset0 = (ResultSet) cstmt.getObject(23);
		while(rset0.next()){
			IS_BAS_1120_SCURLISTRecord rec = new IS_BAS_1120_SCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.chrg_pers_seq = Util.checkString(rset0.getString("chrg_pers_seq"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.chrg_clsf = Util.checkString(rset0.getString("chrg_clsf"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.srt_seqo = Util.checkString(rset0.getString("srt_seqo"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BAS_1120_SDataSet ds = (IS_BAS_1120_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_BAS_1120_SCURLISTRecord curlistRec = (IS_BAS_1120_SCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDept_cd()%>
<%= ds.getDept_nm()%>
<%= ds.getSupr_dept_cd()%>
<%= ds.getSupr_dept_nm()%>
<%= ds.getHdpt_cd()%>
<%= ds.getErplace_cd()%>
<%= ds.getRslt_dept_cd()%>
<%= ds.getDept_rptv_addr()%>
<%= ds.getStep()%>
<%= ds.getTel_no()%>
<%= ds.getFax_no()%>
<%= ds.getSrt_seqo()%>
<%= ds.getUse_yn()%>
<%= ds.getIncmg_pers_ip()%>
<%= ds.getIncmg_pers()%>
<%= ds.getIncmg_dt_tm()%>
<%= ds.getChg_pers()%>
<%= ds.getChg_dt_tm()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.dept_cd%>
<%= curlistRec.chrg_pers_seq%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.chrg_clsf%>
<%= curlistRec.frdt%>
<%= curlistRec.todt%>
<%= curlistRec.srt_seqo%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 14 19:02:59 KST 2012 */