/***************************************************************************************************
* ���ϸ� : SS_L_RDR_EXTN_CYBCOSTDDataSet.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-������-��ϻ�
* �ۼ����� : 2004-04-09
* �ۼ��� : ����ȫ
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
 * Ȯ����Ȳ-���̹�Ȯ��-������-��ϻ�
 *
 */

public class SS_L_RDR_EXTN_CYBCOSTDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curcommlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_RDR_EXTN_CYBCOSTDDataSet(){}
	public SS_L_RDR_EXTN_CYBCOSTDDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord rec = new SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord();
			rec.medicdnm = Util.checkString(rset0.getString("medicdnm"));
			rec.acptqty = rset0.getInt("acptqty");
			rec.calcqty = rset0.getInt("calcqty");
			rec.basiamt = rset0.getInt("basiamt");
			rec.costamt = rset0.getInt("costamt");
			this.curcommlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_L_RDR_EXTN_CYBCOSTDDataSet ds = (SS_L_RDR_EXTN_CYBCOSTDDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
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
<%= curcommlistRec.acptqty%>
<%= curcommlistRec.calcqty%>
<%= curcommlistRec.basiamt%>
<%= curcommlistRec.costamt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 09 16:13:59 KST 2004 */