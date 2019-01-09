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


package chosun.ciis.is.agr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_1610_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_AGR_1610_LDataSet(){}
	public IS_AGR_1610_LDataSet(String errcode, String errmsg){
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
			IS_AGR_1610_LCURLISTRecord rec = new IS_AGR_1610_LCURLISTRecord();
			rec.rvord_dt = Util.checkString(rset0.getString("rvord_dt"));
			rec.scat_dt = Util.checkString(rset0.getString("scat_dt"));
			rec.advcs_cd_nm = Util.checkString(rset0.getString("advcs_cd_nm"));
			rec.std_cd_nm = Util.checkString(rset0.getString("std_cd_nm"));
			rec.ord_qunt = Util.checkString(rset0.getString("ord_qunt"));
			rec.ord_uprc = Util.checkString(rset0.getString("ord_uprc"));
			rec.ord_amt = Util.checkString(rset0.getString("ord_amt"));
			rec.purc_uprc = Util.checkString(rset0.getString("purc_uprc"));
			rec.purc_amt = Util.checkString(rset0.getString("purc_amt"));
			rec.prft_amt = Util.checkString(rset0.getString("prft_amt"));
			rec.prft_rate = Util.checkString(rset0.getString("prft_rate"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_AGR_1610_LDataSet ds = (IS_AGR_1610_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_AGR_1610_LCURLISTRecord curlistRec = (IS_AGR_1610_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rvord_dt%>
<%= curlistRec.scat_dt%>
<%= curlistRec.advcs_cd_nm%>
<%= curlistRec.std_cd_nm%>
<%= curlistRec.ord_qunt%>
<%= curlistRec.ord_uprc%>
<%= curlistRec.ord_amt%>
<%= curlistRec.purc_uprc%>
<%= curlistRec.purc_amt%>
<%= curlistRec.prft_amt%>
<%= curlistRec.prft_rate%>
<%= curlistRec.chrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 24 10:45:24 KST 2012 */