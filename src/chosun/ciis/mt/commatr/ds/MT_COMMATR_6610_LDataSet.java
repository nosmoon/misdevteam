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


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;

import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_6610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
 
	public MT_COMMATR_6610_LDataSet(){}
	public MT_COMMATR_6610_LDataSet(String errcode, String errmsg){
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
			MT_COMMATR_6610_LCURLISTRecord rec = new MT_COMMATR_6610_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.ink = Util.checkString(rset0.getString("ink"));
			rec.a_01 = Util.checkString(rset0.getString("a_01"));
			rec.a_02 = Util.checkString(rset0.getString("a_02"));
			rec.a_03 = Util.checkString(rset0.getString("a_03"));
			rec.a_04 = Util.checkString(rset0.getString("a_04"));
			rec.a_05 = Util.checkString(rset0.getString("a_05"));
			rec.a_06 = Util.checkString(rset0.getString("a_06"));
			rec.a_07 = Util.checkString(rset0.getString("a_07"));
			rec.a_08 = Util.checkString(rset0.getString("a_08"));
			rec.a_09 = Util.checkString(rset0.getString("a_09"));
			rec.a_10 = Util.checkString(rset0.getString("a_10"));
			rec.a_11 = Util.checkString(rset0.getString("a_11"));
			rec.a_12 = Util.checkString(rset0.getString("a_12"));
			this.curlist.add(rec);
		}
		
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			MT_COMMATR_6610_LCURLIST1Record rec = new MT_COMMATR_6610_LCURLIST1Record();
			rec.a_01 = Util.checkString(rset1.getString("a_01"));
			rec.a_02 = Util.checkString(rset1.getString("a_02"));
			rec.a_03 = Util.checkString(rset1.getString("a_03"));
			rec.a_04 = Util.checkString(rset1.getString("a_04"));
			rec.a_05 = Util.checkString(rset1.getString("a_05"));
			rec.a_06 = Util.checkString(rset1.getString("a_06"));
			rec.a_07 = Util.checkString(rset1.getString("a_07"));
			rec.a_08 = Util.checkString(rset1.getString("a_08"));
			rec.a_09 = Util.checkString(rset1.getString("a_09"));
			rec.a_10 = Util.checkString(rset1.getString("a_10"));
			rec.a_11 = Util.checkString(rset1.getString("a_11"));
			rec.a_12 = Util.checkString(rset1.getString("a_12"));
			rec.a_avg = Util.checkString(rset1.getString("a_avg"));
			rec.fac_clsf = Util.checkString(rset1.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset1.getString("fac_clsf_nm"));
			rec.ink = Util.checkString(rset1.getString("ink"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_6610_LDataSet ds = (MT_COMMATR_6610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_6610_LCURLISTRecord curlistRec = (MT_COMMATR_6610_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.ink%>
<%= curlistRec.a_01%>
<%= curlistRec.a_02%>
<%= curlistRec.a_03%>
<%= curlistRec.a_04%>
<%= curlistRec.a_05%>
<%= curlistRec.a_06%>
<%= curlistRec.a_08%>
<%= curlistRec.a_09%>
<%= curlistRec.a_10%>
<%= curlistRec.a_11%>
<%= curlistRec.a_12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 07 16:11:34 KST 2013 */