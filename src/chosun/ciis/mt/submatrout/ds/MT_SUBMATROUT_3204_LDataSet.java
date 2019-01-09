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


public class MT_SUBMATROUT_3204_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_3204_LDataSet(){}
	public MT_SUBMATROUT_3204_LDataSet(String errcode, String errmsg){
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
			MT_SUBMATROUT_3204_LCURLISTRecord rec = new MT_SUBMATROUT_3204_LCURLISTRecord();
			rec.ordr_dt = Util.checkString(rset0.getString("ordr_dt"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ordr_per = Util.checkString(rset0.getString("ordr_per"));
			rec.ordr_per_nm = Util.checkString(rset0.getString("ordr_per_nm"));
			rec.ordr_per_email = Util.checkString(rset0.getString("ordr_per_email"));
			rec.dlvs_dt = Util.checkString(rset0.getString("dlvs_dt"));
			rec.dlvs_fac_cd = Util.checkString(rset0.getString("dlvs_fac_cd"));
			rec.dlco_per = Util.checkString(rset0.getString("dlco_per"));
			rec.dlco_telno = Util.checkString(rset0.getString("dlco_telno"));
			rec.dlco_email = Util.checkString(rset0.getString("dlco_email"));
			rec.amt_pay_mthd = Util.checkString(rset0.getString("amt_pay_mthd"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.ordr_qunt = Util.checkString(rset0.getString("ordr_qunt"));
			rec.ordr_uprc = Util.checkString(rset0.getString("ordr_uprc"));
			rec.ordr_amt = Util.checkString(rset0.getString("ordr_amt"));
			rec.ordr_req_dd = Util.checkString(rset0.getString("ordr_req_dd"));
			rec.remk_ar = Util.checkString(rset0.getString("remk_ar"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_3204_LDataSet ds = (MT_SUBMATROUT_3204_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_3204_LCURLISTRecord curlistRec = (MT_SUBMATROUT_3204_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.ordr_dt%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.ordr_per%>
<%= curlistRec.ordr_per_nm%>
<%= curlistRec.ordr_per_email%>
<%= curlistRec.dlvs_dt%>
<%= curlistRec.dlvs_fac_cd%>
<%= curlistRec.dlco_per%>
<%= curlistRec.dlco_telno%>
<%= curlistRec.dlco_email%>
<%= curlistRec.amt_pay_mthd%>
<%= curlistRec.remk%>
<%= curlistRec.sub_seq%>
<%= curlistRec.matr_cd%>
<%= curlistRec.item_nm%>
<%= curlistRec.std_modl%>
<%= curlistRec.unit%>
<%= curlistRec.ordr_qunt%>
<%= curlistRec.ordr_uprc%>
<%= curlistRec.ordr_amt%>
<%= curlistRec.ordr_req_dd%>
<%= curlistRec.remk_ar%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 13:39:15 KST 2009 */