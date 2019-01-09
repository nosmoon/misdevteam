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


package chosun.ciis.hd.insr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1711_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INSR_1711_LDataSet(){}
	public HD_INSR_1711_LDataSet(String errcode, String errmsg){
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
			HD_INSR_1711_LCURLISTRecord rec = new HD_INSR_1711_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.rnum = Util.checkString(rset0.getString("rnum"));
			rec.tms = Util.checkString(rset0.getString("tms"));
			rec.insr_entr_dt = Util.checkString(rset0.getString("insr_entr_dt"));
			rec.insr_mtry_dt = Util.checkString(rset0.getString("insr_mtry_dt"));
			rec.insr_cmpy = Util.checkString(rset0.getString("insr_cmpy"));
			rec.pymt_insr_fee = Util.checkString(rset0.getString("pymt_insr_fee"));
			rec.recp_insr_amt = Util.checkString(rset0.getString("recp_insr_amt"));
			rec.recp_minus_pymt = Util.checkString(rset0.getString("recp_minus_pymt"));
			rec.recp_insr_fee_stot = Util.checkString(rset0.getString("recp_insr_fee_stot"));
			rec.entr_nops = Util.checkString(rset0.getString("entr_nops"));
			rec.pymt_per_npos = Util.checkString(rset0.getString("pymt_per_npos"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INSR_1700_LDataSet ds = (HD_INSR_1700_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INSR_1700_LCURLISTRecord curlistRec = (HD_INSR_1700_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.rnum%>
<%= curlistRec.tms%>
<%= curlistRec.insr_entr_dt%>
<%= curlistRec.insr_mtry_dt%>
<%= curlistRec.insr_cmpy%>
<%= curlistRec.pymt_insr_fee%>
<%= curlistRec.recp_insr_amt%>
<%= curlistRec.recp_minus_pymt%>
<%= curlistRec.recp_insr_fee_stot%>
<%= curlistRec.entr_nops%>
<%= curlistRec.pymt_per_npos%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 16:54:18 KST 2009 */