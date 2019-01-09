/***************************************************************************************************
* ���ϸ� : SS_L_NWSPITEMCOSTCLMTDataSet.java
* ��� : ��������-�Ź�������ǰ-���(�������)-�󼼸���� ���� DataSet
* �ۼ����� : 2004-02-07
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/

package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-�Ź�������ǰ-���(�������)-�󼼸���� ���� DataSet
 */

public class SS_L_NWSPITEMCOSTCLMTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public long totalcnt;
	public long clamamt;
	public long clamtacmlamt;
	public long clamtbal;

	public SS_L_NWSPITEMCOSTCLMTDataSet(){}
	public SS_L_NWSPITEMCOSTCLMTDataSet(String errcode, String errmsg, long totalcnt, long clamamt, long clamtacmlamt, long clamtbal){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.totalcnt = totalcnt;
		this.clamamt = clamamt;
		this.clamtacmlamt = clamtacmlamt;
		this.clamtbal = clamtbal;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public void setClamamt(long clamamt){
		this.clamamt = clamamt;
	}

	public void setClamtacmlamt(long clamtacmlamt){
		this.clamtacmlamt = clamtacmlamt;
	}

	public void setClamtbal(long clamtbal){
		this.clamtbal = clamtbal;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public long getClamamt(){
		return this.clamamt;
	}

	public long getClamtacmlamt(){
		return this.clamtacmlamt;
	}

	public long getClamtbal(){
		return this.clamtbal;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			SS_L_NWSPITEMCOSTCLMTCURCOMMLISTRecord rec = new SS_L_NWSPITEMCOSTCLMTCURCOMMLISTRecord();
			rec.clamt = rset0.getInt("clamt");
			rec.rcpmpersnm = Util.checkString(rset0.getString("rcpmpersnm"));
			rec.clamtbal = rset0.getInt("clamtbal");
			rec.clamtdt = Util.checkString(rset0.getString("clamtdt"));
			this.curcommlist.add(rec);
		}
		this.totalcnt = cstmt.getLong(8);
		this.clamamt = cstmt.getLong(9);
		this.clamtacmlamt = cstmt.getLong(10);
		this.clamtbal = cstmt.getLong(11);
	}



}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_NWSPITEMCOSTCLMTDataSet ds = (SS_L_NWSPITEMCOSTCLMTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEMCOSTCLMTCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMCOSTCLMTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
<%= ds.getTotalcnt()%>
<%= ds.getClamamt()%>
<%= ds.getClamtacmlamt()%>
<%= ds.getClamtbal()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.clamt%>
<%= curcommlistRec.rcpmpersnm%>
<%= curcommlistRec.clamtbal%>
<%= curcommlistRec.clamtdt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 10 19:48:19 KST 2004 */