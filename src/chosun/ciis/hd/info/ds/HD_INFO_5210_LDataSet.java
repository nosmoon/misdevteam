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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_5210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_5210_LDataSet(){}
	public HD_INFO_5210_LDataSet(String errcode, String errmsg){
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
			HD_INFO_5210_LCURLISTRecord rec = new HD_INFO_5210_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.faml_seq = Util.checkString(rset0.getString("faml_seq"));
			rec.faml_rshp_cd = Util.checkString(rset0.getString("faml_rshp_cd"));
			rec.faml_rshp_nm = Util.checkString(rset0.getString("faml_rshp_nm"));
			rec.faml_flnm = Util.checkString(rset0.getString("faml_flnm"));
			rec.faml_prn = Util.checkString(rset0.getString("faml_prn"));
			rec.ocpn_cd = Util.checkString(rset0.getString("ocpn_cd"));
			rec.ocpn_nm = Util.checkString(rset0.getString("ocpn_nm"));
			rec.offi_nm = Util.checkString(rset0.getString("offi_nm"));
			rec.posi = Util.checkString(rset0.getString("posi"));
			rec.schir_cd = Util.checkString(rset0.getString("schir_cd"));
			rec.schir_nm = Util.checkString(rset0.getString("schir_nm"));
			rec.nmat_yn = Util.checkString(rset0.getString("nmat_yn"));
			rec.dth_dt = Util.checkString(rset0.getString("dth_dt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INFO_5210_LDataSet ds = (HD_INFO_5210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_5210_LCURLISTRecord curlistRec = (HD_INFO_5210_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.emp_no%>
<%= curlistRec.faml_seq%>
<%= curlistRec.faml_rshp_cd%>
<%= curlistRec.faml_rshp_nm%>
<%= curlistRec.faml_flnm%>
<%= curlistRec.faml_prn%>
<%= curlistRec.ocpn_cd%>
<%= curlistRec.ocpn_nm%>
<%= curlistRec.offi_nm%>
<%= curlistRec.posi%>
<%= curlistRec.schir_cd%>
<%= curlistRec.schir_nm%>
<%= curlistRec.nmat_yn%>
<%= curlistRec.dth_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 20:37:31 KST 2009 */