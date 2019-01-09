/***************************************************************************************************
* ���ϸ� : .java
* ��� : 	   
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_LNK_6085_ADataSet ds = (TN_LNK_6085_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

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
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Nov 17 15:32:55 KST 2016 */