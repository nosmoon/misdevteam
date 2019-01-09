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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1250_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String dept_clsf;
	public String cret_frdt;
	public String cret_todt;
	public String cret_stnd;
	public String mngr_nm;
	public String mngr_phon1;
	public String mngr_phon2;
	public String mngr_phon3;
	public String rpt_dt;
	public String pay_frdt;
	public String pay_todt;
	public String tot_cnt;
	public String tot_amt;
	public String rcpt_rpt_idx;

	public TN_LNK_1250_SDataSet(){}
	public TN_LNK_1250_SDataSet(String errcode, String errmsg, String dept_clsf, String cret_frdt, String cret_todt, String cret_stnd, String mngr_nm, String mngr_phon1, String mngr_phon2, String mngr_phon3, String rpt_dt, String pay_frdt, String pay_todt, String tot_cnt, String tot_amt, String rcpt_rpt_idx){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.dept_clsf = dept_clsf;
		this.cret_frdt = cret_frdt;
		this.cret_todt = cret_todt;
		this.cret_stnd = cret_stnd;
		this.mngr_nm = mngr_nm;
		this.mngr_phon1 = mngr_phon1;
		this.mngr_phon2 = mngr_phon2;
		this.mngr_phon3 = mngr_phon3;
		this.rpt_dt = rpt_dt;
		this.pay_frdt = pay_frdt;
		this.pay_todt = pay_todt;
		this.tot_cnt = tot_cnt;
		this.tot_amt = tot_amt;
		this.rcpt_rpt_idx = rcpt_rpt_idx;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setDept_clsf(String dept_clsf){
		this.dept_clsf = dept_clsf;
	}

	public void setCret_frdt(String cret_frdt){
		this.cret_frdt = cret_frdt;
	}

	public void setCret_todt(String cret_todt){
		this.cret_todt = cret_todt;
	}

	public void setCret_stnd(String cret_stnd){
		this.cret_stnd = cret_stnd;
	}

	public void setMngr_nm(String mngr_nm){
		this.mngr_nm = mngr_nm;
	}

	public void setMngr_phon1(String mngr_phon1){
		this.mngr_phon1 = mngr_phon1;
	}

	public void setMngr_phon2(String mngr_phon2){
		this.mngr_phon2 = mngr_phon2;
	}

	public void setMngr_phon3(String mngr_phon3){
		this.mngr_phon3 = mngr_phon3;
	}

	public void setRpt_dt(String rpt_dt){
		this.rpt_dt = rpt_dt;
	}

	public void setPay_frdt(String pay_frdt){
		this.pay_frdt = pay_frdt;
	}

	public void setPay_todt(String pay_todt){
		this.pay_todt = pay_todt;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setRcpt_rpt_idx(String rcpt_rpt_idx){
		this.rcpt_rpt_idx = rcpt_rpt_idx;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getDept_clsf(){
		return this.dept_clsf;
	}

	public String getCret_frdt(){
		return this.cret_frdt;
	}

	public String getCret_todt(){
		return this.cret_todt;
	}

	public String getCret_stnd(){
		return this.cret_stnd;
	}

	public String getMngr_nm(){
		return this.mngr_nm;
	}

	public String getMngr_phon1(){
		return this.mngr_phon1;
	}

	public String getMngr_phon2(){
		return this.mngr_phon2;
	}

	public String getMngr_phon3(){
		return this.mngr_phon3;
	}

	public String getRpt_dt(){
		return this.rpt_dt;
	}

	public String getPay_frdt(){
		return this.pay_frdt;
	}

	public String getPay_todt(){
		return this.pay_todt;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getRcpt_rpt_idx(){
		return this.rcpt_rpt_idx;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.dept_clsf = Util.checkString(cstmt.getString(5));
		this.cret_frdt = Util.checkString(cstmt.getString(6));
		this.cret_todt = Util.checkString(cstmt.getString(7));
		this.cret_stnd = Util.checkString(cstmt.getString(8));
		this.mngr_nm = Util.checkString(cstmt.getString(9));
		this.mngr_phon1 = Util.checkString(cstmt.getString(10));
		this.mngr_phon2 = Util.checkString(cstmt.getString(11));
		this.mngr_phon3 = Util.checkString(cstmt.getString(12));
		this.rpt_dt = Util.checkString(cstmt.getString(13));
		this.pay_frdt = Util.checkString(cstmt.getString(14));
		this.pay_todt = Util.checkString(cstmt.getString(15));
		this.tot_cnt = Util.checkString(cstmt.getString(16));
		this.tot_amt = Util.checkString(cstmt.getString(17));
		this.rcpt_rpt_idx = Util.checkString(cstmt.getString(18));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_1250_SDataSet ds = (TN_LNK_1250_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDept_clsf()%>
<%= ds.getCret_frdt()%>
<%= ds.getCret_todt()%>
<%= ds.getCret_stnd()%>
<%= ds.getMngr_nm()%>
<%= ds.getMngr_phon1()%>
<%= ds.getMngr_phon2()%>
<%= ds.getMngr_phon3()%>
<%= ds.getRpt_dt()%>
<%= ds.getPay_frdt()%>
<%= ds.getPay_todt()%>
<%= ds.getTot_cnt()%>
<%= ds.getTot_amt()%>
<%= ds.getRcpt_rpt_idx()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 30 11:30:30 KST 2016 */