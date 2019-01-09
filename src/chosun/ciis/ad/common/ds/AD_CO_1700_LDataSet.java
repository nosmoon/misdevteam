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


package chosun.ciis.ad.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.common.dm.*;
import chosun.ciis.ad.common.rec.*;

/**
 * 
 */


public class AD_CO_1700_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String preng_fee;
	public String asum_fee;

	public AD_CO_1700_LDataSet(){}
	public AD_CO_1700_LDataSet(String errcode, String errmsg, String preng_fee, String asum_fee){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.preng_fee = preng_fee;
		this.asum_fee = asum_fee;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPreng_fee(String preng_fee){
		this.preng_fee = preng_fee;
	}

	public void setAsum_fee(String asum_fee){
		this.asum_fee = asum_fee;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPreng_fee(){
		return this.preng_fee;
	}

	public String getAsum_fee(){
		return this.asum_fee;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.preng_fee = Util.checkString(cstmt.getString(8));
		this.asum_fee = Util.checkString(cstmt.getString(9));
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			AD_CO_1700_LCURLISTRecord rec = new AD_CO_1700_LCURLISTRecord();
			rec.gb = Util.checkString(rset0.getString("gb"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sect = Util.checkString(rset0.getString("sect"));
			rec.dn = Util.checkString(rset0.getString("dn"));
			rec.cm = Util.checkString(rset0.getString("cm"));
			rec.advt_cont = Util.checkString(rset0.getString("advt_cont"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.preng_uprc = Util.checkString(rset0.getString("preng_uprc"));
			rec.preng_fee = Util.checkString(rset0.getString("preng_fee"));
			rec.asum_uprc = Util.checkString(rset0.getString("asum_uprc"));
			rec.asum_fee = Util.checkString(rset0.getString("asum_fee"));
			rec.dffn_fee = Util.checkString(rset0.getString("dffn_fee"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_CO_1700_LDataSet ds = (AD_CO_1700_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_CO_1700_LCURLISTRecord curlistRec = (AD_CO_1700_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPreng_fee()%>
<%= ds.getAsum_fee()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.gb%>
<%= curlistRec.seq%>
<%= curlistRec.sect%>
<%= curlistRec.dn%>
<%= curlistRec.cm%>
<%= curlistRec.advt_cont%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.preng_uprc%>
<%= curlistRec.preng_fee%>
<%= curlistRec.asum_uprc%>
<%= curlistRec.asum_fee%>
<%= curlistRec.dffn_fee%>
<%= curlistRec.slcrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 03 11:24:03 KST 2016 */