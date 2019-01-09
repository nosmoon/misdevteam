/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String frdt;

	public SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet(){}
	public SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet(String errcode, String errmsg, String frdt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.frdt = frdt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.frdt = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SS_L_RDR_EXTN_BO_RSLT_PRINTCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_BO_RSLT_PRINTCURCOMMLISTRecord();
			rec.jursareanm = Util.checkString(rset0.getString("jursareanm"));
			rec.stafno = Util.checkString(rset0.getString("stafno"));
			rec.stafnm = Util.checkString(rset0.getString("stafnm"));
			rec.prn = Util.checkString(rset0.getString("prn"));
			rec.acctbank = Util.checkString(rset0.getString("acctbank"));
			rec.acctno = Util.checkString(rset0.getString("acctno"));
			rec.acctdeps_pers = Util.checkString(rset0.getString("acctdeps_pers"));
			rec.sa1 = rset0.getInt("sa1");
			rec.sh1 = rset0.getInt("sh1");
			rec.ss1 = rset0.getInt("ss1");
			rec.sa2 = rset0.getInt("sa2");
			rec.sh2 = rset0.getInt("sh2");
			rec.ss2 = rset0.getInt("ss2");
			rec.sa3 = rset0.getInt("sa3");
			rec.sh3 = rset0.getInt("sh3");
			rec.ss3 = rset0.getInt("ss3");
			rec.sa4 = rset0.getInt("sa4");
			rec.sh4 = rset0.getInt("sh4");
			rec.ss4 = rset0.getInt("ss4");
			rec.sa5 = rset0.getInt("sa5");
			rec.sh5 = rset0.getInt("sh5");
			rec.ss5 = rset0.getInt("ss5");
			rec.ea1 = rset0.getInt("ea1");
			rec.eh1 = rset0.getInt("eh1");
			rec.es1 = rset0.getInt("es1");
			rec.ea2 = rset0.getInt("ea2");
			rec.eh2 = rset0.getInt("eh2");
			rec.es2 = rset0.getInt("es2");
			rec.ea3 = rset0.getInt("ea3");
			rec.eh3 = rset0.getInt("eh3");
			rec.es3 = rset0.getInt("es3");
			rec.ea4 = rset0.getInt("ea4");
			rec.eh4 = rset0.getInt("eh4");
			rec.es4 = rset0.getInt("es4");
			rec.ea5 = rset0.getInt("ea5");
			rec.eh5 = rset0.getInt("eh5");
			rec.es5 = rset0.getInt("es5");
			rec.corr_qty = rset0.getInt("corr_qty");
			rec.tot_qty = rset0.getInt("tot_qty");
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet ds = (SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_BO_RSLT_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_BO_RSLT_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFrdt()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curcommlistRec.jursareanm%>
<%= curcommlistRec.stafno%>
<%= curcommlistRec.stafnm%>
<%= curcommlistRec.prn%>
<%= curcommlistRec.acctbank%>
<%= curcommlistRec.acctno%>
<%= curcommlistRec.acctdeps_pers%>
<%= curcommlistRec.sa1%>
<%= curcommlistRec.sh1%>
<%= curcommlistRec.ss1%>
<%= curcommlistRec.sa2%>
<%= curcommlistRec.sh2%>
<%= curcommlistRec.ss2%>
<%= curcommlistRec.sa3%>
<%= curcommlistRec.sh3%>
<%= curcommlistRec.ss3%>
<%= curcommlistRec.sa4%>
<%= curcommlistRec.sh4%>
<%= curcommlistRec.ss4%>
<%= curcommlistRec.sa5%>
<%= curcommlistRec.sh5%>
<%= curcommlistRec.ss5%>
<%= curcommlistRec.ea1%>
<%= curcommlistRec.eh1%>
<%= curcommlistRec.es1%>
<%= curcommlistRec.ea2%>
<%= curcommlistRec.eh2%>
<%= curcommlistRec.es2%>
<%= curcommlistRec.ea3%>
<%= curcommlistRec.eh3%>
<%= curcommlistRec.es3%>
<%= curcommlistRec.ea4%>
<%= curcommlistRec.eh4%>
<%= curcommlistRec.es4%>
<%= curcommlistRec.ea5%>
<%= curcommlistRec.eh5%>
<%= curcommlistRec.es5%>
<%= curcommlistRec.corr_qty%>
<%= curcommlistRec.tot_qty%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 21 09:42:38 KST 2015 */