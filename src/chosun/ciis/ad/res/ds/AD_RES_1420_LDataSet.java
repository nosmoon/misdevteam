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


package chosun.ciis.ad.res.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.res.dm.*;
import chosun.ciis.ad.res.rec.*;

/**
 * 
 */


public class AD_RES_1420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_RES_1420_LDataSet(){}
	public AD_RES_1420_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AD_RES_1420_LCURLISTRecord rec = new AD_RES_1420_LCURLISTRecord();
			rec.preng_occr_seq = Util.checkString(rset0.getString("preng_occr_seq"));
			rec.sect = Util.checkString(rset0.getString("sect"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.chro_clsf = Util.checkString(rset0.getString("chro_clsf"));
			rec.chro_clsf_nm = Util.checkString(rset0.getString("chro_clsf_nm"));
			rec.preng_occr_dt = Util.checkString(rset0.getString("preng_occr_dt"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.slcrg_pers_nm = Util.checkString(rset0.getString("slcrg_pers_nm"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.agn_nm = Util.checkString(rset0.getString("agn_nm"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_clsf = Util.checkString(rset0.getString("dlco_clsf"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_RES_1420_LDataSet ds = (AD_RES_1420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_RES_1420_LCURLISTRecord curlistRec = (AD_RES_1420_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.preng_occr_seq%>
<%= curlistRec.sect%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.chro_clsf%>
<%= curlistRec.chro_clsf_nm%>
<%= curlistRec.preng_occr_dt%>
<%= curlistRec.pubc_side%>
<%= curlistRec.advt_cont%>
<%= curlistRec.uprc%>
<%= curlistRec.advt_fee%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.slcrg_pers_nm%>
<%= curlistRec.agn%>
<%= curlistRec.agn_nm%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlco_clsf%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 12 15:27:28 KST 2012 */