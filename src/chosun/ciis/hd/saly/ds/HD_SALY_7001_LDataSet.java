/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_7001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_7001_LDataSet(){}
	public HD_SALY_7001_LDataSet(String errcode, String errmsg){
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
			HD_SALY_7001_LCURLISTRecord rec = new HD_SALY_7001_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.aply_basi_mm = Util.checkString(rset0.getString("aply_basi_mm"));
			rec.saly_amt_fr = Util.checkString(rset0.getString("saly_amt_fr"));
			rec.saly_amt_to = Util.checkString(rset0.getString("saly_amt_to"));
			rec.faml_1 = Util.checkString(rset0.getString("faml_1"));
			rec.faml_2 = Util.checkString(rset0.getString("faml_2"));
			rec.faml_3 = Util.checkString(rset0.getString("faml_3"));
			rec.faml_4 = Util.checkString(rset0.getString("faml_4"));
			rec.faml_5 = Util.checkString(rset0.getString("faml_5"));
			rec.faml_6 = Util.checkString(rset0.getString("faml_6"));
			rec.faml_7 = Util.checkString(rset0.getString("faml_7"));
			rec.faml_8 = Util.checkString(rset0.getString("faml_8"));
			rec.faml_9 = Util.checkString(rset0.getString("faml_9"));
			rec.faml_10 = Util.checkString(rset0.getString("faml_10"));
			rec.faml_11 = Util.checkString(rset0.getString("faml_11"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_7001_LDataSet ds = (HD_SALY_7001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_7001_LCURLISTRecord curlistRec = (HD_SALY_7001_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.aply_basi_mm%>
<%= curlistRec.saly_amt_fr%>
<%= curlistRec.saly_amt_to%>
<%= curlistRec.faml_1%>
<%= curlistRec.faml_2%>
<%= curlistRec.faml_3%>
<%= curlistRec.faml_4%>
<%= curlistRec.faml_5%>
<%= curlistRec.faml_6%>
<%= curlistRec.faml_7%>
<%= curlistRec.faml_8%>
<%= curlistRec.faml_9%>
<%= curlistRec.faml_10%>
<%= curlistRec.faml_11%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 06 14:33:25 KST 2015 */