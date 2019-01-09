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


package chosun.ciis.mt.papord.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_5005_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_5005_LDataSet(){}
	public MT_PAPORD_5005_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MT_PAPORD_5005_LCURLIST1Record rec = new MT_PAPORD_5005_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.max_ewh_wgt = Util.checkString(rset0.getString("max_ewh_wgt"));
			rec.std_ewh_roll_a = Util.checkString(rset0.getString("std_ewh_roll_a"));
			rec.std_ewh_wgt_a = Util.checkString(rset0.getString("std_ewh_wgt_a"));
			rec.amss_wgt_a = Util.checkString(rset0.getString("amss_wgt_a"));
			rec.std_ewh_roll_b = Util.checkString(rset0.getString("std_ewh_roll_b"));
			rec.std_ewh_wgt_b = Util.checkString(rset0.getString("std_ewh_wgt_b"));
			rec.amss_wgt_b = Util.checkString(rset0.getString("amss_wgt_b"));
			rec.std_ewh_roll_c = Util.checkString(rset0.getString("std_ewh_roll_c"));
			rec.std_ewh_wgt_c = Util.checkString(rset0.getString("std_ewh_wgt_c"));
			rec.amss_wgt_c = Util.checkString(rset0.getString("amss_wgt_c"));
			rec.roll_cnt_a = Util.checkString(rset0.getString("roll_cnt_a"));
			rec.roll_cnt_b = Util.checkString(rset0.getString("roll_cnt_b"));
			rec.roll_cnt_c = Util.checkString(rset0.getString("roll_cnt_c"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			MT_PAPORD_5005_LCURLIST2Record rec = new MT_PAPORD_5005_LCURLIST2Record();
			rec.papcmpy_cd = Util.checkString(rset1.getString("papcmpy_cd"));
			rec.papcmpy_ratio = Util.checkString(rset1.getString("papcmpy_ratio"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPORD_5005_LDataSet ds = (MT_PAPORD_5005_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPORD_5005_LCURLIST1Record curlist1Rec = (MT_PAPORD_5005_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPORD_5005_LCURLIST2Record curlist2Rec = (MT_PAPORD_5005_LCURLIST2Record)ds.curlist2.get(i);%>
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
<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.max_ewh_wgt%>
<%= curlist1Rec.std_ewh_roll_a%>
<%= curlist1Rec.std_ewh_wgt_a%>
<%= curlist1Rec.amss_wgt_a%>
<%= curlist1Rec.std_ewh_roll_b%>
<%= curlist1Rec.std_ewh_wgt_b%>
<%= curlist1Rec.amss_wgt_b%>
<%= curlist1Rec.std_ewh_roll_c%>
<%= curlist1Rec.std_ewh_wgt_c%>
<%= curlist1Rec.amss_wgt_c%>
<%= curlist2Rec.papcmpy_cd%>
<%= curlist2Rec.papcmpy_ratio%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 17 11:52:14 KST 2009 */