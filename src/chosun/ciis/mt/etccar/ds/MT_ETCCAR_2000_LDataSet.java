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


package chosun.ciis.mt.etccar.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCCAR_2000_LDataSet(){}
	public MT_ETCCAR_2000_LDataSet(String errcode, String errmsg){
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
			MT_ETCCAR_2000_LCURLIST1Record rec = new MT_ETCCAR_2000_LCURLIST1Record();
			rec.driv_dt = Util.checkString(rset0.getString("driv_dt"));
			rec.car_no = Util.checkString(rset0.getString("car_no"));
			rec.cmpy_mang_nm = Util.checkString(rset0.getString("cmpy_mang_nm"));
			rec.runt = Util.checkString(rset0.getString("runt"));
			rec.gag = Util.checkString(rset0.getString("gag"));
			rec.drvr_nm = Util.checkString(rset0.getString("drvr_nm"));
			rec.rid_pers = Util.checkString(rset0.getString("rid_pers"));
			rec.rid_deptcd = Util.checkString(rset0.getString("rid_deptcd"));
			rec.driv_purp = Util.checkString(rset0.getString("driv_purp"));
			rec.buyoil_tm = Util.checkString(rset0.getString("buyoil_tm"));
			rec.buyoil_qunt = Util.checkString(rset0.getString("buyoil_qunt"));
			rec.buyoil_gag = Util.checkString(rset0.getString("buyoil_gag"));
			rec.outsd_oil_qunt = Util.checkString(rset0.getString("outsd_oil_qunt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCCAR_2000_LDataSet ds = (MT_ETCCAR_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCCAR_2000_LCURLIST1Record curlist1Rec = (MT_ETCCAR_2000_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.driv_dt%>
<%= curlist1Rec.car_no%>
<%= curlist1Rec.cmpy_mang_nm%>
<%= curlist1Rec.runt%>
<%= curlist1Rec.gag%>
<%= curlist1Rec.drvr_nm%>
<%= curlist1Rec.rid_pers%>
<%= curlist1Rec.rid_deptcd%>
<%= curlist1Rec.driv_purp%>
<%= curlist1Rec.buyoil_tm%>
<%= curlist1Rec.buyoil_qunt%>
<%= curlist1Rec.buyoil_gag%>
<%= curlist1Rec.outsd_oil_qunt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 15:06:38 KST 2009 */