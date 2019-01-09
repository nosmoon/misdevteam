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


package chosun.ciis.as.asrd.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.asrd.dm.*;
import chosun.ciis.as.asrd.rec.*;

/**
 * 
 */


public class AS_ASRD_1901_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASRD_1901_LDataSet(){}
	public AS_ASRD_1901_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			AS_ASRD_1901_LCURLISTRecord rec = new AS_ASRD_1901_LCURLISTRecord();
			rec.aset_no = Util.checkString(rset0.getString("aset_no"));
			rec.aset_nm = Util.checkString(rset0.getString("aset_nm"));
			rec.aset_stat = Util.checkString(rset0.getString("aset_stat"));
			rec.aset_loca = Util.checkString(rset0.getString("aset_loca"));
			rec.aset_size = Util.checkString(rset0.getString("aset_size"));
			rec.aset_usag = Util.checkString(rset0.getString("aset_usag"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.acqr_dt = Util.checkString(rset0.getString("acqr_dt"));
			rec.orgin_acqr_amt = Util.checkString(rset0.getString("orgin_acqr_amt"));
			rec.un_redm_amt = Util.checkString(rset0.getString("un_redm_amt"));
			rec.vat_amt = Util.checkString(rset0.getString("vat_amt"));
			rec.sale_dt = Util.checkString(rset0.getString("sale_dt"));
			rec.sale_amt = Util.checkString(rset0.getString("sale_amt"));
			rec.dlco_ern = Util.checkString(rset0.getString("dlco_ern"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_ASRD_1901_LDataSet ds = (AS_ASRD_1901_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASRD_1901_LCURLISTRecord curlistRec = (AS_ASRD_1901_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.aset_no%>
<%= curlistRec.aset_nm%>
<%= curlistRec.aset_stat%>
<%= curlistRec.aset_loca%>
<%= curlistRec.aset_size%>
<%= curlistRec.aset_usag%>
<%= curlistRec.dept_nm%>
<%= curlistRec.acqr_dt%>
<%= curlistRec.orgin_acqr_amt%>
<%= curlistRec.un_redm_amt%>
<%= curlistRec.vat_amt%>
<%= curlistRec.sale_dt%>
<%= curlistRec.sale_amt%>
<%= curlistRec.dlco_ern%>
<%= curlistRec.budg_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 09:18:43 KST 2009 */