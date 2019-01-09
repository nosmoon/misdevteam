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


package chosun.ciis.mt.etcimpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcimpt.dm.*;
import chosun.ciis.mt.etcimpt.rec.*;

/**
 * 
 */


public class MT_ETCIMPT_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCIMPT_1210_LDataSet(){}
	public MT_ETCIMPT_1210_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			MT_ETCIMPT_1210_LCURLIST1Record rec = new MT_ETCIMPT_1210_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.yy = Util.checkString(rset0.getString("yy"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.leas_clsf = Util.checkString(rset0.getString("leas_clsf"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.cost_case_titl = Util.checkString(rset0.getString("cost_case_titl"));
			rec.real_ship_dt = Util.checkString(rset0.getString("real_ship_dt"));
			rec.ship_port = Util.checkString(rset0.getString("ship_port"));
			rec.ariv_port = Util.checkString(rset0.getString("ariv_port"));
			rec.entr_dt = Util.checkString(rset0.getString("entr_dt"));
			rec.ewh_amt = Util.checkString(rset0.getString("ewh_amt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_ETCIMPT_1210_LCURLIST2Record rec = new MT_ETCIMPT_1210_LCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset1.getString("cd_abrv_nm"));
			rec.impt_occr_cost = Util.checkString(rset1.getString("impt_occr_cost"));
			rec.vat_clsf = Util.checkString(rset1.getString("vat_clsf"));
			rec.remk = Util.checkString(rset1.getString("remk"));
			rec.yy = Util.checkString(rset1.getString("yy"));
			rec.seq = Util.checkString(rset1.getString("seq"));
			rec.leas_clsf = Util.checkString(rset1.getString("leas_clsf"));
			rec.sub_seq = Util.checkString(rset1.getString("sub_seq"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCIMPT_1210_LDataSet ds = (MT_ETCIMPT_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCIMPT_1210_LCURLIST1Record curlist1Rec = (MT_ETCIMPT_1210_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_ETCIMPT_1210_LCURLIST2Record curlist2Rec = (MT_ETCIMPT_1210_LCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.yy%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.leas_clsf%>
<%= curlist1Rec.sub_seq%>
<%= curlist1Rec.cost_case_titl%>
<%= curlist1Rec.real_ship_dt%>
<%= curlist1Rec.ship_port%>
<%= curlist1Rec.ariv_port%>
<%= curlist1Rec.entr_dt%>
<%= curlist1Rec.ewh_amt%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cd_abrv_nm%>
<%= curlist2Rec.impt_occr_cost%>
<%= curlist2Rec.vat_clsf%>
<%= curlist2Rec.remk%>
<%= curlist2Rec.yy%>
<%= curlist2Rec.seq%>
<%= curlist2Rec.leas_clsf%>
<%= curlist2Rec.sub_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 04 18:33:51 KST 2009 */