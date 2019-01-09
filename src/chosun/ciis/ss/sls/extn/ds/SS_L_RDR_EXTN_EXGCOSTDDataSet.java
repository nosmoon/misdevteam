/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_EXGCOSTDDataSet.java
* ��� : ǰ����Ȯ�� ��� �󼼸���� ���� DataSet
* �ۼ����� : 2003-12-03
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EXGCOSTDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_EXTN_EXGCOSTDDataSet(){}
	public SS_L_RDR_EXTN_EXGCOSTDDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){	return;	}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord();
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.trsfqty = rset0.getInt("trsfqty");
			rec.acptqty = rset0.getInt("acptqty");
			rec.uncalctrsfqty = rset0.getInt("uncalctrsfqty");
			rec.uncalcacptqty = rset0.getInt("uncalcacptqty");
			rec.calcqty = rset0.getInt("calcqty");
			rec.basiamt = rset0.getInt("basiamt");
			rec.costamt = rset0.getInt("costamt");
			this.curcommlist.add(rec);
		}
	}


}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_RDR_EXTN_EXGCOSTDDataSet ds = (SS_L_RDR_EXTN_EXGCOSTDDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurcommlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curcommlistRec.medicdnm%>
<%= curcommlistRec.trsfqty%>
<%= curcommlistRec.acptqty%>
<%= curcommlistRec.uncalctrsfqty%>
<%= curcommlistRec.uncalcacptqty%>
<%= curcommlistRec.calcqty%>
<%= curcommlistRec.basiamt%>
<%= curcommlistRec.costamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 03 21:44:40 KST 2003 */
