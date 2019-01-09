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


package chosun.ciis.pr.prtcnsg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_PRTCNSG_1501_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PR_PRTCNSG_1501_LDataSet(){}
	public PR_PRTCNSG_1501_LDataSet(String errcode, String errmsg){
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
			PR_PRTCNSG_1501_LCURLISTRecord rec = new PR_PRTCNSG_1501_LCURLISTRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.seq_nm = Util.checkString(rset0.getString("seq_nm"));
			rec.prt_fee_35 = Util.checkString(rset0.getString("prt_fee_35"));
			rec.prt_fee_65 = Util.checkString(rset0.getString("prt_fee_65"));
			rec.prt_fee_70 = Util.checkString(rset0.getString("prt_fee_70"));
			rec.prt_fee_75 = Util.checkString(rset0.getString("prt_fee_75"));
			rec.prt_fee_73 = Util.checkString(rset0.getString("prt_fee_73"));
			rec.prt_fee_76 = Util.checkString(rset0.getString("prt_fee_76"));
			rec.prt_fee_77 = Util.checkString(rset0.getString("prt_fee_77"));
			rec.prt_fee_99 = Util.checkString(rset0.getString("prt_fee_99"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	PR_PRTCNSG_1501_LDataSet ds = (PR_PRTCNSG_1501_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		PR_PRTCNSG_1501_LCURLISTRecord curlistRec = (PR_PRTCNSG_1501_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.seq%>
<%= curlistRec.seq_nm%>
<%= curlistRec.prt_fee_35%>
<%= curlistRec.prt_fee_65%>
<%= curlistRec.prt_fee_70%>
<%= curlistRec.prt_fee_75%>
<%= curlistRec.prt_fee_73%>
<%= curlistRec.prt_fee_76%>
<%= curlistRec.prt_fee_99%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 01 09:39:53 KST 2014 */