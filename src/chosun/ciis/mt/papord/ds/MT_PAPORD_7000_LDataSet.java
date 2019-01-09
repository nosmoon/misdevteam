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


public class MT_PAPORD_7000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPORD_7000_LDataSet(){}
	public MT_PAPORD_7000_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			MT_PAPORD_7000_LCURLIST1Record rec = new MT_PAPORD_7000_LCURLIST1Record();
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			MT_PAPORD_7000_LCURLIST2Record rec = new MT_PAPORD_7000_LCURLIST2Record();
			rec.ordr_roll = Util.checkString(rset1.getString("ordr_roll"));
			rec.ordr_wgt = Util.checkString(rset1.getString("ordr_wgt"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			MT_PAPORD_7000_LCURLIST3Record rec = new MT_PAPORD_7000_LCURLIST3Record();
			rec.fac_clsf = Util.checkString(rset2.getString("fac_clsf"));
			rec.matr_nm = Util.checkString(rset2.getString("matr_nm"));
			rec.roll_wgt = Util.checkString(rset2.getString("roll_wgt"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPORD_7000_LDataSet ds = (MT_PAPORD_7000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_PAPORD_7000_LCURLIST1Record curlist1Rec = (MT_PAPORD_7000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		MT_PAPORD_7000_LCURLIST2Record curlist2Rec = (MT_PAPORD_7000_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		MT_PAPORD_7000_LCURLIST3Record curlist3Rec = (MT_PAPORD_7000_LCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.issu_dt%>
<%= curlist2Rec.ordr_roll%>
<%= curlist2Rec.ordr_wgt%>
<%= curlist3Rec.fac_clsf%>
<%= curlist3Rec.matr_nm%>
<%= curlist3Rec.roll_wgt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 25 10:58:57 KST 2009 */