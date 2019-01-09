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


package chosun.ciis.ad.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_3310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_BAS_3310_LDataSet(){}
	public AD_BAS_3310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_BAS_3310_LCURLISTRecord rec = new AD_BAS_3310_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.presi_nm = Util.checkString(rset0.getString("presi_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.bizcond = Util.checkString(rset0.getString("bizcond"));
			rec.item = Util.checkString(rset0.getString("item"));
			rec.advt_fee = Util.checkString(rset0.getString("advt_fee"));
			rec.mortg_clsf = Util.checkString(rset0.getString("mortg_clsf"));
			rec.mortg_amt = Util.checkString(rset0.getString("mortg_amt"));
			rec.cntr_prd_frdt = Util.checkString(rset0.getString("cntr_prd_frdt"));
			rec.cntr_prd_todt = Util.checkString(rset0.getString("cntr_prd_todt"));
			rec.slcrg_nm = Util.checkString(rset0.getString("slcrg_nm"));
			rec.mchrg_nm = Util.checkString(rset0.getString("mchrg_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BAS_3310_LDataSet ds = (AD_BAS_3310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_BAS_3310_LCURLISTRecord curlistRec = (AD_BAS_3310_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.presi_nm%>
<%= curlistRec.ern%>
<%= curlistRec.addr%>
<%= curlistRec.tel_no%>
<%= curlistRec.email%>
<%= curlistRec.bizcond%>
<%= curlistRec.item%>
<%= curlistRec.advt_fee%>
<%= curlistRec.mortg_clsf%>
<%= curlistRec.mortg_amt%>
<%= curlistRec.cntr_prd_frdt%>
<%= curlistRec.cntr_prd_todt%>
<%= curlistRec.slcrg_nm%>
<%= curlistRec.mchrg_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 06 19:23:10 KST 2017 */