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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_1310_LDataSet(){}
	public AD_BAS_1310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(17);
		while(rset0.next()){
			AD_BAS_1310_LCURLISTRecord rec = new AD_BAS_1310_LCURLISTRecord();
			rec.mortg_clsf = Util.checkString(rset0.getString("mortg_clsf"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.cntr_type = Util.checkString(rset0.getString("cntr_type"));
			rec.mortg_cont = Util.checkString(rset0.getString("mortg_cont"));
			rec.setup_pers = Util.checkString(rset0.getString("setup_pers"));
			rec.acct_no = Util.checkString(rset0.getString("acct_no"));
			rec.mortg_amt = Util.checkString(rset0.getString("mortg_amt"));
			rec.cntr_dt = Util.checkString(rset0.getString("cntr_dt"));
			rec.cntr_todt = Util.checkString(rset0.getString("cntr_todt"));
			rec.gurt_frdt = Util.checkString(rset0.getString("gurt_frdt"));
			rec.gurt_todt = Util.checkString(rset0.getString("gurt_todt"));
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.owh_dt = Util.checkString(rset0.getString("owh_dt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.del_yn = Util.checkString(rset0.getString("del_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_1310_LDataSet ds = (AD_BAS_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_1310_LCURLISTRecord curlistRec = (AD_BAS_1310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.mortg_clsf%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.cntr_type%>
<%= curlistRec.mortg_cont%>
<%= curlistRec.setup_pers%>
<%= curlistRec.acct_no%>
<%= curlistRec.mortg_amt%>
<%= curlistRec.cntr_dt%>
<%= curlistRec.cntr_todt%>
<%= curlistRec.gurt_frdt%>
<%= curlistRec.gurt_todt%>
<%= curlistRec.ewh_dt%>
<%= curlistRec.owh_dt%>
<%= curlistRec.remk%>
<%= curlistRec.del_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 18 17:38:23 KST 2013 */