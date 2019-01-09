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


package chosun.ciis.tn.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.dm.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1050_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_RPT_1050_LDataSet(){}
	public TN_RPT_1050_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			TN_RPT_1050_LCURLISTRecord rec = new TN_RPT_1050_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.acct_cdnm = Util.checkString(rset0.getString("acct_cdnm"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.acct_num = Util.checkString(rset0.getString("acct_num"));
			rec.acct_clsf = Util.checkString(rset0.getString("acct_clsf"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.tran_date = Util.checkString(rset0.getString("tran_date"));
			rec.bank_id = Util.checkString(rset0.getString("bank_id"));
			rec.bank_name = Util.checkString(rset0.getString("bank_name"));
			rec.today_amt = Util.checkString(rset0.getString("today_amt"));
			rec.in_amt = Util.checkString(rset0.getString("in_amt"));
			rec.out_amt = Util.checkString(rset0.getString("out_amt"));
			rec.yes_amt = Util.checkString(rset0.getString("yes_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_RPT_1050_LDataSet ds = (TN_RPT_1050_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_RPT_1050_LCURLISTRecord curlistRec = (TN_RPT_1050_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.acct_cdnm%>
<%= curlistRec.cdnm%>
<%= curlistRec.acct_num%>
<%= curlistRec.acct_clsf%>
<%= curlistRec.remk%>
<%= curlistRec.tran_date%>
<%= curlistRec.bank_id%>
<%= curlistRec.bank_name%>
<%= curlistRec.today_amt%>
<%= curlistRec.in_amt%>
<%= curlistRec.out_amt%>
<%= curlistRec.yes_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 18 13:57:05 KST 2016 */