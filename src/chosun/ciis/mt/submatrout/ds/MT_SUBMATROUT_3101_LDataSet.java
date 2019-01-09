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


package chosun.ciis.mt.submatrout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_3101_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_3101_LDataSet(){}
	public MT_SUBMATROUT_3101_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			MT_SUBMATROUT_3101_LCURLISTRecord rec = new MT_SUBMATROUT_3101_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.ordr_req_dd = Util.checkString(rset0.getString("ordr_req_dd"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.ordr_req_qunt = Util.checkString(rset0.getString("ordr_req_qunt"));
			rec.matr_cnfm_qunt = Util.checkString(rset0.getString("matr_cnfm_qunt"));
			rec.matr_acpn_yn = Util.checkString(rset0.getString("matr_acpn_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_3101_LDataSet ds = (MT_SUBMATROUT_3101_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_3101_LCURLISTRecord curlistRec = (MT_SUBMATROUT_3101_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.fac_clsf%>
<%= curlistRec.ordr_req_dd%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.unit%>
<%= curlistRec.std_modl%>
<%= curlistRec.ordr_req_qunt%>
<%= curlistRec.matr_cnfm_qunt%>
<%= curlistRec.matr_acpn_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 18:41:36 KST 2009 */