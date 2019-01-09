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


package chosun.ciis.ad.dep.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_3310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_3310_LDataSet(){}
	public AD_DEP_3310_LDataSet(String errcode, String errmsg){
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
			AD_DEP_3310_LCURLISTRecord rec = new AD_DEP_3310_LCURLISTRecord();
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.b_misu_amt = Util.checkString(rset0.getString("b_misu_amt"));
			rec.pubc_amt = Util.checkString(rset0.getString("pubc_amt"));
			rec.rcpm_amt = Util.checkString(rset0.getString("rcpm_amt"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.misu_rat1 = Util.checkString(rset0.getString("misu_rat1"));
			rec.misu_rat2 = Util.checkString(rset0.getString("misu_rat2"));
			rec.misu_rat3 = Util.checkString(rset0.getString("misu_rat3"));
			rec.kiil_avg1 = Util.checkString(rset0.getString("kiil_avg1"));
			rec.kiil_avg2 = Util.checkString(rset0.getString("kiil_avg2"));
			rec.kiil_avg3 = Util.checkString(rset0.getString("kiil_avg3"));
			rec.dhon_amt = Util.checkString(rset0.getString("dhon_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_3310_LDataSet ds = (AD_DEP_3310_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_3310_LCURLISTRecord curlistRec = (AD_DEP_3310_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.medi_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.b_misu_amt%>
<%= curlistRec.pubc_amt%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.misu_amt%>
<%= curlistRec.misu_rat1%>
<%= curlistRec.misu_rat2%>
<%= curlistRec.misu_rat3%>
<%= curlistRec.kiil_avg1%>
<%= curlistRec.kiil_avg2%>
<%= curlistRec.kiil_avg3%>
<%= curlistRec.dhon_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 07 20:42:26 KST 2009 */