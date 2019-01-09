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


package chosun.ciis.mt.close.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.dm.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_7005_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_7005_LDataSet(){}
	public MT_CLOSE_7005_LDataSet(String errcode, String errmsg){
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
			MT_CLOSE_7005_LCURLIST1Record rec = new MT_CLOSE_7005_LCURLIST1Record();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.fac_clsf_nm = Util.checkString(rset0.getString("fac_clsf_nm"));
			rec.dstb_rat_cd = Util.checkString(rset0.getString("dstb_rat_cd"));
			rec.dstb_rat_nm = Util.checkString(rset0.getString("dstb_rat_nm"));
			rec.owh_budg_cd = Util.checkString(rset0.getString("owh_budg_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.use_dept = Util.checkString(rset0.getString("use_dept"));
			rec.hap_qunt = Util.checkString(rset0.getString("hap_qunt"));
			rec.hap_amt = Util.checkString(rset0.getString("hap_amt"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_7005_LDataSet ds = (MT_CLOSE_7005_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_CLOSE_7005_LCURLIST1Record curlist1Rec = (MT_CLOSE_7005_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.fac_clsf%>
<%= curlist1Rec.fac_clsf_nm%>
<%= curlist1Rec.dstb_rat_cd%>
<%= curlist1Rec.dstb_rat_nm%>
<%= curlist1Rec.owh_budg_cd%>
<%= curlist1Rec.budg_cdnm%>
<%= curlist1Rec.use_dept%>
<%= curlist1Rec.hap_qunt%>
<%= curlist1Rec.hap_amt%>
<%= curlist1Rec.matr_cd%>
<%= curlist1Rec.matr_nm%>
<%= curlist1Rec.medi_cd%>
<%= curlist1Rec.sect_cd%>
<%= curlist1Rec.medi_nm%>
<%= curlist1Rec.sect_nm%>
<%= curlist1Rec.qunt%>
<%= curlist1Rec.amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 06 17:51:50 KST 2009 */