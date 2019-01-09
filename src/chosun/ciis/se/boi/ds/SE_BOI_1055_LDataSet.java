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


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1055_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList boinnexpcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public long inn_amt;
	public long exp_amt;
	public long tot_amt;

	public SE_BOI_1055_LDataSet(){}
	public SE_BOI_1055_LDataSet(String errcode, String errmsg, long inn_amt, long exp_amt, long tot_amt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.inn_amt = inn_amt;
		this.exp_amt = exp_amt;
		this.tot_amt = tot_amt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setInn_amt(long inn_amt){
		this.inn_amt = inn_amt;
	}

	public void setExp_amt(long exp_amt){
		this.exp_amt = exp_amt;
	}

	public void setTot_amt(long tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getInn_amt(){
		return this.inn_amt;
	}

	public long getExp_amt(){
		return this.exp_amt;
	}

	public long getTot_amt(){
		return this.tot_amt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.inn_amt = cstmt.getLong(8);
		this.exp_amt = cstmt.getLong(9);
		this.tot_amt = cstmt.getLong(10);
		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			SE_BOI_1055_LBOINNEXPCURRecord rec = new SE_BOI_1055_LBOINNEXPCURRecord();
			rec.innexp_clsf = Util.checkString(rset0.getString("innexp_clsf"));
			rec.innexp_ptcr_clsf = Util.checkString(rset0.getString("innexp_ptcr_clsf"));
			rec.innexp_amt = rset0.getInt("innexp_amt");
			this.boinnexpcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BOI_1055_LDataSet ds = (SE_BOI_1055_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.boinnexpcur.size(); i++){
		SE_BOI_1055_LBOINNEXPCURRecord boinnexpcurRec = (SE_BOI_1055_LBOINNEXPCURRecord)ds.boinnexpcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getInn_amt()%>
<%= ds.getExp_amt()%>
<%= ds.getTot_amt()%>
<%= ds.getBoinnexpcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= boinnexpcurRec.innexp_clsf%>
<%= boinnexpcurRec.innexp_ptcr_clsf%>
<%= boinnexpcurRec.innexp_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 28 13:14:29 KST 2009 */