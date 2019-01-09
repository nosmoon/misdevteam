/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_6085_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public long tot_okcnt;
	public long tot_okamt;
	public long tot_oktax;
	public long tot_okfee;
	public String tailresult;
	public String tailresultmsg;

	public TN_LNK_6085_ADataSet(){}
	public TN_LNK_6085_ADataSet(String errcode, String errmsg, long tot_okcnt, long tot_okamt, long tot_oktax, long tot_okfee, String tailresult, String tailresultmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_okcnt = tot_okcnt;
		this.tot_okamt = tot_okamt;
		this.tot_oktax = tot_oktax;
		this.tot_okfee = tot_okfee;
		this.tailresult = tailresult;
		this.tailresultmsg = tailresultmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_okcnt(long tot_okcnt){
		this.tot_okcnt = tot_okcnt;
	}

	public void setTot_okamt(long tot_okamt){
		this.tot_okamt = tot_okamt;
	}

	public void setTot_oktax(long tot_oktax){
		this.tot_oktax = tot_oktax;
	}

	public void setTot_okfee(long tot_okfee){
		this.tot_okfee = tot_okfee;
	}

	public void setTailresult(String tailresult){
		this.tailresult = tailresult;
	}

	public void setTailresultmsg(String tailresultmsg){
		this.tailresultmsg = tailresultmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTot_okcnt(){
		return this.tot_okcnt;
	}

	public long getTot_okamt(){
		return this.tot_okamt;
	}

	public long getTot_oktax(){
		return this.tot_oktax;
	}

	public long getTot_okfee(){
		return this.tot_okfee;
	}

	public String getTailresult(){
		return this.tailresult;
	}

	public String getTailresultmsg(){
		return this.tailresultmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.tot_okcnt = cstmt.getLong(7);
		this.tot_okamt = cstmt.getLong(8);
		this.tot_oktax = cstmt.getLong(9);
		this.tot_okfee = cstmt.getLong(10);
		this.tailresult = Util.checkString(cstmt.getString(11));
		this.tailresultmsg = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_LNK_6085_ADataSet ds = (TN_LNK_6085_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTot_okcnt()%>
<%= ds.getTot_okamt()%>
<%= ds.getTot_oktax()%>
<%= ds.getTot_okfee()%>
<%= ds.getTailresult()%>
<%= ds.getTailresultmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 17 15:32:55 KST 2016 */