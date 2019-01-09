/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 
 */


public class SS_SLS_BRSUP_2701_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String rdr_no;
	public String rdrnm;
	public String medinm;
	public String bonm;

	public SS_SLS_BRSUP_2701_LDataSet(){}
	public SS_SLS_BRSUP_2701_LDataSet(String errcode, String errmsg, String rdr_no, String rdrnm, String medinm, String bonm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.medinm = medinm;
		this.bonm = bonm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_SLS_BRSUP_2701_LCURCOMMLISTRecord rec = new SS_SLS_BRSUP_2701_LCURCOMMLISTRecord();
			rec.tr_il = Util.checkString(rset0.getString("tr_il"));
			rec.banknm = Util.checkString(rset0.getString("banknm"));
			rec.iacct_no = Util.checkString(rset0.getString("iacct_no"));
			rec.iacct_nm = Util.checkString(rset0.getString("iacct_nm"));
			rec.tr_amt = Util.checkString(rset0.getString("tr_amt"));
			this.curcommlist.add(rec);
		}
		this.rdr_no = Util.checkString(cstmt.getString(5));
		this.rdrnm = Util.checkString(cstmt.getString(6));
		this.medinm = Util.checkString(cstmt.getString(7));
		this.bonm = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_BRSUP_2701_LDataSet ds = (SS_SLS_BRSUP_2701_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_SLS_BRSUP_2701_LCURCOMMLISTRecord curcommlistRec = (SS_SLS_BRSUP_2701_LCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getRdr_no()%>
<%= ds.getRdrnm()%>
<%= ds.getMedinm()%>
<%= ds.getBonm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.tr_il%>
<%= curcommlistRec.banknm%>
<%= curcommlistRec.iacct_no%>
<%= curcommlistRec.iacct_nm%>
<%= curcommlistRec.tr_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 26 14:40:14 KST 2016 */