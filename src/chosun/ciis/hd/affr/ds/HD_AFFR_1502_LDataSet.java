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


public class HD_AFFR_1502_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_1502_LDataSet(){}
	public HD_AFFR_1502_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_AFFR_1502_LCURLIST1Record rec = new HD_AFFR_1502_LCURLIST1Record();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.scl_exps_clsf = Util.checkString(rset0.getString("scl_exps_clsf"));
			rec.frdt = Util.checkString(rset0.getString("frdt"));
			rec.todt = Util.checkString(rset0.getString("todt"));
			rec.fix_rate_clsf = Util.checkString(rset0.getString("fix_rate_clsf"));
			rec.pay_ratio_emp = Util.checkString(rset0.getString("pay_ratio_emp"));
			rec.pay_ratio_ofcr = Util.checkString(rset0.getString("pay_ratio_ofcr"));
			rec.pay_amt = Util.checkString(rset0.getString("pay_amt"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_AFFR_1502_LCURLIST2Record rec = new HD_AFFR_1502_LCURLIST2Record();
			rec.occr_dt = Util.checkString(rset1.getString("occr_dt"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.scl_exps_clsf = Util.checkString(rset1.getString("scl_exps_clsf"));
			rec.qq = Util.checkString(rset1.getString("qq"));
			rec.bgn_mmdd = Util.checkString(rset1.getString("bgn_mmdd"));
			rec.end_mmdd = Util.checkString(rset1.getString("end_mmdd"));
			rec.incmg_pers_ipadd = Util.checkString(rset1.getString("incmg_pers_ipadd"));
			rec.incmg_pers = Util.checkString(rset1.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset1.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset1.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset1.getString("chg_dt_tm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_1502_LDataSet ds = (HD_AFFR_1502_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		HD_AFFR_1502_LCURLIST1Record curlist1Rec = (HD_AFFR_1502_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		HD_AFFR_1502_LCURLIST2Record curlist2Rec = (HD_AFFR_1502_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.occr_dt%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.scl_exps_clsf%>
<%= curlist1Rec.frdt%>
<%= curlist1Rec.todt%>
<%= curlist1Rec.fix_rate_clsf%>
<%= curlist1Rec.pay_ratio_emp%>
<%= curlist1Rec.pay_ratio_ofcr%>
<%= curlist1Rec.pay_amt%>
<%= curlist1Rec.incmg_pers_ipadd%>
<%= curlist1Rec.incmg_pers%>
<%= curlist1Rec.incmg_dt_tm%>
<%= curlist1Rec.chg_pers%>
<%= curlist1Rec.chg_dt_tm%>
<%= curlist2Rec.occr_dt%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.scl_exps_clsf%>
<%= curlist2Rec.qq%>
<%= curlist2Rec.bgn_mmdd%>
<%= curlist2Rec.end_mmdd%>
<%= curlist2Rec.incmg_pers_ipadd%>
<%= curlist2Rec.incmg_pers%>
<%= curlist2Rec.incmg_dt_tm%>
<%= curlist2Rec.chg_pers%>
<%= curlist2Rec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 10:18:14 KST 2009 */