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


package chosun.ciis.mt.prnpap.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PRNPAP_3200_LDataSet(){}
	public MT_PRNPAP_3200_LDataSet(String errcode, String errmsg){
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
			MT_PRNPAP_3200_LCURLISTRecord rec = new MT_PRNPAP_3200_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.paper_loca_clsf = Util.checkString(rset0.getString("paper_loca_clsf"));
			rec.papcmpy_cd = Util.checkString(rset0.getString("papcmpy_cd"));
			rec.a_rem_qunt_cnt = Util.checkString(rset0.getString("a_rem_qunt_cnt"));
			rec.a_rem_qunt_wgt = Util.checkString(rset0.getString("a_rem_qunt_wgt"));
			rec.a_un_use_roll_cnt = Util.checkString(rset0.getString("a_un_use_roll_cnt"));
			rec.a_roll_wgt = Util.checkString(rset0.getString("a_roll_wgt"));
			rec.b_rem_qunt_cnt = Util.checkString(rset0.getString("b_rem_qunt_cnt"));
			rec.b_rem_qunt_wgt = Util.checkString(rset0.getString("b_rem_qunt_wgt"));
			rec.b_un_use_roll_cnt = Util.checkString(rset0.getString("b_un_use_roll_cnt"));
			rec.b_roll_wgt = Util.checkString(rset0.getString("b_roll_wgt"));
			rec.c_rem_qunt_cnt = Util.checkString(rset0.getString("c_rem_qunt_cnt"));
			rec.c_rem_qunt_wgt = Util.checkString(rset0.getString("c_rem_qunt_wgt"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.c_un_use_roll_cnt = Util.checkString(rset0.getString("c_un_use_roll_cnt"));
			rec.c_roll_wgt = Util.checkString(rset0.getString("c_roll_wgt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_PRNPAP_3200_LCURLIST1Record rec = new MT_PRNPAP_3200_LCURLIST1Record();
			rec.paper_clsf_cd = Util.checkString(rset1.getString("paper_clsf_cd"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.roll_wgt = Util.checkString(rset1.getString("roll_wgt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PRNPAP_3200_LDataSet ds = (MT_PRNPAP_3200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PRNPAP_3200_LCURLISTRecord curlistRec = (MT_PRNPAP_3200_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PRNPAP_3200_LCURLIST1Record curlist1Rec = (MT_PRNPAP_3200_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.fac_clsf%>
<%= curlistRec.paper_loca_clsf%>
<%= curlistRec.papcmpy_cd%>
<%= curlistRec.a_rem_qunt_cnt%>
<%= curlistRec.a_rem_qunt_wgt%>
<%= curlistRec.a_un_use_roll_cnt%>
<%= curlistRec.a_roll_wgt%>
<%= curlistRec.b_rem_qunt_cnt%>
<%= curlistRec.b_rem_qunt_wgt%>
<%= curlistRec.b_un_use_roll_cnt%>
<%= curlistRec.b_roll_wgt%>
<%= curlistRec.c_rem_qunt_cnt%>
<%= curlistRec.c_rem_qunt_wgt%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.issu_dt%>
<%= curlistRec.c_un_use_roll_cnt%>
<%= curlistRec.c_roll_wgt%>
<%= curlist1Rec.paper_clsf_cd%>
<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.roll_wgt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 14:14:13 KST 2009 */