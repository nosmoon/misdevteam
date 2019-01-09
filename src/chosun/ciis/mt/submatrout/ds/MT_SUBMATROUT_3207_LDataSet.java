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


package chosun.ciis.mt.submatrout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_3207_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_3207_LDataSet(){}
	public MT_SUBMATROUT_3207_LDataSet(String errcode, String errmsg){
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
			MT_SUBMATROUT_3207_LCURLISTRecord rec = new MT_SUBMATROUT_3207_LCURLISTRecord();
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_per = Util.checkString(rset0.getString("dlco_per"));
			rec.dlco_telno = Util.checkString(rset0.getString("dlco_telno"));
			rec.chrg_pers_email = Util.checkString(rset0.getString("chrg_pers_email"));
			rec.dlco_faxno = Util.checkString(rset0.getString("dlco_faxno"));
			rec.ordr_per_nm = Util.checkString(rset0.getString("ordr_per_nm"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.ordr_per_email = Util.checkString(rset0.getString("ordr_per_email"));
			rec.ordr_telno = Util.checkString(rset0.getString("ordr_telno"));
			rec.ordr_faxno = Util.checkString(rset0.getString("ordr_faxno"));
			rec.ordr_hp = Util.checkString(rset0.getString("ordr_hp"));
			rec.ordr_dt = Util.checkString(rset0.getString("ordr_dt"));
			rec.dlvs_dt = Util.checkString(rset0.getString("dlvs_dt"));
			rec.fac_cd_nm = Util.checkString(rset0.getString("fac_cd_nm"));
			rec.amt_pay_mthd = Util.checkString(rset0.getString("amt_pay_mthd"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_SUBMATROUT_3207_LCURLIST1Record rec = new MT_SUBMATROUT_3207_LCURLIST1Record();
			rec.num = Util.checkString(rset1.getString("num"));
			rec.item_nm = Util.checkString(rset1.getString("item_nm"));
			rec.std_modl = Util.checkString(rset1.getString("std_modl"));
			rec.ordr_qunt = Util.checkString(rset1.getString("ordr_qunt"));
			rec.ordr_uprc = Util.checkString(rset1.getString("ordr_uprc"));
			rec.ordr_amt = Util.checkString(rset1.getString("ordr_amt"));
			rec.remk_ar = Util.checkString(rset1.getString("remk_ar"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_3207_LDataSet ds = (MT_SUBMATROUT_3207_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_3207_LCURLISTRecord curlistRec = (MT_SUBMATROUT_3207_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_SUBMATROUT_3207_LCURLIST1Record curlist1Rec = (MT_SUBMATROUT_3207_LCURLIST1Record)ds.curlist1.get(i);%>
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

<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_per%>
<%= curlistRec.dlco_telno%>
<%= curlistRec.chrg_pers_email%>
<%= curlistRec.dlco_faxno%>
<%= curlistRec.ordr_per_nm%>
<%= curlistRec.dept_nm%>
<%= curlistRec.ordr_per_email%>
<%= curlistRec.ordr_telno%>
<%= curlistRec.ordr_faxno%>
<%= curlistRec.ordr_hp%>
<%= curlistRec.ordr_dt%>
<%= curlistRec.dlvs_dt%>
<%= curlistRec.fac_cd_nm%>
<%= curlistRec.amt_pay_mthd%>
<%= curlistRec.remk%>
<%= curlist1Rec.num%>
<%= curlist1Rec.item_nm%>
<%= curlist1Rec.std_modl%>
<%= curlist1Rec.ordr_qunt%>
<%= curlist1Rec.ordr_uprc%>
<%= curlist1Rec.ordr_amt%>
<%= curlist1Rec.remk_ar%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 25 14:07:22 KST 2009 */