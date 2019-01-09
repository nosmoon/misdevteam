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


package chosun.ciis.ad.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_2010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_2010_LDataSet(){}
	public AD_DEP_2010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_DEP_2010_LCURLISTRecord rec = new AD_DEP_2010_LCURLISTRecord();
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.bank_name = Util.checkString(rset0.getString("bank_name"));
			rec.tran_date = Util.checkString(rset0.getString("tran_date"));
			rec.remark = Util.checkString(rset0.getString("remark"));
			rec.tran_amt = Util.checkString(rset0.getString("tran_amt"));
			rec.extnc_amt = Util.checkString(rset0.getString("extnc_amt"));
			rec.rcpm_slip_no = Util.checkString(rset0.getString("rcpm_slip_no"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_2010_LDataSet ds = (AD_DEP_2010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2010_LCURLISTRecord curlistRec = (AD_DEP_2010_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acct_num%>
<%= curlistRec.bank_name%>
<%= curlistRec.tran_date%>
<%= curlistRec.remark%>
<%= curlistRec.tran_amt%>
<%= curlistRec.extnc_amt%>
<%= curlistRec.rcpm_slip_no%>
<%= curlistRec.mchrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 24 10:32:08 KST 2009 */