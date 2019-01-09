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


public class MT_CLOSE_5001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_CLOSE_5001_LDataSet(){}
	public MT_CLOSE_5001_LDataSet(String errcode, String errmsg){
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
			MT_CLOSE_5001_LCURLISTRecord rec = new MT_CLOSE_5001_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.shet_qunt = Util.checkString(rset0.getString("shet_qunt"));
			rec.all_qunt = Util.checkString(rset0.getString("all_qunt"));
			rec.owh_qunt = Util.checkString(rset0.getString("owh_qunt"));
			rec.owh_amt = Util.checkString(rset0.getString("owh_amt"));
			rec.ewh_budg_cd = Util.checkString(rset0.getString("ewh_budg_cd"));
			rec.owh_budg_cd = Util.checkString(rset0.getString("owh_budg_cd"));
			rec.dstb_rat_cd = Util.checkString(rset0.getString("dstb_rat_cd"));
			rec.owh_dept = Util.checkString(rset0.getString("owh_dept"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_CLOSE_5001_LDataSet ds = (MT_CLOSE_5001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_CLOSE_5001_LCURLISTRecord curlistRec = (MT_CLOSE_5001_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.cdnm%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_nm%>
<%= curlistRec.shet_qunt%>
<%= curlistRec.all_qunt%>
<%= curlistRec.owh_qunt%>
<%= curlistRec.owh_amt%>
<%= curlistRec.ewh_budg_cd%>
<%= curlistRec.owh_budg_cd%>
<%= curlistRec.dstb_rat_cd%>
<%= curlistRec.owh_dept%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 28 20:29:20 KST 2009 */