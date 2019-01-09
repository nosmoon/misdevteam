/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_5000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList supportlist = new ArrayList();
	public ArrayList pymtmmlist = new ArrayList();
	public ArrayList resultlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_LNK_5000_MDataSet(){}
	public TN_LNK_5000_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			TN_LNK_5000_MPYMTMMLISTRecord rec = new TN_LNK_5000_MPYMTMMLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.pymtmmlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			TN_LNK_5000_MSUPPORTLISTRecord rec = new TN_LNK_5000_MSUPPORTLISTRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.supportlist.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			TN_LNK_5000_MRESULTLISTRecord rec = new TN_LNK_5000_MRESULTLISTRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			this.resultlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_5000_MDataSet ds = (TN_LNK_5000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.pymtmmlist.size(); i++){
		TN_LNK_5000_MPYMTMMLISTRecord pymtmmlistRec = (TN_LNK_5000_MPYMTMMLISTRecord)ds.pymtmmlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.supportlist.size(); i++){
		TN_LNK_5000_MSUPPORTLISTRecord supportlistRec = (TN_LNK_5000_MSUPPORTLISTRecord)ds.supportlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.resultlist.size(); i++){
		TN_LNK_5000_MRESULTLISTRecord resultlistRec = (TN_LNK_5000_MRESULTLISTRecord)ds.resultlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPymtmmlist()%>
<%= ds.getSupportlist()%>
<%= ds.getResultlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= pymtmmlistRec.cd%>
<%= pymtmmlistRec.cdnm%>
<%= supportlistRec.cd%>
<%= supportlistRec.cdnm%>
<%= resultlistRec.cd%>
<%= resultlistRec.cdnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 20 15:11:38 KST 2016 */