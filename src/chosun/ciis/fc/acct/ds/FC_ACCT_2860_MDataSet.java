/***************************************************************************************************
* 파일명 : FC_ACCT_2860_M
* 기능 : 입금표처리내역초기
* 작성일자 : 2009-01-13
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 입금표처리내역초기
 *
 */

public class FC_ACCT_2860_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rcpm_clsfcdlist = new ArrayList();
	public ArrayList widr_resncdlist = new ArrayList();
	public ArrayList rcpm_shet_kindcdlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2860_MDataSet(){}
	public FC_ACCT_2860_MDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			FC_ACCT_2860_MRCPM_SHET_KINDCDLISTRecord rec = new FC_ACCT_2860_MRCPM_SHET_KINDCDLISTRecord();
			rec.cccodeval = Util.checkString(rset0.getString("cccodeval"));
			rec.cccdnm = Util.checkString(rset0.getString("cccdnm"));
			rec.cccdynm = Util.checkString(rset0.getString("cccdynm"));
			this.rcpm_shet_kindcdlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			FC_ACCT_2860_MWIDR_RESNCDLISTRecord rec = new FC_ACCT_2860_MWIDR_RESNCDLISTRecord();
			rec.cccodeval = Util.checkString(rset1.getString("cccodeval"));
			rec.cccdnm = Util.checkString(rset1.getString("cccdnm"));
			rec.cccdynm = Util.checkString(rset1.getString("cccdynm"));
			this.widr_resncdlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			FC_ACCT_2860_MRCPM_CLSFCDLISTRecord rec = new FC_ACCT_2860_MRCPM_CLSFCDLISTRecord();
			rec.cccodeval = Util.checkString(rset2.getString("cccodeval"));
			rec.cccdnm = Util.checkString(rset2.getString("cccdnm"));
			rec.cccdynm = Util.checkString(rset2.getString("cccdynm"));
			this.rcpm_clsfcdlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2860_MDataSet ds = (FC_ACCT_2860_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.rcpm_shet_kindcdlist.size(); i++){
		FC_ACCT_2860_MRCPM_SHET_KINDCDLISTRecord rcpm_shet_kindcdlistRec = (FC_ACCT_2860_MRCPM_SHET_KINDCDLISTRecord)ds.rcpm_shet_kindcdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.widr_resncdlist.size(); i++){
		FC_ACCT_2860_MWIDR_RESNCDLISTRecord widr_resncdlistRec = (FC_ACCT_2860_MWIDR_RESNCDLISTRecord)ds.widr_resncdlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rcpm_clsfcdlist.size(); i++){
		FC_ACCT_2860_MRCPM_CLSFCDLISTRecord rcpm_clsfcdlistRec = (FC_ACCT_2860_MRCPM_CLSFCDLISTRecord)ds.rcpm_clsfcdlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRcpm_shet_kindcdlist()%>
<%= ds.getWidr_resncdlist()%>
<%= ds.getRcpm_clsfcdlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= rcpm_shet_kindcdlistRec.cccodeval%>
<%= rcpm_shet_kindcdlistRec.cccdnm%>
<%= rcpm_shet_kindcdlistRec.cccdynm%>
<%= widr_resncdlistRec.cccodeval%>
<%= widr_resncdlistRec.cccdnm%>
<%= widr_resncdlistRec.cccdynm%>
<%= rcpm_clsfcdlistRec.cccodeval%>
<%= rcpm_clsfcdlistRec.cccdnm%>
<%= rcpm_clsfcdlistRec.cccdynm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 20 17:04:57 KST 2009 */
