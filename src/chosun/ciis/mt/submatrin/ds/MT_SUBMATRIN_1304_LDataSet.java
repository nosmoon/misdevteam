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


package chosun.ciis.mt.submatrin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 * 
 */


public class MT_SUBMATRIN_1304_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRIN_1304_LDataSet(){}
	public MT_SUBMATRIN_1304_LDataSet(String errcode, String errmsg){
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
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MT_SUBMATRIN_1304_LCURLISTRecord rec = new MT_SUBMATRIN_1304_LCURLISTRecord();
			rec.slip_occr_dt = Util.checkString(rset1.getString("slip_occr_dt"));
			rec.slip_seq = Util.checkString(rset1.getString("slip_seq"));
			rec.ern = Util.checkString(rset1.getString("ern"));
			rec.wifactcd = Util.checkString(rset1.getString("wifactcd"));
			rec.dlco_nm = Util.checkString(rset1.getString("dlco_nm"));
			rec.matr_cd = Util.checkString(rset1.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset1.getString("matr_nm"));
			rec.ewh_wgt = Util.checkString(rset1.getString("ewh_wgt"));
			rec.unit = Util.checkString(rset1.getString("unit"));
			rec.ewh_uprc = Util.checkString(rset1.getString("ewh_uprc"));
			rec.ewh_amt = Util.checkString(rset1.getString("ewh_amt"));
			rec.ewh_vat = Util.checkString(rset1.getString("ewh_vat"));
			rec.w_amt = Util.checkString(rset1.getString("w_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRIN_1304_LDataSet ds = (MT_SUBMATRIN_1304_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRIN_1304_LCURLISTRecord curlistRec = (MT_SUBMATRIN_1304_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_seq%>
<%= curlistRec.ern%>
<%= curlistRec.wifactcd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.ewh_wgt%>
<%= curlistRec.unit%>
<%= curlistRec.ewh_uprc%>
<%= curlistRec.ewh_amt%>
<%= curlistRec.ewh_vat%>
<%= curlistRec.w_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 17:50:05 KST 2009 */