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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_5401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_fac = new ArrayList();
	public ArrayList curlist_data = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_5401_LDataSet(){}
	public MT_PAPINOUT_5401_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			MT_PAPINOUT_5401_LCURLIST_DATARecord rec = new MT_PAPINOUT_5401_LCURLIST_DATARecord();
			rec.somodat = Util.checkString(rset0.getString("somodat"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.pj_kind = Util.checkString(rset0.getString("pj_kind"));
			rec.pj_kind_nm = Util.checkString(rset0.getString("pj_kind_nm"));
			rec.val = Util.checkString(rset0.getString("val"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.curlist_data.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			MT_PAPINOUT_5401_LCURLIST_FACRecord rec = new MT_PAPINOUT_5401_LCURLIST_FACRecord();
			rec.fac_clsf_nm = Util.checkString(rset1.getString("fac_clsf_nm"));
			this.curlist_fac.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_5401_LDataSet ds = (MT_PAPINOUT_5401_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_data.size(); i++){
		MT_PAPINOUT_5401_LCURLIST_DATARecord curlist_dataRec = (MT_PAPINOUT_5401_LCURLIST_DATARecord)ds.curlist_data.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist_fac.size(); i++){
		MT_PAPINOUT_5401_LCURLIST_FACRecord curlist_facRec = (MT_PAPINOUT_5401_LCURLIST_FACRecord)ds.curlist_fac.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_data()%>
<%= ds.getCurlist_fac()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_dataRec.somodat%>
<%= curlist_dataRec.fac_clsf%>
<%= curlist_dataRec.pj_kind%>
<%= curlist_dataRec.pj_kind_nm%>
<%= curlist_dataRec.val%>
<%= curlist_dataRec.uprc%>
<%= curlist_dataRec.amt%>
<%= curlist_facRec.fac_clsf_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 20 21:35:14 KST 2009 */