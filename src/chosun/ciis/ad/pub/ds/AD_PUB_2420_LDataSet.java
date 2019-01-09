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


package chosun.ciis.ad.pub.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.pub.rec.AD_PUB_2420_LCURLISTRecord;

/**
 * 
 */


public class AD_PUB_2420_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_2420_LDataSet(){}
	public AD_PUB_2420_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AD_PUB_2420_LCURLISTRecord rec = new AD_PUB_2420_LCURLISTRecord();
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.pubc_dt = Util.checkString(rset0.getString("pubc_dt"));
			rec.wkdy = Util.checkString(rset0.getString("wkdy"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.pubc_side = Util.checkString(rset0.getString("pubc_side"));
			rec.chro_clsf = Util.checkString(rset0.getString("chro_clsf"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.agn = Util.checkString(rset0.getString("agn"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.pubc_occr_dt = Util.checkString(rset0.getString("pubc_occr_dt"));
			rec.pubc_occr_seq = Util.checkString(rset0.getString("pubc_occr_seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_2420_LDataSet ds = (AD_PUB_2420_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_2420_LCURLISTRecord curlistRec = (AD_PUB_2420_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_nm%>
<%= curlistRec.sect_nm%>
<%= curlistRec.pubc_dt%>
<%= curlistRec.wkdy%>
<%= curlistRec.advt_fee%>
<%= curlistRec.pubc_side%>
<%= curlistRec.chro_clsf%>
<%= curlistRec.cm%>
<%= curlistRec.dn%>
<%= curlistRec.agn%>
<%= curlistRec.fee%>
<%= curlistRec.medi_cd%>
<%= curlistRec.pubc_occr_dt%>
<%= curlistRec.pubc_occr_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 09:36:17 KST 2009 */