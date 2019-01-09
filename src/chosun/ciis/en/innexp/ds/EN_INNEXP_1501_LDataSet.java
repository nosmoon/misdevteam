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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1501_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_1501_LDataSet(){}
	public EN_INNEXP_1501_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			EN_INNEXP_1501_LCURLISTRecord rec = new EN_INNEXP_1501_LCURLISTRecord();
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.reven_occr_no = Util.checkString(rset0.getString("reven_occr_no"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.budg_cd_dr = Util.checkString(rset0.getString("budg_cd_dr"));
			rec.budg_nm_dr = Util.checkString(rset0.getString("budg_nm_dr"));
			rec.amt_dr = Util.checkString(rset0.getString("amt_dr"));
			rec.budg_cd_cr = Util.checkString(rset0.getString("budg_cd_cr"));
			rec.budg_nm_cr = Util.checkString(rset0.getString("budg_nm_cr"));
			rec.amt_cr = Util.checkString(rset0.getString("amt_cr"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_INNEXP_1501_LDataSet ds = (EN_INNEXP_1501_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_INNEXP_1501_LCURLISTRecord curlistRec = (EN_INNEXP_1501_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.reven_occr_no%>
<%= curlistRec.titl%>
<%= curlistRec.budg_cd_dr%>
<%= curlistRec.budg_nm_dr%>
<%= curlistRec.amt_dr%>
<%= curlistRec.budg_cd_cr%>
<%= curlistRec.budg_nm_cr%>
<%= curlistRec.amt_cr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Apr 26 13:09:27 KST 2009 */