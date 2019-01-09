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

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3530_PDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_PUB_3530_PDataSet(){}
	public AD_PUB_3530_PDataSet(String errcode, String errmsg){
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
			AD_PUB_3530_PCURLISTRecord rec = new AD_PUB_3530_PCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.podr_slip_no = Util.checkString(rset0.getString("podr_slip_no"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.podr_amt = Util.checkString(rset0.getString("podr_amt"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.mms_misu_mat = Util.checkString(rset0.getString("mms_misu_mat"));
			rec.slcrg_pers = Util.checkString(rset0.getString("slcrg_pers"));
			rec.mchrg_pers = Util.checkString(rset0.getString("mchrg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_3530_PDataSet ds = (AD_PUB_3530_PDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_PUB_3530_PCURLISTRecord curlistRec = (AD_PUB_3530_PCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.podr_slip_no%>
<%= curlistRec.dlco_no%>
<%= curlistRec.podr_amt%>
<%= curlistRec.misu_amt%>
<%= curlistRec.mms_misu_mat%>
<%= curlistRec.slcrg_pers%>
<%= curlistRec.mchrg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Nov 18 17:03:38 KST 2016 */