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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1610_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_6 = new ArrayList();
	public ArrayList curlist_5 = new ArrayList();
	public ArrayList curlist_4 = new ArrayList();
	public ArrayList curlist_3 = new ArrayList();
	public ArrayList curlist_2 = new ArrayList();
	public ArrayList curlist_1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String vip_busn_acty_rept;
	public String vip_busn_plan;

	public IS_BUS_1610_SDataSet(){}
	public IS_BUS_1610_SDataSet(String errcode, String errmsg, String vip_busn_acty_rept, String vip_busn_plan){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.vip_busn_acty_rept = vip_busn_acty_rept;
		this.vip_busn_plan = vip_busn_plan;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setVip_busn_acty_rept(String vip_busn_acty_rept){
		this.vip_busn_acty_rept = vip_busn_acty_rept;
	}

	public void setVip_busn_plan(String vip_busn_plan){
		this.vip_busn_plan = vip_busn_plan;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getVip_busn_acty_rept(){
		return this.vip_busn_acty_rept;
	}

	public String getVip_busn_plan(){
		return this.vip_busn_plan;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.vip_busn_acty_rept = Util.checkString(cstmt.getString(9));
		this.vip_busn_plan = Util.checkString(cstmt.getString(10));
		ResultSet rset0 = (ResultSet) cstmt.getObject(12);
		while(rset0.next()){
			IS_BUS_1610_SCURLIST_1Record rec = new IS_BUS_1610_SCURLIST_1Record();
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.tgt_amt = Util.checkString(rset0.getString("tgt_amt"));
			rec.rst_amt = Util.checkString(rset0.getString("rst_amt"));
			rec.dm_rate = Util.checkString(rset0.getString("dm_rate"));
			rec.tgt_amt_1 = Util.checkString(rset0.getString("tgt_amt_1"));
			rec.rst_amt_1 = Util.checkString(rset0.getString("rst_amt_1"));
			rec.dm_rate_1 = Util.checkString(rset0.getString("dm_rate_1"));
			rec.rst_amt_2 = Util.checkString(rset0.getString("rst_amt_2"));
			rec.rst_amt_3 = Util.checkString(rset0.getString("rst_amt_3"));
			rec.tgt_amt_s = Util.checkString(rset0.getString("tgt_amt_s"));
			rec.rst_amt_s = Util.checkString(rset0.getString("rst_amt_s"));
			rec.dm_rate_s = Util.checkString(rset0.getString("dm_rate_s"));
			this.curlist_1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(13);
		while(rset1.next()){
			IS_BUS_1610_SCURLIST_2Record rec = new IS_BUS_1610_SCURLIST_2Record();
			rec.chrg_pers_nm = Util.checkString(rset1.getString("chrg_pers_nm"));
			rec.mi_amt_1 = Util.checkString(rset1.getString("mi_amt_1"));
			rec.mi_amt_2 = Util.checkString(rset1.getString("mi_amt_2"));
			rec.mi_amt_3 = Util.checkString(rset1.getString("mi_amt_3"));
			rec.mi_amt_4 = Util.checkString(rset1.getString("mi_amt_4"));
			rec.np_amt = Util.checkString(rset1.getString("np_amt"));
			rec.t_amt = Util.checkString(rset1.getString("t_amt"));
			this.curlist_2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(14);
		while(rset2.next()){
			IS_BUS_1610_SCURLIST_3Record rec = new IS_BUS_1610_SCURLIST_3Record();
			rec.purc_dlco_nm = Util.checkString(rset2.getString("purc_dlco_nm"));
			rec.jun_amt_2 = Util.checkString(rset2.getString("jun_amt_2"));
			rec.dan_amt_1 = Util.checkString(rset2.getString("dan_amt_1"));
			rec.icr_rate = Util.checkString(rset2.getString("icr_rate"));
			rec.icr_amt = Util.checkString(rset2.getString("icr_amt"));
			this.curlist_3.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(15);
		while(rset3.next()){
			IS_BUS_1610_SCURLIST_4Record rec = new IS_BUS_1610_SCURLIST_4Record();
			rec.purc_dlco_nm = Util.checkString(rset3.getString("purc_dlco_nm"));
			rec.cnt_1 = Util.checkString(rset3.getString("cnt_1"));
			rec.cnt_2 = Util.checkString(rset3.getString("cnt_2"));
			rec.cnt_3 = Util.checkString(rset3.getString("cnt_3"));
			rec.cnt_4 = Util.checkString(rset3.getString("cnt_4"));
			rec.cnt_t = Util.checkString(rset3.getString("cnt_t"));
			rec.per_2 = Util.checkString(rset3.getString("per_2"));
			rec.per_3 = Util.checkString(rset3.getString("per_3"));
			rec.per_4 = Util.checkString(rset3.getString("per_4"));
			rec.minus_3 = Util.checkString(rset3.getString("minus_3"));
			rec.minus_4 = Util.checkString(rset3.getString("minus_4"));
			this.curlist_4.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(16);
		while(rset4.next()){
			IS_BUS_1610_SCURLIST_5Record rec = new IS_BUS_1610_SCURLIST_5Record();
			rec.indt_cd_nm = Util.checkString(rset4.getString("indt_cd_nm"));
			rec.dan_cnt_1 = Util.checkString(rset4.getString("dan_cnt_1"));
			rec.dan_amt_1 = Util.checkString(rset4.getString("dan_amt_1"));
			rec.jun_cnt_2 = Util.checkString(rset4.getString("jun_cnt_2"));
			rec.jun_amt_2 = Util.checkString(rset4.getString("jun_amt_2"));
			rec.incr_rate = Util.checkString(rset4.getString("incr_rate"));
			rec.incr_amt = Util.checkString(rset4.getString("incr_amt"));
			this.curlist_5.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(17);
		while(rset5.next()){
			IS_BUS_1610_SCURLIST_6Record rec = new IS_BUS_1610_SCURLIST_6Record();
			rec.sale_clsf_nm = Util.checkString(rset5.getString("sale_clsf_nm"));
			rec.dm_amt_1 = Util.checkString(rset5.getString("dm_amt_1"));
			this.curlist_6.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BUS_1610_SDataSet ds = (IS_BUS_1610_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_1.size(); i++){
		IS_BUS_1610_SCURLIST_1Record curlist_1Rec = (IS_BUS_1610_SCURLIST_1Record)ds.curlist_1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_2.size(); i++){
		IS_BUS_1610_SCURLIST_2Record curlist_2Rec = (IS_BUS_1610_SCURLIST_2Record)ds.curlist_2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_3.size(); i++){
		IS_BUS_1610_SCURLIST_3Record curlist_3Rec = (IS_BUS_1610_SCURLIST_3Record)ds.curlist_3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_4.size(); i++){
		IS_BUS_1610_SCURLIST_4Record curlist_4Rec = (IS_BUS_1610_SCURLIST_4Record)ds.curlist_4.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_5.size(); i++){
		IS_BUS_1610_SCURLIST_5Record curlist_5Rec = (IS_BUS_1610_SCURLIST_5Record)ds.curlist_5.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_6.size(); i++){
		IS_BUS_1610_SCURLIST_6Record curlist_6Rec = (IS_BUS_1610_SCURLIST_6Record)ds.curlist_6.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getVip_busn_acty_rept()%>
<%= ds.getVip_busn_plan()%>
<%= ds.getCurlist_1()%>
<%= ds.getCurlist_2()%>
<%= ds.getCurlist_3()%>
<%= ds.getCurlist_4()%>
<%= ds.getCurlist_5()%>
<%= ds.getCurlist_6()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_1Rec.chrg_pers_nm%>
<%= curlist_1Rec.tgt_amt%>
<%= curlist_1Rec.rst_amt%>
<%= curlist_1Rec.dm_rate%>
<%= curlist_1Rec.tgt_amt_1%>
<%= curlist_1Rec.rst_amt_1%>
<%= curlist_1Rec.dm_rate_1%>
<%= curlist_1Rec.rst_amt_2%>
<%= curlist_1Rec.rst_amt_3%>
<%= curlist_1Rec.tgt_amt_s%>
<%= curlist_1Rec.rst_amt_s%>
<%= curlist_1Rec.dm_rate_s%>
<%= curlist_2Rec.chrg_pers_nm%>
<%= curlist_2Rec.mi_amt_1%>
<%= curlist_2Rec.mi_amt_2%>
<%= curlist_2Rec.mi_amt_3%>
<%= curlist_2Rec.mi_amt_4%>
<%= curlist_2Rec.np_amt%>
<%= curlist_2Rec.t_amt%>
<%= curlist_3Rec.purc_dlco_nm%>
<%= curlist_3Rec.jun_amt_2%>
<%= curlist_3Rec.dan_amt_1%>
<%= curlist_3Rec.icr_rate%>
<%= curlist_3Rec.icr_amt%>
<%= curlist_4Rec.purc_dlco_nm%>
<%= curlist_4Rec.cnt_1%>
<%= curlist_4Rec.cnt_2%>
<%= curlist_4Rec.cnt_3%>
<%= curlist_4Rec.cnt_4%>
<%= curlist_4Rec.cnt_t%>
<%= curlist_4Rec.per_2%>
<%= curlist_4Rec.per_3%>
<%= curlist_4Rec.per_4%>
<%= curlist_4Rec.minus_3%>
<%= curlist_4Rec.minus_4%>
<%= curlist_5Rec.indt_cd_nm%>
<%= curlist_5Rec.dan_cnt_1%>
<%= curlist_5Rec.dan_amt_1%>
<%= curlist_5Rec.jun_cnt_2%>
<%= curlist_5Rec.jun_amt_2%>
<%= curlist_5Rec.incr_rate%>
<%= curlist_5Rec.incr_amt%>
<%= curlist_6Rec.sale_clsf_nm%>
<%= curlist_6Rec.dm_amt_1%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 19 18:11:56 KST 2012 */