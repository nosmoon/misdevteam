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


public class MT_SUBMATRIN_1303_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRIN_1303_LDataSet(){}
	public MT_SUBMATRIN_1303_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(15);
		while(rset0.next()){
			MT_SUBMATRIN_1303_LCURLISTRecord rec = new MT_SUBMATRIN_1303_LCURLISTRecord();
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.factcdnm = Util.checkString(rset0.getString("factcdnm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.use_deptcd = Util.checkString(rset0.getString("use_deptcd"));
			rec.biusedeptnm = Util.checkString(rset0.getString("biusedeptnm"));
			rec.ewh_qunt = Util.checkString(rset0.getString("ewh_qunt"));
			rec.ewh_unit = Util.checkString(rset0.getString("ewh_unit"));
			rec.ewh_uprc = Util.checkString(rset0.getString("ewh_uprc"));
			rec.ewh_amt = Util.checkString(rset0.getString("ewh_amt"));
			rec.ewh_vat = Util.checkString(rset0.getString("ewh_vat"));
			rec.bihannm = Util.checkString(rset0.getString("bihannm"));
			rec.matr_clas = Util.checkString(rset0.getString("matr_clas"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.ewh_budg_cd = Util.checkString(rset0.getString("ewh_budg_cd"));
			rec.ewh_budg_nm = Util.checkString(rset0.getString("ewh_budg_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRIN_1303_LDataSet ds = (MT_SUBMATRIN_1303_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRIN_1303_LCURLISTRecord curlistRec = (MT_SUBMATRIN_1303_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.ewh_dt%>
<%= curlistRec.seq%>
<%= curlistRec.ern%>
<%= curlistRec.factcdnm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.remk%>
<%= curlistRec.use_deptcd%>
<%= curlistRec.biusedeptnm%>
<%= curlistRec.ewh_qunt%>
<%= curlistRec.ewh_unit%>
<%= curlistRec.ewh_uprc%>
<%= curlistRec.ewh_amt%>
<%= curlistRec.ewh_vat%>
<%= curlistRec.bihannm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 09:50:27 KST 2009 */