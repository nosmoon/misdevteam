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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_1021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_1021_LDataSet(){}
	public MC_COST_1021_LDataSet(String errcode, String errmsg){
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
			MC_COST_1021_LCURLISTRecord rec = new MC_COST_1021_LCURLISTRecord();
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cdnm = Util.checkString(rset0.getString("budg_cdnm"));
			rec.medi_dstb_cd = Util.checkString(rset0.getString("medi_dstb_cd"));
			rec.mccdnm = Util.checkString(rset0.getString("mccdnm"));
			rec.dtls_medi_dstb_cd = Util.checkString(rset0.getString("dtls_medi_dstb_cd"));
			rec.dtls_medi_dstb_cdnm = Util.checkString(rset0.getString("dtls_medi_dstb_cdnm"));
			rec.whco_ndstb_cd = Util.checkString(rset0.getString("whco_ndstb_cd"));
			rec.jscdnm = Util.checkString(rset0.getString("jscdnm"));
			rec.whco_comn_cost_yn = Util.checkString(rset0.getString("whco_comn_cost_yn"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_1021_LDataSet ds = (MC_COST_1021_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_1021_LCURLISTRecord curlistRec = (MC_COST_1021_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.budg_cd%>
<%= curlistRec.budg_cdnm%>
<%= curlistRec.medi_dstb_cd%>
<%= curlistRec.mccdnm%>
<%= curlistRec.dtls_medi_dstb_cd%>
<%= curlistRec.dtls_medi_dstb_cdnm%>
<%= curlistRec.whco_ndstb_cd%>
<%= curlistRec.jscdnm%>
<%= curlistRec.whco_comn_cost_yn%>
<%= curlistRec.use_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 13:38:23 KST 2009 */