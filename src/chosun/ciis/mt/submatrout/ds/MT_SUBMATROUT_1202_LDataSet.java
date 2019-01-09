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


public class MT_SUBMATROUT_1202_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_1202_LDataSet(){}
	public MT_SUBMATROUT_1202_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(14);
		while(rset0.next()){
			MT_SUBMATROUT_1202_LCURLISTRecord rec = new MT_SUBMATROUT_1202_LCURLISTRecord();
			rec.owh_dt = Util.checkString(rset0.getString("owh_dt"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.owh_dept = Util.checkString(rset0.getString("owh_dept"));
			rec.owh_budg_cd = Util.checkString(rset0.getString("owh_budg_cd"));
			rec.owh_qunt = Util.checkString(rset0.getString("owh_qunt"));
			rec.owh_unit = Util.checkString(rset0.getString("owh_unit"));
			rec.owh_uprc = Util.checkString(rset0.getString("owh_uprc"));
			rec.owh_amt = Util.checkString(rset0.getString("owh_amt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset0.getString("medi_ser_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.ewh_budg_cd = Util.checkString(rset0.getString("ewh_budg_cd"));
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.ewh_seq = Util.checkString(rset0.getString("ewh_seq"));
			rec.ewh_sub_seq = Util.checkString(rset0.getString("ewh_sub_seq"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.bccgdeptnm = Util.checkString(rset0.getString("bccgdeptnm"));
			rec.matr_clas = Util.checkString(rset0.getString("matr_clas"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_1202_LDataSet ds = (MT_SUBMATROUT_1202_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_1202_LCURLISTRecord curlistRec = (MT_SUBMATROUT_1202_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.owh_dt%>
<%= curlistRec.fac_clsf_nm%>
<%= curlistRec.matr_cd%>
<%= curlistRec.owh_dept%>
<%= curlistRec.owh_budg_cd%>
<%= curlistRec.owh_qunt%>
<%= curlistRec.owh_unit%>
<%= curlistRec.owh_uprc%>
<%= curlistRec.owh_amt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_ser_no%>
<%= curlistRec.remk%>
<%= curlistRec.ewh_budg_cd%>
<%= curlistRec.ewh_dt%>
<%= curlistRec.ewh_seq%>
<%= curlistRec.ewh_sub_seq%>
<%= curlistRec.matr_nm%>
<%= curlistRec.unit%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.bccgdeptnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 19:56:13 KST 2009 */